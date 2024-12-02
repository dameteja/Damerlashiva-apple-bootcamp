
def square(x:Int) : Int = x*x
def square2 = (x:Int) => x*x
def square4: Int => Int = x => x*x

def square3(): Int => Int = (x) => x*x
println(square3()(20))
//400

def add(): (Int,Int) => Int = (a,b)=> a+b
println(add()(2,3))
5

def cube(): (Int) => Int = (x) => x*x*x
println(cube()(2))
8

def complexcube(): () => (Int) => Int = cube
println(complexcube()()(2))

def complexcube2: Int => Int = cube()
println(complexcube2(2))

def complexadd():() => (Int,Int) => Int = add 
println(complexadd()()(4,5))
8
8
9

def complexcomplexcube(): ()=> () => (Int) => Int = complexcube
println(complexcomplexcube()()()(2))
8

def layer1: Int => Int = (x) => x+100

def calculator(operation: String): (Int, Int) => Int = (a,b) => {
    operation  match{
        case "add" => a+b
        case "sub" => a-b
        case "mul" => a*b
        case _ => -1
    }
}
println(calculator("add")(2,3))
println(calculator("sub")(3,2))
println(calculator("divde")(2,3))
5
1
-1

def wrapper(x: Int): Unit = {
    var outerscope = x
    def inerfunction(a: Int): Unit = {
        outerscope = outerscope + a
        println(s"innerscope variable $a , outerscope variable $outerscope")
    }
    inerfunction(20)
    inerfunction(30)
}
wrapper(5)
innerscope variable 20 , outerscope variable 25
innerscope variable 30 , outerscope variable 55



def wrapper2: Int => Unit = x => {
    var outerscope = x
    def innerfunction2: Int => Unit = a => {
        outerscope = outerscope + a
        println(s"innerscope variable $a , outerscope variable $outerscope")
    }
    innerfunction2(2)
    innerfunction2(3)
}
wrapper2(5)
innerscope variable 2 , outerscope variable 7
innerscope variable 3 , outerscope variable 10



def wrapper2(x: Int): (Int) => Unit = {
    var outerscope = x
    def innerfunction2: Int => Unit = a => {
        outerscope = outerscope + a
        println(s"innerscope variable $a , outerscope variable $outerscope")
    }
    innerfunction2
}
wrapper2(5)(2)
wrapper2(5)(3)   
//output for this : innerscope variable 2 , outerscope variable 7
// innerscope variable 3 , outerscope variable 8

val y = wrapper2(5)
y(2)
y(3)
// innerscope variable 2 , outerscope variable 7
// innerscope variable 3 , outerscope variable 10
innerscope variable 2 , outerscope variable 7
innerscope variable 3 , outerscope variable 8
innerscope variable 2 , outerscope variable 7
innerscope variable 3 , outerscope variable 10
defined function wrapper2
y: Int => Unit = ammonite.$sess.cmd11$Helper$$Lambda/0x000003e00195a208@6c0af9f6
def function1(x: Int,f: (String => Unit)): Unit = {
  var value = x
  f("Shiva")
}

def f(s: String): Unit = {
  function1(10,(sub)=> println(s"The String inside the second function $s , and the int value $sub"))
}

f("Shiva")
The String inside the second function Shiva , and the int value Shiva


def add(x:Int, y:Int): Int = x+y
def add(x:Int): Int => Int = y => x+y
println(add(2,3))
println(add(2)(2))
println(add(-1)(2))
5
4
1



def addbyone: Int => Int = x => x+1
def double: Int => Int = y => y*2
val result = double andThen addbyone 

println(result(20))
41


def addbyone1(x:Int): Int = x+1
def double1(y:Int): Int = y*2
val result2 = double1 _ andThen addbyone1


println(result2(8))
17


def topping(s: String) = {
    println(s"Topping Added $s")
}

def bake (xtype: String, toppings:String) =  {
    println(s"Baked $xtype , and topping of $toppings")
    toppings
}

val cakebaek = bake("cake",_:String)
val cakeprep = cakebaek andThen topping
cakeprep("Choclate cream")
Baked cake , and topping of Choclate cream
Topping Added Choclate cream



def Langtype(s: String) = {
   println(s"inside language $s")
}

def greeting (name: String, lang: String) = {
    lang
}

var namefix = greeting("Shiva",_:String)
val greet = namefix andThen Langtype
greet("Hola")
inside language Hola


println(6 % 3)
0
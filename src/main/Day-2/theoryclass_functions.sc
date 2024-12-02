
//Functions
def first(name: String,age: Int): String = { 
    return "Hi " + name + "! of age " + age
}
println(first("Shiva" , 26))
//Hi Shiva! of age 26


def first(name: String,age: Int): String = { 
    "Hi " + name + "! of age " + age
}
println(first("Shiva" , 26))
//Hi Shiva! of age 26


def first(name: String,age: Int): String = { 
    println("Welcome")
    "Hi " + name + "! of age " + age
}
println(first("shiva" , 26))
//Welcome
//Hi shiva! of age 26


def first(name: String,age: Int):String = "Hi " + name + "! of age " +  age
println(first("shiva",26))
//Hi shiva! of age 26


def sum(a: Int, b:Int): Int = a+b
val x:Int = sum(2,3)
println(s"sum: $x")
//sum: 5


//-Variable can hold functions : implicit and expicit

var sum = (a: Int, b: Int) => a+b
val x:Int = sum(2,3)
println(s"sum: $x")
sum: 5


var sum: (Int, Int)  => Long = (a,b) => a+b
val x:Long = sum(2,3)
println(s"sum: $x")
sum: 5


var sum: (Int, Int)  => Long = (a,b) => a+b
val x:Long = sum(2,3)
println(s"sum: $x")
sum: 5


def process(s: String) : String = s"Hello $s"
val x =  process _
println(x("Shiva"))
println(x.getClass)
Hello Shiva



def process(s: String) : String = s"Hello $s"
val y: String => String = process
println(y("Shiva"))
println(y.getClass)
Hello Shiva


//Functions can hold functions

def mainfunction(n:Int, method: (String) => String) = {
    for(i <- 1 to n){
        println("Starting the mainfunction for loop")
        val x:String = method("shiva")
        println(x)
        println("Ending the mainfunction for loop")
    }
    println("Done")
}

def subfunction(s:String): String = s"Inside the second function $s"

mainfunction(3,subfunction)
Starting the mainfunction for loop
Inside the second function shiva
Ending the mainfunction for loop
Starting the mainfunction for loop
Inside the second function shiva
Ending the mainfunction for loop
Starting the mainfunction for loop
Inside the second function shiva
Ending the mainfunction for loop
Done

//another method to change the string value 
mainfunction(3,(x:String) =>  s"lamda processing $x")
Starting the mainfuunction for loop
lamda processing shiva
Ending the mainfunction for loop
Starting the mainfuunction for loop
lamda processing shiva
Ending the mainfunction for loop
Starting the mainfuunction for loop
lamda processing shiva
Ending the mainfunction for loop
Done


val x:String => Unit = x => println(x)
x("hello")
hello


def filterIt(elements:Array[Int],logic: Int=>Boolean): Array[Int] = {
    var a: Int=0;
    var count: Int=0;
    for(data<-elements){
        if(logic(data))
            {
                count+=1;
            }
    }
    val arr=Array.fill(count)(0)
    for(data<-elements){
        if(logic(data))
            {
                arr(a)=data 
                a+=1
            }
    }
    return arr
}

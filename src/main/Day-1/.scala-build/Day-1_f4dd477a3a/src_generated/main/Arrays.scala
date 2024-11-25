

final class Arrays$_ {
def args = Arrays_sc.args$
def scriptPath = """Arrays.sc"""
/*<script>*/
//Collections : Arrays
val x:Array[Int] = Array(1,2,3,4)
val y = Array("shiva","sai")
for(m1 <- x){
    print(s" $m1")
}
println("")
for(m1 <- y){
    print(s" $m1")
}

1 2 3 4
 shiva sai
x: Array[Int] = Array(1, 2, 3, 4)
y: Array[String] = Array("shiva", "sai")


val x:Array[Int] = Array(1,2,3)
for(m1 <- x){
    print(s" $m1")
}
 1 2 3
x: Array[Int] = Array(1, 2, 3)


val zeros: Array[Int] = Array.fill(5)(0)
for(m1 <- zeros){
    print(s" $m1")
}
 0 0 0 0 0
zeros: Array[Int] = Array(0, 0, 0, 0, 0)

//Accessing the elements
val numbers: Array[Int] = Array(1,2,3,4)
val firstNumber = numbers(0) // number(0) bringing from given array values 
for(m1 <- numbers){
    print(s" $m1")
}
 1 2 3 4
numbers: Array[Int] = Array(1, 2, 3, 4)
firstNumber: Int = 1


///Modifying the elements (updating the returned value of number variable)
numbers(1) = 0
for(m1 <- numbers){
    print(s" $m1")
}
 1 0 3 4

 //finding the length of previous value 
val length = numbers.length
length: Int = 4

// using for each case to print
for (num <- numbers) {
    println(num)
}

numbers.foreach(println)
1
0
3
4
1
0
3
4

//condition of doubling is applied using maps condition set

val doubled = numbers.map(_ * 2) 
for(m1 <- doubled){
    print(s" $m1")
}
 2 0 6 8
doubled: Array[Int] = Array(2, 0, 6, 8)

//filter condition using for previous number variable

val evens = numbers.filter(_ % 2 == 0) 
for(m1 <- evens){
    print(s" $m1")
}
 0 4
evens: Array[Int] = Array(0, 4)

//sum operation is added for the number variable
val sum = numbers.reduce(_ + _) 
println(sum)
8
sum: Int = 8
/*</script>*/ /*<generated>*//*</generated>*/
}

object Arrays_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new Arrays$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export Arrays_sc.script as `Arrays`


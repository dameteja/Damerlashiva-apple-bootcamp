

final class conditional$u0020Statements$_ {
def args = conditional$u0020Statements_sc.args$
def scriptPath = """conditional Statements.sc"""
/*<script>*/
//If Statement
val age = 18

if (age >= 18) {
  println("You are an adult.")
} else {
  println("You are a minor.")
}
You are an adult.
age: Int = 18

//If-Else chainned
val score = 85

if (score >= 90) {
  println("Grade: A")
} else if (score >= 80) {
  println("Grade: B")
} else if (score >= 70) {
  println("Grade: C")
} else {
  println("Grade: D")
}
Grade: B
score: Int = 85


//Match Statements
val day = "Webnesday"
day match {
    case "Monday" => println("The day is Monday")
    case "Tuesday" => println("The day is Tuesday")
    case _ => println("some other day")
}
some other day
day: String = "Webnesday"


def process(value: Any): Unit = {
  value match {
    case i: Int => println(s"Integer: $i")
    case s: String => println(s"String: $s")
    case _ => println("Unknown type")
  }
}
//interpolar function is call of previous valued record//
String: Hello
Unknown type
defined function process


//Nested If loops
val temperature = 24

if (temperature > 25) {
  println("It's warm.")
  if (temperature > 35) {
    println("It's hot!")
  } else {
    println("It's a pleasant warmth.")
  }
} else {
  println("It's cool.")
}
It's warm.
It's a pleasant warmth.
temperature: Int = 30


--//If as an expression
val number = 9
val result = if (number % 2 == 0) "Even" else "Odd"
println(s"$number is $result.")
10 is Even.
number: Int = 10
result: String = "Even"

//Jump Statemnet
Return Statements
def add(a: Int, b: Int): Int = {
  return a + b  // Returning the sum
}

val result = add(5, 3)
println(s"Result: $result")  // either use interpolar or normal function also works here \

Result: 8
defined function add
result: Int = 8


//Break and continue
import scala.util.control.Breaks._

breakable {
  for (i <- 1 to 10) {
    if (i == 5) break()  // Exits the loop when i is 5
    println(i)
  }
}
// Output: 1, 2, 3, 4
1
2
3
4
import scala.util.control.Breaks._


//Do-while loop
var count = 1
do {
  println(s"Count: $count")
  count += 1
} while (count <= 5)
// Output: Count: 1, Count: 2, Count: 3, Count: 4, Count: 5
Count: 1
Count: 2
Count: 3
Count: 4
Count: 5
count: Int = 6
/*</script>*/ /*<generated>*//*</generated>*/
}

object conditional$u0020Statements_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new conditional$u0020Statements$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export conditional$u0020Statements_sc.script as `conditional Statements`


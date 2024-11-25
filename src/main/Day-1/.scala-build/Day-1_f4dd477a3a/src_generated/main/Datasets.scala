

final class Datasets$_ {
def args = Datasets_sc.args$
def scriptPath = """Datasets.sc"""
/*<script>*/
//Byte - 8 bit signed value. Range from -128 to 127
val x: Byte = 0x02
val y: Byte = 1
x: Byte = 2
y: Byte = 1

//Short - 16 bit signed value. Range -32768 to 32767
val x:Short = 32765
val y:Short = 4
x: Short = 32765
y: Short = 4


//Int - 32 bit signed value. Range -2147483648 to 2147483647
val x:Int = 34
val y = 56
x: Int = 34
y: Int = 56


//Long - 64 bit signed value. -9223372036854775808 to 9223372036854775807
val x:Long = 3456
val number = 2147483642
val y = 67
val num = number + y
println(num)

val number2:Long = 2147483642
val y2:Long = 67
val num2 = number2 + y2   //doubt
x: Long = 3456L
number: Int = 2147483642
y: Int = 67
num: Int = -2147483587
number2: Long = 2147483642L
y2: Long = 67L
num2: Long = 2147483709L

//Float - 32 bit IEEE 754 single-precision float
val x:Float = 2.2f
val y:Float = -2.2f
x: Float = 2.2F
y: Float = -2.2F

//Double - 64 bit IEEE 754 double-precision float
val x:Double = 3.45
val y = 6.78
x: Double = 3.45
y: Double = 6.78


//Char - 16 bit unsigned Unicode character. Range from U+0000 to U+FFFF
val x = 'a'
val y:Char = 't'
x: Char = 'a'
y: Char = 't'


//String- A sequence of Chars
val x:String = "a"
val y = "hello"
x: String = "a"
y: String = "hello"


//Boolean - Either the literal true or the literal fals
val x:Boolean = true
val y = false
x: Boolean = true
y: Boolean = false

//Unit- Corresponds to no value
val result:Unit = {
    println("Hello World")
}
println(s"Result: $result")
Hello World
Result: ()


//Null- null or empty reference
val x:String = null
val y:Null = null
val z = null
x: String = null
y: Null = null
z: Null = null


//Nothing - The subtype of every other type; includes no values
def fail(message: String): Nothing = {
  throw new RuntimeException(message)
}
// Uncommenting the following line will cause a runtime exception
// fail("This is an error!") // This will throw an exception


//defined function fail
Any - The supertype of any type; any object is of type Any
val a: Any = 23
val x: Any = "hello"
a: Any = 23
x: Any = "hello"


//AnyRef - The supertype of any reference type
val x: AnyRef = new String("A reference type")
x: AnyRef = "A reference type"

/*</script>*/ /*<generated>*//*</generated>*/
}

object Datasets_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new Datasets$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export Datasets_sc.script as `Datasets`




final class operators$_ {
def args = operators_sc.args$
def scriptPath = """operators.sc"""
/*<script>*/
/** Arthematic_operations**/

val a = 10
val b = 3
println(a + b)
println(a - b)
println(a * b)
println(a / b)
println(a % b)

//**Relational operations**/
val x = 5
val y = 10

println(x == y)
println(x != y)
println(x > y)
println(x < y)
println(x >= y)
println(x <= y)


//**logical operations**//

val p = true
val q = false

println(p && q)
println(p || q)
println(!p)


//bitwise operations//

val m = 5
val n = 3

println(m & n) // Output: 1  (0001 in binary)
println(m | n) // Output: 7  (0111 in binary)
println(m ^ n) // Output: 6  (0110 in binary)
println(~m)    // Output: -6 (inverts all bits)
println(m << 1) // Output: 10 (1010 in binary)
println(m >> 1) // Output: 2  (0010 in binary)

//Assignment operators
var z = 5
z += 3
println(z)
z -= 2
println(z)
z *= 2
println(z)
z /= 3
println(z)


//Unary Operators
val a = 5
val b = -a  // Unary minus
println(b)

val c = +a // Unary plus (effectively no change)
println(c)



/*</script>*/ /*<generated>*//*</generated>*/
}

object operators_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new operators$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export operators_sc.script as `operators`


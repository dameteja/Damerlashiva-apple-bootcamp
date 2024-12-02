

final class theory$u0020class_first$_ {
def args = theory$u0020class_first_sc.args$
def scriptPath = """theory class_first.sc"""
/*<script>*/
 object Fisrt{
     def main(args: Array[String]): Unit = {
         print("hello world")
        // print(args)
     }
 } 

object Runit extends App {
    println("hello through runint")
    println(args)
}

 @main def first(name: String, age: Int): Unit = {
     println("hello from anotation like python")
    println(s"Name: $name, Age: $age")
 }
/*</script>*/ /*<generated>*//*</generated>*/
}

object theory$u0020class_first_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new theory$u0020class_first$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export theory$u0020class_first_sc.script as `theory class_first`




final class tempCodeRunnerFile$_ {
def args = tempCodeRunnerFile_sc.args$
def scriptPath = """c:\Users\damerlashiva.s\Documents\firstproject\Damerlashiva-apple-bootcamp\src\main\Day-1\tempCodeRunnerFile.sc"""
/*<script>*/
val person = ("Alice", 30, "Engineer")

// Accessing elements
println(person._1) 
println(person._2) 
println(person._3) 

// Destructuring a tuple
val (name, age, profession) = person //(gattering all together with diffrent aspects of values with diffrent types)
println(s"$name is $age years old and works as a $profession.")
/*</script>*/ /*<generated>*//*</generated>*/
}

object tempCodeRunnerFile_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new tempCodeRunnerFile$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export tempCodeRunnerFile_sc.script as `tempCodeRunnerFile`


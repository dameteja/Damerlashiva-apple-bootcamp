

final class tempCodeRunnerFile$_ {
def args = tempCodeRunnerFile_sc.args$
def scriptPath = """c:\Users\damerlashiva.s\Documents\firstproject\Damerlashiva-apple-bootcamp\src\main\Day-3\tempCodeRunnerFile.sc"""
/*<script>*/
def add(x:Int, y:Int): Int = x+y
def add(x:Int): Int => Int = y => x+y
println(add(2,3))
println(add(2)(2))
println(add(-1)(2))
5
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


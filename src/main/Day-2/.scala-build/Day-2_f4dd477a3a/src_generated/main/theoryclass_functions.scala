

final class theoryclass_functions$_ {
def args = theoryclass_functions_sc.args$
def scriptPath = """theoryclass_functions.sc"""
/*<script>*/

/*</script>*/ /*<generated>*//*</generated>*/
}

object theoryclass_functions_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new theoryclass_functions$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export theoryclass_functions_sc.script as `theoryclass_functions`


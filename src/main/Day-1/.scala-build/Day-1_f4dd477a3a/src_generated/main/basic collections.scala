

final class basic$u0020collections$_ {
def args = basic$u0020collections_sc.args$
def scriptPath = """basic collections.sc"""
/*<script>*/

/*</script>*/ /*<generated>*//*</generated>*/
}

object basic$u0020collections_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new basic$u0020collections$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export basic$u0020collections_sc.script as `basic collections`


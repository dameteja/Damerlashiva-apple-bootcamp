

final class index$_ {
def args = index_sc.args$
def scriptPath = """index.sc"""
/*<script>*/
Create a notebook for each of the topics
  1) Formatted output (Print) -- done
  2) Variables and literals -- done
  3) Datatypes  (All possible datatypes in scala) -- done
  4) Conditional and Jump statements -- done
  5) Iterative statements -- done
  6) Selection Statements -- done(included in conditional and jump statements)
  7) Single and Multi Dimensional Array( 2 note books) --done
  8) Basic collections -- done
  9) Operators -- done
/*</script>*/ /*<generated>*//*</generated>*/
}

object index_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new index$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export index_sc.script as `index`




final class index$_ {
def args = index_sc.args$
def scriptPath = """index.sc"""
/*<script>*/
Array Related Tasks:
Implement functions that takes array as parameters and does the following to the original array-
1)Bubble Sort
2)Insertion Sort
3) Quick Sort
4) Heap Sort
5) Selection Sort
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


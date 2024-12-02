

final class tempCodeRunnerFile$_ {
def args = tempCodeRunnerFile_sc.args$
def scriptPath = """c:\Users\damerlashiva.s\Documents\firstproject\Damerlashiva-apple-bootcamp\src\main\Day-1\tempCodeRunnerFile.sc"""
/*<script>*/
val x:Array[Int] = Array(1,2,3,4)
val y = Array("shiva","sai")
for(m1 <- x){
    print(s" $m1")
}
println("")
for(m1 <- y){
    print(s" $m1")
}
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


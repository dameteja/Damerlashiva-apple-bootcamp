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
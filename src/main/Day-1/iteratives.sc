--//Iterative Statements


//For statements
for (i <- 1 to 5) {
  println(s"Iteration: $i")
}
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
Iteration: 5

//For staments using until
for (i <- 1 until 5){
    println(s"Iteration: $i")
}
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4

//Nested for loops
for (i <- 1 to 3;j <-2 to 3){
    println(s"i: $i, j: $j")
}
i: 1, j: 2
i: 1, j: 3
i: 2, j: 2
i: 2, j: 3
i: 3, j: 2
i: 3, j: 3


//If inside the for loop
for(i <- 1 to 10 if i%2 == 0){
    println(s"even number: $i")
}
even number: 2
even number: 4
even number: 6
even number: 8
even number: 10


//While loop
var x: Int = 1;
while(x <= 5){
    println(s"number: $x")
    x+=1
}
number: 1
number: 2
number: 3
number: 4
number: 5
x: Int = 6


//Do-While loop
var num = 1
do {
  println(s"Number: $num")
  num += 1
} while (num <= 5)
Number: 1
Number: 2
Number: 3
Number: 4
Number: 5
num: Int = 6

//Iterating over a collections using foreach
val names = List("shiva","sai","teja")
names.foreach(name => println(s"Name: $name"))
Name: shiva
Name: sai
Name: teja

names: List[String] = List("shiva", "sai", "teja")


//Iterating over a collection using map
val numbers = List(1,2,3,4)
val doubled = numbers.map(_ * 2)
println(doubled)
List(2, 4, 6, 8)
numbers: List[Int] = List(1, 2, 3, 4)
doubled: List[Int] = List(2, 4, 6, 8)
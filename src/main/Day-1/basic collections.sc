//Immutable Lists
val fruits = List("Apple", "Banana", "Cherry")

println(fruits(0))

fruits.foreach(fruit => println(fruit))

val newFruits = "Orange" :: fruits // adding extra fruit since immutable 
println(newFruits)
Apple
Apple
Banana
Cherry
List(Orange, Apple, Banana, Cherry)
fruits: List[String] = List("Apple", "Banana", "Cherry")
newFruits: List[String] = List("Orange", "Apple", "Banana", "Cherry")


//Mutable Lits
import scala.collection.mutable.ListBuffer

// Creating a mutable list
val numbers = ListBuffer(1, 2, 3)

// Adding elements
numbers += 4
numbers += (5)
println(numbers) 

// Removing an element
numbers -= 2
println(numbers)
ListBuffer(1, 2, 3, 4, 5)
ListBuffer(1, 3, 4, 5)
import scala.collection.mutable.ListBuffer
numbers: ListBuffer[Int] = ListBuffer(1, 3, 4, 5)
res6_2: ListBuffer[Int] = ListBuffer(1, 3, 4, 5)
res6_3: ListBuffer[Int] = ListBuffer(1, 3, 4, 5)
res6_5: ListBuffer[Int] = ListBuffer(1, 3, 4, 5)


///Immutable Sets
val fruitsSet = Set("Apple", "Banana", "Cherry", "Apple") 
println(fruitsSet)
println(fruitsSet.contains("Banana"))
Set(Apple, Banana, Cherry)
true
fruitsSet: Set[String] = Set("Apple", "Banana", "Cherry")


//Mutable Sets
import scala.collection.mutable.Set

val mutableSet = Set(1, 2, 3)

// Adding elements
mutableSet += 4
println(mutableSet)

// Removing elements
mutableSet -= 2
println(mutableSet)
HashSet(1, 2, 3, 4)
HashSet(1, 3, 4)
import scala.collection.mutable.Set
mutableSet: Set[Int] = HashSet(1, 3, 4)
res8_2: Set[Int] = HashSet(1, 3, 4)
res8_4: Set[Int] = HashSet(1, 3, 4)


//Immutable Maps
val capitalCities = Map("USA" -> "Washington, D.C.", "France" -> "Paris", "Japan" -> "Tokyo")

// Accessing values
println(capitalCities("France")) 

// Iterating through a map
capitalCities.foreach { case (country, city) =>
  println(s"The capital of $country is $city")
}
Paris
The capital of USA is Washington, D.C.
The capital of France is Paris
The capital of Japan is Tokyo
capitalCities: Map[String, String] = Map(
  "USA" -> "Washington, D.C.",
  "France" -> "Paris",
  "Japan" -> "Tokyo"
)


//Mutable Maps
import scala.collection.mutable.Map

val mutableMap = Map("Alice" -> 25, "Bob" -> 30)

// Adding elements
mutableMap("Charlie") = 35
println(mutableMap)

// Updating values
mutableMap("Alice") = 26
println(mutableMap)
HashMap(Bob -> 30, Alice -> 25, Charlie -> 35)
HashMap(Bob -> 30, Alice -> 26, Charlie -> 35)
import scala.collection.mutable.Map
mutableMap: Map[String, Int] = HashMap(
  "Bob" -> 30,
  "Alice" -> 26,
  "Charlie" -> 35
)


//Tuples
val person = ("Alice", 30, "Engineer")

// Accessing elements
println(person._1) 
println(person._2) 
println(person._3) 

// Destructuring a tuple
val (name, age, profession) = person //(gattering all together with diffrent aspects of values with diffrent types)
println(s"$name is $age years old and works as a $profession.")
Alice
30
Engineer
Alice is 30 years old and works as a Engineer.
person: (String, Int, String) = ("Alice", 30, "Engineer")
name: String = "Alice"
age: Int = 30
profession: String = "Engineer"
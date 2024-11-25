//Initialise the Array
val twoDArray = Array(
  Array(1, 2, 3),
  Array(4, 5, 6),
  Array(7, 8, 9)
)
//op:twoDArray: Array[Array[Int]] = Array(
  //Array(1, 2, 3),
  //Array(4, 5, 6),
  //Array(7, 8, 9)
//

// Accessing elements
println(twoDArray(0)(0)) 
println(twoDArray(1)(2))
//op :
    //1
   //6


//Print the array

for (row <- twoDArray) {
  for (elem <- row) {
    print(elem)
    print(" ") 
  }
  println()
}
1 2 3 
4 5 6 
7 8 9 


//Using ofDim, which allows us to define size beforehand
val twoDArray: Array[Array[Int]] = Array.ofDim[Int](3, 4)
// val twoDArray2: Array[Array[Int]] = Array.fill[Int](3, 4)
op:
   twoDArray: Array[Array[Int]] = Array(
  Array(0, 0, 0, 0),
  Array(0, 0, 0, 0),
  Array(0, 0, 0, 0)
)


//Three dimentional array
--Fill the array, print the array
val threeDArray = Array.ofDim[Int](2, 3, 4)

for (i <- 0 until 2; j <- 0 until 3; k <- 0 until 4) {
  threeDArray(i)(j)(k) = i + j + k
}

// Printing the 3D array
for (layer <- threeDArray) {
  for (row <- layer) {
    println(row.mkString(", ")) // Print each row
  }
  println() 
}
0, 1, 2, 3
1, 2, 3, 4
2, 3, 4, 5

1, 2, 3, 4
2, 3, 4, 5
3, 4, 5, 6

//threeDArray: Array[Array[Array[Int]]] = Array(Array(Array(0, 1, 2, 3), Array(1, 2, 3, 4), Array(2, 3, 4, 5)),Array(Array(1, 2, 3, 4), Array(2, 3, 4, 5), Array(3, 4, 5, 6))
)//


///MultiDimentional Array
val n = 5
val m = 5
val dynamicArray = Array.ofDim[Int](n, m)

// Filling based on a condition (e.g., check if the sum of indices is even)
for (i <- 0 until n; j <- 0 until m) {
  dynamicArray(i)(j) = if ((i + j) % 2 == 0) 1 else 0
}

// Printing the dynamic array
for (row <- dynamicArray) {
  println(row.mkString(", "))
}
1, 0, 1, 0, 1
0, 1, 0, 1, 0
1, 0, 1, 0, 1
0, 1, 0, 1, 0
1, 0, 1, 0, 1
n: Int = 5
m: Int = 5
dynamicArray: Array[Array[Int]] = Array(
  Array(1, 0, 1, 0, 1),
  Array(0, 1, 0, 1, 0),
  Array(1, 0, 1, 0, 1),
  Array(0, 1, 0, 1, 0),
  Array(1, 0, 1, 0, 1)
)
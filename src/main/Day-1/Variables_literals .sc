//Mutable Variables using the keyword var
var myVar : String = "Hello"
println(myVar)
myVar = "Hi"
println(myVar)

//Immutable Variables using the keyword val
val myVal : Int = 4
println(myVal)
//myval = 5  //this would cause compile error

//Integer Literal and some examples//
--0, 035, 21, 0xFFFFFFFF, 0777L (L in the end will make it long)--
val x: Int = 100  // 100 is an integer literal
val y: Int = 035
val z = 0xFFFF
val long = 0777L //not included print statments//

//Float Literal and some examples//
--Floating point literals are of type Float when followed by a floating point type suffix F or f, and are of type Double otherwise
0.0, 1e30f, 3.14159f, 1.0e100, .1--

val x = 2.2f
val y: Double = 1e30f
val z = 1e30f
val a = .1

//Boolean Literal//

val y: Boolean = true  // true is a boolean literal
val x = false 
println(y)



//Character Literal//
--single character enclosed in a single quotes--

val x: Char = 'a'
val y = '\n'

//String Literal
sequence of characters in double quotes
val z: String = "hello world!"
val x = "Hello \n World"
val y = "This string contains a \" character."
println(z+x+y) //combined print for expellation of the things 


//Multi line Strings
val x = """ this containts 
two lines """
println(x)

//Null Value
val y:Null = null
val x = null


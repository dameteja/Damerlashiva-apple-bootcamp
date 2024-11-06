//usage of string '%s' is used or the interpolator 's' is used

//s represents exact value name
//'%s' represents the placeholder for preivously s value
//'\n' represents the new line

val s:String = "Shiva Sai Teja"
val formatted_s =  String.format("Name using format : %s",s)
print(s"Name using Interpolator : $s\n") //Using interpolator
printf("Name using printf: %s\n",s) //Using printf
print(formatted_s) //Using format

//Basic Formatting for a Integer '%d' is used or the interpolator 'f' is used

val i:Int = 3
print(f"Integer using Interpolator: $i%d\n")  //Using interpolator
printf("Interger using printf: %d\n",i) //Using printf
printf("Integer with leading zeros: %02d\n", i) //For trailing zeroes


//Formating for large integers

val large_int = 1234567

// Using f interpolator
print(f"Formatted large number with commas: ${large_int}%,d\n")

// Using printf
printf("Large number with commas: %,d\n", large_int)

//Formatting for Double Variable

val number :  Double = 123.456
print(f"Formatted number: $number%.2f\n")
printf("Formatted number: %.2f\n", number)
printf("Double as Scientific notation: %.2e\n", number)
print(f"Double as Scientific notation: $number%.2e\n")
println(f"With leading zeros: $number%08.2f")
val formattedString1 = String.format("Double using format function: %.2f", number)
println(formattedString1)  // Outputs: Formatted number: 1234.57


//Formatting for Boolean

val flag: Boolean = true
printf("Boolean value: %b\n", flag)
printf("Boolean value (uppercase): %B\n", flag)
println(f"Formatted Boolean value: $flag")
val formattedBool = if (flag) "Yes" else "No"
println(s"Formatted Boolean as Yes/No: $formattedBool")  // Outputs: Formatted Boolean as Yes/No: Yes
val formattedString1 = String.format("Boolean using format function: %b", flag)
println(formattedString1)  // Outputs: Boolean using format function: true
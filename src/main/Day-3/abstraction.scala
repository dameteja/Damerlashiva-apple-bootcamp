abstract class Vehicle { // Changed class name to 'Vehicle'
  protected val carFuelCap = 40.0
  protected val bikeFuelCap = 18.0
  protected val autoFuelCap = 9.0

  // Private variables can be used in the methods of the class
  private val xTest: String = "I am a private variable of class Vehicle"

  // Public by default
  var xType: String = "I am a public variable of class Vehicle"

  def printPrivate: String = s"$xTest"
  def printProtected: String = s"$carFuelCap"

  def fuelEfficiency(): Double // Abstract methods
  def setMileage(x: Int): Unit
  def describe(): String
}

class Car(var mileage: Int, var model: String) extends Vehicle {
  def fuelEfficiency(): Double = mileage / carFuelCap

  def setMileage(x: Int): Unit = mileage = x

  def describe(): String = s"Car with mileage $mileage and model $model"
}

class Bike(var mileage: Int, var model: String) extends Vehicle {
  def fuelEfficiency(): Double = mileage / bikeFuelCap

  def setMileage(x: Int): Unit = mileage = x

  def describe(): String = s"Bike with mileage $mileage and model $model"
}

class Auto(var mileage: Int, var model: String) extends Vehicle {
  def fuelEfficiency(): Double = mileage / autoFuelCap

  def setMileage(x: Int): Unit = mileage = x

  def describe(): String = s"Auto with mileage $mileage and model $model"
}

@main def main(): Unit = {
  val hyundaiCar = new Car(20, "Hyundai")
  println(hyundaiCar.xType) // Public variable of the abstract class Vehicle
  println(hyundaiCar.printPrivate) // Printing the private variable through a method in Vehicle
  println(hyundaiCar.printProtected) // Printing the protected variable through a method in Vehicle

  println(hyundaiCar.describe())
  println(hyundaiCar.fuelEfficiency())

  val audi = new Car(18, "Audi")
  println(audi.describe())
}

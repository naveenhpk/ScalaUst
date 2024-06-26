//define a class

class Car(var brand :String, var model:String, var year:Int){
  def display(): Unit = {
    println(s"Car info $year $brand $model")
  }
}


//create an object of class car
object SimpleClass extends App{
  val car = new Car("Toyota","Innova",1999)
//  call method using car object
  car.display()

//  mdifying values of class
  car.year=2021
  car.model="Corolla"
  car.display()

}

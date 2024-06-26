//class with comapanion object using scala
// companion objects canbe used to provide facoty method and utility functions related to a class
//a companion object will have same name as per the class and also the same scop
//access to private member of class or trait
//this can be directly used class name without any instance of class
class Circle (val radius:Double){
  def area : Double =Math.PI * Math.pow(radius,2)
  def circumference = 2* Math.PI * radius
}
object circle {
  def apply(radius : Double ):Circle =new Circle(radius)
}
object CompanionObj extends App {
//  create ana instance using companion object
  var circle =Circle(6.0)
  println(circle.area)
  println(circle.circumference)
}
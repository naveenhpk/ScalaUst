//InheritANCE exmaple demonstrate inheritance where a subclass extends a super class


class  Animal(val name :String){
  def makeSound(): Unit = {
    println(s"$name is making a sound")
  }
}

//subclass
class Dog(name : String) extends Animal(name){
  override def makeSound(): Unit = {
    println(s"$name says poda patti!")
  }
}

object Inher extends App{
  val animal =new Animal("Kuttapi")
  animal.makeSound()
  val dog= new Dog("Anaya")
  dog.makeSound()
}
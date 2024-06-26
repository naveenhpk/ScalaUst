//case classes are special classes in scala programming that are immutable and
//are compaered by valueOfthey area ideal for use in pattern matching

case class Person(name :String,salary : Int)
  object CaseClass extends App{
//    create an instace of caseclass
    val person1=Person("Person1",30000)
    val person2=Person("Person2",60000)
    val person3=Person("Person3",40000)
    println(person1)
    println(person2)
    println(person3)
//    copy case class and salary is updated
    val person4 =person1.copy(salary=2500)
    println(person3)

    //pattern matching with case class
//    pattern matching in scla allows you to match vslued against pattern and excecute code based on match values aginst
//    person1 match {
////      case pattern ==> result 1
//      case Person(name,salary)=>println(s"Name: $name Salary:$salary")
//    }
    // Pattern matching with multiple cases
//    def matchPerson(person: Person): String = person match {
//      case Person(name, salary) if salary > 50000 =>
//        s"$name has a high salary of $salary"
//      case Person(name, salary) if salary >= 30000 && salary <= 50000 =>
//        s"$name has a moderate salary of $salary"
//      case Person(name, salary) if salary < 30000 =>
//        s"$name has a low salary of $salary"
//      case _ =>
//        s"Person's details are not available"
//    }
  }


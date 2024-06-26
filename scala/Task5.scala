object Task5{
  def main(args : Array[String]): Unit = {

    val employees = List(("A", 100), ("B", 23820), ("C", 10200), ("D", 120), ("E", 15000), ("F", 16000))
//    var sum = 0
//    for (innerlist <- employees) {
//      val empname = innerlist._1
//      val empsal = innerlist._2
//      println(empname + " " + empsal)
//      sum += empsal
//    }
    var sum = employees.map(_._2).sum
    var percent = sum * 0.10
    val (higher, lower) = employees.partition(_._2 > percent)
    println("Higher:")
    higher.foreach {case(empname,empsalary)=>println(s"Name: $empname, Salary: $empsalary") }
    println("Lower:")
    lower.foreach {case(empname,empsalary)=>println(s"Name: $empname, Salary: $empsalary") }
  }
}

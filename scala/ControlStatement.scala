object ControlStatement{
  def main (args :Array[String]): Unit = {
//    ---------------If else------------------Example 1
//    import scala.io.StdIn  //for inputing
////    val x1=10
//    println("Enter a number") ///ask user to input
//    val x1=StdIn.readLine().toInt //deafult it will be in string then typecast to defined type
//    if (x1>0){
//      println("Value is posetive")
//    }
//    else if (x1<0){
//      println("Value is negative")
//    }
//    else{
//      println("Value  is 0")
//    }
//
//
////------------------Example2-------------- using If else ans an expression
//    println("Enter a number") ///ask user to input
//    val x2 = StdIn.readLine().toInt
//    val out=if (x2 % 2 ==0) "even" else "odd"
//    print(out)
//
////    ---------example 3 : while loop-----------------
//
//    var i =1
//    while(i <= 5){
//      println(s"Value of i is :$i")
//      i+=1
//    }
////example 4 -----------------for looop------------------
//    val list1 = List("kerala","india","cbse",393930,782.498)
//    for(value1 <- list1){
//      println(value1)
//    }
////Example 5------------------------------
//
////Generate as collection of even number
//    val num=(1 to 50).toList
//    //yeild is keyword in scsle which is used to generste new collection form an exisiting one
//    var even = for{
//      valu <- num
//      if valu % 2 ==0
//    }yield valu
//    println(even)
//
//  example 6 generte prime number-----------------------
    val prime=for{
      value <- 2 to 100
      if (2 until value).forall(x=> value % x !=0) //until stops the valu leess tan the limit vlaue
    }yield value
    println(prime)
    println(prime.mkString(","))
//
//


  }
}

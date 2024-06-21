////object is a singletone intsnace that is lazily initalised when it ois first accessed .It is similar to class but
//onyly one instanve will be createdd automatically
object Datatypes{
  //main is the entry point ro any scala project
//  unit defines tthe return type of main indicating that it is return type of function
  def main(args:Array[String]): Unit = {
//    integer data typr
    val intNum : Int= 20
    val longNum : Long = 123456789L
    val shortNum: Short =32765
    val byteNum: Byte=127

    //    Floating Datatypes
    val FloatingNum: Float = 3.14f
    val doubleNum : Double =3.145565345332

//    String Datatypes
    val stringVar : String = "Hello Scala"

//    char datatypes
    val charvar : Char = 'A'

    //Unit datatypr
    val unitVal : Unit = ()

//    Mutabale datatpe
    //boolean datatype
    var boovar : Boolean =true
    var intVar : Int = 123

    println(s"Integer :$intNum")
    println(s"Long Integer:$longNum")
    println(s"Short Integer:$shortNum")
    println(s"Byte Integer:$byteNum")
    println(s"FLoating:$FloatingNum")
    print("Boolean"+boovar)
    println("INteger var"+intVar)

//  chanching intvar it is mutable
    intVar=intVar+1000
    println("updated value of intvar "+intVar)

////    chancing immutable variable
//    intNum=intNum+1000

  }

}
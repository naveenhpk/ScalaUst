object aeiouTask2{
  def main(args :Array[String]): Unit = {
    import scala.collection.mutable.ArrayBuffer
    val arr1=ArrayBuffer[String]()
    var x  =1
    import scala.io.StdIn
    while (x <=5){
      val usr=StdIn.readLine()
      arr1 +=usr
      x += 1
    }
    val grup = arr1.groupBy(value=>if ("aeiouAEIOU".contains(value.head)) "vowels" else "consonents" )
    for ((key, num) <- grup) {
      println(key)
      num.foreach(println)
    }

  }
}

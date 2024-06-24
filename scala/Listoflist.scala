object Listoflist{
  def main (args:Array[String]): Unit = {

    //Task 1------------------------------------Processing  and filkering data
    //    saple recrd=(product name, unit price, discoutn, quantity)
    //    1.filter out product that have price gt than 50
    //    2.calculate total cost of each product
    //    3.print the name of product that has execeede total cost  gt than $300

    val Prodlist = List(("Bread", 200, 0.5, 5), ("Milk", 50, 0.7, 4), ("Jam", 150, 0.1, 8), ("Icecream", 250, 0.12, 3), ("Biscut", 253, 0.5, 1), ("Pickle", 342, 0.17, 7))

    for (innerlist <- Prodlist) {
      val name = innerlist._1
      val price = innerlist._2
      if (price > 50) {
        println("Item : " + name + "price : " + price)
      }
    }
    //create a listbuffer to add the products grater than 300
    import scala.collection.mutable.ListBuffer
    var exceed = new ListBuffer[String]()
    for (innerlist <- Prodlist){
      for ((name,price,discount,quantity)<-List(innerlist)) {
        val sum = price * quantity * (1 - discount)
        println("Total Cost of "+name+" : " + sum)
        if (sum>300){
          exceed+=name
        }
      }
    }
    println("Items cost Greater than 300")
    exceed.foreach(println)





  }
}

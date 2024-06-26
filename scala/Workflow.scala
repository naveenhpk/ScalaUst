object Workflow{
  def main(args :Array[String]): Unit = {
//    Map Functions
//Map functions transforms each element of collection using given function
    val numbers = List(1,2,3,4,5,6,7,8)
    val doublenum=numbers.map(_*2)
    val concat =numbers.map(_+"Number")
    concat.foreach(println)
    val words=List("kannur","payyanur","wayanad","chikku")
    println(words.map(_.length))

//    Flat map used for multi dimentioanl arry to single
    val nestedlist = List(List(12,3,3),List(23,5,6,7),List(34,5,6))
    val flatnest=nestedlist.flatMap(identity)
    flatnest.foreach(println)

    val sentences =List("Hai naveen ur handsome","Thank you")
    val split=sentences.flatMap(_.split(" "))
    split.foreach(println)


//    3.filter it selectes elemetn form collcetion that satisfy a given condition
    val shortword=split.filter(_.length <=4) //takes words 4 or less length
    println(shortword)

//    4.fold : this combines elemnts of collection using a binary operatioon starting with an initail value
    println(numbers.fold(7)(_+_)) //do operation along with all numbe in list and add number in fold


//    5.Reduce combie s elemnnt of collection but doues not require any initial position
    val words2=List("Hai kutta","how are you","fine thank you")
    val combination =words2.reduce(_+" "+_)//similar to join
    println(combination)


//    7.foreach function that applies a given procedure to each element of a collection
    words2.foreach(word=>println(word.toUpperCase))


//    7.collect : function applies a partial function to the elements of collections and return a neew collection
    val number1 = List(1,2,3,4,5,6,7,23,3,4,55,67,883,2)
    val odd = number1.collect{case x if x % 2 != 0 => x }
    val length1 =words.collect{case y if y.length >6 => y}
    println(length1)

//    8.partition : this function will split collections into 2 part based on condition

    val (longwords,shortwords) = words.partition(_.length > 4)
    println(shortwords)

//    9.groupby the group by groups a collection based on a given function
    val num3 = List(12,13,14,15,16,35,46,65)
    println(num3.groupBy(_ % 2 == 0))
    println(num3.groupBy(_ % 2))

    //    10.Scan this function is similar to fold but retuen s a collectionof succesive cumulative results of binary operation
    println(num3.scan(0)(_+_))//0+12 12+13 ,25+14











  }
}

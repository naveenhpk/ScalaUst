
object DataStuctures{
  def main (arg : Array[String]): Unit = {
//------------------------------------------------------------------------------------------------------------
    //    List is a immutable and Homagenous collectiosn of data
    val fruits: List[String] = List("Apple", "orange", "mango", "grapes")
    println("First Element" + fruits.head) //first elemet
    println("exclude first Element" + fruits.tail) //excludin the first eelemet
    println("Last Element" + fruits.last) //Last eelemet
    println(fruits) //display all


    //    type2
    val List1 = List("Hadoop", "Spark", "Python", "Java", 10000, true, 3.24)
    println(List1)
    println(List1.getClass)
    println(fruits.getClass)

    // declaring an empty list
    val List3: List[Nothing] = List()
    println(List3.getClass)

    //    create a list buffer of type Mutable

    import scala.collection.mutable.ListBuffer
    var cities = new ListBuffer[String]()
    cities += "tvm"
    cities += "koch"
    cities += ("Mum", "chen", "ban") //multiple values adding
    cities -= "Mum"
    println(cities)
    //typecast
    cities.toList
    println()


//--------------------------------------------------------------------------------------------


//    Array DataType is muttable fixed size colledction of data structuure
//array is homogenous collectoin use any to change anyb datatype similar in list

    val arr = Array("Apple", "orange", "mango", "grapes")
//    print(arr) elemrtn in output new line
    arr.foreach(println)
//    print all values by making to string
    println(arr.mkString(","))
//    updated
    arr(0)="manago"
    println(arr.mkString(","))

//  declare an empty array
    val ar1=new Array[String](10)//1d
    val ar2=Array.ofDim[Int](2,2)//2d
    //Addinf values in 2d
    ar2(0)(0)=23
    ar2(0)(1)=21
    ar2(1)(0)=22
    ar2(1)(1)=24
    //print the multi array
    val flattenAry:Array[Int]=ar2.flatten
    println(flattenAry.mkString(","))
//    Decalre list type 4
    val list3=10::20::30::40::Nil
    println(list3.mkString(","))

//------------------------------------------------------------------------------------------

//Set Collection Immutable
//Hashset collection is a mutable collection

    val set1:Set[String] = Set()
    val set2 = Set("Apple", "orange", "mango", "grapes")

    import scala.collection.mutable.Set
    val mutablset=Set("Apple", "orange", "mango", "grapes")
    mutablset+="undampori"
    mutablset-="Apple"
    println(mutablset)

//  -------------------------------------------------------------------------
//Tuple declararion
//in scala tuplpe is fix size,it is hetrogneous
    val Tup1=(10,20,30,40,50,60,70,80,90)
//    Tup1._1="Immutable" /// cnanot chang ethe vlaues"
    println(Tup1._1)//tupple index strat from 1 for acessing tuplename._index

//-------------------------------------------------------------------------------
//    Mapping ::: it is a collection of keys and values keys are uniques
//2 thpyes mutable : import collection.nutable.Mpa
//   immutabel by deafult mapis immutable

      //import scala.collection.immutable.Map ///mutable t immutable convertion
      var map1 : Map[String,Int]=Map()
      var map2 = Map("UST1001"->"Naveen","UST1002"->"RAJAN","UST3003"->"SUKUMARAN")
      println(map2.contains("UST1001"))//searrch for key
      println(map2.get("UST3003"))//search for value
//      print all keys
      println(map2.keys)
//    PRINT ALL VLAUESD
      println(map2.values)

//    decalre mutable map data type

      import scala.collection.mutable.Map
      val mutableVar =Map("UST1001"->"Naveen","UST1002"->"RAJAN","UST3003"->"SUKUMARAN")
//    update
      mutableVar("UST3003")="Rohit"
//    insert
      mutableVar+=("UST1005"->"ShAsh")


//-----------------------------------------------------------------------------------------
//    Itrators in scala programming
//      An itretor ins scala rep a sequence of elements that allows you to traverse through a collection sequentially

      val mylist = List(12,23,3,456,7,69,845)
      val iter =mylist.iterator
//    methods of itreator to check if ther is more element (.hasNext()) and to remove elements from mutable itreators .remove(),
//.next( ): to retive the next value

      println(iter.next())
      println(iter.next())

//    ------------------------------------------------------------------------

//Lazy intialisation of variable using scala
      lazy val donuts : Int =100
      println(donuts * 5)
//      lazy var donuys : Int = 20 ///not posible with var




















  }
}
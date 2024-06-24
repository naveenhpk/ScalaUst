object datastructuremethods{
  def main(args:Array[String]): Unit = {

//    --------------------List and its methods------------------------

    val list1 =List(1,2,3,4)
    val list2=List()
    val List1 = List("Hadoop", "Spark", "Python", "Java")

//    Basic operatio
    val firstelement=list1.head
    val lastelement=list1.last
    val secondelement=list1(1)

//    check if list is empty
    val islistempty=list1.isEmpty
//    println(islistempty)

//    get size of collecftion
    val lenlist=list1.length

//    adding or removing elemt form the list
    val list3=List(1,2,3,4,5,6,7,8)
    val newList =0 :: list3
    val appendlist=list3:+9 //add 9 in las

//    concat 2 list
    val concatlist=list3 ::: List(11,12,13)
    val concatlist1 = list3 ++ List(14,15,16)

//    remove or droping valies from list
    val update=concatlist.drop(3) //drop from the begining
    val updatedlist = concatlist.filter(_!=13) ///filter takes the value
    val updatelist2 = concatlist.diff(List(11,12)) //remove slected values

//    tranforming list
    val map1=list3.map(_*2)
//    println(list3)
//    println(map1)
    val filter1=list3.filter(_%2 == 0) ///cheching even numbers
//    println(filter1)
    val nestedlist = List(List(1,23,3),List(4,5,6),List(10))
    val flatlist=nestedlist.flatMap(identity)  ////conver to  SINGLE LIST
    println(flatlist)
    val sum=flatlist.reduce(_ + _) //taking the sum by taking 2 elemnts at a time it is type of aggreagte operation
//    println(sum)
    val mul=flatlist.reduce(_ * _)


//    Slicing and sublist
    list3.take(3)///take the first 3 eemt
    list3.takeRight(3)//take from the rightside/last 3 elemt
    list3.dropRight(3)//drop last 2 value

    list3.slice(1,4)//stop vallue wil be 3

//    converting list to map
    val listoftuples= List(("ust1001","krishna"),("ust1002","Rohit"),("ust1003","adinan"))
    val listmap = listoftuples.toMap

//    reverse a list
//    list2.reverse

//    zippinh list
    val ziplist = list3.zip(list1)
    println(ziplist)
    val (num1,num2) = ziplist.unzip
    println(num1)

//***************************************************************************************************************

//    sets and sets method
    val set1=Set(1,2,3,4,5,6,7,8)
    val set2=Set("Apple","banana","orange","mango","guava")

    set1.contains(3) ///retuen true or false
    set1 + 9 //add
    set1 - 7 // remov

    val seta=Set(10,20,30,80,40)
    val setb=Set(40,50,60,70,80)

    val union=seta union setb
    val interset = seta intersect setb
//    seta diff setb

//    checking suser
    seta.subsetOf(setb)
    seta.filter(_%4==0)
    val nestset = Set(("ust1001","krishna"),("ust1002","Rohit"),("ust1003","adinan"))
    val setmap = nestset.toMap
//    println(setmap)
    seta.foreach(println)
    seta.map(_*3).filter(_%2==0)


//    *********************************************************************************************

    val array1=("kochi","varkala","trivndrum","kannur")
    val array2=(1,2,3,4,5,6,7,8)
    val emptyarry=Array[Int]()
//    array2(3)=10 //updating

    import scala.collection.mutable.ArrayBuffer
    val arrbuf=ArrayBuffer(1,2,3,4,5,6,7)
    arrbuf+=8
    arrbuf-=7
    arrbuf.map(_*2)
//    arrbuf.foreach(println)
    val arr3=arrbuf.toArray


    //Nested array
    val nestarr = Array(Array(1,2,3),Array(5,6),Array(7,8,9))
    val flatarr=nestarr.flatten
    flatarr.slice(1,3)
    val arry4=Array(20,30,10,60,50,80,90)
    val sorted = arry4.sorted
    sorted.foreach(println)
    for (elem <- sorted.reverse) {(println(elem))}

//    groupby methd in scala collection methods

    var arra1 = Array("kochi","varkala","trivndrum","kannur","munnar")
    val gruplenth = arra1.groupBy(_.length  )

//    gruplenth.foreach(println)
    for ((key,num) <- gruplenth){
      println(key)
      num.foreach(println)

    }
//    val grupfirstchar = arra1.groupBy(_.charAt(0))
//    val ary=Array(23,34,454,57,87,86,89,443)
//    val groupoddeven=ary.groupBy(num=>if(num%2==0)"even" else "odd")
//    for( (key,num) <- groupoddeven){
//      println(key)
//      num.foreach(println)
//    }
//    groupoddeven.foreach{case(key,value)=>println(s"$key :${value.mkString(",")}")}


//    collection map
    val immutableMap=Map("a"->1,"b"->2,"c"->3,"d"->4,"e"->5)
    import scala.collection.mutable
    val mutableMap = mutable.Map("a"->1,"b"->2,"c"->3,"d"->4,"e"->5)
    immutableMap.contains("a")

    //print output storediin key
    println(immutableMap("a"))

//    concat 2 map
    val mapA =Map("a"->1,"b"->2,"c"->3)
    val mapB = Map("d"->4,"e"->5,"f"->6,"g"->7)
    val mergeMap = mapA ++ mapB
    println(mergeMap)

//tranfer the keys and value
    val incrmtVal=immutableMap.mapValues(_+1)
    val transfornkey = immutableMap.map{case(k,v)=>(k.toUpperCase,v)}
    println(transfornkey)
    incrmtVal.foreach{
      case(key,value)=>println(s"$key-> $value")
    }



  }
}

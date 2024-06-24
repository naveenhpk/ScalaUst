object loopsfunctions{
  def main(args: Array[String]): Unit = {
//    while---------------------------------------------
    var j = 1
//    while (j <= 5)
//    do {
//      println(j)
//      j += 1
//    }
    while{
      print(j)
      j+=1
      j<=5
    }do()

//    for---------------------------------------
    for(i<-1 to 10 by 2){
      println(i)
    }

    //itrating over a collection
    val fruits=List("apple","cherry","oranges","pinapple","stawbberry")
    for(value<-fruits){
      println(value)
    }

//    complex condition
    import scala.io.StdIn
//    println("enter the temp")
//    var temp=StdIn.readInt()
//    println("enter the humidity")
//    var hum=StdIn.readInt()
//
//    val weatherdec=if(temp>30 & hum>60){
//      "hot and humid"
//    }else if(temp>=45 & hum<60){"hot"}
//    else if(hum>70 & temp<30){"humid"}
//    else{
//      "pleasent"
//    }
//    println(weatherdec)


//    Functions------------------------------------------------------------------------
    def add(a:Int,b:Int): Int = {
      a+b
    }
    println(add(5,7))
//    anoymous function
    val sum=(a:Int,b:Int)=>a+b
    println(sum(5,8))


//    find the max elemn in a list
    def maxele(x:List[Int]): Int = {
      x.max
    }
    val numbers=List(1,2,3,4,5,6,7,8)
    println(maxele(numbers))

//    recursion
    def factorial(num : Int ):Int={
      if (num==0)1
      else num*factorial(num-1)
    }
    print(factorial(8))
  }
}

import scala.io.Source
object FileAnalysis{
  def main(args:Array[String]): Unit = {
    val filepath="C:\\Users\\Administrator\\Desktop\\Training\\SCALA\\vineeth.txt"
    val source =Source.fromFile(filepath)//read file
//    read all lines
    val lines=source.getLines().toList

    source.close()

//   Task 1. get most frequnet count words
    var words=lines.flatMap(_.split("\\s+")).map(_.toLowerCase) //line to flatmap to single value and spliting by space _ for single individual wo

    words.foreach(println)
    val grpwords=words.groupBy(identity)
    val wordcoutn=grpwords.mapValues(_.size).toSeq.sortBy(-_._2)///- for decending
    println(wordcoutn)
    wordcoutn.take(10).foreach{case(word,count)=>println(s"$word : $count")}

//    Task 2 average word lwnth
    val totalWords = words.length
    val totalchar=words.map(_.length).sum
    val avgwrdlength=if(totalWords>0) totalchar.toDouble / totalWords else 0.0
    println(avgwrdlength)
  }
}

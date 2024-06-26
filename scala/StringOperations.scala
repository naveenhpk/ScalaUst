//string operatiosn in scala
object StringOperations{
  def main(args:Array[String]): Unit = {

    var str = "Hai I am  NAveen Rajan I am from Kannur"
    var str2 ="Photosynthesis"
    println("*" * 50)

//    getting character at given index
    print(str2.charAt(3))

    println("*" * 50)
    // Concatenate two strings
    println(str.concat(str2))

    println("*"*50)
//    compare 2 strings if yes returns true
    println(str2.contentEquals("Photosynthesis"))
    println(str2.contentEquals(str))
    println(str.equals(str))

    println("*"*50)
//check if string ends with character
    println(str2.endsWith("s"))

    println("*"*50)
//    returning the index of the first occurrence of the character in the string.
    println(str.toLowerCase.indexOf("i"))

    println("*"*50)
//    begins stsrt searching at the specified index.
    println(str.toLowerCase.indexOf("a",5))

    println("*"*50)
//    return the last index of the cahracter
    println(str.toLowerCase.lastIndexOf('a'))

    println("*"*50)
    // Using length() methods
    println(str.length)

    println("*"*50)
//  string replace
    println(str.replaceAll("a","*"))
    println(str.replaceFirst("a","*"))

    println("*" * 50)
//    split return a list
    var spli=str.split(" ",3) //split only 3 spaces
    var spli1=str.split(" ") //split all
    spli1.foreach(println)

    println("*"*50)
//    return the sub string
    println(str2.substring(3,7))
    println(str2.substring(3)) //3 to end

    println("*"*50)
//    return string to char array
    var strarr=str2.toCharArray
    strarr.foreach(println)

    println("*"*50)
//    remove strat and end  space
    var s=" Geeks "
    println(s.trim())

    println("*"*50)
//    matching like like
    println(str2.matches(".h.*")) //check if 2nd letter is h * rep  to end . rep 1 character

    println("*"*50)
//    string reverse
    println(str2.reverse)

    println("*"*50)
//    check string contsins specific char
      println(str.contains("Hai"))









  }
}

import scala.io.Source

object fileAnalysis2 {
  def main(args: Array[String]): Unit = {
    val filepath = "C:\\Users\\Administrator\\Downloads\\StatewiseGDP.csv"
    val source = Source.fromFile(filepath) // read file

    // Initialize variables for tasks
    var maxgdp = 0
    var highgdpstate = ""
    var totalGdp = 0
    var totalPop = 0
    var totalIncome=0
    var linecount=0

    // Read all lines, skipping the header
    for (line <- source.getLines().drop(1)) {
      val columns = line.split(",")
      val state = columns(0)
      val gdp = columns(1).toInt
      println(gdp)
      val pop = columns(2).toInt
      println(pop)

      // Task 1: Find state with higher GDP contribution
      if (gdp > maxgdp) {
        highgdpstate = state
        maxgdp = gdp
      }

      totalGdp += gdp
      totalPop += pop
      totalIncome+=pop

      linecount+=1
    }

    source.close()

    // Task 2: Calculate average GDP per capita
    val averageGdpPerCapita = totalIncome / linecount

    println(s"State with highest GDP contribution: $highgdpstate")
    println(s"Total GDP: $totalGdp")
    println(f"Average GDP per capita: $averageGdpPerCapita")
  }
}

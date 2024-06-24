object task3{
  import scala.io.StdIn as io
  def main(args:Array[String]): Unit = {
    bankmenu()
  }
  def bankmenu(): Unit = {
    println("BANK")

    println("1.check balace\n2.withraw\n3.Deposit\n4.Exit")
    println("enter the choice")
    var choice = io.readInt()
    var bal = 1000
    var continue = true
    while (continue) {
      if (choice == 1) {
        print(s"Account Blanace $bal")
      }
      else if (choice == 2) {
        println(withdraw(bal))
      }
      else if (choice == 3) {
        println(Deposit(bal))
      }
      else if (choice == 4) {
        continue = false
      }
      else {
        println("Invalid")
      }
    }
  }

  def withdraw(bal: Int): Unit = {
    if (bal == 0) {
      println("No Balance")
    } else {
      println("Enter the  amount")
      var amt = io.readInt()
      if (amt <= 0) {
        println("amount should be graeter than 0")
      }
      else {
        bal - amt
      }
    }
  }

  def Deposit(bal: Int): Unit = {
    println("Enter the  amount")
    var amt = io.readInt()
    if (amt <= 0) {
      println("amount should be graeter than 0")
    }
    else {
      bal + amt
    }
  }
}

object Bank {
  import scala.io.StdIn as io
  def main(args: Array[String]): Unit = {
    bankmenu()
  }

  def bankmenu(): Unit = {
    println("BANK")
    var bal=1000
    var continue=true
    while (continue) {
      println("1.Check balance\n2.Withdraw\n3.Deposit\n4.Exit")
      println("Enter your choice")
      val choice=io.readInt()
      if (choice==1) {
        println(s"Account Balance: $bal")
      }else if(choice==2){
        bal = withdraw(bal)
        println(s"Account Balance: $bal")
      }else if(choice==3){
        bal = deposit(bal)
        println(s"Account Balance: $bal")
      }else if(choice==4){
        continue = false
      }else{
        println("Invalid choice")
      }
    }
  }
  
  
  
  
  

  def withdraw(bal: Int): Int = {
    if (bal==0){
      println("No Balance")
      bal
    }else{
      println("Enter the amount")
      val amt=io.readInt()
      if (amt<=0){
        println("Amount should be greater than 0")
        bal
      }else if(amt>bal) {
        println("Insufficient balance")
        bal
      }else{
        bal-amt
      }
    }
  }

  
  

  def deposit(bal: Int): Int = {
    println("Enter the amount")
    val amt = io.readInt()
    if (amt <= 0) {
      println("Amount should be greater than 0")
      bal
    } else {
      bal + amt
    }
  }



}

import jdk.jfr.DataAmount

class Account(val acno :String,var bal :Double){
  def deposit(amount :Double): Unit = {
    if (amount>0){
      bal+=amount
      println(s"Deposit Amount $amount \n New Balance $bal")
    }
  }
  def withdraw(amount: Double): Unit = {
    if (amount>0 && amount<=bal ){
      bal-=amount
      println(s"WIthdraw Amount $amount \n New Balance $bal")
    }else{
      println("Insufficient funds")
    }
  }
  def getbal:Double=bal
}
object Banko{
  def main(args:Array[String]): Unit = {
    var ac1 = new Account("507689", 200000)
    var ac2 =  new Account("340349",100000)

    println(s"Account Number: ${ac1.acno} \nBalance: ${ac1.bal}")
    ac1.deposit(5000)
    ac1.withdraw(4000)
    println(s"Account Number: ${ac1.acno} \nBalance: ${ac1.getbal}")
  }
}

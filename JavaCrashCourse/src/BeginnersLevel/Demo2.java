package BeginnersLevel;

//Write classes code here
class Account {
protected double balance;

Account(double balance){
 this.balance=balance;
}

public void Withdraw(double amount){
}
public void Deposit(double amount){
 }
public void printBalance(){
}
}

class Savings extends Account {
private double interest;

public Savings(double balance) {
 super(balance);
 this.interest=0.8;
}

public void Withdraw(double amount){
   balance = balance - (amount*interest);
}

public void Deposit(double amount){
 balance = balance + (amount*interest);
}

public void printBalance(){
 System.out.println("Balance in your saving account:" + balance);
}
}

class Current extends Account{

public Current(double balance){
super(balance);
}
}


class Demo2 {

public static void main(String args[]) {
 Account SAccount = new Savings(50000);
 
 SAccount.Deposit(1000);
 SAccount.printBalance();

 SAccount.Withdraw(3000);
 SAccount.printBalance();

 System.out.println();

 // creating current account object
 Account CAccount = new Current(50000);
 CAccount.Deposit(1000);
 CAccount.printBalance();

 CAccount.Withdraw(3000);
 CAccount.printBalance(); 
 

 // call their traits functions here
 
}

}

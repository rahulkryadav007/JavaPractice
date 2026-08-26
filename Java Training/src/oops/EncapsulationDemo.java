package oops;
class BankAccount { private double balance; public void deposit(double amount){if(amount>0) balance+=amount;} public double getBalance(){return balance;} }
public class EncapsulationDemo { public static void main(String[] args){BankAccount a=new BankAccount();a.deposit(5000);System.out.println(a.getBalance());} }

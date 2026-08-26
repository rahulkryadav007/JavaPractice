package abstraction;
abstract class ATM { abstract void withdraw(); void welcome(){System.out.println("Welcome to ATM");} }
class SBI extends ATM { @Override void withdraw(){System.out.println("Withdraw from SBI");} }
public class AbstractionDemo { public static void main(String[] args){ATM a=new SBI();a.welcome();a.withdraw();} }

// Creating Class Instances
// Write a program where you create an instance of a BankAccount class with accountHolder and balance attributes and show details.
class BankAccount{
    String accountHolder;
    int balance;
    public void setBalance(String name,int balance){
        accountHolder=name;
        this.balance=balance;
    }
    public void show(){
        System.out.println("The Account holder name is :"+accountHolder+" and balance is: "+balance);
    }
}
public class Q9 {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.setBalance("Hari", 1000);
        ba.show();
    }
}

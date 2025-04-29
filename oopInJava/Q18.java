
// Access Control
// Create a class Account with private balance field and public deposit() and withdraw() methods. Ensure balance can't be accessed directly.
class Account{
    private int balance;
    public void deposit(int balance){
        this.balance+=balance;
        System.out.println("Your current balance is :"+this.balance);
    }
    public void withdraw(int balance){
        this.balance-=balance;
        System.out.println("your current balance is :"+this.balance);
    }

}
public class Q18 {
    public static void main(String[] args) {
        Account a=new Account();
        a.deposit(55000);
        a.withdraw(5000);
    }
}

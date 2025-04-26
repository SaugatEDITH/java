// Create a Java class Account with fields like accountNumber, balance, etc.
// Allow basic operations like deposit, withdrawal, and balance check through a menu-driven console program.
// Use arrays to manage multiple accounts, control statements for choices, and logical/assignment operators.

class Account{
    double AccountNo;
    double Balance;
    Account(double AccountNo ,double Balance){
        this.AccountNo=AccountNo;
        this.Balance=Balance;
    }
    public void Diposit(double Amount){
        Balance+=Amount;
        System.out.println("You diposited amt: "+Amount+" now your current balance is :"+Balance);
    }
    public void Withdraw(double Amount){
        if (Balance>=Amount) {
            Balance=Balance-Amount;
            System.out.println("You Withdrawed amt: "+Amount+" now your current balance is :"+Balance);
        }else{
            System.out.println("You dont have sufficent balance ");
        }
    }
    public void balanceCheck(){
        System.out.println("user with Ac no: "+AccountNo+" Your balance is: "+Balance);
    }
}
public class Q5 {
    public static void main(String[] args) {
        Account ac1=new Account(1111,50000);
        Account ac2=new Account(1112,500000);
        Account ac3=new Account(1113,950000.0);
        Account ac4=new Account(1114,150000.0);
        ac4.Diposit(50000);
        ac4.Withdraw(20000);
        ac4.balanceCheck();
        
    }
}

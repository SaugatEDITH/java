class Parent{
    private int balance=1000;
    //constructor(default)
    Parent(){
        System.out.println("Created an instance");
    }
    Parent(int number){
        System.out.println(number);
    }
    Parent(int number1,int number2){
        System.out.println(number1+" & "+number2);
    }
    public void setBalance(int balance){
        this.balance+=balance;
        System.out.println("you got "+balance+" balance");
    }
    public int returnBalance(){
        return balance;
    }


}

public class Encapsulation {
   public static void main(String[] args) {
    // Parent p=new Parent();
    // Parent p2=new Parent(100);
    Parent p3=new Parent(100,200);
    
    p.setBalance(500);
    System.out.println(p.returnBalance());
    
   } 
}

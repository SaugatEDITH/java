//comparison,logical,conditional operator(if,elif,else,switch)
import java.util.Scanner;

class Operator{
    public static void main(String[] args) {
        int x=1;
        int y=1;
//        comparison operator
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(x<=y);
        System.out.println(x>=y);
//        logical operation
        int temp=12;
        boolean isWarm=temp >20 &&temp<30;//&& both need to be true to be true
        System.out.println(isWarm);
        boolean hasGoodIncome=true;
        boolean hasGoodCredit=true;
        boolean hasCriminalRecord=false;
        boolean isEligible= (hasGoodIncome || hasGoodCredit)&& !hasCriminalRecord;// || at least one need to be true to be true
        System.out.println(isEligible);
//        Conditional statement
        if (temp>=30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water ");
        }else if(temp>=20){
            System.out.println("Its an nice Day !");
        }else{
            System.out.println("its Cold!");
        }
//        ternary operator
        int num1=55;
        int num2=58;
        int number=(num1>num2)?num1:num2;
        System.out.println(number);
//        switch statement
        Scanner sc=new Scanner(System.in);
        System.out.println("Whats your role:> ");
        String role=sc.nextLine().toLowerCase();
        switch (role){
            case "admin":
                System.out.println("Welcome admin");
                break;
            case "user":
                System.out.println("Welcome user");
                break;
            default:
                System.out.println("Wrong user !");
        }
    }

}
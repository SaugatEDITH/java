import java.util.Scanner;

class userInput{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:> ");
        int intNumber=sc.nextInt();
        System.out.println("You entered:> "+intNumber);
        System.out.println("Enter Float number:> ");
        float floatNumber=sc.nextFloat();
        System.out.println("You entered:> "+floatNumber);
        System.out.println("Enter an double");
        double doubleNumber=sc.nextDouble();
        System.out.println("You entered:> "+doubleNumber);
        System.out.println("Enter an word(without space):> ");
        String name=sc.next();
        System.out.println("You entered:> "+name);
        sc.nextLine();
        System.out.println("Enter an string");
        String LongText=sc.nextLine();
        System.out.println("You entered:> "+LongText);
        System.out.println("Enter an boolean");
        boolean kota=sc.nextBoolean();
        System.out.println("You entered:> "+kota);
    }
}
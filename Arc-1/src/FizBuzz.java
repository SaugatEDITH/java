// div by 3 buzz div by 5 fizz div by both 5 and 3 fizz buzz if not number itself

import java.util.Scanner;

class  FizzBuzz{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an number");
        int number=sc.nextInt();
        var result=(number%3==0 && number%5==0)?"FizzBuzz":(number%5==0)?"Fizz":(number%3==0)?"Buzz":number;
        System.out.println(result);
    }
}
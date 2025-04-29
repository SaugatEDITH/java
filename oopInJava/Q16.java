
// More on Methods: Passing by Value and Reference
// Write a program to show that Java passes primitive types by value (changing parameter inside method doesn’t change original value).
//for pass by value
public class Q16 {
    public static void increment(int num){
        num++;
        System.out.println("Number value inside of method is:"+num);
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println("num value before method "+num);
        increment(num);
        System.out.println("number value after sending it through increment func :"+num);
    }
}

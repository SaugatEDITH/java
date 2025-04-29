// Methods that Return Values
// Create a class Calculator with a method squareRoot(int n) that returns the square root of the number.
class Calculator{
public double squareRoot(double n){
    return Math.sqrt(n);
}
}
public class Q19 {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        double result=c.squareRoot(100);
        System.out.println(result);
    }
}

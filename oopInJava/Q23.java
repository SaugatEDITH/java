//Recursion
// Write a recursive Java method to find factorial of a given number.
public class Q23 {
    public static int factorial(int n,int result){
        if (n<=0) {
            return result;
        }
        else{
            result*=n;
            return factorial(n-1,result);
        }
    }
    public static void main(String[] args) {
        int result=1;
        int output=factorial(10, result);
        System.out.println("the factorial of the given no is: "+output);
    }
}

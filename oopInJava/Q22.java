// Recursion
// Write a recursive method sum(n) that returns the sum of first n natural numbers.

public class Q22 {
    public static int sum(int n,int summed){
       
        summed+=n;
        if (n==0) {
            return summed;
        }
        return sum(n-1,summed);
    }
    public static void main(String[] args) {
        int summed=0;
        System.out.println(sum(10,summed));
    }
}

public class recursion {
    public static int recursion(int x){
        if (x<=0){
            return 1;
        }else{
            System.out.println(x);
            return recursion(x-1);
        }
    }
    public static void main(String[] args) {
        recursion(10);
    }
}

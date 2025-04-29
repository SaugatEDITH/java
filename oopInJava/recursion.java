public class recursion {
    public static int recursion(int x,int result){
        if (x<=0){
            return result;
        }else{
         
            result*=x;
            return recursion(x-1,result);
        }
    }
    public static void main(String[] args) {
        int result=1;
        System.out.println("the recursion of 10 is: "+recursion(10,result));
    }
}

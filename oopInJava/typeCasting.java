//typecasting
public class typeCasting {
   public static void main(String[] args) {
    int num=(int)12.2;
    float num2=(float)12;
    String name=Integer.toString(11);
    System.out.println(num);
    System.out.println(num2);
    System.out.println(name);
    //Command line argumen
    System.out.println("This is cmd line argument "+args[0]+" and "+args[1]);
    // compile it manually like this:> java .\typeCasting.java hello world 
    //otherwise it will throw an error
   } 
}

//for basic class
//Write a Java program to create a class Rectangle with length and width, and a method to calculate area.
class Rectang{
    public void Calculate(double l,double b){
    System.out.println("The area of Rectangle: "+l*b);
    }
}
public class Q7 {
    public static void main(String[] args) {
        Rectang r=new Rectang();
        r.Calculate(50.5,25);
        
    }
}

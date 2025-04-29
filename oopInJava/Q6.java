//For fundamentals of class
//Create a class Laptop with fields brand and price. Add a method displayInfo() to show its details.
class Laptop{
    String brand="Honda";
    int price=1500000;
    public void displayInfo(){
        System.out.println("The brand is: "+brand+" the price is :"+price);
    }
}
public class Q6 {
    public static void main(String[] args) {
        Laptop l=new Laptop();
        l.displayInfo();
    }
}

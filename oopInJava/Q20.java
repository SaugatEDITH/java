// Polymorphism and Method Overloading
// Create a class Printer with two overloaded methods print(): one for printing String and one for printing integer.
class Printer{
    public void print(int n){
        System.out.println("The number is: "+n);
    }
    public void print(String str){
        System.out.println("The string is: "+str);
    }
}
public class Q20 {
    public static void main(String[] args){
        Printer p=new Printer();
        p.print(5);
        p.print("hari");

    }
    
}

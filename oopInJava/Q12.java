// Abstraction
// Create an abstract class Shape with an abstract method area(). Create two subclasses Circle and Square and implement area().
abstract class Shape{
   abstract public void area(float input);
}
class Circle extends Shape{

public void area(float radious){
    System.out.println("The area of circle is :"+(3.14*Math.pow(radious, 2)));
}
}
class Square extends Shape{
  
    public void area(float l){
        System.out.println("The area of Square is :"+(Math.pow(l, 2)));
    }
}
public class Q12 {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.area(4.5f);
        Square sq=new Square();
        sq.area(6);
    }
}

abstract class Parent{
abstract public void callMe();
public void Apple(){
    System.out.println("i am from parent");
}
}
class Child extends Parent{
    public void callMe(){
        System.out.println("calling from parent");
    }
    public void Apple(){
        System.out.println("i am from child");
    }

}
public class Abstraction {
    public static void main(String[] args) {
        Child c=new Child();
        c.callMe();
        c.Apple();
    }
}

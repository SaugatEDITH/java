// Create a parent class Animal and child classes Cat, Dog. Override a method sound() in each child class to show polymorphism.
//method overriding
class Animals{
    public void sound(){
        System.out.println("Animal ");
    }
}
class Cat extends Animals{
    public void sound(){
        System.out.println("Meeww...");
    }
}
class Dog extends Animals{
    public void sound(){
        System.out.println("vaw vawww...");
    }
}
public class Q21 {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.sound();
        Dog d=new Dog();
        d.sound();
    }
}

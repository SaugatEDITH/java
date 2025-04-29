
// More on Methods: Passing by Value and Reference
// Write a program where an object’s property is modified inside a method, proving object references are passed.
//for pass by ref
class Number{
public int value;
}
public class Q17 {
    public static void changeValue(Number n1){
        n1.value++;
    }
    public static void main(String[] args) {
        Number n=new Number();
        n.value=55;
        System.out.println("Before sending shrough change fun :"+n.value);
        changeValue(n);
        System.out.println("After sending through change fun: "+n.value);
    }
  
}

// Adding Methods to a Class
// Create a class MathOperation with two methods add() and multiply() that operate on two integers.
class MathOperation{
    float a,b;
    public void setValue(float a,float b){
        this.a=a;
        this.b=b;
    }
    public void add(){
        System.out.println("The sum of a and b is :"+(a+b));
    }
    public void multiply(){
        System.out.println("The multiply of a and b is :"+ a*b);

    }
}
public class Q10 {
    public static void main(String[] args) {
        MathOperation mo=new MathOperation();
        mo.setValue(82, 69);
        mo.add();
        mo.multiply();
    }
}

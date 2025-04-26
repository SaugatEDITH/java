//polymorphism & me
class Parent{
    public int sum(int a,int b){
        return a+b;
    }
    public double sum(double a,double b){
        return a+b;
    }
}
public class Polymorphysm {
    public static void main(String[] args) {
        Parent p=new Parent();
        System.out.println(p.sum(5, 5));
        System.out.println(p.sum(5.5, 5.55));
    }
}

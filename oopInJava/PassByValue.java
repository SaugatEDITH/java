//pass by refrence
class Numberone{
    int value;
}
class SetNumber{
   public void setNumber(Numberone n1){
        n1.value=8;
        System.out.println("The number is set to "+n1.value);
    }
    //pass by value
    public double divideBy10(int num){
        return num/10;
    }
}
public class PassByValue {
    public static void main(String[] args) {
        Numberone num=new Numberone();
       SetNumber n1= new SetNumber();
       //pass by ref
       n1.setNumber(num);
       //pass by value
       double result=n1.divideBy10(150);
       System.out.println(result);
    }
}

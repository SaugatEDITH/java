
class Basic{
    String name="hari";
    public void naming(){
        System.out.println("hello");
    }
    public void person(String name){
        System.out.println(name);
    }
    public int sum(int a,int b){
        return a+b;
    }
}

public class basicClass {
    public static void main(String[] args) {
        Basic b=new Basic();
        Basic b2=new Basic();
        b.naming();
        System.out.println(b.name);
        b2.person("Saym");
        int result=b.sum(5, 15);
        System.out.println(result);
    }
}

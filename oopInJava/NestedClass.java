class Parent{
    class Child{
        public void innerMethod(){
            System.out.println("Calling from inner class");
        }
    }
}
public class NestedClass {
    public static void main(String[] args) {
        Parent p=new Parent();
        Parent.Child c=p.new Child();
        c.innerMethod();
    }
}

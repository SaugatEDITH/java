// Constructors and Default Constructors
// Create a class Mobile with a parameterized constructor to set modelName. Then create another class Tablet with a default constructor.
class Mobile{
    String modelName;
    Mobile(String modelName){
        this.modelName=modelName;
    }
public void showModel(){
    System.out.println("The phone model is :"+modelName);
}
}
class Tablet{
    Tablet(){
        System.out.println("Tablet instanciated");
    }
}
class Q15{
    public static void main(String[] args) {
        Mobile m=new Mobile("nokia");
        m.showModel();
        new Tablet();
    }
}
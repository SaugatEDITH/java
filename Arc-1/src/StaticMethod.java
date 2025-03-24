//method or function for an main class should have static methods right below its main function
public class StaticMethod {
    public static void main(String[] args) {
        String message=greetUser("Ram","prasad");
        System.out.println(message);
        message=greetUser("Hari","lal");
        System.out.println(message);
        message=greetUser("Gita","Aryal");
        System.out.println(message);
    }
    public static String greetUser(String name,String lastname){
        return "Hello "+name+" "+lastname;
    }
}

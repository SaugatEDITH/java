// it covers user define types eg class,interface,Enum
interface InneruserDefinedTypes {
    final String name="saym";
 void call();
}


public class userDefinedTypes implements InneruserDefinedTypes {
    enum Names{
        AAYAM,
        AAYUSH,
        ARPIT,
    }

    String name;
    int number;
    userDefinedTypes(String name,int id){
        this.name=name;
        this.number=id;
        System.out.println(id+" "+name);
    }
    public void call(){
    System.out.println("i am calling from upper interface");
    }
public static void main(String[] args) {
   userDefinedTypes user =new userDefinedTypes("hari",56);
   user.call();
   System.out.println(Names.AAYAM);
}
}

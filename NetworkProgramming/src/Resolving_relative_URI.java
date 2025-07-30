import java.net.URI;

public class Resolving_relative_URI {
    public static void main(String[] args) {
        try {
            URI base=new URI("https://www.example.com/");
            URI relstive=new URI("index.html");
            URI resolved=base.resolve(relstive);
            System.out.println(resolved);
        }catch (Exception e){e.printStackTrace();}
    }
}

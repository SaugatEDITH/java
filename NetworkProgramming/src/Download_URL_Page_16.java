import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Download_URL_Page_16 {
    public static void main(String[] args) {
        try{
           URL url=new URL("http://www.google.com");
           BufferedReader in=new BufferedReader(new InputStreamReader(url.openStream()));

            in.lines().forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

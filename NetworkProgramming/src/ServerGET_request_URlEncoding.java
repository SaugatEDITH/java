import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

public class ServerGET_request_URlEncoding {
    public static void main(String[] args) {
        try {
            //url x-www-form-urlencoded encode example
            String urlencoded= URLEncoder.encode("Hari Prasad updhay", "UTF-8");
            System.out.println(urlencoded);
            // page download example
            URL url=new URL("https://www.example.com/index.html");
            BufferedReader in= new BufferedReader(new InputStreamReader(url.openStream()));
            in.lines().forEach(System.out::println);
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
    }
}

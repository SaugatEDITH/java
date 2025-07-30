import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class URLConnectionPrint_20 {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://example.com");
            HttpURLConnection con= (HttpURLConnection)url.openConnection();
            System.out.println("The HttpURL Connection's URL: "+con.getURL());
            System.out.println("The Lastmodified: "+new Date(con.getLastModified()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

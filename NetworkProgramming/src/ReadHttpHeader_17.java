import java.net.HttpURLConnection;
import java.net.URL;

public class ReadHttpHeader_17 {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://www.google.com");
            HttpURLConnection con=(HttpURLConnection) url.openConnection();
            //for getting specific header
            System.out.println("content-type :"+con.getHeaderField("content-Type"));
            System.out.println("server :"+con.getHeaderField("Server"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

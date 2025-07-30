import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPRequestMethod_19 {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://www.google.com");
            HttpURLConnection con=(HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            System.out.println("Request method :"+con.getRequestMethod());
            System.out.println("Response-code: :"+con.getResponseCode());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Download_page11 {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://www.google.com");
            BufferedReader in=new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine=in.readLine())!=null){
                System.out.println(inputLine);
            }
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

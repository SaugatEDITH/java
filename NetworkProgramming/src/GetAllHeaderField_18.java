import java.net.HttpURLConnection;
import java.net.URL;

public class GetAllHeaderField_18 {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://www.google.com");
            HttpURLConnection con=(HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            int i=1;
            String header;
            while ((header=con.getHeaderFieldKey(i))!=null){
                System.out.println("Header: "+header);
                i++;
            }
            con.disconnect();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }}

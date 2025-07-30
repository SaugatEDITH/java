import java.net.URL;

public class Split_URL_9 {
    public static void main(String[] args) {
        try{
URL url=new URL("https://saikripa.com.np/index.html?name=hari&age=15");
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
            System.out.println("Port: "+url.getPort());
            System.out.println("Path: "+url.getPath());
            System.out.println("query "+url.getQuery());
            System.out.println("Refragment: "+url.getRef());
        }catch (Exception e){}
    }
}

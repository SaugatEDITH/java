import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Time_fetch_24 {
    public static void main(String[] args) {
        try{
            Socket sc=new Socket("time.nist.gov",13);
            InputStream in=sc.getInputStream();
            InputStreamReader isr=new InputStreamReader(in,"ASCII");
            BufferedReader br=new BufferedReader(isr);
            br.lines().forEach(System.out::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

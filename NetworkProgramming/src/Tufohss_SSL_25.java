import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.Socket;

public class Tufohss_SSL_25 {
    public static void main(String[] args) {
        try{
            SSLSocketFactory factory=(SSLSocketFactory)SSLSocketFactory.getDefault();
            SSLSocket s=(SSLSocket)factory.createSocket("tufohss.edu.np",443);
            //get
            // Send HTTP GET request
            PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"UTF-8"));
            out.println("GET / HTTP/1.1");
            out.println("Host: tufohss.edu.np");
            out.println("Connection: close");
            out.println();  // Blank line to end headers
            out.flush();
            //read
            BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
            in.lines().forEach(System.out::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

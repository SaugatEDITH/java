import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.DataInputStream;
import java.net.Socket;

public class SSLCLient_26 {
    public static void main(String[] args) {
        try {
            SSLSocketFactory factory=(SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket s=(SSLSocket) factory.createSocket("localhost",5000);
            DataInputStream in=new DataInputStream(s.getInputStream());
            String msg= in.readUTF();
            System.out.println(msg);
//            System.out.println(in.readUTF().toString());
            s.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

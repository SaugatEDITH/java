import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import java.io.DataOutputStream;
import java.net.Socket;

public class SSLServer_26 {
    public static void main(String[] args) {
        try {
            SSLServerSocketFactory factory=(SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            SSLServerSocket ss=(SSLServerSocket)factory.createServerSocket(5000);
            SSLSocket socket=(SSLSocket) ss.accept();
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
            out.writeUTF("Hello from Server");
            socket.close();
        }catch (Exception e){System.out.println(e.getMessage());}
    }
}

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.net.*;
import java.io.*;
public class SSLClientSockets {
    public static void main(String[] args) throws Exception{
        SSLSocketFactory factory =(SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket sc=(SSLSocket) factory.createSocket("localhost",5555);
        DataOutputStream out=new DataOutputStream(sc.getOutputStream());
        out.writeUTF("Hello from client");
        DataInputStream in=new DataInputStream(sc.getInputStream());
        System.out.println(in.readUTF());
    }
}

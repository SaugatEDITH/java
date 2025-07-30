
import java.io.*;
import java.net.*;
import javax.net.ssl.*;
public class SSLServerSockets {
    public static void main(String[] args) {
        try{
            SSLServerSocketFactory factory=(SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            SSLServerSocket ss=(SSLServerSocket) factory.createServerSocket(5555);
            SSLSocket socket=(SSLSocket) ss.accept();
            DataInputStream in=new DataInputStream(socket.getInputStream());
            System.out.println(in.readUTF());
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
            out.writeUTF("Jhola gang");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

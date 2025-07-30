import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientPrime001 {
    public static void main(String[] args) {
        try{
           Socket sc=new Socket("localhost",5000);
            DataOutputStream out=new DataOutputStream(sc.getOutputStream());
            out.writeUTF("7");
            DataInputStream in=new DataInputStream(sc.getInputStream());
            System.out.println(in.readUTF());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

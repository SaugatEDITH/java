import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPrime001 {
    public static void main(String[] args) {
        try{
            ServerSocket sc=new ServerSocket(5000);
            Socket socket=sc.accept();
            DataInputStream in=new DataInputStream(socket.getInputStream());
            int number=Integer.parseInt(in.readUTF().trim());
            int till=(int) Math.floor(Math.sqrt(number));
            boolean isPrime=true;
            for(int i=2;i<=till;i++){
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
            out.writeUTF(String.valueOf(isPrime));
            socket.close();
            sc.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

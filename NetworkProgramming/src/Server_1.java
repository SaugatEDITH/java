import java.net.*;
import java.io.*;
public class Server_1 {
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(5555);
            Socket sc=ss.accept();
            DataInputStream input=new DataInputStream(sc.getInputStream());
            int data=Integer.parseInt(input.readUTF());
            System.out.println(data);
            String sendingValue=String.valueOf(data*data);
            DataOutputStream out=new DataOutputStream(sc.getOutputStream());
            out.writeUTF(sendingValue);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

import java.net.*;
import java.io.*;
public class Client_1 {
    public static void main(String[] args) {
        try{
            Socket sc=new Socket("localhost",5555);
            DataOutputStream out=new DataOutputStream(sc.getOutputStream());
            out.writeUTF("2");
            DataInputStream in=new DataInputStream(sc.getInputStream());
            String data=in.readUTF();
            System.out.println(data);

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
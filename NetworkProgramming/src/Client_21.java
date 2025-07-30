import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client_21 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        Socket s=new Socket("localhost",5555);
        DataInputStream in=new DataInputStream(s.getInputStream());
        DataOutputStream out=new DataOutputStream(s.getOutputStream());
        String serverMsg,clientMsg;
        while(true){
            serverMsg=in.readUTF();
            System.out.println("Server msg: "+serverMsg);
            System.out.println();
            System.out.println("Write your msg: ");
            clientMsg=sc.nextLine();
            out.writeUTF(clientMsg);
            if("bye".equals(clientMsg.toLowerCase().trim())){
                break;
            }
            System.out.println("Server is typing...");

        }
    s.close();
        in.close();
        out.close();
    }
}

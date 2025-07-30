import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Server_21 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        ServerSocket ss=new ServerSocket(5555);
        Socket s=ss.accept();
        DataOutputStream out=new DataOutputStream(s.getOutputStream());
        DataInputStream in=new DataInputStream(s.getInputStream());
        String serverMsg,clientMsg;
        while (true){
            System.out.println("Enter the message : ");
            serverMsg=sc.nextLine();
            out.writeUTF(serverMsg);
            if("bye".equals(serverMsg.toLowerCase().trim())){
                break;
            }
            System.out.println("Client is Typing ...");
            clientMsg=in.readUTF();
            System.out.println("Client msg : "+clientMsg);
        }
        out.close();
        in.close();
        s.close();
    }
}

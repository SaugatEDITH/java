import java.io.*;
import java.net.*;
public class PrintLocalHostAddress_3 {
    public static void main(String[] args) {
        try{
            InetAddress address=InetAddress.getLocalHost();
            System.out.println(address);

        }catch(UnknownHostException e){}
    }
}

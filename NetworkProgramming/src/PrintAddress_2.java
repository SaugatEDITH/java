import java.net.*;
import java.io.*;
public class PrintAddress_2 {
    public static void main(String[] args) {
        try{
            InetAddress address1=InetAddress.getByName("www.tufohss.edu.np");
            System.out.println(address1);

        }catch(UnknownHostException e){

        }
    }
}

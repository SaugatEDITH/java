import java.io.*;
import java.net.*;
public class Ipv4ORIpv6_4 {
    public static void main(String[] args) {
        try{
            InetAddress address1=InetAddress.getByName("192.168.1.66");
            InetAddress address2=InetAddress.getByName("2600::");
            if(address1 instanceof Inet4Address){
                System.out.println("Its ipv4 :"+address1);
            }else if(address1 instanceof Inet6Address){
                System.out.println("its ipv6 :"+address1);
            }
            if(address2 instanceof Inet4Address){
                System.out.println("Its ipv4 :"+address2);
            }else if(address2 instanceof Inet6Address){
                System.out.println("its ipv6 :"+address2);
            }
        }catch(IOException e){}
    }
}

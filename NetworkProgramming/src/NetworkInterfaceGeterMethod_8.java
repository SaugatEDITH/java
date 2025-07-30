import java.net.NetworkInterface;
import java.net.Socket;
import java.util.Enumeration;

public class NetworkInterfaceGeterMethod_8 {
    public static void main(String[] args) {
        try{
            Enumeration<NetworkInterface> ni=NetworkInterface.getNetworkInterfaces();
            while(ni.hasMoreElements()){
                NetworkInterface device=ni.nextElement();
                System.out.println("Name: "+device.getName());
                System.out.println("Display Name: "+device.getDisplayName());
                System.out.println("isUp: "+device.isUp());
                System.out.println("Multicast : "+device.supportsMulticast());
                System.out.println("loopback : "+device.isLoopback());
                System.out.println("-----------------------------------");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

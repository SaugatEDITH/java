import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Checking_001 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> ni=NetworkInterface.getNetworkInterfaces();
            while (ni.hasMoreElements()){
                NetworkInterface device=ni.nextElement();
                byte[] mac=device.getHardwareAddress();
                StringBuilder macBuild=new StringBuilder();
                for (byte b:mac){
                    macBuild.append(String.format("%02X:",b));
                }
                System.out.println(macBuild.substring(0,17));
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }
}

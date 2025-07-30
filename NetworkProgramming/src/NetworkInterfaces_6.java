import java.io.*;
import java.net.*;
import java.util.Enumeration;

public class NetworkInterfaces_6 {
    public static void main(String[] args) {
        try{
            Enumeration<NetworkInterface> ni=NetworkInterface.getNetworkInterfaces();
            while (ni.hasMoreElements()){
                NetworkInterface device=ni.nextElement();
                System.out.println(device);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

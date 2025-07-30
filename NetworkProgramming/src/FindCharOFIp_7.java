import java.net.InetAddress;

public class FindCharOFIp_7 {
    public static void main(String[] args) {
        try{
            InetAddress address=InetAddress.getByName("127.0.0.1");
            System.out.println("Is Local: "+address.isAnyLocalAddress());
            System.out.println("Is Multicast: "+address.isMulticastAddress());
            System.out.println("Is Looopback: "+address.isLoopbackAddress());
            System.out.println("Is LinkLocal: "+address.isLinkLocalAddress());
            System.out.println("Is SiteLocal: "+address.isSiteLocalAddress());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

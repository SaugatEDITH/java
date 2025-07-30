import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPDateClient {
    public static void main(String[] args) {
        try{
        DatagramSocket sc=new DatagramSocket();
        byte[] buffer="We need date!".getBytes();
            InetAddress address=InetAddress.getByName("localhost");
        DatagramPacket pktout=new DatagramPacket(buffer,buffer.length,address,5000);
        sc.send(pktout);

        byte[] data=new byte[2000];
        DatagramPacket pktin=new DatagramPacket(data, data.length);
        sc.receive(pktin);
        String dateresult=new String(pktin.getData(),0,pktin.getLength());
            System.out.println(dateresult);
            sc.close();
    } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

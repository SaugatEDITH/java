import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class BasicUDP_Server_30 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket=new DatagramSocket(5555);
            byte[] receivData=new byte[1024];
            System.out.println("Date Time server is running: ");
            while (true){
                DatagramPacket receivedPacket=new DatagramPacket(receivData,receivData.length);
                socket.receive(receivedPacket);
                String msg=new String(receivedPacket.getData(),0,receivedPacket.getLength());
                System.out.println("received msg is: "+msg);
                InetAddress clientAddress=receivedPacket.getAddress();
                int clientPort=receivedPacket.getPort();
                String dateTime=new Date().toString();
                DatagramPacket sendPacket=new DatagramPacket(dateTime.getBytes(),dateTime.length(),clientAddress,clientPort);
                socket.send(sendPacket);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

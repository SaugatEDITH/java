import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BasicUDP_Client_30 {
    public static void main(String[] args) {
        try{
            DatagramSocket socket=new DatagramSocket();
            InetAddress serverAddress=InetAddress.getByName("localhost");
            byte [] sendData="Requesting DateTime:".getBytes();
            DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,serverAddress,5555);
            socket.send(sendPacket);
            byte[] receivedData=new byte[1024];
            DatagramPacket receivedPacket=new DatagramPacket(receivedData,receivedData.length);
            socket.receive(receivedPacket);
            String DataTime=new String(receivedPacket.getData(),0,receivedPacket.getLength());
            System.out.println(DataTime);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

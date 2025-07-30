
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Multicast_Sender_Server_32 {
    public static void main(String[] args) {
        try {
            // Multicast group IP (must be in range 224.0.0.0 to 239.255.255.255)
            InetAddress group = InetAddress.getByName("230.0.0.1");


            MulticastSocket socket = new MulticastSocket();

            String message = "Hello multicast group!";
            byte[] buffer = message.getBytes();

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, group, 5555);

            socket.send(packet);
            System.out.println("Multicast message sent.");

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

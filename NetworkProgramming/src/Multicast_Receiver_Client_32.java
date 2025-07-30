import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Multicast_Receiver_Client_32 {
    public static void main(String[] args) {
        try {

            InetAddress group = InetAddress.getByName("230.0.0.1");

            MulticastSocket socket = new MulticastSocket(5555);
            socket.joinGroup(group); // Join multicast group

            System.out.println("Multicast Receiver joined group. Waiting for messages...");

            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            // Receive one message
            socket.receive(packet);

            String received = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received multicast message: " + received);

            socket.leaveGroup(group); // Optional: Leave the group
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

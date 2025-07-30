import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPPortScanner {
    public static void main(String[] args) {
        for (int port = 1024; port <= 6535; port++) {
            try {
                DatagramSocket socket = new DatagramSocket(port);
                socket.close();
                System.out.println("Port " + port + " is open.");
            } catch (SocketException ex) {
                System.out.println("Port " + port + " is closed.");
            }
        }
    }
}

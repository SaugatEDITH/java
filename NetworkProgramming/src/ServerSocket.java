import java.net.Socket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

public class ServerSocket {
    public static void main(String[] args) {
        try {
            SSLServerSocketFactory factory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            SSLServerSocket serverSocket = (SSLServerSocket) factory.createServerSocket(1422);
            System.out.println("Waiting for the client to connect...");

            Socket socket = serverSocket.accept();  // Accept client connection
            System.out.println("Client accepted and connected...");

            socket.close();
            serverSocket.close();  // Close the server socket when done
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
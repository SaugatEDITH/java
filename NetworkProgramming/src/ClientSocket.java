import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class ClientSocket{
    public static void main(String[] args) {
        try {
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket socket = (SSLSocket) factory.createSocket("localhost", 1422); // Connect to server

            System.out.println("Connected to server...");

            // Sending a message to the server
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream, true);
            writer.println("Hello, Server!");

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
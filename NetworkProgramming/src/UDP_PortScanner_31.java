import java.net.DatagramSocket;

public class UDP_PortScanner_31 {
    public static void main(String[] args) {
        try{
            for (int port=1024;port<65535;port++){
            DatagramSocket socket=new DatagramSocket(port);
            System.out.println("Its valid and working: "+port);
            socket.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

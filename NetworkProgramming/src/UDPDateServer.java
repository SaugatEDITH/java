import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Date;

public class UDPDateServer {
    public static void main(String[] args) {
        try {
            DatagramSocket sc=new DatagramSocket(5000);
            byte [] buffer=new byte[1024];
            DatagramPacket pktin=new DatagramPacket(buffer,buffer.length);
            sc.receive(pktin);
            String msgin=new String(pktin.getData(),0,pktin.getLength());
            System.out.println("User msg is: "+msgin);

            //send from server

            byte [] date=new Date().toString().getBytes();
            DatagramPacket pktout=new DatagramPacket(date,date.length,pktin.getAddress(),pktin.getPort());
            sc.send(pktout);
            sc.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

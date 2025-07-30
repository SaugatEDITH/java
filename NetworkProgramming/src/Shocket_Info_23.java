import java.net.Socket;

public class Shocket_Info_23 {
    public static void main(String[] args) {
        try {
         Socket s=new Socket("example.com",80);
            System.out.println("Remote Address "+s.getInetAddress());
            System.out.println("Remote port: "+s.getPort());
            System.out.println("Local Address: "+s.getLocalAddress());
            System.out.println("localPort :"+s.getLocalPort());
            s.close();

        }catch (Exception e){e.printStackTrace();
        }
    }
}

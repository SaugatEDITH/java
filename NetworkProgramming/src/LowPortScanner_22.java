import java.net.Socket;


public class LowPortScanner_22 {
    public static void main(String[] args) {
            for(int i=1;i<=1024;i++){
                try{
                Socket sc=new Socket("localhost",i);
                System.out.println("The port no: "+i+" is open ");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
    }
}

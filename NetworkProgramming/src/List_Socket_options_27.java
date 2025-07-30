import java.net.SocketOption;
import java.nio.channels.SocketChannel;
import java.util.Set;

public class List_Socket_options_27 {
    public static void main(String[] args) {
        try{
            SocketChannel sc=SocketChannel.open();
            Set<SocketOption<?>> option=sc.supportedOptions();
            System.out.println("Supported socket options are:");
            for (SocketOption<?> op:option){
                System.out.println(op.name());
            }
            sc.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

import java.nio.ByteBuffer;

public class DataConversion_29 {
    public static void main(String[] args) {
        ByteBuffer buffer=ByteBuffer.allocate(16);
        buffer.putInt(55);
        buffer.flip();
        int valueInt=buffer.getInt();
        System.out.println(valueInt);
        buffer.clear();
        buffer.putDouble(3.14);
        buffer.flip();
        Double valueDouble=buffer.getDouble();
        System.out.println(valueDouble);
    }
}

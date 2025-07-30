import java.nio.ByteBuffer;

public class FillingDraining {
    public static void main(String[] args) {
        // Create a ByteBuffer with a capacity of 10
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Filling the buffer
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte) i);
        }

        // Switch to read mode
        buffer.flip();

        // Draining the buffer
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }

        // Clear the buffer for reuse
        buffer.clear();
    }
}

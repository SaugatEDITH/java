import java.nio.ByteBuffer;

public class Buffer_operation_28 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10); // buffer declaring

        // Filling buffer
        for (byte i = 0; i < buffer.capacity(); i++) {
            buffer.put(i);
        }

        buffer.flip();
        System.out.println("Draining buffer");
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get());
        }

        buffer.clear(); // Reset before reusing

        // Re-filling buffer
        for (byte i = 0; i < buffer.capacity(); i++) {
            buffer.put(i);
        }

        buffer.flip(); // Prepare for reading before duplicating
        ByteBuffer duplicateBuffer = buffer.duplicate();
        System.out.println("\nDuplicated buffer: ");
        while (duplicateBuffer.hasRemaining()) {
            System.out.println("the dup buffer is: " + duplicateBuffer.get());
        }

        System.out.println();

        // Sliced buffer
        buffer.position(3);
        buffer.limit(7);
        ByteBuffer bufferSliced = buffer.slice(); // Correct slicing
        System.out.println("Buffer Sliced ");
        while (bufferSliced.hasRemaining()) {
            System.out.println("Sliced buffer: " + bufferSliced.get()); // ✅ fixed
        }

        buffer.clear(); // Reset before reuse

        for (byte i = 0; i < 6; i++) {
            buffer.put(i);
        }

        buffer.flip();
        System.out.println("one byte value of buffer: " + buffer.get());

        // Compact buffer
        buffer.compact();
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.println("Compacted buffer: " + buffer.get());
        }
    }
}

import java.nio.ByteBuffer;

public class BufferDuplication {
    public static void main(String[] args) {
        // Create a ByteBuffer with a capacity of 10
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Fill the buffer with some data
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte) i);
        }
        buffer.flip();
        // Duplicate the buffer
        ByteBuffer duplicateBuffer = buffer.duplicate();
        duplicateBuffer.rewind();//na gare ne hunxa mathi kai flip le kam garxa

        // Print the original and duplicated buffers
        System.out.println("Original Buffer: " + buffer);
        while(buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        System.out.println(); // New line for better readability
        System.out.println("Duplicated Buffer: " + duplicateBuffer);
        while(duplicateBuffer.hasRemaining()) {
            System.out.print(duplicateBuffer.get() + " ");
        }
        System.out.println(); // New line for better readability
        
    }
    
}

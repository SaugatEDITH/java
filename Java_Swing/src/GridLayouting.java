import java.awt.*; // Importing the AWT package for layout management
import javax.swing.*; // Importing the Swing package for GUI components

// This class demonstrates the use of GridLayout in a Swing application
public class GridLayouting {
    public static void main(String[] args) {
        
        // Create a new JFrame (main window)
        JFrame frame = new JFrame();
        frame.setTitle("GridLayout"); // Set the title of the frame
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); // Close the application when the frame is closed
        frame.setSize(520, 520); // Set the size of the frame
        
        // Set the layout of the frame to GridLayout with 3 rows, 3 columns, and 10px gaps
        frame.setLayout(new GridLayout(3, 3, 10, 10));
        
        // Add buttons to the frame
        frame.add(new JButton("1")); // Button 1
        frame.add(new JButton("2")); // Button 2
        frame.add(new JButton("3")); // Button 3
        frame.add(new JButton("4")); // Button 4
        frame.add(new JButton("5")); // Button 5
        frame.add(new JButton("6")); // Button 6
        frame.add(new JButton("7")); // Button 7
        frame.add(new JButton("8")); // Button 8
        frame.add(new JButton("9")); // Button 9
        frame.add(new JButton("10")); // Button 10 (extra button, will not fit in the 3x3 grid)
        
        frame.setVisible(true); // Make the frame visible
    }
}

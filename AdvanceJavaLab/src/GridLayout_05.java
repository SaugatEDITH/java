import javax.swing.*;
import java.awt.*;

public class GridLayout_05 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Example");
        
        // Set GridLayout for the frame
        frame.setSize(512, 512);
        frame.setLayout(new GridLayout(3, 2)); // 3 rows, 2 columns
        
        // Add components to the grid
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JTextArea("Text Area"));
        frame.add(new JLabel("Label"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

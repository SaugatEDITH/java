//! pannel is an gui component that functions as an container for other elements
import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame();
        frame.setTitle("JPanel Example");
        frame.setSize(520, 520);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Disable layout manager for absolute positioning

        // Create Red Panel
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());

        // Create Blue Panel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(new BorderLayout());
        // Create Green Panel
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 250, 250);
        greenPanel.setLayout(new BorderLayout());

        // Create Yellow Panel
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        yellowPanel.setBounds(250, 250, 250, 250);
        JLabel label=new JLabel("Hi!");
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        redPanel.add(label);

        // Add panels to frame
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.add(yellowPanel);

        // Make frame visible
        frame.setVisible(true);
    }
}

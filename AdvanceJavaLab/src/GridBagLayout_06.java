import javax.swing.*;
import java.awt.*;
class GridBag extends JFrame{
    GridBag(){
        this.setTitle("Grid Bag Layout");
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding between components

        JButton button1 = new JButton("Button 1");
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(button1, gbc);

        JButton button2 = new JButton("Button 2");
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(button2, gbc);

        JButton button3 = new JButton("Button 3");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // Span two columns
        this.add(button3, gbc);

        JButton button4 = new JButton("Button 4");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1; // Reset to default
        this.add(button4, gbc);

        JButton button5 = new JButton("Button 5");
        gbc.gridx = 1;
        gbc.gridy = 2;
        this.add(button5, gbc);

        this.pack(); // Adjust frame size to fit components
        this.setVisible(true);
    }
}
public class GridBagLayout_06 {
    public static void main(String[] args) {
        new GridBag();
    }
}

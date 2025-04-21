import javax.swing.*;
import java.awt.*;
public class BorderLayout_04{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(512,512);
        frame.setLayout(new BorderLayout());
        frame.setTitle("Border Layout ");
        frame.add(new JButton("East"),BorderLayout.EAST);
        frame.add(new JButton("West"),BorderLayout.WEST);
        frame.add(new JTextArea("Center"),BorderLayout.CENTER);
        frame.add(new JLabel("North"),BorderLayout.NORTH);
        frame.add(new JButton("South"),BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

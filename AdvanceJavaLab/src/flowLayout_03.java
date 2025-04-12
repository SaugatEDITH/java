import javax.swing.*;
import java.awt.*;
public class flowLayout_03 {
    public static void main(String[] args){
        JFrame frame=new JFrame("flow layout");
        frame.setLayout(new FlowLayout());
        frame.setSize(512,512);
        frame.add(new JLabel("Name:"));
        JTextField text1=new JTextField();
        text1.setPreferredSize(new Dimension(200, 30));
        frame.add(text1);
        frame.add(new JButton("Submit"));
        frame.add(new JButton("Cancel"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

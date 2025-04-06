import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
public class FlowLayouting {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("FlowLayout");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        frame.setSize(520,520);
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");
        JButton b7=new JButton("7");
        JButton b8=new JButton("8");
        JButton b9=new JButton("9");
        JPanel panel =new JPanel();
        panel.setPreferredSize(new Dimension(200,250));
        panel.setBackground(Color.CYAN);
        panel.setLayout(new FlowLayout());
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        frame.add(panel);
        frame.setVisible(true);
    }
}

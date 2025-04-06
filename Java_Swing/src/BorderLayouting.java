import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.*;
public class BorderLayouting {
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setTitle("BorderLayout");
        frame.setSize(520,520);
        frame.setLayout(new BorderLayout(10,10));
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();
        JPanel panel5=new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.BLACK);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        panel5.setLayout(new BorderLayout(10,10));
// setting pannel as an inner frame
JPanel panel6=new JPanel();
JPanel panel7=new JPanel();
JPanel panel8=new JPanel();
JPanel panel9=new JPanel();
JPanel panel10=new JPanel();
panel6.setBackground(Color.CYAN);
panel7.setBackground(Color.MAGENTA);
panel8.setBackground(Color.WHITE);
panel9.setBackground(Color.PINK);
panel10.setBackground(Color.ORANGE);

panel6.setPreferredSize(new Dimension(100,100));
panel7.setPreferredSize(new Dimension(100,100));
panel8.setPreferredSize(new Dimension(100,100));
panel9.setPreferredSize(new Dimension(100,100));
panel10.setPreferredSize(new Dimension(100,100));



panel5.add(panel6, BorderLayout.NORTH);
panel5.add(panel7,BorderLayout.WEST);
panel5.add(panel8,BorderLayout.EAST);
panel5.add(panel9,BorderLayout.SOUTH);
panel5.add(panel10,BorderLayout.CENTER);
        

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);
    }
}

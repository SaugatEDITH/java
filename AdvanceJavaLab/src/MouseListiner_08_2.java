import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListiner_08_2 extends MouseAdapter {
    JTextField t1, t2;
    JLabel l1;

    public MouseListiner_08_2() {
        JFrame frame=new JFrame("Mouse Listiner v2");
        frame.setSize(512, 512);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Enter Number one:"));
        t1 = new JTextField(10);
        frame.add(t1);
        frame.add(new JLabel("Enter Number two:"));
        t2 = new JTextField(10);
        frame.add(t2);
        JButton b1 = new JButton("Submit");
        frame.add(b1);
        l1 = new JLabel();
        frame.add(l1);
        b1.addMouseListener(this);
        frame.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int result = num1 + num2;
        l1.setText("the sum of " + num1 + " and " + num2 + " is: " + result);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int result = num1 - num2;
        l1.setText("The subtraction of " + num1 + " and " + num2 + " is " + result);
    }

    
    public static void main(String[] args) {
        new MouseListiner_08_2();
    }
}

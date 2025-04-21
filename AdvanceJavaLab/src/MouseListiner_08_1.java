import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListiner_08_1 extends JFrame implements MouseListener {
    JTextField t1, t2;
    JLabel l1;

    public MouseListiner_08_1() {
        setSize(512, 512);
        setTitle("Mouse Listiner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(new JLabel("Enter Number one:"));
        t1 = new JTextField(10);
        add(t1);
        add(new JLabel("Enter Number two:"));
        t2 = new JTextField(10);
        add(t2);
        JButton b1 = new JButton("Submit");
        add(b1);
        l1 = new JLabel();
        add(l1);
        b1.addMouseListener(this);
        setVisible(true);
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

    @Override
    public void mouseEntered(MouseEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int result = num1 - num2;
        l1.setText("The subtraction of " + num1 + " and " + num2 + " is " + result);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int result = num1 - num2;
        l1.setText("The subtraction of " + num1 + " and " + num2 + " is " + result);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseListiner_08_1();
    }
}

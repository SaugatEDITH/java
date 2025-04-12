import javax.swing.*;
import java.awt.*;

public class showForm_01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setSize(512, 512);
        frame.setLayout(null); // Use absolute positioning
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("First Name:");
        l1.setBounds(20, 20, 100, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(130, 20, 200, 30);

        JLabel l2 = new JLabel("Last Name:");
        l2.setBounds(20, 60, 100, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(130, 60, 200, 30);

        JLabel l3 = new JLabel("Email:");
        l3.setBounds(20, 100, 100, 30);
        JTextField t3 = new JTextField();
        t3.setBounds(130, 100, 200, 30);

        JLabel l4 = new JLabel("Password:");
        l4.setBounds(20, 140, 100, 30);
        JPasswordField p1 = new JPasswordField();
        p1.setBounds(130, 140, 200, 30);

        JLabel l5 = new JLabel("Gender:");
        l5.setBounds(20, 180, 100, 30);
        JRadioButton b1 = new JRadioButton("Male");
        b1.setBounds(130, 180, 70, 30);
        JRadioButton b2 = new JRadioButton("Female");
        b2.setBounds(200, 180, 80, 30);
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(b1);
        btnGroup.add(b2);

        JLabel l6 = new JLabel("What Do You Prefer:");
        l6.setBounds(20, 220, 150, 30);
        JCheckBox c1 = new JCheckBox("Cat");
        c1.setBounds(130, 220, 70, 30);
        JCheckBox c2 = new JCheckBox("Dog");
        c2.setBounds(200, 220, 70, 30);
        JCheckBox c3 = new JCheckBox("Racoon");
        c3.setBounds(270, 220, 80, 30);
        JLabel address=new JLabel("Address:");
        address.setBounds(20,260,100,30);
        String[] province = {"Bagmati", "Province 1", "Madhes"};
        JComboBox<String> combo = new JComboBox<>(province);
        combo.setBounds(130, 260, 200, 30);

        JButton btn = new JButton("Submit");
        btn.setBounds(200, 310, 100, 30);

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(l4);
        frame.add(p1);
        frame.add(l5);
        frame.add(b1);
        frame.add(b2);
        frame.add(l6);
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(address);
        frame.add(combo);
        frame.add(btn);

        frame.setVisible(true);
    }
}

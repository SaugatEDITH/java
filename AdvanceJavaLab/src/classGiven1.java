import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class classGiven1 extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1, t2, t3;
    JButton b1;
    classGiven1(){
        setTitle("Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(512,512);
        l1=new JLabel("First Number: ");
        l2=new JLabel("Second Number");
        l3=new JLabel("Result");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        b1=new JButton("Add");
        b1.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int add=num1+num2;
            t3.setText(String.valueOf(add));
        }
    }
public static void main(String[] args) {
    new classGiven1();
}

}

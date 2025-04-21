import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;


class ActionEventing extends JFrame implements ActionListener{
JButton b1=new JButton("Submit");
JTextField t1,t2;
JLabel l1 = new JLabel(); // Initialize JLabel to avoid null pointer exception
ActionEventing(){
    this.setLayout(new FlowLayout());
    this.setSize(512,512);
    this.add(new JLabel("First Number:"));
    t1=new JTextField(10);
    this.add(t1);
    this.add(new JLabel("Second Number:"));
    t2=new JTextField(10);
    this.add(t2);
    this.add(b1);
    b1.addActionListener(this);
    this.add(l1);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);

}
@Override
public void actionPerformed(ActionEvent e){ // Correct method name to match ActionListener interface
    if(e.getSource()==b1){
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int ans=num1+num2;
    l1.setText("Sum of "+num1+" & "+num2+" is :"+ans);
    }
}
}
public class ActionEvent_07 {
    public static void main(String[] args) {
        new ActionEventing();
    }
}

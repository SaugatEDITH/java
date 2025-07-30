import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
public class FocusListener_09 extends JFrame implements FocusListener{
    JTextField t1,t2;
    JLabel l1,l2,l3;
    FocusListener_09(){
        setTitle("FocusListiner");
        setLayout(new FlowLayout());
        setSize(512,512);
        setVisible(true);
        l1=new JLabel("Enter number one: ");
        t1=new JTextField(10);
        l2=new JLabel("Enter number two: ");
        t2=new JTextField(10);
        l3=new JLabel();
        JButton button=new JButton("Submit");
        button.addFocusListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(button);
    }
    @Override
    public void focusGained(FocusEvent e){
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int result=num1+num2;
        l3.setText("its on FocusGained and sum of "+num1+" and "+num2+"is: " +result);
    }
    @Override
    public void focusLost(FocusEvent e){
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int result=num1-num2;
        l3.setText("its on FocusLost and sub of "+num1+" and "+num2+" is: "+result);
    }
    public static void main(String[] args) {
        new FocusListener_09();
    }
}

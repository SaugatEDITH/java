import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiButton_13 extends JFrame implements ActionListener {
    JTextField t1;
    JButton B1,B2,B3;
    JLabel label;
    MultiButton_13(){
        setTitle("Multi Buttons");
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(512,512);
        t1=new JTextField(30);
        B1=new JButton("Pallindrom");
        B1.addActionListener(this);
        B2=new JButton("Reverse");
        B2.addActionListener(this);
        B3=new JButton("Find Vowel");
        B3.addActionListener(this);
        add(t1);
        add(B1);
        add(B2);
        add(B3);
        label=new JLabel();
        add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==B1){
            String text1=t1.getText().toString();
            String reverse="";
            // int lengthOfStr=text1.length();
            for(int i=text1.length()-1;i>=0;i--){

                reverse+=text1.charAt(i);
            }
            if (text1.equals(reverse)){
                label.setText("Its pallindrom");
            }else{
                label.setText("Not palindrom");
            }
        }else if(e.getSource()==B2){
            String text1=t1.getText();
            text1.split("");
            String text2="";
            int lengthOfStr=text1.length();
            for(int i=lengthOfStr-1;i>=0;i--){
                text2+=text1.charAt(i);

            }
            
label.setText(text2);
        }else if(e.getSource()==B3){
            String text1=t1.getText();
            String vowel="";
            for(char element:new char [] {'a','e','i','o','u','A','E','I','O','U'}){
                if (text1.contains(String.valueOf(element))) {
                    vowel+=element;
                }
            }
            label.setText(vowel);
        }else{
            label.setText("Wrong Interaction");
        }
    }
public static void main(String[] args) {
    new MultiButton_13();
}
}

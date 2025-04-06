import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    Myframe(){
        this.setSize(520,520);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        JLabel label=new JLabel("Name:");
        textField=new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        button=new JButton("Submit");
        button.addActionListener(this);
        this.add(label);
        this.add(textField);
        this.add(button);
        this.setVisible(true);
        this.pack();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== button){
            System.out.println("Welcome "+textField.getText()); 
        }
    }
}
class JTextFields{
    public static void main(String[] args) {
        Myframe frame=new Myframe();
    }
}
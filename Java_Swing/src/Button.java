import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyButton extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    public MyButton(){
        this.setVisible(true);
        this.setSize(520,520);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Buttoning");
        button=new JButton("Click me");
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        button.setForeground(Color.red);
        button.setBackground(Color.green);
        this.add(button);
        label=new JLabel("Hello Boo!");
        label.setBounds(150,250,150,150);
        label.setVisible(false);
        this.add(label);
    }
    // @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== button){
            System.out.println("Boo");
            label.setVisible(true);
            
        }
    }
}
class Button{
    public static void main(String[] args){
        MyButton button=new MyButton();
    }
}
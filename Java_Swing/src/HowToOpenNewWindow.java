import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NewWindow extends JFrame{
NewWindow(){
    this.setTitle("New Opened Window");
    this.setVisible(true);
    this.setSize(240,240);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    JLabel label=new JLabel("Hello New Window");
    label.setBounds(0,0,100,50);
    label.setFont(new Font("Arial", Font.PLAIN, 25));
    this.add(label);
}
}


class LaunchPage implements ActionListener {
    JFrame frame=new JFrame();
    JButton button=new JButton("New Window");

    public LaunchPage(){
        button.setBounds(100,150,200,40);
        button.addActionListener(this);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("New Window");
        frame.setSize(520,520);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    //event tregering the instansiation of new window and close of old
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== button){
            frame.dispose();
new NewWindow();
        }
    }
}


public class HowToOpenNewWindow {
    public static void main(String[] args) {
        LaunchPage lp=new LaunchPage();
    }
}

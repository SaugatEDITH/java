import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener{
JRadioButton pizzaButton,hamburgerButton,hotdogButton;
MyFrame(){
    this.setSize(520,520);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    this.setTitle("JCheckBox");
    this.setLayout(new FlowLayout());
    // this.pack();
    pizzaButton=new JRadioButton("pizza");
    hamburgerButton=new JRadioButton("hamburger");
    hotdogButton=new JRadioButton("hotdog");
    ButtonGroup group=new ButtonGroup();
    //adding action listiner to each button
    pizzaButton.addActionListener(this);
    hamburgerButton.addActionListener(this);
    hotdogButton.addActionListener(this);
    group.add(pizzaButton);
    group.add(hamburgerButton);
    group.add(hotdogButton);
    this.add(pizzaButton);
    this.add(hamburgerButton);
    this.add(hotdogButton);
    this.setVisible(true);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==pizzaButton){
    System.out.println("Pizza in the House");
}
else if(e.getSource()==hamburgerButton){
    System.out.println("Hamburger in the house");
}
else if(e.getSource()==hotdogButton){
    System.out.println("Hotdog in the house");
}
}
}


public class JRadioButtons {
    public static void main(String[] args) {
        new MyFrame();
     } 
}

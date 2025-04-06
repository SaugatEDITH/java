import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener{
    JCheckBox checkbox;
    JButton button;
MyFrame(){
this.setVisible(true);
this.setSize(520,520);
this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
this.setTitle("JCheckBox");
this.setLayout(new FlowLayout());
checkbox=new JCheckBox();
checkbox.setText("i'm not an robot");
this.add(checkbox);
button=new JButton("submit");
button.addActionListener(this);
this.add(button);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()== button){
    System.out.println(checkbox.isSelected()); 
}
}
}
public class JCheckBoxes {
    public static void main(String[] args) {
       new MyFrame();
    }
}

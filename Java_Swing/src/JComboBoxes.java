//drop Down list
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener{
// JButton button;
JComboBox combobox;
MyFrame(){
    this.setSize(520,520);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    this.setTitle("JCheckBox");
    this.setLayout(new FlowLayout());
    
    String [] animals={"dog","cat","bird"};
    combobox=new JComboBox(animals);
    combobox.insertItemAt("unicorn", 0);
    combobox.addActionListener(this);
    
    this.add(combobox);
    this.setVisible(true);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==combobox){
   System.out.println(combobox.getSelectedItem());
   System.out.println(combobox.getSelectedIndex());
}
}
}




public class JComboBoxes {
    public static void main(String[] args) {
        new MyFrame();
        
    }
}

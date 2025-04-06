//to show dialoge Box
import java.awt.*;
import javax.swing.*;

public class JoptionPanes {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"This is some more useless info","title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"This is some much more useless info","title",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Your computer has a virus","title",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"This is some god level useless info","title",JOptionPane.ERROR_MESSAGE);
// Different type of Dialog Box
        JOptionPane.showConfirmDialog(null, "Bro do you even code", "ITs my Title", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println( JOptionPane.showConfirmDialog(null, "Why are you gae", "ITs my Title", JOptionPane.YES_NO_CANCEL_OPTION));//printing whats each button value are
        String name=JOptionPane.showInputDialog("What's your name Homie?.");
        System.out.println("Hello "+name);
//combines multiple dialog box

JOptionPane.showOptionDialog(null,"Are You Awesome","Secret Message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE, null, null, 0);
        
    }

}

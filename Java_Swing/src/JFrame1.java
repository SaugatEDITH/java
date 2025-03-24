//No.1: way to impliment JFrame using JFrame object
import javax.swing.*;
import java.awt.*;

public class JFrame1 {
     public static void main(String[] args){
        // JFrame = a GUI window to add components to
        //Way one Create an
        JFrame frame=new JFrame();
        frame.setTitle("Jframe Title"); //sets frame title
        frame.setSize(420,420); //sets frame size
        frame.setVisible(true); // makes frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cloases application on close
        frame.getContentPane().setBackground(Color.green); // changing background color using string
        frame.getContentPane().setBackground(new Color(123,50,250));//
      
    }
}

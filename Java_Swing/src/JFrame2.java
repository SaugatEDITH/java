//No.2: way to impliment JFrame using inhiritance
import javax.swing.*;
import java.awt.*;
class MyFrame extends JFrame {
public MyFrame(){

    this.setTitle("Jframe Title"); //sets frame title
    this.setSize(420,420); //sets frame size
    this.setVisible(true); // makes frame visible
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cloases application on close
    this.getContentPane().setBackground(Color.green); // changing background color using string
    this.getContentPane().setBackground(new Color(123,50,250));//
}

}
class JFrame2{
public static void main(String[] args){
    // new MyFrame();
    MyFrame my=new MyFrame();
}
}

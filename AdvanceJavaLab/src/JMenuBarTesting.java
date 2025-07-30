import javax.swing.*;
import java.awt.*;

public class JMenuBarTesting extends JFrame{
    public JMenuBarTesting(){
        setTitle("JMenu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(512,512);
        JMenuBar bar=new JMenuBar();
        JMenu m1=new JMenu("file");
        JMenu m2=new JMenu("edit");
        JMenuItem i1=new JMenuItem("save as");
        JMenuItem i2=new JMenuItem("hello");
        JMenuItem i3=new JMenuItem("Bye");
        JMenu submenu=new JMenu("Apple");
        JMenuItem si1=new JMenuItem("Ball");
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        submenu.add(si1);
        m1.add(submenu);
        bar.add(m1);
        bar.add(m2);
        setJMenuBar(bar);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JMenuBarTesting();
    }
}

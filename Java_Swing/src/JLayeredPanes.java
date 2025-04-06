//to make layer of pannel stacked up one upen another
//provide z index or depth from swing component
import java.awt.*;
import javax.swing.*;
public class JLayeredPanes {
    public static void main(String[] args) {
        
        JLayeredPane layredPane=new JLayeredPane();
        layredPane.setBounds(0,0,520,520);
        JLabel label1,label2,label3;
        label1=new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);

        label2=new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(100,100,200,200);

        label3=new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.GREEN);
        label3.setBounds(150,150,200,200);
        layredPane.add(label1,Integer.valueOf(0));
        layredPane.add(label2,Integer.valueOf(2));
        layredPane.add(label3,Integer.valueOf(1));
        JFrame frame=new JFrame();
        frame.add(layredPane);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setTitle("JLayred pane");
        frame.setSize(520,520);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}

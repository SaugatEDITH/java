import javax.swing.*;
import java.awt.*;
public class Labels {
    public static void main(String[] args){
        // JLabel label=new JLabel("Bro do you even code")
        JLabel label=new JLabel();
        //! setting text of label in different line
        label.setText("Bro do you even code");
        //! Setting Image icon on Jlabel
        ImageIcon image=new ImageIcon("code.png");
        label.setIcon(image);
        //!moving image reletive to icon image
        label.setHorizontalTextPosition(JLabel.CENTER); //text will be in center of icon (LEFT,CENTER,RIGHT)
        label.setVerticalTextPosition(JLabel.TOP); //set text (TOP,CENTER,BOTTOM) of image icon
        //! Changing Font Color
        label.setForeground(new Color(0x00FF00)); //can set using hex or rgb if used new Color
        //Other approach
        label.setForeground(Color.green); //set font color easy way
        //! setting new custom font to label
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); //set font to label (fontname,type,size)
        //! manage gap between label and icon with int
        label.setIconTextGap(-50); 
        //! set background color of label its full screen because label takes entire size of available display by default
        label.setBackground(Color.black);
        label.setOpaque(true);
        //! set label elements alignment
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text within label
       
        JFrame frame=new JFrame();
        frame.setTitle("JLabel in swing");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(label);

    }
}

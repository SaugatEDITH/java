import javax.swing.*;
import java.awt.*;
class MenuBar extends JFrame{
public MenuBar(){
this.setTitle("Menu Bar");
this.setSize(512,512);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// this.setLayout(null);
JMenuBar menuBar=new JMenuBar();
JMenu m1=new JMenu("File");
JMenu m2=new JMenu("Edit");
JMenu m3=new JMenu("Help");
JMenu  subitem=new JMenu("Extract as");
//items for file
JMenuItem i1=new JMenuItem("Open");
JMenuItem i2=new JMenuItem("Save");
JMenuItem i3=new JMenuItem("Save as");

//menu inside File for extract as
JMenuItem subitem1=new JMenuItem("PDF");
JMenuItem subitem2=new JMenuItem("CSV");
JMenuItem subitem3=new JMenuItem("TSV");
JMenuItem subitem4=new JMenuItem("Excel");
subitem.add(subitem1);
subitem.add(subitem2);
subitem.add(subitem3);
subitem.add(subitem4);
// Menu inside files sub file for extract as
JMenu subSubItem=new JMenu("DB file");
JMenuItem subSubItem1=new JMenuItem("Sqlite");
JMenuItem subSubItem2=new JMenuItem("SQL");
JMenuItem subSubItem3=new JMenuItem("BSON");
subSubItem.add(subSubItem1);
subSubItem.add(subSubItem2);
subSubItem.add(subSubItem3);
subitem.add(subSubItem);
m1.add(i1);
m1.add(i2);
m1.add(i3);
m1.add(subitem);
menuBar.add(m1);
menuBar.add(m2);
menuBar.add(m3);

this.setJMenuBar(menuBar);
this.setVisible(true);

}
}
public class Menu_02 {
   public static void main(String[] args) {
    new MenuBar();

   } 
}

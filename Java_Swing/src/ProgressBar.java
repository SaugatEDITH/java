import javax.swing.*;
import java.awt.*;
class ProgressBarDemo{
JFrame frame= new JFrame("JProgressBar");
JProgressBar progress=new JProgressBar();
ProgressBarDemo(){
    progress.setValue(0);
    progress.setBounds(0,0,420,50);
    progress.setStringPainted(true);
    progress.setFont(new Font("MV BOLI",Font.BOLD,25));
    progress.setForeground(Color.green);
    frame.add(progress);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(520,520);
    frame.setLayout(null);
    frame.setVisible(true);
    fill();
}
public void fill() {
    Thread T = new Thread();
    int counter = 0;
    while (counter <= 100) {
        progress.setValue(counter);
        try {
            T.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter++;
    }
    progress.setString("Done");
}
}
public class ProgressBar {
    public static void main(String[] args) {
        ProgressBarDemo dem=new ProgressBarDemo();
    }
}

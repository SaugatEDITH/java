import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import javax.swing.event.*;
class sliderDemo implements ChangeListener {
JFrame frame;
JPanel panel;
JLabel label;
JSlider slider;
sliderDemo(){
frame=new JFrame("Slider Demo");
frame.setSize(520,520);
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
panel=new JPanel();
label=new JLabel();
slider=new JSlider(0,100,50);
slider.setPreferredSize(new Dimension(400,200));
slider.setPaintTicks(true);
slider.setMinorTickSpacing(10);
slider.setMajorTickSpacing(25);
slider.setPaintLabels(true);
slider.setOrientation(SwingConstants.VERTICAL);
// slider.setOrientation(SwingConstants.HORIZONTAL);
slider.addChangeListener(this);
panel.add(slider);
panel.add(label);
frame.add(panel);
frame.setVisible(true);
}
public void stateChanged(ChangeEvent e){
    label.setText("°C = "+slider.getValue());

}
}

public class JSliders {
    public static void main(String[] args) {
        sliderDemo demo=new sliderDemo();
    }
}

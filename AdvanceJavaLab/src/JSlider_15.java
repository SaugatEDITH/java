import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSlider_15 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Temperature Slider");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Temperature: 0°C", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        JSlider slider = new JSlider(JSlider.HORIZONTAL, -50, 50, 0);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                label.setText("Temperature: " + value + "°C");
            }
        });

        frame.add(label, BorderLayout.NORTH);
        frame.add(slider, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

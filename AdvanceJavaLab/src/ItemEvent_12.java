import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemEvent_12 extends JFrame implements ItemListener {
    JRadioButton r1, r2;
    JCheckBox c1, c2;
    JLabel l1;

    ItemEvent_12() {
        setTitle("Item event");
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonGroup btng = new ButtonGroup();
        r1 = new JRadioButton("Male");
        r1.addItemListener(this);
        r2 = new JRadioButton("Female");
        r2.addItemListener(this);
        btng.add(r1);
        btng.add(r2);

        add(new JLabel("Gender:"));
        add(r1);
        add(r2);

        c1 = new JCheckBox("Fishing");
        c2 = new JCheckBox("Swimming");
        c1.addItemListener(this);
        c2.addItemListener(this);

        add(new JLabel("Like to Do:"));
        add(c1);
        add(c2);

        l1 = new JLabel("Selection: ");
        add(l1);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        StringBuilder selection = new StringBuilder("Selection: ");

        if (r1.isSelected()) {
            selection.append("Male ");
        } else if (r2.isSelected()) {
            selection.append("Female ");
        }

        if (c1.isSelected()) {
            selection.append("Fishing ");
        }
        if (c2.isSelected()) {
            selection.append("Swimming ");
        }

        l1.setText(selection.toString());
    }

    public static void main(String[] args) {
        new ItemEvent_12();
    }
}

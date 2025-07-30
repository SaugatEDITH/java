import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class KeyEvent_11 extends JFrame implements KeyListener {
    JLabel l1 = new JLabel(); // Initialize l1
    JTextField t1;
    KeyEvent_11(){
        setTitle("KeyEvent");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(512,512);
        setLayout(new FlowLayout());
        add(new JLabel("Enter the keys:"));
        t1=new JTextField(10);
        t1.addKeyListener(this);
        add(t1);
        add(l1);
    }
    @Override
    public void keyPressed(KeyEvent e) {
		l1.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		l1.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		l1.setText("Key Typed: " + e.getKeyChar());
	}
    public static void main(String[] args) {
        new KeyEvent_11();
    }
}

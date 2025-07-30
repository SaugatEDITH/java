import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class WindowEvent_10 extends WindowAdapter {
public static void main(String[] args) {
    JFrame frame=new JFrame();
    frame.setVisible(true);
    frame.setSize(512,512);
    frame.addWindowListener(new WindowEvent_10());
}
@Override
public void windowOpened(WindowEvent e) {
    System.out.println("Function: windowOpened - Triggered when the window is first opened.");
}

@Override
public void windowClosing(WindowEvent e) {
    System.out.println("Function: windowClosing - Triggered when the window is about to close.");
}

@Override
public void windowClosed(WindowEvent e) {
    System.out.println("Function: windowClosed - Triggered after the window has been closed.");
}

@Override
public void windowIconified(WindowEvent e) {
    System.out.println("Function: windowIconified - Triggered when the window is minimized.");
}

@Override
public void windowDeiconified(WindowEvent e) {
    System.out.println("Function: windowDeiconified - Triggered when the window is restored from minimized state.");
}

@Override
public void windowActivated(WindowEvent e) {
    System.out.println("Function: windowActivated - Triggered when the window gains focus.");
}

@Override
public void windowDeactivated(WindowEvent e) {
    System.out.println("Function: windowDeactivated - Triggered when the window loses focus.");
}
}
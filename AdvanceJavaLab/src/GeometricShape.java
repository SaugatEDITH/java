import javax.swing.*;
import java.awt.*;

public class GeometricShape extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 50);

        // Draw a circle
        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 50, 50);

        // Draw a triangle
        g.setColor(Color.GREEN);
        int[] xPoints = {300, 350, 325};
        int[] yPoints = {100, 100, 50};
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw a square
        g.setColor(Color.ORANGE);
        g.fillRect(400, 50, 50, 50);

        // Draw an ellipse
        g.setColor(Color.MAGENTA);
        g.fillOval(200, 300, 100, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Geometric Shapes");
        GeometricShape panel = new GeometricShape();

        frame.add(panel);
        frame.setSize(512, 512);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

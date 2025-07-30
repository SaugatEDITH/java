import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JTableSwing_14 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Create column names
        String[] columnNames = {"ID", "Name", "Age"};

        // Create data for the table
        Object[][] data = {
            {1, "Alice", 25},
            {2, "Bob", 30},
            {3, "Charlie", 35}
        };

        // Create a table model and set it to the JTable
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        // Add the table to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the scroll pane to the frame
        frame.add(scrollPane);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}

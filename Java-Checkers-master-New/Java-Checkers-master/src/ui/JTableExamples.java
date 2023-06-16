package ui;
// Packages to import
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
public class JTableExamples {
    // frame
    JFrame f;
    // Table
    JTable j;
 
    // Constructor
    JTableExamples(String[][] data)
    {
        // Frame initialization
        f = new JFrame();
 
        // Frame Title
        f.setTitle("Tournament Registeration");
 
 
        // Column Names
        String[] columnNames = { "Player Number", "Full Name", "Game Played","Won","Win Percentage" };
 
        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
 
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }
 
    // Driver  method
    public static void main(String[][] data)
    {
       
    }
}
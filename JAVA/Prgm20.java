import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Prgm20 extends Applet implements ActionListener {
    List l1;
    TextField t1;
    Button b1, b2;
    FlowLayout f1;

    public void init() {
        // Initialize components
        f1 = new FlowLayout();
        setLayout(f1);

        b1 = new Button("ADD");
        b2 = new Button("REMOVE");
        t1 = new TextField(30);
        l1 = new List();

        // Add components to the applet
        add(t1);
        add(l1);
        add(b1);
        add(b2);

        // Add action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle ADD button click
        if (e.getSource() == b1) {
            String s = t1.getText();
            if (!s.isEmpty()) {
                l1.add(s); // Add text from TextField to List
                t1.setText(""); // Clear TextField
            }
        }

        // Handle REMOVE button click
        if (e.getSource() == b2) {
            int i = l1.getSelectedIndex(); // Get the selected item index
            if (i != -1) { // Only remove if an item is selected
                l1.remove(i); // Remove the selected item
            }
        }
    }
}

import java.applet.*;
import java.awt.*;

public class Prgm19 extends Applet {
    int x;
    int y;
    int width;
    int height;
    Color col;

    public void init() {
        // Default values if parameters are missing or invalid
        try {
            x = Integer.parseInt(getParameter("x"));
            y = Integer.parseInt(getParameter("y"));
            width = Integer.parseInt(getParameter("width"));
            height = Integer.parseInt(getParameter("height"));
            col = new Color(Integer.parseInt(getParameter("c"), 16)); // Hex color
        } catch (Exception e) {
            // Provide default values in case of error
            x = 10;
            y = 20;
            width = 500;
            height = 300;
            col = Color.RED; // Default color is red
        }
    }

    public void paint(Graphics g) {
        g.setColor(col);
        g.drawRect(x, y, width, height); // Draw a rectangle
    }
}

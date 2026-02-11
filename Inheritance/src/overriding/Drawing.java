package overriding;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing extends JFrame {
    public static void main(String[] args) {
        new Drawing();
    }

    public Drawing() {
        setSize(500, 500);
        setVisible(true);
        setTitle("Drawing");
    }

        @Override
        public void paint(Graphics g) {
            // super.paint(g);

            g.setColor(new Color(215, 215, 50));
            g.fillOval(50, 50, 150, 150);

            g.setColor(Color.BLUE);
            g.drawLine(50, 50, 200, 200);
            g.drawLine(200, 50, 50, 200);

            g.setColor(Color.RED);
            g.drawRect(50, 50, 150, 150);

            g.drawString("My String", 100, 100);

        }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Drawing extends JPanel {

//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        this.setBackground(Color.WHITE);
//
//        g.setColor(Color.BLUE);
//        g.fillRect(25, 25, 100, 30);
//
//        g.setColor(new Color(190, 81, 216));
//        g.fillRect(25, 65, 100, 30);
//
//        g.setColor(Color.RED);
//        g.drawString("this is some text", 25, 120);
//}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.drawLine(10, 25, 200, 45);

        g.setColor(Color.RED);
        g.drawRect(10, 55, 100, 30);

        g.setColor(Color.GREEN);
        g.fillOval(10, 95, 100, 30);

        g.setColor(Color.ORANGE);
        g.fill3DRect(10, 160, 100, 50, true);
    }

}

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

//        int x = 0;
//        int y = 0;
//        int[] points = {x, y};
        graphics.setColor(Color.GREEN);
        graphics.drawLine(10, 10, 290, 10);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(290, 10, 290, 290);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(290, 290, 10, 290);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(10, 290, 10, 10);

        graphics.setColor(Color.GREEN);
        graphics.drawLine(50, 100,70, 70 );
        graphics.setColor(Color.GREEN);
        graphics.drawLine(70, 70, 80, 90);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(80, 90, 90, 90);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(90, 90, 100, 70);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(100, 70, 120, 100);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(120, 100, 85, 130);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(85, 130, 50, 100);


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}


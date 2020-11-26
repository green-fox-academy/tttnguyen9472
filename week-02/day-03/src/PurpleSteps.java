import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]
        for (int i = 0; i < 25; i++) {

            int squareSize = 10;
            int x = 10;
            int y = 10;
            drawSquares(graphics, squareSize, x + 10 * i, y + 10 * i);
        }


    }

    public static void drawSquares(Graphics graphics, int squareSize, int x, int y) {
        graphics.setColor(Color.MAGENTA);
        graphics.fillRect(x, y, squareSize, squareSize);

        graphics.setColor(Color.BLACK);
        graphics.drawRect(x, y, squareSize, squareSize);
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

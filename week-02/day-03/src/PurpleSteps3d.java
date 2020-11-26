import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]


            //10; 10 - 20; 20 - 40; 40 - 80; 80 - 160; 160

                drawSquares(graphics, 20);

    }

    public static void drawSquares(Graphics graphics, int squareSize) {
        int x = squareSize;
        int y = squareSize;
        int width = squareSize;
        int height = squareSize;

        for (int i = 0; i < 10; i++) {

            graphics.setColor(Color.MAGENTA);
            graphics.fillRect(x + 1, y + 1, width - 2, height - 2);

            graphics.setColor(Color.BLACK);
            graphics.drawRect(x, y, width, height);

            x = x + width;
            y = y + height;
            width = width + squareSize;
            height = height + squareSize;
        }
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

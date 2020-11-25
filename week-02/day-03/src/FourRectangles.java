import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i < 4; i++) {

            int x = (int) (100 * Math.random());
            int y = (int) (100 * Math.random());
            int z = (int) (100 * Math.random());

            int a = (int) (256 * Math.random());
            int b = (int) (256 * Math.random());
            int c = (int) (256 * Math.random());
            drawSquares(graphics, x, y, z, a, b, c);
        }

    }

    public static void drawSquares(Graphics graphics, int x, int y, int z, int a, int b, int c) {
        graphics.setColor(new Color(a, b, c));
        graphics.fillRect(x, y, z, z);
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

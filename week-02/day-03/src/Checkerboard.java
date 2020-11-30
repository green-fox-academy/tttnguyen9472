import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int square = 40;
        int x = 40;
        int y = 0;
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                DrawOneRow(graphics, x, y, square, square);
                y = y + 40;
            } else {
                System.out.println("x went to the left " + i);
//                x = x - 40;
                DrawOneRow(graphics, x - 40, y, square, square);
                y = y + 40;
            }
        }
    }


    public static void DrawOneRow(Graphics graphics, int x, int y, int width, int height) {
        for (int i = 0; i < 4; i++) {
            graphics.setColor(Color.BLACK);
            graphics.fillRect(x, y, width, height);
            x = x + 80;
        }
    }

//    public static void drawSquares(Graphics graphics, int squareSize) {
//        for (int i = 0; i < 4; i++) {
//            int x = 40;
//            int y = 0;
//            graphics.setColor(Color.BLACK);
//            graphics.fillRect(x, y, squareSize, squareSize);
//            x = x + 80;
//        }

//        for (int i = 0; i < 4; i++) {
//
//            for (int j = 0; j < 4; j++) {
//
//                if (i % 2 == 0 && j % 2 == 0) {
//                    graphics.setColor(Color.BLACK);
//                    graphics.fillRect(x, y, squareSize, squareSize);
//                    x = x + 80;
//                } else {
//                    x = x - 40;
//                    y = y + 40;
//                    graphics.setColor(Color.BLACK);
//                    graphics.fillRect(x, y, squareSize, squareSize);
//                    x = x + 80;
//                }
//    }
//
//
//}


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




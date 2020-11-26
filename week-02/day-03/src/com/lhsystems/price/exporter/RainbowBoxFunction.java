package com.lhsystems.price.exporter;

import javax.swing.*;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        //red
        //orange
        //yellow
        //green
        //blue
        //indigo
        //violet
        int squareSize = 320;
        List<Color> colors = new ArrayList();
        colors.add(new Color(238,26,16));
        colors.add(new Color(238,132, 15));
        colors.add(new Color(234, 230, 4));
        colors.add(new Color(95 ,238, 19));
        colors.add(new Color(47 ,61, 238));
        colors.add(new Color(29 ,0 ,51));
        colors.add(new Color(228 ,71, 238));


        int plusSize = 45;
        for (int i = 0; i <colors.size() ; i++) {
            draw(squareSize - i * plusSize, colors.get(i), graphics);
        }


    }

    private static void draw(int squareSize, Color o, Graphics graphics) {
        graphics.setColor(o);
        graphics.fillRect((WIDTH - squareSize) / 2,(HEIGHT -squareSize) / 2, squareSize, squareSize);

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
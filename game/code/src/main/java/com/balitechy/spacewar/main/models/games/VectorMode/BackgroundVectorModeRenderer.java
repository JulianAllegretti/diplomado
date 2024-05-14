package com.balitechy.spacewar.main.models.games.VectorMode;

import com.balitechy.spacewar.main.models.interfaces.GameAbstract;
import com.balitechy.spacewar.main.models.interfaces.IBackgroundRenderer;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class BackgroundVectorModeRenderer implements IBackgroundRenderer {

    private static final int WIDTH = 150;
    private static final int HEIGHT = 150;

    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        Graphics2D g2d = (Graphics2D) g;
        float grosorLinea = 3.0f;
        g2d.clearRect(0, 0, c.getWidth(), c.getHeight());

        g2d.setStroke(new BasicStroke(grosorLinea));
        g2d.setColor(Color.BLACK);
        g2d.drawOval(10,10, WIDTH, HEIGHT);
    }
}

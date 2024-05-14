package com.balitechy.spacewar.main.models.games.VectorColorMode;

import com.balitechy.spacewar.main.models.interfaces.IBackgroundRenderer;

import java.awt.*;
import java.io.IOException;

public class BackgroundVectorColorModeRenderer implements IBackgroundRenderer {

    private static final int WIDTH = 150;
    private static final int HEIGHT = 150;

    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        Graphics2D g2d = (Graphics2D) g;
        g2d.clearRect(0, 0, c.getWidth(), c.getHeight());
        g2d.setColor(Color.BLACK);
        g2d.fillOval(10,10, WIDTH, HEIGHT);
    }
}

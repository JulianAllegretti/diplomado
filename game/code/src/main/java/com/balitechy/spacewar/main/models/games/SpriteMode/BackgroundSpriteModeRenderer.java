package com.balitechy.spacewar.main.models.games.SpriteMode;

import com.balitechy.spacewar.main.models.interfaces.IBackgroundRenderer;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class BackgroundSpriteModeRenderer implements IBackgroundRenderer {

    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        BufferedImage background = null;
        SpritesImageLoader bg;
        bg = new SpritesImageLoader("/bg.png");
        bg.loadImage();
        background = bg.getImage(0, 0, 640, 480);
        g.drawImage(background, 0, 0, c.getWidth(), c.getHeight(), c);
    }
}

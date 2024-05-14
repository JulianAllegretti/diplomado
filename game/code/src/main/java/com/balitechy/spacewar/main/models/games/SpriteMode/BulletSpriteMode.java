package com.balitechy.spacewar.main.models.games.SpriteMode;

import com.balitechy.spacewar.main.models.factories.FactoryGameAbstractSpriteMode;
import com.balitechy.spacewar.main.models.interfaces.BulletAbstract;

import java.awt.*;
import java.awt.image.BufferedImage;

public class BulletSpriteMode extends BulletAbstract {
    private BufferedImage image;

    public BulletSpriteMode(double x, double y, FactoryGameAbstractSpriteMode game){
        super(x, y);
        image = game.getSprites().getImage(35, 52, WIDTH, HEIGHT);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(image, (int) x, (int) y, null);
    }
}

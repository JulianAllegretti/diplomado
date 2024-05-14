package com.balitechy.spacewar.main.models.games.VectorMode;

import com.balitechy.spacewar.main.models.factories.FactoryGameAbstractSpriteMode;
import com.balitechy.spacewar.main.models.factories.FactoryGameAbstractVectorMode;
import com.balitechy.spacewar.main.models.interfaces.BulletAbstract;

import java.awt.*;
import java.awt.image.BufferedImage;

public class BulletVectorMode extends BulletAbstract {

    public BulletVectorMode(double x, double y, FactoryGameAbstractVectorMode game){
        super(x, y);
    }

    @Override
    public void render(Graphics g) {
        g.drawLine((int)x, (int)y, (int)x, (int)y-10);
    }
}

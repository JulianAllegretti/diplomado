package com.balitechy.spacewar.main.models.games.VectorMode;

import com.balitechy.spacewar.main.models.factories.FactoryGameAbstractSpriteMode;
import com.balitechy.spacewar.main.models.factories.FactoryGameAbstractVectorMode;
import com.balitechy.spacewar.main.models.interfaces.BulletAbstract;
import com.balitechy.spacewar.main.models.interfaces.PlayerAbstract;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PlayerVectorMode extends PlayerAbstract {

    public PlayerVectorMode(double x, double y, FactoryGameAbstractVectorMode game) {
        super(x, y, game);
    }


    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        float grosorLinea = 3.0f;
        g2d.setStroke(new BasicStroke(grosorLinea));
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(new int[] {(int)x,(int)x + 50, (int)x + 25}, new int[] {(int)y,(int)y,(int)y - 25}, 3);
    }

    @Override
    public void shoot() {
        BulletAbstract b = new BulletVectorMode(x+(WIDTH/2)-5, y-18, (FactoryGameAbstractVectorMode) game);
        game.getBullets().addBullet(b);
    }
}

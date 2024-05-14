package com.balitechy.spacewar.main.models.games.VectorColorMode;

import com.balitechy.spacewar.main.models.factories.FactoryGameAbstractVectorColorMode;
import com.balitechy.spacewar.main.models.factories.FactoryGameAbstractVectorMode;
import com.balitechy.spacewar.main.models.interfaces.BulletAbstract;
import com.balitechy.spacewar.main.models.interfaces.PlayerAbstract;

import java.awt.*;

public class PlayerVectorColorMode extends PlayerAbstract {

    public PlayerVectorColorMode(double x, double y, FactoryGameAbstractVectorColorMode game) {
        super(x, y, game);
    }


    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        float grosorLinea = 3.0f;
        g2d.setStroke(new BasicStroke(grosorLinea));
        g2d.setColor(Color.RED);
        g2d.fillPolygon(new int[] {(int)x,(int)x + 50, (int)x + 25}, new int[] {(int)y,(int)y,(int)y - 25}, 3);
    }

    @Override
    public void shoot() {
        BulletAbstract b = new BulletVectorColorMode(x+(WIDTH/2)-5, y-18, (FactoryGameAbstractVectorColorMode) game);
        game.getBullets().addBullet(b);
    }
}

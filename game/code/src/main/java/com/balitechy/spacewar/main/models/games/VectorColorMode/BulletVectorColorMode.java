package com.balitechy.spacewar.main.models.games.VectorColorMode;

import com.balitechy.spacewar.main.models.factories.FactoryGameAbstractVectorColorMode;
import com.balitechy.spacewar.main.models.factories.FactoryGameAbstractVectorMode;
import com.balitechy.spacewar.main.models.interfaces.BulletAbstract;

import java.awt.*;

public class BulletVectorColorMode extends BulletAbstract {

    public BulletVectorColorMode(double x, double y, FactoryGameAbstractVectorColorMode game){
        super(x, y);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.ORANGE);
        g.drawLine((int)x, (int)y, (int)x, (int)y-10);
    }
}

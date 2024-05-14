package com.balitechy.spacewar.main.models.games.SpriteMode;

import com.balitechy.spacewar.main.models.factories.FactoryGameAbstractSpriteMode;
import com.balitechy.spacewar.main.models.interfaces.BulletAbstract;
import com.balitechy.spacewar.main.models.interfaces.PlayerAbstract;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PlayerSpriteMode extends PlayerAbstract {
    private BufferedImage image;

    public PlayerSpriteMode(double x, double y, FactoryGameAbstractSpriteMode game) {
        super(x, y, game);

        // Get image for Player
        image = game.getSprites().getImage(219, 304, WIDTH, HEIGHT);
    }


    @Override
    public void render(Graphics g) {
        g.setColor(Color.white);
        g.drawImage(image, (int) x, (int) y, null);
    }

    @Override
    public void shoot() {
        BulletAbstract b = new BulletSpriteMode(x+(WIDTH/2)-5, y-18, (FactoryGameAbstractSpriteMode) game);
        game.getBullets().addBullet(b);
    }
}

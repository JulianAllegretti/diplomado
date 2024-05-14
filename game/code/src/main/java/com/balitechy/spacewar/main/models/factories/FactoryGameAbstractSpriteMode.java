package com.balitechy.spacewar.main.models.factories;

import com.balitechy.spacewar.main.models.InputHandler;
import com.balitechy.spacewar.main.models.games.SpriteMode.SpritesImageLoader;
import com.balitechy.spacewar.main.models.BulletController;
import com.balitechy.spacewar.main.models.games.SpriteMode.BackgroundSpriteModeRenderer;
import com.balitechy.spacewar.main.models.games.SpriteMode.PlayerSpriteMode;
import com.balitechy.spacewar.main.models.interfaces.GameAbstract;
import com.balitechy.spacewar.main.models.interfaces.PlayerAbstract;

import java.io.IOException;

public class FactoryGameAbstractSpriteMode extends GameAbstract {

    private SpritesImageLoader sprites;

    public SpritesImageLoader getSprites(){
        return sprites;
    }

    @Override
    public void init() {
        requestFocus();

        sprites = new SpritesImageLoader("/sprites.png");
        try {
            sprites.loadImage();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Add keyboard listener
        addKeyListener(new InputHandler(this));

        // Initialize game components.


        // Set player position at the bottom center.
        player = new PlayerSpriteMode((WIDTH * SCALE - PlayerAbstract.WIDTH) / 2, HEIGHT * SCALE - 50 , this);
        bullets = new BulletController();
        backgRenderer=new BackgroundSpriteModeRenderer();
    }
}

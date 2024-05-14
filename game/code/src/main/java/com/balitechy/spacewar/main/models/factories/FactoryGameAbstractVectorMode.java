package com.balitechy.spacewar.main.models.factories;

import com.balitechy.spacewar.main.models.BulletController;
import com.balitechy.spacewar.main.models.InputHandler;
import com.balitechy.spacewar.main.models.games.VectorMode.BackgroundVectorModeRenderer;
import com.balitechy.spacewar.main.models.games.VectorMode.PlayerVectorMode;
import com.balitechy.spacewar.main.models.interfaces.GameAbstract;
import com.balitechy.spacewar.main.models.interfaces.PlayerAbstract;

public class FactoryGameAbstractVectorMode extends GameAbstract {

    @Override
    public void init() {
        requestFocus();

        // Add keyboard listener
        addKeyListener(new InputHandler(this));

        // Initialize game components.


        // Set player position at the bottom center.
        player = new PlayerVectorMode((WIDTH * SCALE - PlayerAbstract.WIDTH) / 2, HEIGHT * SCALE - 50 , this);
        bullets = new BulletController();
        backgRenderer=new BackgroundVectorModeRenderer();
    }
}
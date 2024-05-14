package com.balitechy.spacewar.main.models.interfaces;

import java.awt.*;

public abstract class PlayerAbstract {
    public double x = 0;
    public double y = 0;
    public double velX = 0;
    public double velY = 0;
    public static final int WIDTH = 56;
    public static final int HEIGHT = 28;
    public GameAbstract game;

    public PlayerAbstract(double x, double y, GameAbstract game){
        this.x = x;
        this.y = y;
        this.game = game;
    }

    public double getX() {
        return x;
    }

    void setX(double x) {
        this.x = x;
    }

    double getY() {
        return y;
    }

    void setY(double y) {
        this.y = y;
    }

    void setVelX(double velX) {
        this.velX = velX;
    }

    void setVelY(double velY) {
        this.velY = velY;
    }

    void tick(){
        x += velX;
        y += velY;

        // To avoid player go outside the arena.
        if(x <= 0)
            x = 0;
        if(x >= (GameAbstract.WIDTH * GameAbstract.SCALE) - WIDTH)
            x = (GameAbstract.WIDTH * GameAbstract.SCALE) - WIDTH;
        if(y <= 0)
            y = 0;
        if(y >= (GameAbstract.HEIGHT * GameAbstract.SCALE) - HEIGHT)
            y = (GameAbstract.HEIGHT * GameAbstract.SCALE) - HEIGHT;
    }

    public abstract void render(Graphics g);

    public abstract void shoot();
}

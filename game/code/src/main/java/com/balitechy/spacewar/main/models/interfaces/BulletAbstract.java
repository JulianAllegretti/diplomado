package com.balitechy.spacewar.main.models.interfaces;

import com.balitechy.spacewar.main.Game;

import java.awt.*;

public abstract class BulletAbstract {
    public double x;
    public double y;
    public static final int WIDTH = 11;
    public static final int HEIGHT = 21;

    public BulletAbstract(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void tick(){
        y -= 5;
    }

    public abstract void render(Graphics g);

    public double getY(){
        return y;
    }
}

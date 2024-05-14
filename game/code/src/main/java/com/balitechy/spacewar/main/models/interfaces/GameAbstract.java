package com.balitechy.spacewar.main.models.interfaces;

import com.balitechy.spacewar.main.models.BulletController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.io.IOException;

public abstract class GameAbstract extends Canvas implements Runnable{
    private static final long serialVersionUID = 1L;
    public static final int WIDTH = 320;
    public static final int HEIGHT = WIDTH / 12 * 9;
    public static final int SCALE = 2;
    public final String TITLE = "Space War 2D";

    public boolean running = false;
    public Thread thread;

    //Game components
    public PlayerAbstract player;
    public BulletController bullets;
    public IBackgroundRenderer backgRenderer;

    public abstract void init();

    public BulletController getBullets(){
        return bullets;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        switch(key){
            case KeyEvent.VK_RIGHT:
                player.setVelX(5);
                break;

            case KeyEvent.VK_LEFT:
                player.setVelX(-5);
                break;

            case KeyEvent.VK_UP:
                player.setVelY(-5);
                break;

            case KeyEvent.VK_DOWN:
                player.setVelY(5);
                break;

            case KeyEvent.VK_SPACE:
                player.shoot();
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        switch(key){
            case KeyEvent.VK_RIGHT:
                player.setVelX(0);
                break;

            case KeyEvent.VK_LEFT:
                player.setVelX(0);
                break;

            case KeyEvent.VK_UP:
                player.setVelY(0);
                break;

            case KeyEvent.VK_DOWN:
                player.setVelY(0);
                break;

        }
    }

    private synchronized void start(){
        if(running) return;

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    private synchronized void stop(){
        if(!running) return;

        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(1);
    }

    /*
     * Game thread runner.
     */
    @Override
    public void run() {
        init();

        long lastTime = System.nanoTime();
        final double numOfTicks = 60.0;
        double ns = 1000000000 / numOfTicks;
        double delta = 0;
        int updates = 0;
        int frames = 0;
        long timer = System.currentTimeMillis();

        while(running){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if(delta >= 1){
                tick();
                updates++;
                delta--;
            }
            render();
            frames++;

            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                System.out.println(updates + "ticks, fps " + frames);
                updates = 0;
                frames = 0;
            }
        }
        stop();
    }

    /*
     * Run the ticks of all game components.
     */
    public void tick(){
        player.tick();
        bullets.tick();
    }

    /*
     * Render overall game components.
     */
    public void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        /////////////////////////////////

        try {
            backgRenderer.render(g, this);
            player.render(g);
            bullets.render(g);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ////////////////////////////////
        g.dispose();
        bs.show();
    }

    public void play() {
        this.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        this.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        this.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));

        JFrame frame = new JFrame(this.TITLE);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        this.start();
    }
}

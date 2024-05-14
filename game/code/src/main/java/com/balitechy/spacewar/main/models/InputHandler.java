package com.balitechy.spacewar.main.models;

import com.balitechy.spacewar.main.models.interfaces.GameAbstract;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InputHandler extends KeyAdapter{
	
	private GameAbstract game;
	
	public InputHandler(GameAbstract game){
		this.game = game;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		game.keyPressed(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		game.keyReleased(e);
	}

}

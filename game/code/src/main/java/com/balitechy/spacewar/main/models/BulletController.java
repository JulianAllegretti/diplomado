package com.balitechy.spacewar.main.models;

import com.balitechy.spacewar.main.models.interfaces.BulletAbstract;

import java.awt.Graphics;
import java.util.LinkedList;

public class BulletController {
	private LinkedList<BulletAbstract> bl = new LinkedList<BulletAbstract>();
	
	public void tick(){
		for(int i=0; i < bl.size(); i++){
			if(bl.get(i).getY() < 0){
				removeBullet(bl.get(i));
			}else{
				bl.get(i).tick();
			}
		}
	}
	
	public void render(Graphics g){
		for(int i=0; i < bl.size(); i++){
			bl.get(i).render(g);
		}
	}
	
	public void addBullet(BulletAbstract bullet){
		bl.add(bullet);
	}
	
	public void removeBullet(BulletAbstract bullet){
		bl.remove(bullet);
	}
}

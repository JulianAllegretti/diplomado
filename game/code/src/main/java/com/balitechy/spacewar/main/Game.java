package com.balitechy.spacewar.main;

import com.balitechy.spacewar.main.models.factories.FactoryGameAbstractSpriteMode;
import com.balitechy.spacewar.main.models.factories.FactoryGameAbstractVectorColorMode;
import com.balitechy.spacewar.main.models.factories.FactoryGameAbstractVectorMode;
import com.balitechy.spacewar.main.models.interfaces.GameAbstract;
import java.util.Scanner;


public class Game {

	private GameAbstract selectGame() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the type of graphics game you want.");
		System.out.println("1.-Sprites");
		System.out.println("2.-Vector");
		System.out.println("3.-Vector with color");
		System.out.println("0.-Exit");
		int op = in.nextInt();

		switch (op) {
			case 1:
				return new FactoryGameAbstractSpriteMode();
			case 2:
				return new FactoryGameAbstractVectorMode();
			case 3:
				return new FactoryGameAbstractVectorColorMode();
			case 0:
				System.out.println("See you!");
				System.exit(1);
				break;
			default:
				System.out.println("Invalid option");
				System.exit(1);
		}

		return null;
	}


	public static void main(String args[]){		
		Game main = new Game();
		GameAbstract game = main.selectGame();
		game.play();
	}
}

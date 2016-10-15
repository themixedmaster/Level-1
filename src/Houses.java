import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {
		for(; true;){
			Tortoise.setX(-100);
			Tortoise.setY(900);
			for(int i = 0; i <=  11; i++){
				int exotic = new Random().nextInt(800) + 1;
				int butters = 90;
				int meme = 90;
				exoticButters(exotic, butters, meme);
			}
		}
		
	}
	static void exoticButters(int butters, int exotic, int meme){
		Tortoise.setPenColor(Color.RED);
		Tortoise.setSpeed(10);
		Tortoise.penDown();
		Tortoise.move(butters);
		Tortoise.turn(meme);
		Tortoise.move(exotic);
		Tortoise.turn(meme);
		Tortoise.move(butters);
		Tortoise.turn(-meme);
		//Tortoise.move(exotic);
		Tortoise.turn(-meme);
		butters = new Random().nextInt(800) + 1;
		Tortoise.setPenColor(Color.BLUE);
		Tortoise.setSpeed(10);
		Tortoise.penDown();
		Tortoise.move(butters);
		Tortoise.turn(meme);
		Tortoise.move(exotic);
		Tortoise.turn(meme);
		Tortoise.move(butters);
		Tortoise.turn(-meme);
		//Tortoise.move(exotic);
		Tortoise.turn(-meme);
		
	}
}

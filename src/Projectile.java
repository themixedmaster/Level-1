import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {
	int speed = 10;
	Projectile(int x,int y,int width,int height){
		super(x,y,width,height);
		
	}
	void update(){
		super.update();
		y = y - speed;
		if(y <= 0){
			isAlive = false;
		}
	}
	void draw(Graphics sharkie){
		sharkie.setColor(new Color(0,0,0));
		sharkie.fillRect(x, y, width, height);
	}
}

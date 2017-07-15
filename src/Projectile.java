import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {
	int speed;
	Projectile(int x,int y,int width,int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	void update(){
		y = y - speed;
		if(y <= 0){
			isAlive = false;
		}
	}
	void draw(Graphics sharkie){
		sharkie.setColor(new Color(255,64,0));
		sharkie.fillRect(x, y, width, height);
	}
}

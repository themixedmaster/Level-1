import java.awt.Color;
import java.awt.Graphics;

public class rocketShip extends GameObject{
	int speed;
	rocketShip(int x,int y,int width,int height){
		super(x,y,width,height);
		speed = 5;
	}
	void update(){
		super.update();
	}
	void draw(Graphics g){
		g.setColor(new Color(0,128,0));
		g.fillRect(x, y, width, height);
	}
}

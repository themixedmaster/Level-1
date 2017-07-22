import java.awt.Color;
import java.awt.Graphics;

public class Balloony extends GameObject{
	Balloony(int x,int y,int width,int height){
		super(x,y,width,height);
		//this.x = x;
		//this.y = y;
		//this.width = width;
		//this.height = height;
		
	}
	void update(){
		super.update();
		y = y + 3;
	}
	void draw(Graphics sharkie){
		sharkie.setColor(new Color(0,255,255));
		sharkie.fillRect(x, y, width, height);
	}
}

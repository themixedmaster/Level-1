import java.awt.Color;
import java.awt.Graphics;

public class Balloony extends GameObject{
	int fall = 0;
	Balloony(int x,int y,int width,int height){
		super(x,y,width,height);
		//this.x = x;
		//this.y = y;
		//this.width = width;
		//this.height = height;
		
	}
	void update(){
		super.update();
		y = y + fall;
		fall = fall + 1;
	}
	void draw(Graphics sharkie){
		sharkie.drawImage(GamePanel.alienImg, x, y, width, height, null);
	}
}

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Font titleFont;
	Timer mrClock; 
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	rocketShip melon = new rocketShip
	GamePanel(){
		mrClock = new Timer(1000/60,this);
		titleFont = new Font("Arial",Font.PLAIN,50);
	}
	void StartGame(){
		mrClock.start();
	}
	void updateMenuState(){
		
	}
	void updateGameState(){
		
	}
	void updateEndState(){
		
	}
	void drawMenuState(Graphics g){
		g.setColor(new Color(255,224,32));
		g.fillRect(0, 0, DerpInvaders.WIDTH, DerpInvaders.HIGHT);
		g.setColor(new Color(0,0,0));
		g.setFont(titleFont);
		g.drawString("DERP INVADERS", 40, 100);

	}
	void drawGameState(Graphics g){
		g.setColor(new Color(208,64,88));
		g.fillRect(0, 0, DerpInvaders.WIDTH, DerpInvaders.HIGHT);   
	}
	void drawEndState(Graphics g){
		g.setColor(new Color(255,128,128));
		g.fillRect(0, 0, DerpInvaders.WIDTH, DerpInvaders.HIGHT);
		g.setColor(new Color(0,0,0));
		g.setFont(titleFont);
		g.drawString("YOU LOSED", 90, 100);
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
		if(currentState == MENU_STATE){
			updateMenuState();
		}else if(currentState == GAME_STATE){
			updateGameState();
		}else if(currentState == END_STATE){
			updateEndState();
		}

	}
	public void paintComponent(Graphics g){
		g.fillRect(0, 0, 501, 799);
		if(currentState == MENU_STATE){
			drawMenuState(g);
		}else if(currentState == GAME_STATE){
			drawGameState(g);
		}else if(currentState == END_STATE){
			drawEndState(g);
		}

	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		System.out.println(e.getKeyCode());
		if(e.getKeyCode() == 10){
			currentState = currentState + 1;
			if(currentState > END_STATE){
				currentState = MENU_STATE;
			}

		}
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("2");
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("7");
	}

}

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer mrClock; 

	GamePanel(){
		mrClock = new Timer(1000/60,this);
	}
	void StartGame(){
		mrClock.start();
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
	public void paintComponent(Graphics g){
		g.fillRect(10, 10, 100, 100);
	}

}

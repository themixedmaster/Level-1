import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gooey implements ActionListener{
	JFrame window;
	JPanel Panel;
	JButton button;
	int points = 0;
	public static void main(String[] args) {
		Gooey gooey = new Gooey();
		gooey.run();
	}
	public void run(){
		window = new JFrame();
		Panel = new JPanel();
		window.setVisible(true);
		window.add(Panel);
		button = new JButton("" + points);
		Panel.add(button);
		button.addActionListener(this);
		window.setSize(500,500);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		points = points + 1;
		button.setText("" + points);
	}
}

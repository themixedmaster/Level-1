import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class ClickerGame implements ActionListener{
	public static void main(String[] args) {
		ClickerGame eightloi = new ClickerGame();
		eightloi.createUI();
	}
	Random rando = new Random();
	int money = 0;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("add");
	JButton subtract = new JButton("subtract");
	JButton reset = new JButton("reset");
	JButton random = new JButton("random 1-1000");
	JLabel number = new JLabel(String.valueOf(money));
	public void createUI(){
		add.addActionListener(this);
		subtract.addActionListener(this);
		reset.addActionListener(this);
		random.addActionListener(this);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(add);
		panel.add(subtract);
		panel.add(reset);
		panel.add(random);
		panel.add(number);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add){
			money = money + 1;
		}
		if(e.getSource() == subtract){
			money = money - 1;
		}
		if(e.getSource() == reset){
			money = 0;
		}
		if(e.getSource() == random){
			money = rando.nextInt(1000) + 1;
		}
		number.setText(String.valueOf(money));
		frame.setSize(1000, 1000);
	}
}

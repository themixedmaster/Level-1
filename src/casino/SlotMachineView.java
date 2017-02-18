package casino;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachineView {
	JLabel reel1 = new JLabel();
	JLabel reel2 = new JLabel();
	JLabel reel3 = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton lever = new JButton();	
	public SlotMachineView(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(reel1);
		panel.add(reel2);
		panel.add(reel3);
		panel.add(lever);
		frame.pack();
		
	}
	public void addSlotListenter(ActionListener slotMachineListener) {
		// TODO Auto-generated method stub
		
	}

	public void setReel1(Object getreel1) {
		// TODO Auto-generated method stub
		
	}

	public void setReel2(Object getreel2) {
		// TODO Auto-generated method stub
		
	}

	public void setReel3(Object getreel3) {
		// TODO Auto-generated method stub
		
	}

	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	public Object getBetAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getWinnings() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setWinAmount(Object winnings) {
		// TODO Auto-generated method stub
		
	}

}

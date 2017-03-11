package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller implements ActionListener{
	Model model;
	View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		view.addListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		System.out.println(buttonPressed.getText());
		model.addNum(buttonPressed.getText());
		view.setLabelOne(model.getInputOne());
		view.setLabelFour(model.getOutput());	
		view.setLabelTree(model.getInputTree());	
		view.setLabelTwo(model.getInputTwo());
		
	}

}

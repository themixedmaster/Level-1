package Calculator;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View {
	JFrame frame = new JFrame("8loi Calculator");
	JPanel panel = new JPanel();
	JLabel num1 = new JLabel();
	JLabel mathType = new JLabel();
	JLabel num2 = new JLabel();
	JLabel answer = new JLabel();
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton tree = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton zero = new JButton("0");
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JButton multiply = new JButton("X");
	JButton divide = new JButton("÷");
	JButton modulo = new JButton("%");
	JButton equals = new JButton("=");
	JButton clear = new JButton("Clear");
	public void createUI(){
		frame.setVisible(true);
		frame.add(panel);
		panel.setLayout(new GridLayout(3, 4));
		panel.add(num1);
		panel.add(mathType);
		panel.add(num2);
		panel.add(answer);
		panel.add(equals);
		panel.add(clear);
		panel.add(one);
		panel.add(two);
		panel.add(tree);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(zero);
		panel.add(plus);
		panel.add(minus);
		panel.add(multiply);
		panel.add(divide);
		panel.add(modulo);
		
	}
	void setLabelOne(String muh){
		num1.setText(muh);
	}
	void setLabelTwo(String muh){
		mathType.setText(muh);
	}
	void setLabelTree(String muh){
		num2.setText(muh);
	}
	void setLabelFour(String muh){
		answer.setText(muh);
	}
	public void addListener(Controller controller) {
		// TODO Auto-generated method stub
		one.addActionListener(controller);
		two.addActionListener(controller);
		tree.addActionListener(controller);
		four.addActionListener(controller);
		five.addActionListener(controller);
		six.addActionListener(controller);
		seven.addActionListener(controller);
		eight.addActionListener(controller);
		nine.addActionListener(controller);
		zero.addActionListener(controller);
		plus.addActionListener(controller);
		minus.addActionListener(controller);
		multiply.addActionListener(controller);
		divide.addActionListener(controller);
		modulo.addActionListener(controller);
		equals.addActionListener(controller);
		clear.addActionListener(controller);
	}
}

import javax.swing.JFrame;

public class DerpInvaders {
	JFrame anythingYouWant;
	GamePanel pannel;
	static final int WIDTH = 501;
	static final int HIGHT = 799;
	public static void main(String[] args) {
		DerpInvaders adventure = new DerpInvaders();
	}
	DerpInvaders(){
		anythingYouWant = new JFrame();
		pannel = new GamePanel();
		setup();
	}
	void setup(){
		anythingYouWant.add(pannel);
		anythingYouWant.addKeyListener(pannel);
		anythingYouWant.setSize(WIDTH, HIGHT);
		anythingYouWant.setVisible(true);
		anythingYouWant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pannel.StartGame();
	}
}

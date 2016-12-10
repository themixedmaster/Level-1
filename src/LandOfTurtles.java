import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;


public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "http://foundtheworld.com/wp-content/uploads/2016/08/Galapagos-Islands-4.jpg";


// 1. Create a frame & make it visible
		JFrame frame = new JFrame();
		frame.add(panel);
		
		// 3. Set the background image of the panel to the Galapagos Islands 
		panel.setBackgroundImage(galapagosIslands);
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		for(int i = 0; i <= 999999998; i++){
			int x = new Random().nextInt(1000);
			int y = new Random().nextInt(1000);
			Turtle turt = new Turtle();
			panel.addTurtle(turt);
			turt.setX(x);
			turt.setY(y);
		}
		// 4. Instantiate a Turtle 
		

// 5. Add the turtle to the panel 
		
		// 6. Put 50 Turtles on the beach


	}
}
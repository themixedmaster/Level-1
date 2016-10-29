import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class PhotoQuiz {


	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);


		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String pokemon = "http://www.pokemon-sunmoon.com/media/uploads/oct_27_assets/decidueye.png";

		// 2. create a variable of type "Component" that will hold your image
		Component decidueye;

		// 3. use the "createImage()" method below to initialize your Component
		decidueye = createImage(pokemon);

		// 4. add the image to the quiz window
		quizWindow.add(decidueye);

		// 5. call the pack() method on the quiz window
		quizWindow.pack();

		// 6. ask a question that relates to the image
		String type1 = question("What is this Pokemon's first type?");

		// 7. print "CORRECT" if the user gave the right answer
		if(type1.equalsIgnoreCase("Grass")){
			text("Good Job!");
			String type2 = question("What is this Pokemon's second type?");
			if(type2.equalsIgnoreCase("Ghost")){
				text("Good Job!");
			}else{
				text("U FAIL!!!");
			}
		}else{
			text("U FAIL!!!");
		}	

		// 8. print "INCORRECT" if the answer is wrong
		

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(decidueye);

		// 10. find another image and create it (might take more than one line of code)
		pokemon = "http://www.pokemon-sunmoon.com/media/uploads/aug_1_assets/gumshoos.png";
		Component trump;

		// 3. use the "createImage()" method below to initialize your Component
		trump = createImage(pokemon);

		// 4. add the image to the quiz window
		quizWindow.add(trump);

		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		type1 = question("What is Donald Trump's first type?");

		// 7. print "CORRECT" if the user gave the right answer
		if(type1.equalsIgnoreCase("racist")){
			text("Good Job!");
			String type2 = question("What is Donald Trump's second type?");
			if(type2.equalsIgnoreCase("Idiot")){
				text("Good Job!");
			}else{
				text("U FAIL!!!");
			}
		}else{
			text("U FAIL!!!");
		}
		// 11. add the second image to the quiz window


		// 12. pack the quiz window


		// 13. ask another question
		

		// 14+ check answer, say if correct or incorrect, etc.


	}


	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	static String question(String text) {
		String answer = JOptionPane.showInputDialog(text);
		return (answer);
	}

	static void text(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
}


	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 


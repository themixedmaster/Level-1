import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class celebbodyparts {


	//*** Get 3 celebrity photos from the memenet, save them to your computer, and fill
	//*** in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "\\Users\\Gavin Morris\\Downloads\\celeb1.jpg";
	String secondImage = "\\Users\\Gavin Morris\\Downloads\\celeb2.jpg";
	String thirdImage = "\\Users\\Gavin Morris\\Downloads\\celeb3.jpg";


	Frame window = new Frame();
	
	private void startQuiz() {
		// *** Set the size of the window so that you can only see part of the image.
		window.setSize(300, 300);
		// *** Make an int variable to hold the score.
		int score = 0;

		// *** Ask the user who this person is and store their answer
		String answer = question("What Celebrity is this?");

		// *** If they got the answer right:
		if(answer.equalsIgnoreCase("Donald Trump")){
		// *** -- Tell them they are correct.
			text("U win!!!");
		// *** -- Increase the score by 1
			score = score + 1;
		}


		// *** Otherwise:
		else{
		// *** -- Tell them they are wrong
			text("U Fail!");
		}
		// *** Use the method below to show the next image
		String scorez = Integer.toString(score);
		text(scorez);
		showNextImage();
		// *** Show the score
		
		// .... repeat for all your images.....
		window.setSize(300, 300);
		answer = question("What Celebrity is this?");
		if(answer.equalsIgnoreCase("Grumpy Cat")){
			// *** -- Tell them they are correct.
				text("U win!!!");
			// *** -- Increase the score by 1
				score = score + 1;
			}
		else{
			// *** -- Tell them they are wrong
				text("U Fail!");
			}
		scorez = Integer.toString(score);
		text(scorez);
		showNextImage();
		window.setSize(300, 300);
		answer = question("What Celebrity is this?");
		if(answer.equalsIgnoreCase("Abraham Lincoln")){
			// *** -- Tell them they are correct.
				text("U win!!!");
			// *** -- Increase the score by 1
				score = score + 1;
			}else if(answer.equalsIgnoreCase("Abraham Lincon")){
				text("You spelled it wrong!!! Penalty -1 point!!!");
				score = score - 1;
			}
		else{
			// *** -- Tell them they are wrong
				text("U Fail!");
			}
		scorez = Integer.toString(score);
		text(scorez);
		if(score == -1){
			text("Rank: Worse than your phone");
		}
		if(score == 0){
			text("Rank: Noob of Noobs");
		}
		if(score == 1){
			text("Rank: Derp Plant");
		}
		if(score == 2){
			text("Rank: B+");
		}
		if(score == 3){
			text("Rank: Are you a wizard?!");
		}
	}

	static void text(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
	
	static String question(String text) {
		String answer = JOptionPane.showInputDialog(text);
		return (answer);
	}
	
	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}


	public static void main(String[] args) {
		celebbodyparts quiz = new celebbodyparts();
		quiz.initializeGui();
		quiz.startQuiz();
	}


	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}


	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}


	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;


	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}


	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}



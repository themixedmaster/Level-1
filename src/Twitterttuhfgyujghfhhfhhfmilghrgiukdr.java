import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Twitterttuhfgyujghfhhfhhfmilghrgiukdr implements ActionListener {
	public static void main(String[] args) {
		Twitterttuhfgyujghfhhfhhfmilghrgiukdr tweeetteteterer = new Twitterttuhfgyujghfhhfhhfmilghrgiukdr();
		tweeetteteterer.createUI();
	}
	JTextField text = new JTextField(20);
	void createUI(){
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.add(panel);
		JButton button = new JButton("Search twittterer");
		panel.add(button);
		panel.add(text);
		button.addActionListener(this);
		frame.pack();
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("tweet tweet");
		String qwertyuiop = getLatestTweet(text.getText());
		System.out.println(qwertyuiop);
	}
	
	
	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}

}
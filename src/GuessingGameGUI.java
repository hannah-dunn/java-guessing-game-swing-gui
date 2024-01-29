import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GuessingGameGUI extends JFrame {
	public GuessingGameGUI() {
		setTitle(" ⭐ Number Guessing Game ⭐ ");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SplashScreen splashScreen = new SplashScreen("splash.png");
		splashScreen.showSplashScreen();

		add(new GuessingGamePanel());
	}
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// new GuessingGameGUI().setVisible(true);
				GuessingGameGUI gui = new GuessingGameGUI();
				gui.setVisible(true);

				SplashScreen splashScreen = new SplashScreen("splash.png");
				splashScreen.hideSplashScreen();
			}
		});
	}
	
}

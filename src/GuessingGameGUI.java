import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GuessingGameGUI extends JFrame {
	public GuessingGameGUI() {
		setTitle(" ⭐ Number Guessing Game ⭐ ");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new GuessingGamePanel());
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GuessingGameGUI().setVisible(true);
			}
		});
	}
	
}

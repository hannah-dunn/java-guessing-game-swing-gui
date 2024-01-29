import javax.swing.JWindow;
import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JWindow{

    private Image splashImage;

    public SplashScreen(String imagePath) {
        splashImage = Toolkit.getDefaultToolkit().getImage(imagePath);
        setSize(splashImage.getWidth(null), splashImage.getHeight(null));
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(splashImage, 0, 0, null);
    }

    public void showSplashScreen() {
        setVisible(true);
    }

    public void hideSplashScreen() {
        setVisible(false);
    }
}

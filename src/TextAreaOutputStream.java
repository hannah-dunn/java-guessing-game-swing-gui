import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JTextArea;

public class TextAreaOutputStream extends OutputStream {
    private final JTextArea textArea;

    public TextAreaOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) throws IOException {
        // here appends the character to the JTextArea
        textArea.append(String.valueOf((char) b));
        // scroll to the end of the text area
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}

import javax.swing.*;
// import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;


public class GuessingGamePanel extends JPanel {
	
	private GuessingGame game;
	private JTextField guessField;
	private JTextArea outputArea;

	public GuessingGamePanel() {
		
		setLayout(new BorderLayout());
		
		game = new GuessingGame();
		
		guessField = new JTextField();
//		guessField.setColumns(10);
//		guessField.setPreferredSize(new Dimension(100, guessField.getPreferredSize().height));
		JButton submitButton = new JButton("Submit");
		outputArea = new JTextArea();
//		outputArea.setRows(8);
//		outputArea.setColumns(20);
//		outputArea.setPreferredSize(new Dimension(300, outputArea.getPreferredSize().height));
		outputArea.setEditable(false);
		
//		guessField.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
//        outputArea.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
      
    // creates JScrollPane and add outputArea to it
//        JScrollPane scrollPane = new JScrollPane(outputArea);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//		
		 // this here creates PrintStream that writes to the JTextArea
        PrintStream printStream = new PrintStream(new TextAreaOutputStream(outputArea));

        // Redirect System.out and System.err to the custom PrintStream
        System.setOut(printStream);
        System.setErr(printStream);
		
//		add(new JLabel("Guess what number I'm thinking between 1 and 1000: "), BorderLayout.NORTH);
//		add(guessField, BorderLayout.CENTER);
//		add(submitButton, BorderLayout.SOUTH);
//		add(scrollPane, BorderLayout.EAST);
//		
		
		  // changed to a boxlayout for the input panel(along the top, guessField, submitbutton and Jlabel)
		  // they are now horizontal with the X_AXIS 
		  // the output area JScrollPane is in the center using BorderLayout, auto takes up remaining space
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));
        inputPanel.add(new JLabel("Guess what number I'm thinking between 1 and 1000: "));
        inputPanel.add(guessField);
        inputPanel.add(submitButton);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
		
		submitButton.addActionListener(new SubmitButtonListener());
	}
	
	private class SubmitButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String input = guessField.getText();
			outputArea.append("Your guess: " + input + "\n");
			game.checkGuess(input);
			guessField.setText("");
		}
	}

}

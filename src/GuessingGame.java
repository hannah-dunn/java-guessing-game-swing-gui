import java.util.Random;

public class GuessingGame {
	private int secretNumber;
	private int guessCount;
	
	public GuessingGame() {
		Random randomNumber = new Random();
		secretNumber = 1 + randomNumber.nextInt(1000);
		guessCount = 0;
	}
	
	public void checkGuess(String input) {
        try {
            int userGuess = Integer.parseInt(input);
            guessCount++;

            if (userGuess == secretNumber) {
                System.out.println("You are correct!");
                System.out.println("It took you " + guessCount + " tries!");
            } else if (userGuess < secretNumber) {
                System.out.println("The secret number is higher than this guess");
            } else {
                System.out.println("The secret number is lower than this guess");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}

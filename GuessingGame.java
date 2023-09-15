import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String targetName = "Emma";
        String guess;
        int attempts = 0;

        System.out.println("Guess my name (type stop to exit)");

        while (true) {
            guess = scanner.nextLine();
            attempts++;

            if (guess.equalsIgnoreCase(targetName)) {
                System.out.println("Congratulations!");
                System.out.println("You guessed " + attempts  + " times.");
                break;
            } else if (guess.equalsIgnoreCase("stop")) {
                //System.out.println("Game over. You stopped guessing.");
                System.out.println("You guessed " + (attempts -1) + " times.");
                break;
            } else {
                System.out.println("Guess my name (type stop to exit)");
            }
        }

        scanner.close();
    }
}
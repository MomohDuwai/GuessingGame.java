import java.util.Scanner;

public class GuessingGame {
    //Define the print method 
    public static void print(String message ) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String targetName = "Emma"; // The name to be guessed
        String guess;
        int attempts = 0; // Count of guessing attempts

        print("Guess my name (type stop to exit)");

        while (true) {
            guess = scanner.nextLine();
            attempts++;

            if (guess.equalsIgnoreCase(targetName)) { // If the guess matches the target name (case-insensitive)
                print("Congratulations!");

                print("You guessed " + attempts  + " times.");
                break;
            } else if (guess.equalsIgnoreCase("stop")) {
                //System.out.println("Game over. You stopped guessing.");
               print("You guessed " + (attempts -1) + " times.");
                break;
            } else {
                print("Guess my name (type stop to exit)"); // This will print out a response by guessing the player name
            }
        }

        scanner.close();//scanner close here
    }
}
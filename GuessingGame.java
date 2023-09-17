import java.util.Scanner;

public class GuessingGame {
    //Define the print method 
    public static void print(String message ) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String targetName = "Emma";
        String guess;
        int attempts = 0;

        print("Guess my name (type stop to exit)");

        while (true) {
            guess = scanner.nextLine();
            attempts++;

            if (guess.equalsIgnoreCase(targetName)) {
                print("Congratulations!");

                print("You guessed " + attempts  + " times.");
                break;
            } else if (guess.equalsIgnoreCase("stop")) {
                //System.out.println("Game over. You stopped guessing.");
               print("You guessed " + (attempts -1) + " times.");
                break;
            } else {
                print("Guess my name (type stop to exit)");
            }
        }

        scanner.close();
    }
}
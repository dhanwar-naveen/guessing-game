import java.util.*;

public class Game {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int secretNumber = (int)(Math.random() * 100) + 1;
    int guess;

    System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

    do {
      System.out.print("Enter your guess: ");
      guess = scanner.nextInt();

      if (guess < secretNumber) {
        System.out.println("Your guess is too low. Try again.");
      } else if (guess > secretNumber) {
        System.out.println("Your guess is too high. Try again.");
      }
    } while (guess != secretNumber);

    System.out.println("Congratulations! You guessed the secret number.");
  }
}
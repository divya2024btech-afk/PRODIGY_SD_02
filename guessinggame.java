import java.util.Scanner;
import java.util.Random;

public class guessinggame {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int numberToGuess = rand.nextInt(100) + 1; // Random number between 1-100
        int attempts =0;
        int guess = 0;
        
        System.out.println("Welcome to the guessing game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
        
        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + "attempts.");
            }
        }
        
        sc.close();
   }
}
        
    

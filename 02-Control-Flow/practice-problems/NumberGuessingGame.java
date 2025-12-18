import java.util.Random;
import java.util.Scanner;

/**
 * NumberGuessingGame - Interactive guessing game (Practice Problem)
 * 
 * INSTRUCTIONS:
 * Complete this number guessing game by adding code where indicated by TODO comments.
 * The computer will pick a random number and you'll provide hints to help the player guess it.
 * 
 * Demonstrates:
 * - while loops for game logic
 * - if-else statements for feedback
 * - Random number generation
 * - Counter variables
 * - break statement to exit loop
 * 
 * @author Introduction to Java Course
 */
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Game configuration
        final int MIN_NUMBER = 1;
        final int MAX_NUMBER = 100;
        final int MAX_ATTEMPTS = 7;
        
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║   NUMBER GUESSING GAME             ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
        System.out.println("I'm thinking of a number between " + MIN_NUMBER + " and " + MAX_NUMBER);
        System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it!");
        System.out.println();
        
        // TODO: Generate a random number between MIN_NUMBER and MAX_NUMBER using random.nextInt()
        // Formula: random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER
        // Store it in a variable called secretNumber
        
        
        
        // TODO: Create a variable called attempts and initialize it to 0
        
        
        // TODO: Create a boolean variable called hasWon and initialize it to false
        
        
        // TODO: Create a while loop that continues as long as attempts < MAX_ATTEMPTS
        
            // TODO: Display the current attempt number (attempts + 1)
            
            
            // TODO: Prompt the user to enter their guess and read it using nextInt()
            // Store it in a variable called guess
            
            
            
            // TODO: Increment the attempts counter
            
            
            // TODO: Check if the guess equals the secretNumber
            // If yes:
            //   - Set hasWon to true
            //   - Print "🎉 CONGRATULATIONS! 🎉"
            //   - Print "You guessed the number [secretNumber] correctly!"
            //   - Print "It took you [attempts] attempt(s)."
            //   - Use break to exit the loop
            
            
            
            
            
            
            
            
            // TODO: Else if the guess is less than secretNumber
            //   - Print "📉 Too low! Try a higher number."
            
            
            
            
            // TODO: Else (guess is greater than secretNumber)
            //   - Print "📈 Too high! Try a lower number."
            
            
            
            
            // TODO: Calculate and display remaining attempts
            
            
            
            System.out.println();
        
        
        // TODO: After the loop, check if hasWon is false
        // If the player didn't win:
        //   - Print "😞 GAME OVER!"
        //   - Print "You've used all [MAX_ATTEMPTS] attempts."
        //   - Print "The secret number was: [secretNumber]"
        
        
        
        
        
        
        scanner.close();
    }
}

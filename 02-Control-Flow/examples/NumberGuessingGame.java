import java.util.Random;
import java.util.Scanner;

/**
 * NumberGuessingGame - Interactive guessing game
 * 
 * Demonstrates:
 * - while loops for game logic
 * - if-else statements for feedback
 * - User input validation
 * - Random number generation
 * - Counter variables
 * - break statement to exit loop
 * 
 * Game Rules:
 * - Computer picks a random number between 1-100
 * - Player guesses the number
 * - Hints provided (higher/lower)
 * - Counts number of attempts
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
        
        // Generate random number
        int secretNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        int attempts = 0;
        boolean hasWon = false;
        
        // Main game loop
        while (attempts < MAX_ATTEMPTS) {
            // Display attempt number
            System.out.print("Attempt #" + (attempts + 1) + " - Enter your guess: ");
            
            // Validate input
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Clear invalid input
                continue; // Skip to next iteration
            }
            
            int guess = scanner.nextInt();
            attempts++;
            
            // Check if guess is in valid range
            if (guess < MIN_NUMBER || guess > MAX_NUMBER) {
                System.out.println("Out of range! Please guess between " + MIN_NUMBER + " and " + MAX_NUMBER);
                attempts--; // Don't count this attempt
                continue;
            }
            
            // Check the guess
            if (guess == secretNumber) {
                // Winner!
                hasWon = true;
                System.out.println("\n🎉 CONGRATULATIONS! 🎉");
                System.out.println("You guessed the number " + secretNumber + " correctly!");
                System.out.println("It took you " + attempts + " attempt(s).");
                
                // Performance rating
                if (attempts == 1) {
                    System.out.println("Rating: INCREDIBLE! First try!");
                } else if (attempts <= 3) {
                    System.out.println("Rating: EXCELLENT!");
                } else if (attempts <= 5) {
                    System.out.println("Rating: GOOD!");
                } else {
                    System.out.println("Rating: You made it!");
                }
                break; // Exit the loop
                
            } else if (guess < secretNumber) {
                // Too low
                System.out.println("📉 Too low! Try a higher number.");
                
                // Provide additional hints
                if (secretNumber - guess > 20) {
                    System.out.println("   Hint: Much higher!");
                }
                
            } else {
                // Too high
                System.out.println("📈 Too high! Try a lower number.");
                
                // Provide additional hints
                if (guess - secretNumber > 20) {
                    System.out.println("   Hint: Much lower!");
                }
            }
            
            // Show remaining attempts
            int remaining = MAX_ATTEMPTS - attempts;
            if (remaining > 0) {
                System.out.println("   Attempts remaining: " + remaining);
            }
            
            System.out.println();
        }
        
        // Check if player lost
        if (!hasWon) {
            System.out.println("\n😞 GAME OVER!");
            System.out.println("You've used all " + MAX_ATTEMPTS + " attempts.");
            System.out.println("The secret number was: " + secretNumber);
        }
        
        // Play again?
        System.out.print("\nWould you like to play again? (yes/no): ");
        String playAgain = scanner.next().toLowerCase();
        
        if (playAgain.equals("yes") || playAgain.equals("y")) {
            System.out.println("\nRestarting game...\n");
            scanner.close();
            main(args); // Recursive call to restart
        } else {
            System.out.println("\nThanks for playing! Goodbye!");
        }
        
        scanner.close();
    }
}

/*
 * Sample Game Session:
 * 
 * ╔════════════════════════════════════╗
 * ║   NUMBER GUESSING GAME             ║
 * ╚════════════════════════════════════╝
 * 
 * I'm thinking of a number between 1 and 100
 * You have 7 attempts to guess it!
 * 
 * Attempt #1 - Enter your guess: 50
 * 📈 Too high! Try a lower number.
 *    Attempts remaining: 6
 * 
 * Attempt #2 - Enter your guess: 25
 * 📉 Too low! Try a higher number.
 *    Attempts remaining: 5
 * 
 * Attempt #3 - Enter your guess: 37
 * 📈 Too high! Try a lower number.
 *    Attempts remaining: 4
 * 
 * Attempt #4 - Enter your guess: 31
 * 📉 Too low! Try a higher number.
 *    Attempts remaining: 3
 * 
 * Attempt #5 - Enter your guess: 34
 * 
 * 🎉 CONGRATULATIONS! 🎉
 * You guessed the number 34 correctly!
 * It took you 5 attempt(s).
 * Rating: GOOD!
 * 
 * Would you like to play again? (yes/no): no
 * 
 * Thanks for playing! Goodbye!
 * 
 * 
 * KEY CONCEPTS DEMONSTRATED:
 * 
 * 1. WHILE LOOP:
 *    - Continues as long as attempts < MAX_ATTEMPTS
 *    - Condition checked at the start of each iteration
 * 
 * 2. IF-ELSE CHAINS:
 *    - Multiple conditions checked sequentially
 *    - First true condition executes, others skipped
 * 
 * 3. BREAK STATEMENT:
 *    - Exits the loop immediately when number is guessed
 *    - Used to terminate game early
 * 
 * 4. CONTINUE STATEMENT:
 *    - Skips rest of current iteration
 *    - Used for invalid input handling
 * 
 * 5. BOOLEAN FLAGS:
 *    - hasWon tracks game state
 *    - Used to determine outcome after loop
 * 
 * 6. INPUT VALIDATION:
 *    - Checks if input is integer
 *    - Verifies input is in valid range
 * 
 * 7. COMPARISON OPERATORS:
 *    - <, >, ==, <=, >= for number comparison
 * 
 * 8. LOGICAL CONDITIONS:
 *    - Combined conditions with || and &&
 * 
 * GAME STRATEGY TIPS:
 * - Use binary search strategy (start at 50)
 * - Narrow range by half each guess
 * - Optimal strategy needs log₂(100) ≈ 7 guesses max
 */

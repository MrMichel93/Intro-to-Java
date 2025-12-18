import java.util.Scanner;

/**
 * PrimeNumberChecker - Check if a number is prime (Practice Problem - Hard)
 * 
 * INSTRUCTIONS:
 * Complete this prime number checker by adding code where indicated by TODO comments.
 * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 * 
 * Demonstrates:
 * - Nested loops for checking divisibility
 * - Boolean flags
 * - break statement for optimization
 * - Mathematical logic
 * 
 * Examples:
 * - Prime numbers: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29...
 * - Not prime: 4 (divisible by 2), 9 (divisible by 3), 15 (divisible by 3 and 5)
 * 
 * @author Introduction to Java Course
 */
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║    PRIME NUMBER CHECKER            ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
        
        // TODO: Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        
        // TODO: Read the number
        
        
        // TODO: Validate that the number is greater than 0
        // If not, print "Error: Please enter a positive integer" and exit
        
        
        
        
        
        // TODO: Handle special case: numbers less than 2 are not prime
        
        
        
        
        
        // TODO: Create a boolean variable called isPrime and initialize it to true
        
        
        // TODO: Create a for loop that checks divisibility from 2 to number-1
        // Optimization: You only need to check up to the square root of the number
        // For simplicity, check from 2 to number/2
        
        
            // TODO: Check if number is divisible by the current loop variable
            // Hint: Use the modulo operator (%)
            // If divisible:
            //   - Set isPrime to false
            //   - Print "[number] is divisible by [current divisor]"
            //   - Use break to exit the loop early (optimization)
            
            
            
            
            
            
            
        
        
        // TODO: After the loop, check the isPrime flag
        // If isPrime is true:
        //   - Print "✓ [number] is a PRIME number!"
        // Else:
        //   - Print "✗ [number] is NOT a prime number."
        
        
        
        
        
        
        
        System.out.println();
        
        // BONUS CHALLENGE (Optional):
        // TODO: Modify the program to find all prime numbers from 1 to a given range
        // Prompt: "Do you want to find all primes up to your number? (yes/no): "
        // If yes, use a loop to check each number and print all primes found
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        scanner.close();
    }
}

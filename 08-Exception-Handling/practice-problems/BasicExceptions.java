import java.util.Scanner;

/**
 * BasicExceptions - Exception handling basics (Practice Problem - Easy)
 * 
 * INSTRUCTIONS:
 * Complete this program by adding exception handling where indicated by TODO comments.
 * 
 * Demonstrates:
 * - try-catch blocks
 * - Multiple catch blocks
 * - finally block
 * - Common exception types
 * 
 * @author Introduction to Java Course
 */
public class BasicExceptions {
    
    /**
     * TODO: Create a method called safeDivide
     * - Takes two int parameters: numerator and denominator
     * - Returns double
     * - Use try-catch to handle ArithmeticException (division by zero)
     * - Return 0.0 if exception occurs
     * - Print error message in catch block
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called parseIntegerSafely
     * - Takes String parameter
     * - Returns int
     * - Use try-catch to handle NumberFormatException
     * - Return -1 if exception occurs
     * - Print error message
     */
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called accessArrayElement
     * - Takes int[] array and int index
     * - Returns int
     * - Use try-catch to handle ArrayIndexOutOfBoundsException
     * - Return -1 if exception occurs
     * - Print error message
     */
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called demonstrateFinally
     * - Takes no parameters
     * - Returns void
     * - Use try-catch-finally blocks
     * - Print messages in each block to show execution order
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("=== Exception Handling Basics ===\n");
        
        // TODO: Test safeDivide
        System.out.println("--- Safe Division ---");
        // Test with normal values
        
        // Test with zero denominator
        
        
        System.out.println();
        
        // TODO: Test parseIntegerSafely
        System.out.println("--- Safe Integer Parsing ---");
        // Test with valid string
        
        // Test with invalid string
        
        
        System.out.println();
        
        // TODO: Test accessArrayElement
        System.out.println("--- Safe Array Access ---");
        int[] numbers = {10, 20, 30};
        // Test with valid index
        
        // Test with invalid index
        
        
        System.out.println();
        
        // TODO: Test demonstrateFinally
        System.out.println("--- Finally Block Demo ---");
        
        
        System.out.println();
        
        // TODO: Create a Scanner and demonstrate exception handling with user input
        System.out.println("--- User Input Exception Handling ---");
        Scanner scanner = new Scanner(System.in);
        
        
        
        
        
        
        
        
        
        
        
        
        
        scanner.close();
    }
}

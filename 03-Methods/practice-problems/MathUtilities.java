/**
 * MathUtilities - Collection of useful mathematical methods (Practice Problem)
 * 
 * INSTRUCTIONS:
 * Complete this utility class by implementing methods where indicated by TODO comments.
 * Each method should perform a specific mathematical operation.
 * 
 * Demonstrates:
 * - Method creation with parameters and return values
 * - Method overloading (same name, different parameters)
 * - Static methods for utility functions
 * - Input validation
 * 
 * @author Introduction to Java Course
 */
public class MathUtilities {
    
    /**
     * TODO: Create a method called isEven that checks if a number is even
     * - Method should be public and static
     * - Should take one int parameter called number
     * - Should return a boolean (true if even, false if odd)
     * - Hint: Use the modulo operator (%) to check if divisible by 2
     */
    
    
    
    
    
    /**
     * TODO: Create a method called isOdd that checks if a number is odd
     * - Method should be public and static
     * - Should take one int parameter called number
     * - Should return a boolean (true if odd, false if even)
     * - Hint: A number is odd if it's not even
     */
    
    
    
    
    
    /**
     * TODO: Create a method called max that returns the larger of two integers
     * - Method should be public and static
     * - Should take two int parameters: a and b
     * - Should return an int (the larger value)
     * - Hint: Use the ternary operator ? : or an if statement
     */
    
    
    
    
    
    /**
     * TODO: Create an overloaded version of max that works with doubles
     * - Method should be public and static
     * - Should take two double parameters: a and b
     * - Should return a double (the larger value)
     */
    
    
    
    
    
    /**
     * TODO: Create a method called min that returns the smaller of two integers
     * - Method should be public and static
     * - Should take two int parameters: a and b
     * - Should return an int (the smaller value)
     */
    
    
    
    
    
    /**
     * TODO: Create a method called abs that returns the absolute value of a number
     * - Method should be public and static
     * - Should take one int parameter called n
     * - Should return an int (the absolute value)
     * - Hint: If n is negative, return -n; otherwise return n
     */
    
    
    
    
    
    /**
     * TODO: Create a method called power that calculates base raised to exponent
     * - Method should be public and static
     * - Should take two int parameters: base and exponent
     * - Should return a double
     * - For simplicity, assume exponent is non-negative
     * - Use a loop to multiply base by itself exponent times
     */
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called factorial that calculates n!
     * - Method should be public and static
     * - Should take one int parameter called n (assume n >= 0)
     * - Should return a long (factorial can be large)
     * - Hint: 0! = 1, 1! = 1, n! = n * (n-1) * (n-2) * ... * 1
     * - Use a loop to calculate the result
     */
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called circleArea that calculates the area of a circle
     * - Method should be public and static
     * - Should take one double parameter called radius
     * - Should return a double
     * - Formula: π * radius²
     * - Use 3.14159 for π (or Math.PI)
     */
    
    
    
    
    
    /**
     * TODO: Create a void method called displayNumberInfo that prints information about a number
     * - Method should be public and static
     * - Should take one int parameter called number
     * - Should not return anything (void)
     * - Should print:
     *   - "Number: [number]"
     *   - "Even: [true/false]" (use the isEven method)
     *   - "Odd: [true/false]" (use the isOdd method)
     *   - "Absolute value: [value]" (use the abs method)
     */
    
    
    
    
    
    
    
    
    
    
    // Main method for demonstration
    public static void main(String[] args) {
        System.out.println("=== Math Utilities Demonstration ===\n");
        
        // TODO: Test isEven and isOdd methods
        System.out.println("--- Even/Odd Tests ---");
        // Print: "10 is even: " + result of isEven(10)
        
        // Print: "7 is odd: " + result of isOdd(7)
        
        
        System.out.println();
        
        // TODO: Test max method (both int and double versions)
        System.out.println("--- Max Tests ---");
        // Print: "max(10, 20) = " + result of max(10, 20)
        
        // Print: "max(3.5, 2.1) = " + result of max(3.5, 2.1)
        
        
        System.out.println();
        
        // TODO: Test min method
        System.out.println("--- Min Tests ---");
        // Print: "min(10, 20) = " + result of min(10, 20)
        
        
        System.out.println();
        
        // TODO: Test abs method
        System.out.println("--- Absolute Value Tests ---");
        // Print: "abs(-15) = " + result of abs(-15)
        
        // Print: "abs(15) = " + result of abs(15)
        
        
        System.out.println();
        
        // TODO: Test power method
        System.out.println("--- Power Tests ---");
        // Print: "2^10 = " + result of power(2, 10)
        
        
        System.out.println();
        
        // TODO: Test factorial method
        System.out.println("--- Factorial Tests ---");
        // Print: "5! = " + result of factorial(5)
        
        
        System.out.println();
        
        // TODO: Test circleArea method
        System.out.println("--- Circle Area Tests ---");
        // Print: "Area of circle with radius 5.0: " + result of circleArea(5.0)
        
        
        System.out.println();
        
        // TODO: Test displayNumberInfo method (void method)
        System.out.println("--- Number Info Display ---");
        // Call displayNumberInfo(17)
        
    }
}

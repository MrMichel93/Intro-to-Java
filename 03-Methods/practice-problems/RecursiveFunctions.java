/**
 * RecursiveFunctions - Practice with recursion (Practice Problem - Hard)
 * 
 * INSTRUCTIONS:
 * Complete this class by implementing recursive methods where indicated by TODO comments.
 * Recursion is when a method calls itself to solve a problem by breaking it into smaller subproblems.
 * 
 * Demonstrates:
 * - Recursive method calls
 * - Base cases (stopping condition)
 * - Recursive cases (breaking down the problem)
 * - Stack usage in recursion
 * 
 * Important: Every recursive method needs:
 * 1. Base case - condition to stop recursion
 * 2. Recursive case - method calling itself with a smaller problem
 * 
 * @author Introduction to Java Course
 */
public class RecursiveFunctions {
    
    /**
     * TODO: Create a recursive method called factorial
     * - Method should be public and static
     * - Should take one int parameter called n
     * - Should return a long (factorial can be large)
     * - Base case: if n <= 1, return 1
     * - Recursive case: return n * factorial(n - 1)
     * - Example: factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
     */
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a recursive method called fibonacci
     * - Method should be public and static
     * - Should take one int parameter called n
     * - Should return an int
     * - Base cases: 
     *   - if n == 0, return 0
     *   - if n == 1, return 1
     * - Recursive case: return fibonacci(n - 1) + fibonacci(n - 2)
     * - Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21...
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a recursive method called sumDigits
     * - Method should be public and static
     * - Should take one int parameter called n
     * - Should return an int (sum of all digits in n)
     * - Example: sumDigits(1234) = 1 + 2 + 3 + 4 = 10
     * - Base case: if n == 0, return 0
     * - Recursive case: return (n % 10) + sumDigits(n / 10)
     * - Hint: n % 10 gives the last digit, n / 10 removes the last digit
     */
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a recursive method called power
     * - Method should be public and static
     * - Should take two int parameters: base and exponent
     * - Should return a long
     * - Calculates base raised to the power of exponent (base^exponent)
     * - Base case: if exponent == 0, return 1 (anything to power 0 is 1)
     * - Recursive case: return base * power(base, exponent - 1)
     * - Example: power(2, 3) = 2 * 2 * 2 = 8
     */
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a recursive method called reverseString
     * - Method should be public and static
     * - Should take one String parameter called str
     * - Should return a String (reversed)
     * - Base case: if str is empty or has 1 character, return str
     * - Recursive case: return reverseString(str.substring(1)) + str.charAt(0)
     * - Example: reverseString("hello") = "olleh"
     */
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a recursive method called countDown
     * - Method should be public and static
     * - Should take one int parameter called n
     * - Should return void (just prints)
     * - Base case: if n <= 0, print "Blast off!" and return
     * - Recursive case: 
     *   - Print n
     *   - Call countDown(n - 1)
     * - Example: countDown(5) prints "5 4 3 2 1 Blast off!"
     */
    
    
    
    
    
    
    
    
    
    
    
    // Main method for demonstration
    public static void main(String[] args) {
        System.out.println("=== Recursive Functions Demonstration ===\n");
        
        // TODO: Test factorial method
        System.out.println("--- Factorial ---");
        // Print: "5! = " + factorial(5)
        // Print: "10! = " + factorial(10)
        
        
        
        System.out.println();
        
        // TODO: Test fibonacci method
        System.out.println("--- Fibonacci Sequence ---");
        System.out.print("First 10 Fibonacci numbers: ");
        // Use a loop to print fibonacci(0) through fibonacci(9)
        
        
        
        
        System.out.println("\n");
        
        // TODO: Test sumDigits method
        System.out.println("--- Sum of Digits ---");
        // Print: "Sum of digits in 1234: " + sumDigits(1234)
        // Print: "Sum of digits in 9876: " + sumDigits(9876)
        
        
        
        System.out.println();
        
        // TODO: Test power method
        System.out.println("--- Power ---");
        // Print: "2^10 = " + power(2, 10)
        // Print: "5^3 = " + power(5, 3)
        
        
        
        System.out.println();
        
        // TODO: Test reverseString method
        System.out.println("--- Reverse String ---");
        // Print: "Reverse of 'recursion': " + reverseString("recursion")
        
        
        System.out.println();
        
        // TODO: Test countDown method
        System.out.println("--- Countdown ---");
        // Call countDown(5)
        
        
        System.out.println();
        
        System.out.println("\n=== Recursion Tips ===");
        System.out.println("1. Always define a base case to stop recursion");
        System.out.println("2. Make sure recursive calls move toward the base case");
        System.out.println("3. Be careful with stack overflow for large inputs");
        System.out.println("4. Some recursive solutions can be converted to iterative ones");
    }
}

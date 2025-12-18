import java.io.IOException;

/**
 * ExceptionPropagation - Exception propagation and rethrowing (Practice Problem - Hard)
 * 
 * INSTRUCTIONS:
 * Complete this program demonstrating exception propagation where indicated by TODO comments.
 * 
 * Demonstrates:
 * - Exception propagation through call stack
 * - Throws clause
 * - Rethrowing exceptions
 * - Exception wrapping
 * - Multi-catch blocks
 * 
 * @author Introduction to Java Course
 */
public class ExceptionPropagation {
    
    /**
     * TODO: Create method level1
     * - Takes int value
     * - Throws ArithmeticException if value is 0
     * - Otherwise, returns 100 / value
     * - Declare "throws ArithmeticException" in method signature
     */
    
    
    
    
    
    
    
    
    /**
     * TODO: Create method level2
     * - Takes int value
     * - Calls level1(value)
     * - Catches ArithmeticException
     * - Prints "Level 2: Caught exception"
     * - Rethrows the exception
     * - Declare "throws ArithmeticException"
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create method level3
     * - Takes int value
     * - Calls level2(value) inside try-catch
     * - Catches ArithmeticException
     * - Prints "Level 3: Caught exception"
     * - Wraps it in IOException with message "Failed at level 3"
     * - Throws the IOException
     * - Declare "throws IOException"
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create method processData
     * - Takes String data
     * - Returns int
     * - Tries to parse data as integer
     * - If NumberFormatException: print error and return -1
     * - If result is negative: throw IllegalArgumentException
     * - Use multi-catch if possible
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create method complexOperation
     * - Takes two String parameters: num1 and num2
     * - Returns double
     * - Try to:
     *   1. Parse both strings to integers
     *   2. Divide num1 by num2
     *   3. Return result
     * - Handle multiple exception types:
     *   - NumberFormatException
     *   - ArithmeticException
     *   - Any other Exception
     * - Use separate catch blocks or multi-catch
     * - Rethrow as RuntimeException if needed
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create method demonstrateFinally
     * - Opens a "resource" (simulate with message)
     * - Throws exception in try block
     * - Has finally block that "closes" resource
     * - Shows finally executes even when exception thrown
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("=== Exception Propagation Demonstration ===\n");
        
        // TODO: Test exception propagation through multiple levels
        System.out.println("--- Multi-Level Propagation ---");
        
        
        
        
        
        
        
        
        
        System.out.println();
        
        // TODO: Test processData method
        System.out.println("--- Process Data ---");
        // Test with valid data
        
        // Test with invalid data
        
        // Test with negative number
        
        
        
        
        System.out.println();
        
        // TODO: Test complexOperation
        System.out.println("--- Complex Operation ---");
        // Test various scenarios
        
        
        
        
        
        
        System.out.println();
        
        // TODO: Test demonstrateFinally
        System.out.println("--- Finally Block ---");
        
        
        
        
        
        System.out.println();
        
        System.out.println("=== Exception Propagation Summary ===");
        System.out.println("1. Exceptions propagate up the call stack");
        System.out.println("2. Methods can catch, handle, and rethrow exceptions");
        System.out.println("3. 'throws' clause declares exceptions method might throw");
        System.out.println("4. finally block always executes (cleanup code)");
        System.out.println("5. Can wrap exceptions in different exception types");
    }
}

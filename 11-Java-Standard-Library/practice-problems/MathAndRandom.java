import java.util.Random;

/**
 * MathAndRandom - Math and Random classes (Practice Problem - Easy)
 * 
 * INSTRUCTIONS:
 * Complete this program using Math and Random classes where indicated by TODO comments.
 * 
 * Demonstrates:
 * - Math class methods
 * - Random class for random number generation
 * - Mathematical calculations
 * - Random value generation
 * 
 * @author Introduction to Java Course
 */
public class MathAndRandom {
    
    /**
     * TODO: Create a method called calculateCircleArea
     * - Takes double radius
     * - Returns double
     * - Uses Math.PI and Math.pow()
     * - Formula: π * r²
     */
    
    
    
    
    
    
    /**
     * TODO: Create a method called calculateDistance
     * - Takes four parameters: x1, y1, x2, y2 (all double)
     * - Returns double (distance between two points)
     * - Formula: √((x2-x1)² + (y2-y1)²)
     * - Use Math.sqrt() and Math.pow()
     */
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called roundToDecimalPlaces
     * - Takes double value and int decimalPlaces
     * - Returns double rounded to specified decimal places
     * - Use Math.round(), Math.pow()
     * - Example: roundToDecimalPlaces(3.14159, 2) returns 3.14
     */
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called generateRandomInt
     * - Takes two parameters: min and max
     * - Returns random int between min and max (inclusive)
     * - Use Random class
     */
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called generateRandomDouble
     * - Takes two parameters: min and max
     * - Returns random double between min and max
     * - Use Random class
     */
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called rollDice
     * - Takes int parameter: numberOfDice
     * - Returns int (sum of all dice rolls)
     * - Each die is 1-6
     * - Use Random class
     */
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called getAbsoluteValue
     * - Takes int parameter
     * - Returns int (absolute value)
     * - Use Math.abs()
     */
    
    
    
    
    
    
    /**
     * TODO: Create a method called findMaxMin
     * - Takes three int parameters
     * - Returns String: "Max: X, Min: Y"
     * - Use Math.max() and Math.min()
     */
    
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("=== Math and Random Demonstration ===\n");
        
        // TODO: Test Math class methods
        System.out.println("--- Math Class ---");
        
        // Calculate circle area with radius 5.0
        
        
        // Calculate distance between (0,0) and (3,4)
        
        
        // Round 3.14159 to 2 decimal places
        
        
        // Find absolute value of -42
        
        
        // Find max and min of 15, 7, 23
        
        
        System.out.println();
        
        // TODO: Test Random class
        System.out.println("--- Random Class ---");
        
        // Generate random int between 1 and 100
        
        
        
        // Generate random double between 0.0 and 10.0
        
        
        
        // Roll 2 dice and show sum
        
        
        
        System.out.println();
        
        // TODO: Demonstrate other Math methods
        System.out.println("--- Other Math Methods ---");
        
        // Power: 2^10
        
        
        // Square root of 144
        
        
        // Ceiling and floor of 3.7
        
        
        
        // Trigonometry: sin, cos, tan of 45 degrees
        
        
        
        
        System.out.println();
        
        System.out.println("=== Common Math Methods ===");
        System.out.println("Math.abs(x)    - Absolute value");
        System.out.println("Math.pow(x,y)  - x raised to power y");
        System.out.println("Math.sqrt(x)   - Square root");
        System.out.println("Math.max(x,y)  - Maximum of two values");
        System.out.println("Math.min(x,y)  - Minimum of two values");
        System.out.println("Math.round(x)  - Round to nearest integer");
        System.out.println("Math.ceil(x)   - Round up");
        System.out.println("Math.floor(x)  - Round down");
        System.out.println("Math.random()  - Random double [0.0, 1.0)");
    }
}

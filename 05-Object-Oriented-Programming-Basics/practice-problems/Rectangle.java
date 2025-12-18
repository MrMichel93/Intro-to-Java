/**
 * Rectangle - Rectangle shape class with calculations (Practice Problem - Medium)
 * 
 * INSTRUCTIONS:
 * Complete this Rectangle class by adding code where indicated by TODO comments.
 * 
 * Demonstrates:
 * - Encapsulation with private fields
 * - Constructor overloading
 * - Method implementation
 * - Instance vs static methods
 * - Object comparison
 * 
 * @author Introduction to Java Course
 */
public class Rectangle {
    
    // TODO: Declare private instance fields:
    // - width (double)
    // - height (double)
    
    
    
    
    /**
     * TODO: Create a default constructor (no parameters)
     * - Sets width to 1.0
     * - Sets height to 1.0
     */
    
    
    
    
    
    
    /**
     * TODO: Create a constructor that takes width and height
     * - Initialize width and height with parameters
     * - If width or height is <= 0, use default value of 1.0
     */
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a constructor that creates a square
     * - Takes one parameter: side
     * - Sets both width and height to side
     */
    
    
    
    
    
    
    /**
     * TODO: Create getter and setter methods
     * - getWidth() returns double
     * - getHeight() returns double
     * - setWidth(double width) - validate > 0
     * - setHeight(double height) - validate > 0
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called calculateArea
     * - No parameters
     * - Returns double (area = width * height)
     */
    
    
    
    
    
    
    /**
     * TODO: Create a method called calculatePerimeter
     * - No parameters
     * - Returns double (perimeter = 2 * (width + height))
     */
    
    
    
    
    
    
    /**
     * TODO: Create a method called isSquare
     * - No parameters
     * - Returns boolean
     * - Returns true if width equals height
     */
    
    
    
    
    
    
    /**
     * TODO: Create a method called getDiagonal
     * - No parameters
     * - Returns double
     * - Calculate diagonal using Pythagorean theorem: √(width² + height²)
     * - Use Math.sqrt() and Math.pow()
     */
    
    
    
    
    
    
    /**
     * TODO: Create a method called scale
     * - Takes one double parameter: factor
     * - Returns void
     * - Multiplies both width and height by factor
     * - Example: scale(2.0) doubles the size
     */
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called isBiggerThan
     * - Takes one Rectangle parameter: other
     * - Returns boolean
     * - Returns true if this rectangle's area > other rectangle's area
     */
    
    
    
    
    
    
    /**
     * TODO: Create a static method called compareAreas
     * - Takes two Rectangle parameters: r1 and r2
     * - Returns String
     * - Returns:
     *   - "First rectangle is larger" if r1 area > r2 area
     *   - "Second rectangle is larger" if r2 area > r1 area
     *   - "Both rectangles have equal area" if areas are equal
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Override toString method
     * - Returns String with rectangle information
     * - Format: "Rectangle[width=X.XX, height=Y.YY, area=Z.ZZ]"
     * - Use printf formatting or String.format() for 2 decimal places
     */
    
    
    
    
    
    
    // Main method for testing
    public static void main(String[] args) {
        System.out.println("=== Rectangle Class Demonstration ===\n");
        
        // TODO: Create rectangles using different constructors
        System.out.println("--- Creating Rectangles ---");
        // Create default rectangle
        
        // Create rectangle with width=5.0, height=3.0
        
        // Create square with side=4.0
        
        
        // TODO: Print all rectangles
        
        
        
        System.out.println();
        
        // TODO: Test calculation methods
        System.out.println("--- Rectangle 1 Calculations ---");
        // Print area
        // Print perimeter
        // Print diagonal
        // Check if square
        
        
        
        
        
        System.out.println();
        
        // TODO: Test scale method
        System.out.println("--- Scaling Rectangle ---");
        // Print before scaling
        // Scale by 2.0
        // Print after scaling
        
        
        
        
        System.out.println();
        
        // TODO: Test comparison methods
        System.out.println("--- Comparing Rectangles ---");
        // Use isBiggerThan
        
        // Use static compareAreas method
        
        
        System.out.println();
        
        // TODO: Test setters
        System.out.println("--- Modifying Rectangle ---");
        // Change dimensions
        // Print updated rectangle
        
        
        
    }
}

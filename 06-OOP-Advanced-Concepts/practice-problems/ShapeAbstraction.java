/**
 * ShapeAbstraction - Abstract classes and method overriding (Practice Problem - Medium)
 * 
 * INSTRUCTIONS:
 * Complete this shape hierarchy using abstract classes where indicated by TODO comments.
 * 
 * Demonstrates:
 * - Abstract classes and methods
 * - Method overriding requirements
 * - Polymorphism with abstract types
 * - Template method pattern
 * 
 * @author Introduction to Java Course
 */

/**
 * TODO: Create abstract class Shape
 * - Declare protected field: name (String)
 * - Create constructor that takes name
 * - Declare abstract method: calculateArea() returns double
 * - Declare abstract method: calculatePerimeter() returns double
 * - Create concrete method: displayInfo() that prints name, area, and perimeter
 */








/**
 * TODO: Create Circle class that extends Shape
 * - Add private field: radius (double)
 * - Create constructor that takes radius
 * - Call super constructor with "Circle"
 * - Implement calculateArea(): π * radius²
 * - Implement calculatePerimeter(): 2 * π * radius
 * - Use Math.PI for π
 */








/**
 * TODO: Create Rectangle class that extends Shape
 * - Add private fields: width (double) and height (double)
 * - Create constructor that takes width and height
 * - Call super constructor with "Rectangle"
 * - Implement calculateArea(): width * height
 * - Implement calculatePerimeter(): 2 * (width + height)
 */








/**
 * TODO: Create Triangle class that extends Shape
 * - Add private fields: base (double) and height (double)
 * - Create constructor that takes base and height
 * - Call super constructor with "Triangle"
 * - Implement calculateArea(): (base * height) / 2
 * - Implement calculatePerimeter(): for simplicity, assume equilateral triangle
 *   perimeter = 3 * base (or use base * 3)
 */








/**
 * TODO: Create Square class that extends Rectangle
 * - Create constructor that takes side length
 * - Call super constructor with side, side (same value for width and height)
 * - Override toString to return "Square with side X"
 */






// Main class
public class ShapeAbstraction {
    
    /**
     * TODO: Create a static method called printShapeDetails
     * - Takes Shape parameter (polymorphic)
     * - Calls displayInfo() on the shape
     * - Demonstrates polymorphism
     */
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("=== Shape Abstraction Demonstration ===\n");
        
        // TODO: Create different shape objects
        System.out.println("--- Creating Shapes ---");
        
        
        
        
        
        System.out.println();
        
        // TODO: Display each shape's details
        System.out.println("--- Shape Details ---");
        
        
        
        
        
        System.out.println();
        
        // TODO: Demonstrate polymorphism with Shape array
        System.out.println("--- Polymorphic Array ---");
        
        
        
        
        
        
        
        
        System.out.println();
        
        // TODO: Find the shape with largest area
        System.out.println("--- Comparing Areas ---");
        
        
        
        
        
        
        
        
        
    }
}

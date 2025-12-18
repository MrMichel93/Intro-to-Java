/**
 * VehicleInheritance - Inheritance hierarchy demonstration (Practice Problem - Easy)
 * 
 * INSTRUCTIONS:
 * Complete this vehicle hierarchy by implementing inheritance where indicated by TODO comments.
 * 
 * Demonstrates:
 * - Inheritance (extends keyword)
 * - super keyword for calling parent constructor
 * - Method overriding
 * - Polymorphism basics
 * 
 * @author Introduction to Java Course
 */

/**
 * Vehicle - Base class (parent/superclass)
 */
class Vehicle {
    protected String brand;
    protected int year;
    protected double price;
    
    public Vehicle(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
    
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

/**
 * TODO: Create Car class that extends Vehicle
 * - Add private field: numberOfDoors (int)
 * - Create constructor that takes brand, year, price, and numberOfDoors
 * - Use super() to call parent constructor
 * - Override start() method to print "Car engine is starting..."
 * - Override displayInfo() to call super.displayInfo() then print numberOfDoors
 */







/**
 * TODO: Create Motorcycle class that extends Vehicle
 * - Add private field: hasWindshield (boolean)
 * - Create constructor that takes brand, year, price, and hasWindshield
 * - Use super() to call parent constructor
 * - Override start() method to print "Motorcycle engine is revving..."
 * - Override displayInfo() to call super.displayInfo() then print hasWindshield status
 */







/**
 * TODO: Create Truck class that extends Vehicle
 * - Add private field: cargoCapacity (double) - in tons
 * - Create constructor that takes brand, year, price, and cargoCapacity
 * - Use super() to call parent constructor
 * - Override start() method to print "Truck diesel engine is starting..."
 * - Override displayInfo() to show all info including cargo capacity
 * - Add method: canCarry(double weight) that returns boolean
 *   (true if weight <= cargoCapacity)
 */








// Main class
public class VehicleInheritance {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Inheritance Demonstration ===\n");
        
        // TODO: Create a Car object
        System.out.println("--- Car ---");
        
        
        
        System.out.println();
        
        // TODO: Create a Motorcycle object
        System.out.println("--- Motorcycle ---");
        
        
        
        System.out.println();
        
        // TODO: Create a Truck object
        System.out.println("--- Truck ---");
        
        
        
        System.out.println();
        
        // TODO: Demonstrate polymorphism
        // Create an array of Vehicle type that holds different vehicle types
        System.out.println("--- Polymorphism Demo ---");
        System.out.println("Starting all vehicles:");
        
        
        
        
        
        
    }
}

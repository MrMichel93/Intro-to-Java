import java.util.*;
import java.time.*;
import java.time.format.*;

/**
 * UtilityPackages - Exploring Java's built-in packages (Practice Problem - Medium)
 * 
 * INSTRUCTIONS:
 * Complete this program exploring common Java packages where indicated by TODO comments.
 * 
 * Demonstrates:
 * - java.util package (collections, utilities)
 * - java.time package (date and time)
 * - java.lang package (automatic import)
 * - Using classes from different packages
 * 
 * @author Introduction to Java Course
 */
public class UtilityPackages {
    
    /**
     * TODO: Create a method demonstrateUtilPackage
     * - Use classes from java.util package
     * - Create ArrayList, HashMap, Scanner
     * - Show basic operations
     */
    public static void demonstrateUtilPackage() {
        System.out.println("=== java.util Package ===");
        
        // TODO: Create and use ArrayList
        
        
        
        
        
        // TODO: Create and use HashMap
        
        
        
        
        
        // TODO: Use Random class
        
        
        
        
        System.out.println();
    }
    
    /**
     * TODO: Create a method demonstrateTimePackage
     * - Use classes from java.time package
     * - Show LocalDate, LocalTime, LocalDateTime
     * - Format dates
     */
    public static void demonstrateTimePackage() {
        System.out.println("=== java.time Package ===");
        
        // TODO: Get current date
        
        
        
        // TODO: Get current time
        
        
        
        // TODO: Get current date and time
        
        
        
        // TODO: Format date
        
        
        
        
        // TODO: Parse date string
        
        
        
        
        // TODO: Calculate days between dates
        
        
        
        
        System.out.println();
    }
    
    /**
     * TODO: Create a method demonstrateLangPackage
     * - Use classes from java.lang package (auto-imported)
     * - Show String, Math, System, Integer wrapper
     */
    public static void demonstrateLangPackage() {
        System.out.println("=== java.lang Package (auto-imported) ===");
        
        // TODO: String operations
        
        
        
        
        // TODO: Math operations
        
        
        
        
        // TODO: Wrapper class operations
        
        
        
        
        // TODO: System class
        
        
        
        System.out.println();
    }
    
    /**
     * TODO: Create a method demonstrateMathPackage
     * - Use java.lang.Math class
     * - Show various mathematical operations
     */
    public static void demonstrateMathPackage() {
        System.out.println("=== Math Operations ===");
        
        // TODO: Power and square root
        
        
        
        // TODO: Rounding
        
        
        
        
        // TODO: Trigonometry
        
        
        
        // TODO: Random number in range
        
        
        
        System.out.println();
    }
    
    /**
     * TODO: Create a practical example combining multiple packages
     * Example: Simple event scheduler
     * - Use ArrayList to store events
     * - Use LocalDateTime for event times
     * - Use Scanner for user input (simulated)
     */
    public static void practicalExample() {
        System.out.println("=== Practical Example: Event Scheduler ===");
        
        // TODO: Create event class
        // TODO: Create list of events
        // TODO: Add events with dates
        // TODO: Sort events by date
        // TODO: Display upcoming events
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   JAVA PACKAGE EXPLORATION             ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();
        
        // TODO: Call all demonstration methods
        
        
        
        
        
        
        
        
        System.out.println("=== Common Java Packages ===");
        System.out.println("java.lang   - Core classes (String, Math, System)");
        System.out.println("java.util   - Collections, utilities (ArrayList, HashMap)");
        System.out.println("java.time   - Date and time API");
        System.out.println("java.io     - Input/Output");
        System.out.println("java.nio    - New I/O (file operations)");
        System.out.println("java.net    - Networking");
        System.out.println();
        
        System.out.println("=== Package Import Tips ===");
        System.out.println("1. Import specific classes: import java.util.ArrayList;");
        System.out.println("2. Import all classes: import java.util.*;");
        System.out.println("3. java.lang is automatically imported");
        System.out.println("4. Avoid wildcard imports in production code");
    }
}

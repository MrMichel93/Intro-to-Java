import java.util.Scanner;

/**
 * TemperatureConverter - Convert between Celsius and Fahrenheit
 * 
 * Demonstrates:
 * - User input with Scanner
 * - Arithmetic operations and formulas
 * - Type conversion (int to double)
 * - Formatted output with printf
 * - Constants with final keyword
 * 
 * Formulas:
 * - Fahrenheit to Celsius: (F - 32) * 5/9
 * - Celsius to Fahrenheit: (C * 9/5) + 32
 * 
 * @author Introduction to Java Course
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        // Constants for conversion formulas
        final double FAHRENHEIT_FREEZING = 32.0;
        final double CELSIUS_FREEZING = 0.0;
        final double FAHRENHEIT_BOILING = 212.0;
        final double CELSIUS_BOILING = 100.0;
        
        Scanner input = new Scanner(System.in);
        
        // Display header
        System.out.println("====================================");
        System.out.println("   Temperature Converter");
        System.out.println("====================================");
        System.out.println();
        
        // Show menu
        System.out.println("Select conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("\nYour choice (1 or 2): ");
        int choice = input.nextInt();
        
        System.out.println();
        
        if (choice == 1) {
            // Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            
            // Conversion formula: F = (C * 9/5) + 32
            double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
            
            // Display result with formatting
            System.out.println("\n----- Results -----");
            System.out.printf("%.2f°C = %.2f°F\n", celsius, fahrenheit);
            
            // Provide context
            if (celsius <= CELSIUS_FREEZING) {
                System.out.println("That's at or below freezing point of water!");
            } else if (celsius >= CELSIUS_BOILING) {
                System.out.println("That's at or above boiling point of water!");
            } else if (celsius >= 30) {
                System.out.println("That's hot!");
            } else if (celsius <= 10) {
                System.out.println("That's cold!");
            } else {
                System.out.println("That's a moderate temperature.");
            }
            
        } else if (choice == 2) {
            // Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            
            // Conversion formula: C = (F - 32) * 5/9
            double celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
            
            // Display result with formatting
            System.out.println("\n----- Results -----");
            System.out.printf("%.2f°F = %.2f°C\n", fahrenheit, celsius);
            
            // Provide context
            if (fahrenheit <= FAHRENHEIT_FREEZING) {
                System.out.println("That's at or below freezing point of water!");
            } else if (fahrenheit >= FAHRENHEIT_BOILING) {
                System.out.println("That's at or above boiling point of water!");
            } else if (fahrenheit >= 86) {
                System.out.println("That's hot!");
            } else if (fahrenheit <= 50) {
                System.out.println("That's cold!");
            } else {
                System.out.println("That's a moderate temperature.");
            }
            
        } else {
            System.out.println("Invalid choice! Please select 1 or 2.");
        }
        
        // Fun facts
        System.out.println("\n----- Fun Facts -----");
        System.out.println("Water freezes at: 0°C / 32°F");
        System.out.println("Water boils at: 100°C / 212°F");
        System.out.println("Human body temperature: 37°C / 98.6°F");
        System.out.println("Room temperature: ~20°C / ~68°F");
        
        input.close();
    }
}

/*
 * Sample Run 1:
 * ====================================
 *    Temperature Converter
 * ====================================
 * 
 * Select conversion:
 * 1. Celsius to Fahrenheit
 * 2. Fahrenheit to Celsius
 * 
 * Your choice (1 or 2): 1
 * 
 * Enter temperature in Celsius: 25
 * 
 * ----- Results -----
 * 25.00°C = 77.00°F
 * That's a moderate temperature.
 * 
 * ----- Fun Facts -----
 * Water freezes at: 0°C / 32°F
 * Water boils at: 100°C / 212°F
 * Human body temperature: 37°C / 98.6°F
 * Room temperature: ~20°C / ~68°F
 * 
 * Sample Run 2:
 * Your choice (1 or 2): 2
 * 
 * Enter temperature in Fahrenheit: 32
 * 
 * ----- Results -----
 * 32.00°F = 0.00°C
 * That's at or below freezing point of water!
 * ...
 */

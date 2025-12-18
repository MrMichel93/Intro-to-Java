import java.util.Scanner;

/**
 * TemperatureConverter - Convert between Celsius and Fahrenheit (Practice Problem)
 * 
 * INSTRUCTIONS:
 * Complete this temperature converter by adding code where indicated by TODO comments.
 * Use the provided formulas to perform conversions.
 * 
 * Formulas:
 * - Fahrenheit to Celsius: (F - 32) * 5/9
 * - Celsius to Fahrenheit: (C * 9/5) + 32
 * 
 * @author Introduction to Java Course
 */
public class TemperatureConverter {
    public static void main(String[] args) {
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
            // TODO: Prompt user to enter temperature in Celsius and store in celsius variable
            
            
            
            // TODO: Convert celsius to fahrenheit using formula: (C * 9/5) + 32
            // Store the result in a variable called fahrenheit
            
            
            
            // TODO: Display the result using printf with 2 decimal places
            // Format: "%.2f°C = %.2f°F\n"
            System.out.println("\n----- Results -----");
            
            
            // TODO: Add context messages based on the celsius value:
            // - If celsius <= 0: print "That's at or below freezing point of water!"
            // - Else if celsius >= 100: print "That's at or above boiling point of water!"
            // - Else if celsius >= 30: print "That's hot!"
            // - Else if celsius <= 10: print "That's cold!"
            // - Else: print "That's a moderate temperature."
            
            
            
            
            
            
            
            
            
        } else if (choice == 2) {
            // TODO: Prompt user to enter temperature in Fahrenheit and store in fahrenheit variable
            
            
            
            // TODO: Convert fahrenheit to celsius using formula: (F - 32) * 5/9
            // Store the result in a variable called celsius
            
            
            
            // TODO: Display the result using printf with 2 decimal places
            // Format: "%.2f°F = %.2f°C\n"
            System.out.println("\n----- Results -----");
            
            
            // TODO: Add context messages based on the fahrenheit value:
            // - If fahrenheit <= 32: print "That's at or below freezing point of water!"
            // - Else if fahrenheit >= 212: print "That's at or above boiling point of water!"
            // - Else if fahrenheit >= 86: print "That's hot!"
            // - Else if fahrenheit <= 50: print "That's cold!"
            // - Else: print "That's a moderate temperature."
            
            
            
            
            
            
            
            
            
        } else {
            System.out.println("Invalid choice! Please select 1 or 2.");
        }
        
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

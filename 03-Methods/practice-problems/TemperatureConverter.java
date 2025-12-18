import java.util.Scanner;

/**
 * TemperatureConverter - Convert between temperature scales (Practice Problem - Medium)
 * 
 * INSTRUCTIONS:
 * Complete this temperature converter by implementing methods where indicated by TODO comments.
 * The program should convert between Celsius, Fahrenheit, and Kelvin.
 * 
 * Demonstrates:
 * - Methods with parameters and return values
 * - Mathematical operations
 * - Method overloading
 * - User interaction with menu
 * 
 * Formulas:
 * - Celsius to Fahrenheit: (C × 9/5) + 32
 * - Fahrenheit to Celsius: (F - 32) × 5/9
 * - Celsius to Kelvin: C + 273.15
 * - Kelvin to Celsius: K - 273.15
 * 
 * @author Introduction to Java Course
 */
public class TemperatureConverter {
    
    /**
     * TODO: Create a method called celsiusToFahrenheit
     * - Method should be public and static
     * - Should take one double parameter called celsius
     * - Should return a double (temperature in Fahrenheit)
     * - Formula: (celsius × 9.0/5.0) + 32
     */
    
    
    
    
    
    
    /**
     * TODO: Create a method called fahrenheitToCelsius
     * - Method should be public and static
     * - Should take one double parameter called fahrenheit
     * - Should return a double (temperature in Celsius)
     * - Formula: (fahrenheit - 32) × 5.0/9.0
     */
    
    
    
    
    
    
    /**
     * TODO: Create a method called celsiusToKelvin
     * - Method should be public and static
     * - Should take one double parameter called celsius
     * - Should return a double (temperature in Kelvin)
     * - Formula: celsius + 273.15
     */
    
    
    
    
    
    
    /**
     * TODO: Create a method called kelvinToCelsius
     * - Method should be public and static
     * - Should take one double parameter called kelvin
     * - Should return a double (temperature in Celsius)
     * - Formula: kelvin - 273.15
     */
    
    
    
    
    
    
    /**
     * TODO: Create a method called fahrenheitToKelvin
     * - Method should be public and static
     * - Should take one double parameter called fahrenheit
     * - Should return a double (temperature in Kelvin)
     * - Hint: Convert Fahrenheit to Celsius first, then Celsius to Kelvin
     * - Use the methods you already created!
     */
    
    
    
    
    
    
    /**
     * TODO: Create a method called kelvinToFahrenheit
     * - Method should be public and static
     * - Should take one double parameter called kelvin
     * - Should return a double (temperature in Fahrenheit)
     * - Hint: Convert Kelvin to Celsius first, then Celsius to Fahrenheit
     */
    
    
    
    
    
    
    /**
     * TODO: Create a void method called displayMenu
     * - Method should be public and static
     * - Should not take any parameters
     * - Should print the conversion menu:
     *   "1. Celsius to Fahrenheit"
     *   "2. Fahrenheit to Celsius"
     *   "3. Celsius to Kelvin"
     *   "4. Kelvin to Celsius"
     *   "5. Fahrenheit to Kelvin"
     *   "6. Kelvin to Fahrenheit"
     *   "0. Exit"
     */
    
    
    
    
    
    
    
    
    
    
    
    
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║   TEMPERATURE CONVERTER            ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
        
        // TODO: Create a while loop that continues until user chooses to exit
        
        
            // TODO: Display the menu using the displayMenu method
            
            
            // TODO: Prompt user to enter their choice
            System.out.print("\nEnter your choice: ");
            
            
            // TODO: Read the choice
            
            
            // TODO: If choice is 0, break out of the loop
            
            
            
            // TODO: Prompt user to enter the temperature value
            System.out.print("Enter temperature: ");
            
            
            // TODO: Read the temperature
            
            
            // TODO: Use a switch statement or if-else to handle each conversion
            // For each case:
            //   - Call the appropriate conversion method
            //   - Store the result
            //   - Print the result formatted to 2 decimal places
            //   - Use System.out.printf("%.2f", value) for formatting
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            System.out.println();
        
        
        System.out.println("\nThank you for using Temperature Converter!");
        scanner.close();
    }
}

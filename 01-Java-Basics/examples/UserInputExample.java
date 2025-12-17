import java.util.Scanner;

/**
 * UserInputExample - Comprehensive Scanner demonstration
 * 
 * Demonstrates:
 * - Creating and using Scanner object
 * - Reading different data types (String, int, double, boolean)
 * - nextLine() vs next()
 * - Input validation
 * - Closing Scanner properly
 * 
 * @author Introduction to Java Course
 */
public class UserInputExample {
    public static void main(String[] args) {
        // Create Scanner object to read from System.in (keyboard)
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====================================");
        System.out.println("   User Profile Creator");
        System.out.println("====================================\n");
        
        // Reading a String (full line)
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();  // Reads entire line including spaces
        
        // Reading an int
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Reading a double
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();
        
        // Reading a boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        
        // Clear the newline left by nextBoolean()
        scanner.nextLine();
        
        // Reading another String
        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();
        
        // Reading a single word
        System.out.print("Enter your city (single word): ");
        String city = scanner.next();  // Only reads until space
        
        // Display collected information
        System.out.println("\n====================================");
        System.out.println("   Your Profile");
        System.out.println("====================================");
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age + " years old");
        System.out.println("Height: " + height + " meters");
        System.out.println("Student Status: " + (isStudent ? "Yes" : "No"));
        System.out.println("Favorite Color: " + favoriteColor);
        System.out.println("City: " + city);
        
        // Calculate and display additional info
        System.out.println("\n----- Additional Information -----");
        
        // Birth year (approximate)
        int currentYear = 2024;
        int birthYear = currentYear - age;
        System.out.println("Approximate birth year: " + birthYear);
        
        // Height in centimeters
        double heightInCm = height * 100;
        System.out.printf("Height in cm: %.1f cm\n", heightInCm);
        
        // Age category
        String ageCategory;
        if (age < 13) {
            ageCategory = "Child";
        } else if (age < 20) {
            ageCategory = "Teenager";
        } else if (age < 65) {
            ageCategory = "Adult";
        } else {
            ageCategory = "Senior";
        }
        System.out.println("Age category: " + ageCategory);
        
        // Fun personalized message
        System.out.println("\n----- Personalized Message -----");
        System.out.println("Hello, " + fullName + " from " + city + "!");
        if (isStudent) {
            System.out.println("Good luck with your studies!");
        } else {
            System.out.println("Enjoy your day!");
        }
        System.out.println("Your favorite color, " + favoriteColor + ", is a great choice!");
        
        // Important: Always close the Scanner when done
        scanner.close();
        
        System.out.println("\n====================================");
        System.out.println("Profile created successfully!");
        System.out.println("====================================");
    }
}

/*
 * Sample Run:
 * ====================================
 *    User Profile Creator
 * ====================================
 * 
 * Enter your full name: Alice Johnson
 * Enter your age: 16
 * Enter your height in meters (e.g., 1.75): 1.65
 * Are you a student? (true/false): true
 * Enter your favorite color: Blue
 * Enter your city (single word): Seattle
 * 
 * ====================================
 *    Your Profile
 * ====================================
 * Name: Alice Johnson
 * Age: 16 years old
 * Height: 1.65 meters
 * Student Status: Yes
 * Favorite Color: Blue
 * City: Seattle
 * 
 * ----- Additional Information -----
 * Approximate birth year: 2008
 * Height in cm: 165.0 cm
 * Age category: Teenager
 * 
 * ----- Personalized Message -----
 * Hello, Alice Johnson from Seattle!
 * Good luck with your studies!
 * Your favorite color, Blue, is a great choice!
 * 
 * ====================================
 * Profile created successfully!
 * ====================================
 * 
 * 
 * IMPORTANT NOTES:
 * 
 * 1. Scanner Methods:
 *    - nextLine()  : Reads entire line (including spaces)
 *    - next()      : Reads single word (stops at space)
 *    - nextInt()   : Reads integer
 *    - nextDouble(): Reads decimal number
 *    - nextBoolean(): Reads true/false
 * 
 * 2. Common Issue - Mixing nextLine() with other methods:
 *    After nextInt(), nextDouble(), etc., there's a newline left in buffer.
 *    Call scanner.nextLine() to clear it before reading next line of text.
 * 
 * 3. Always close Scanner:
 *    scanner.close() - Prevents resource leaks
 * 
 * 4. Input Validation:
 *    This example assumes correct input. In real programs, 
 *    you should validate input (covered in later modules).
 */

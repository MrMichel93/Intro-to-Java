import java.util.Scanner;

/**
 * UserInputExample - Comprehensive Scanner demonstration (Practice Problem)
 * 
 * INSTRUCTIONS:
 * Complete this user profile creator by adding code where indicated by TODO comments.
 * Practice reading different data types using Scanner methods.
 * 
 * @author Introduction to Java Course
 */
public class UserInputExample {
    public static void main(String[] args) {
        // TODO: Create a Scanner object to read from System.in and store it in a variable called scanner
        
        
        System.out.println("====================================");
        System.out.println("   User Profile Creator");
        System.out.println("====================================\n");
        
        // TODO: Prompt the user to enter their full name and read it using nextLine()
        // Store it in a variable called fullName (type: String)
        
        
        
        // TODO: Prompt the user to enter their age and read it using nextInt()
        // Store it in a variable called age (type: int)
        
        
        
        // TODO: Prompt the user to enter their height in meters and read it using nextDouble()
        // Store it in a variable called height (type: double)
        
        
        
        // TODO: Prompt the user if they are a student and read it using nextBoolean()
        // Store it in a variable called isStudent (type: boolean)
        
        
        
        // TODO: Clear the newline character left in the buffer by calling nextLine()
        
        
        // TODO: Prompt the user to enter their favorite color and read it using nextLine()
        // Store it in a variable called favoriteColor (type: String)
        
        
        
        // TODO: Prompt the user to enter their city and read it using next()
        // Store it in a variable called city (type: String)
        
        
        
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
        
        System.out.println("\n----- Additional Information -----");
        
        // TODO: Calculate the approximate birth year by subtracting age from 2024
        // Store it in a variable called birthYear
        
        
        System.out.println("Approximate birth year: " + birthYear);
        
        // TODO: Convert height to centimeters by multiplying by 100
        // Store it in a variable called heightInCm
        
        
        System.out.printf("Height in cm: %.1f cm\n", heightInCm);
        
        // TODO: Determine age category using if-else statements:
        // - If age < 13: "Child"
        // - Else if age < 20: "Teenager"  
        // - Else if age < 65: "Adult"
        // - Else: "Senior"
        // Store in a variable called ageCategory
        
        
        
        
        
        
        
        
        
        System.out.println("Age category: " + ageCategory);
        
        // TODO: Print a personalized message: "Hello, [fullName] from [city]!"
        
        
        
        // TODO: If isStudent is true, print "Good luck with your studies!"
        // Otherwise, print "Enjoy your day!"
        
        
        
        
        
        // TODO: Close the Scanner
        
        
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

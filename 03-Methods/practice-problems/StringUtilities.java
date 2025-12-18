/**
 * StringUtilities - String manipulation methods (Practice Problem - Easy)
 * 
 * INSTRUCTIONS:
 * Complete this utility class by implementing methods where indicated by TODO comments.
 * Each method should perform a specific string operation.
 * 
 * Demonstrates:
 * - Methods with String parameters
 * - String methods (length, charAt, substring, etc.)
 * - Return statements
 * - String manipulation
 * 
 * @author Introduction to Java Course
 */
public class StringUtilities {
    
    /**
     * TODO: Create a method called countVowels that counts vowels in a string
     * - Method should be public and static
     * - Should take one String parameter called text
     * - Should return an int (count of vowels: a, e, i, o, u - case insensitive)
     * - Hint: Use a loop and check each character with charAt()
     */
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called reverseString that reverses a string
     * - Method should be public and static
     * - Should take one String parameter called text
     * - Should return a String (reversed text)
     * - Hint: Loop backwards through the string and build result
     */
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called isPalindrome that checks if a string is a palindrome
     * - Method should be public and static
     * - Should take one String parameter called text
     * - Should return a boolean (true if palindrome, false otherwise)
     * - A palindrome reads the same forwards and backwards (e.g., "radar", "level")
     * - Hint: Compare the string with its reverse
     */
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called countWords that counts words in a string
     * - Method should be public and static
     * - Should take one String parameter called text
     * - Should return an int (number of words)
     * - Hint: Use the split(" ") method to split by spaces
     */
    
    
    
    
    
    
    /**
     * TODO: Create a method called capitalizeFirst that capitalizes the first letter
     * - Method should be public and static
     * - Should take one String parameter called text
     * - Should return a String (text with first letter capitalized)
     * - Handle empty strings gracefully
     * - Hint: Use substring() and toUpperCase()
     */
    
    
    
    
    
    
    
    
    
    // Main method for demonstration
    public static void main(String[] args) {
        System.out.println("=== String Utilities Demonstration ===\n");
        
        String testString = "Hello World";
        
        // TODO: Test countVowels method
        System.out.println("--- Count Vowels ---");
        // Print: "'" + testString + "' has " + countVowels(testString) + " vowels"
        
        
        System.out.println();
        
        // TODO: Test reverseString method
        System.out.println("--- Reverse String ---");
        // Print: "Original: " + testString
        // Print: "Reversed: " + reverseString(testString)
        
        
        
        System.out.println();
        
        // TODO: Test isPalindrome method
        System.out.println("--- Palindrome Check ---");
        String palindrome = "radar";
        // Print: "'" + palindrome + "' is palindrome: " + isPalindrome(palindrome)
        // Print: "'" + testString + "' is palindrome: " + isPalindrome(testString)
        
        
        
        System.out.println();
        
        // TODO: Test countWords method
        System.out.println("--- Count Words ---");
        // Print: "'" + testString + "' has " + countWords(testString) + " words"
        
        
        System.out.println();
        
        // TODO: Test capitalizeFirst method
        System.out.println("--- Capitalize First ---");
        String lowercase = "hello";
        // Print: "Original: " + lowercase
        // Print: "Capitalized: " + capitalizeFirst(lowercase)
        
        
    }
}

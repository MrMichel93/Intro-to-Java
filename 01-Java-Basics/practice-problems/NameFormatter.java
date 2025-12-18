import java.util.Scanner;

/**
 * NameFormatter - String manipulation demonstration (Practice Problem)
 * 
 * INSTRUCTIONS:
 * Complete this program by adding code where indicated by TODO comments.
 * Practice using various String methods to analyze and manipulate text.
 * 
 * Demonstrates:
 * - String methods (length, charAt, substring, indexOf, etc.)
 * - String comparison (equals, equalsIgnoreCase)
 * - toUpperCase, toLowerCase, trim
 * 
 * @author Introduction to Java Course
 */
public class NameFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====================================");
        System.out.println("   Name Formatter & Analyzer");
        System.out.println("=====================================\n");
        
        // Get full name
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        
        // Get username
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        
        System.out.println("\n----- Analysis Results -----\n");
        
        // TODO: Get the length of fullName using the length() method and store it in nameLength
        
        
        // TODO: Get the length of username using the length() method and store it in usernameLength
        
        
        System.out.println("Name length: " + nameLength + " characters");
        System.out.println("Username length: " + usernameLength + " characters");
        
        // TODO: Get the first character of fullName using charAt(0) and store it in firstChar
        
        
        // TODO: Get the last character of fullName using charAt(nameLength - 1) and store it in lastChar
        
        
        System.out.println("First letter of name: " + firstChar);
        System.out.println("Last letter of name: " + lastChar);
        
        // TODO: Convert fullName to uppercase using toUpperCase() and store in upperName
        
        
        // TODO: Convert fullName to lowercase using toLowerCase() and store in lowerName
        
        
        System.out.println("\nUppercase: " + upperName);
        System.out.println("Lowercase: " + lowerName);
        
        // TODO: Remove leading/trailing spaces from fullName using trim() and store in trimmedName
        
        
        System.out.println("Trimmed name: '" + trimmedName + "'");
        
        // TODO: Check if fullName contains a space using contains(" ") and store in containsSpace
        
        
        System.out.println("\nName contains space: " + containsSpace);
        
        if (containsSpace) {
            // TODO: Find the position of the first space using indexOf(" ") and store in spaceIndex
            
            
            System.out.println("First space at position: " + spaceIndex);
            
            // TODO: Extract the first name using substring(0, spaceIndex)
            
            
            // TODO: Extract the last name using substring(spaceIndex + 1)
            
            
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
        }
        
        // TODO: Compare fullName and username using equals() and store in exactMatch
        
        
        // TODO: Compare fullName and username ignoring case using equalsIgnoreCase() and store in caseInsensitiveMatch
        
        
        System.out.println("\n----- Comparison Tests -----");
        System.out.println("Name equals username: " + exactMatch);
        System.out.println("Name equals username (ignoring case): " + caseInsensitiveMatch);
        
        // TODO: Check if fullName starts with "A" using startsWith() and print the result
        
        
        
        // TODO: Check if fullName ends with "n" using endsWith() and print the result
        
        
        
        // TODO: Create an email suggestion by converting username to lowercase, 
        // replacing spaces with dots, and adding "@example.com"
        
        
        System.out.println("Email suggestion: " + emailSuggestion);
        
        scanner.close();
        
        System.out.println("\n=====================================");
        System.out.println("Analysis complete!");
        System.out.println("=====================================");
    }
}

/*
 * Sample Run:
 * =====================================
 *    Name Formatter & Analyzer
 * =====================================
 * 
 * Enter your full name: Alice Johnson
 * Enter your username: alice_j
 * 
 * ----- Analysis Results -----
 * 
 * Name length: 13 characters
 * Username length: 7 characters
 * First letter of name: A
 * Last letter of name: n
 * 
 * Uppercase: ALICE JOHNSON
 * Lowercase: alice johnson
 * Trimmed name: 'Alice Johnson'
 * 
 * Name contains space: true
 * First space at position: 5
 * First name: Alice
 * Last name: Johnson
 * Number of words: 2
 * 
 * ----- Comparison Tests -----
 * Name equals username: false
 * Name equals username (ignoring case): false
 * Name comes before username alphabetically
 * 
 * ----- Pattern Matching -----
 * Check if name starts with: Ali
 * Result: true
 * Check if name ends with: son
 * Result: true
 * 
 * ----- String Replacement -----
 * Replace what character: o
 * With what character: *
 * Result: Alice J*hns*n
 * 
 * ----- Empty/Blank Checks -----
 * Name is empty: false
 * Name is blank: false
 * 
 * ----- Generated Formats -----
 * Initials: A.J.
 * Formal: Johnson, Alice
 * Email suggestion: alice_j@example.com
 * 
 * ----- Immutability Demo -----
 * Original: Hello
 * After toUpperCase() call: Hello
 * Assigned to new variable: HELLO
 * 
 * =====================================
 * Analysis complete!
 * =====================================
 * 
 * 
 * KEY STRING METHODS:
 * 
 * - length()                : Returns number of characters
 * - charAt(index)          : Returns character at position
 * - substring(start, end)  : Extracts part of string
 * - indexOf(str)           : Finds position of substring
 * - toLowerCase()          : Converts to lowercase
 * - toUpperCase()          : Converts to uppercase
 * - trim()                 : Removes leading/trailing spaces
 * - equals(str)            : Compares content (case-sensitive)
 * - equalsIgnoreCase(str)  : Compares content (case-insensitive)
 * - contains(str)          : Checks if contains substring
 * - startsWith(str)        : Checks if starts with prefix
 * - endsWith(str)          : Checks if ends with suffix
 * - replace(old, new)      : Replaces characters
 * - isEmpty()              : Checks if length is 0
 * - isBlank()              : Checks if empty or only whitespace
 * 
 * IMPORTANT: Strings are IMMUTABLE!
 * Methods like toUpperCase() don't change the original string.
 * They return a NEW string with the changes.
 */

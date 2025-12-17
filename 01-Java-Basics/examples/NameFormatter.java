import java.util.Scanner;

/**
 * NameFormatter - String manipulation demonstration
 * 
 * Demonstrates:
 * - String methods (length, charAt, substring, indexOf, etc.)
 * - String comparison (equals, equalsIgnoreCase, compareTo)
 * - String concatenation
 * - String immutability
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
        
        // 1. String Length
        int nameLength = fullName.length();
        int usernameLength = username.length();
        System.out.println("Name length: " + nameLength + " characters");
        System.out.println("Username length: " + usernameLength + " characters");
        
        // 2. Character Access
        if (nameLength > 0) {
            char firstChar = fullName.charAt(0);
            char lastChar = fullName.charAt(nameLength - 1);
            System.out.println("First letter of name: " + firstChar);
            System.out.println("Last letter of name: " + lastChar);
        }
        
        // 3. Case Conversion
        String upperName = fullName.toUpperCase();
        String lowerName = fullName.toLowerCase();
        System.out.println("\nUppercase: " + upperName);
        System.out.println("Lowercase: " + lowerName);
        
        // 4. Trim (remove leading/trailing spaces)
        String trimmedName = fullName.trim();
        System.out.println("Trimmed name: '" + trimmedName + "'");
        
        // 5. Finding substrings
        boolean containsSpace = fullName.contains(" ");
        System.out.println("\nName contains space: " + containsSpace);
        
        if (containsSpace) {
            int spaceIndex = fullName.indexOf(" ");
            System.out.println("First space at position: " + spaceIndex);
            
            // Extract first and last name
            String firstName = fullName.substring(0, spaceIndex);
            String lastName = fullName.substring(spaceIndex + 1);
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            
            // Count words (simple count based on spaces)
            int wordCount = 1;  // Start at 1 for first word
            for (int i = 0; i < nameLength; i++) {
                if (fullName.charAt(i) == ' ' && i < nameLength - 1) {
                    wordCount++;
                }
            }
            System.out.println("Number of words: " + wordCount);
        }
        
        // 6. String Comparison
        System.out.println("\n----- Comparison Tests -----");
        
        // Test if name and username are equal
        boolean exactMatch = fullName.equals(username);
        boolean caseInsensitiveMatch = fullName.equalsIgnoreCase(username);
        System.out.println("Name equals username: " + exactMatch);
        System.out.println("Name equals username (ignoring case): " + caseInsensitiveMatch);
        
        // Compare alphabetically
        int comparison = fullName.compareTo(username);
        if (comparison < 0) {
            System.out.println("Name comes before username alphabetically");
        } else if (comparison > 0) {
            System.out.println("Name comes after username alphabetically");
        } else {
            System.out.println("Name and username are identical");
        }
        
        // 7. Starts with / Ends with
        System.out.println("\n----- Pattern Matching -----");
        System.out.print("Check if name starts with: ");
        String prefix = scanner.nextLine();
        boolean startsWithPrefix = fullName.startsWith(prefix);
        System.out.println("Result: " + startsWithPrefix);
        
        System.out.print("Check if name ends with: ");
        String suffix = scanner.nextLine();
        boolean endsWithSuffix = fullName.endsWith(suffix);
        System.out.println("Result: " + endsWithSuffix);
        
        // 8. Replace
        System.out.println("\n----- String Replacement -----");
        System.out.print("Replace what character: ");
        char oldChar = scanner.next().charAt(0);
        System.out.print("With what character: ");
        char newChar = scanner.next().charAt(0);
        String replacedName = fullName.replace(oldChar, newChar);
        System.out.println("Result: " + replacedName);
        
        // 9. Check for empty or blank
        System.out.println("\n----- Empty/Blank Checks -----");
        System.out.println("Name is empty: " + fullName.isEmpty());
        System.out.println("Name is blank: " + fullName.isBlank());
        
        // 10. Generate initials (if space exists)
        System.out.println("\n----- Generated Formats -----");
        if (containsSpace) {
            int spaceIdx = fullName.indexOf(" ");
            String first = fullName.substring(0, spaceIdx);
            String last = fullName.substring(spaceIdx + 1);
            String initials = first.charAt(0) + "." + last.charAt(0) + ".";
            System.out.println("Initials: " + initials.toUpperCase());
            System.out.println("Formal: " + last + ", " + first);
        }
        
        // 11. Email suggestion
        String emailSuggestion = username.toLowerCase().replace(" ", ".") + "@example.com";
        System.out.println("Email suggestion: " + emailSuggestion);
        
        // 12. Demonstrate immutability
        System.out.println("\n----- Immutability Demo -----");
        String original = "Hello";
        System.out.println("Original: " + original);
        original.toUpperCase();  // This doesn't change 'original'!
        System.out.println("After toUpperCase() call: " + original);  // Still "Hello"
        String modified = original.toUpperCase();  // Must assign to new variable
        System.out.println("Assigned to new variable: " + modified);  // "HELLO"
        
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

import java.util.ArrayList;

/**
 * ArrayListBasics - ArrayList operations (Practice Problem - Easy)
 * 
 * INSTRUCTIONS:
 * Complete this program by implementing ArrayList operations where indicated by TODO comments.
 * 
 * Demonstrates:
 * - ArrayList creation and initialization
 * - Adding and removing elements
 * - Accessing elements
 * - ArrayList traversal
 * - Common ArrayList methods
 * 
 * @author Introduction to Java Course
 */
public class ArrayListBasics {
    
    /**
     * TODO: Create a method called printList
     * - Takes ArrayList<String> parameter
     * - Returns void
     * - Prints list in format: [item1, item2, item3]
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called findLongestString
     * - Takes ArrayList<String> parameter
     * - Returns String (longest string in list)
     * - Returns null if list is empty
     */
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called removeShortWords
     * - Takes ArrayList<String> parameter and int minLength
     * - Returns void
     * - Removes all strings shorter than minLength
     * - Be careful: removing while iterating requires careful index management
     */
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("=== ArrayList Basics Demonstration ===\n");
        
        // TODO: Create an ArrayList of Strings
        
        
        // TODO: Add some fruits to the list
        System.out.println("--- Adding Elements ---");
        
        
        
        
        
        
        // TODO: Print the list
        
        
        System.out.println("Size: " + /* get size */);
        System.out.println();
        
        // TODO: Access elements by index
        System.out.println("--- Accessing Elements ---");
        // Print first element
        // Print last element
        // Print element at index 2
        
        
        
        
        System.out.println();
        
        // TODO: Modify an element
        System.out.println("--- Modifying Elements ---");
        // Change element at index 1 to "Blueberry"
        
        
        System.out.println();
        
        // TODO: Check if list contains an element
        System.out.println("--- Searching ---");
        // Check if list contains "Apple"
        // Check if list contains "Grape"
        
        
        
        System.out.println();
        
        // TODO: Remove elements
        System.out.println("--- Removing Elements ---");
        // Remove "Banana" by value
        // Remove element at index 0
        
        
        
        
        System.out.println();
        
        // TODO: Test findLongestString
        System.out.println("--- Finding Longest String ---");
        
        
        System.out.println();
        
        // TODO: Test removeShortWords
        System.out.println("--- Removing Short Words ---");
        ArrayList<String> words = new ArrayList<>();
        words.add("Hi");
        words.add("Hello");
        words.add("I");
        words.add("Programming");
        words.add("Is");
        words.add("Fun");
        System.out.print("Before: ");
        printList(words);
        // Remove words shorter than 4 characters
        
        System.out.print("After:  ");
        printList(words);
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

/**
 * HashMapDemo - HashMap and key-value operations (Practice Problem - Hard)
 * 
 * INSTRUCTIONS:
 * Complete this program using HashMap where indicated by TODO comments.
 * 
 * Demonstrates:
 * - HashMap creation and operations
 * - Key-value pair manipulation
 * - HashMap iteration
 * - Practical use cases for maps
 * 
 * @author Introduction to Java Course
 */
public class HashMapDemo {
    
    /**
     * TODO: Create a method called wordFrequency
     * - Takes String text parameter
     * - Returns HashMap<String, Integer>
     * - Counts frequency of each word in text
     * - Split text by spaces
     * - Use map.getOrDefault(key, 0) to handle missing keys
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called phoneBook
     * - Demonstrates contact management
     * - Creates and returns HashMap<String, String> (name -> phone)
     * - Add at least 5 contacts
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called findMostFrequentWord
     * - Takes HashMap<String, Integer> parameter (word frequencies)
     * - Returns String (most frequent word)
     * - Returns null if map is empty
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called invertMap
     * - Takes HashMap<String, String> parameter
     * - Returns HashMap<String, String> with keys and values swapped
     * - Example: {"John" -> "555-1234"} becomes {"555-1234" -> "John"}
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a StudentRecord class with:
     * - Private fields: studentId (String), name (String), grades (ArrayList<Integer>)
     * - Constructor
     * - Method to add grade
     * - Method to get average
     * - toString method
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called manageStudentRecords
     * - Creates HashMap<String, StudentRecord> (studentId -> record)
     * - Adds several students
     * - Adds grades to students
     * - Returns the map
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("=== HashMap Demonstration ===\n");
        
        // TODO: Test basic HashMap operations
        System.out.println("--- Basic HashMap Operations ---");
        HashMap<String, Integer> ages = new HashMap<>();
        // Add entries
        
        
        
        
        // Access values
        
        
        // Check if key exists
        
        
        // Update value
        
        
        // Remove entry
        
        
        System.out.println();
        
        // TODO: Test word frequency counter
        System.out.println("--- Word Frequency Counter ---");
        String text = "hello world hello java world hello";
        
        
        
        
        
        System.out.println();
        
        // TODO: Test phone book
        System.out.println("--- Phone Book ---");
        
        
        
        
        
        System.out.println();
        
        // TODO: Find most frequent word
        System.out.println("--- Most Frequent Word ---");
        
        
        System.out.println();
        
        // TODO: Test map inversion
        System.out.println("--- Invert Map ---");
        
        
        
        
        System.out.println();
        
        // TODO: Test student records
        System.out.println("--- Student Records ---");
        
        
        
        
        
        
        
    }
}

import java.io.*;
import java.nio.file.*;

/**
 * BasicFileOperations - Reading and writing files (Practice Problem - Easy)
 * 
 * INSTRUCTIONS:
 * Complete this program by implementing file operations where indicated by TODO comments.
 * 
 * Demonstrates:
 * - Writing to files
 * - Reading from files
 * - File existence checking
 * - try-with-resources
 * 
 * @author Introduction to Java Course
 */
public class BasicFileOperations {
    
    /**
     * TODO: Create a method called writeToFile
     * - Takes String filename and String content
     * - Returns void
     * - Use try-with-resources to write content to file
     * - Handle IOException
     * - Use FileWriter or PrintWriter
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called readFromFile
     * - Takes String filename
     * - Returns String (entire file content)
     * - Use try-with-resources to read file
     * - Handle IOException
     * - Use BufferedReader or Files.readString()
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called appendToFile
     * - Takes String filename and String content
     * - Returns void
     * - Appends content to existing file
     * - Use FileWriter with append=true
     * - Handle IOException
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called countLines
     * - Takes String filename
     * - Returns int (number of lines in file)
     * - Use try-with-resources
     * - Handle IOException
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called fileExists
     * - Takes String filename
     * - Returns boolean
     * - Use File or Path to check if file exists
     */
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("=== Basic File Operations ===\n");
        
        String filename = "test_output.txt";
        
        // TODO: Test writeToFile
        System.out.println("--- Writing to File ---");
        String content = "Hello, File I/O!\nThis is line 2.\nThis is line 3.";
        
        
        System.out.println();
        
        // TODO: Test fileExists
        System.out.println("--- Checking File Existence ---");
        
        
        System.out.println();
        
        // TODO: Test readFromFile
        System.out.println("--- Reading from File ---");
        
        
        
        System.out.println();
        
        // TODO: Test countLines
        System.out.println("--- Counting Lines ---");
        
        
        System.out.println();
        
        // TODO: Test appendToFile
        System.out.println("--- Appending to File ---");
        
        
        System.out.println("After appending:");
        
        
        System.out.println();
        
        // TODO: Cleanup - delete test file
        System.out.println("--- Cleanup ---");
        
        
        
        
        System.out.println("\n=== Tips ===");
        System.out.println("1. Always use try-with-resources for automatic resource closing");
        System.out.println("2. Handle IOException for file operations");
        System.out.println("3. Check file existence before reading");
        System.out.println("4. Use BufferedReader/Writer for better performance");
    }
}

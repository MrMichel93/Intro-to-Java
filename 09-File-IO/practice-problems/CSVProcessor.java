import java.io.*;
import java.util.*;

/**
 * CSVProcessor - Reading and writing CSV files (Practice Problem - Medium)
 * 
 * INSTRUCTIONS:
 * Complete this CSV processor by implementing methods where indicated by TODO comments.
 * 
 * Demonstrates:
 * - Reading CSV files
 * - Writing CSV files
 * - Parsing CSV data
 * - Data manipulation with files
 * 
 * @author Introduction to Java Course
 */

/**
 * TODO: Create a Student class
 * - Private fields: id (String), name (String), grade (double)
 * - Constructor
 * - Getters
 * - Method: toCSV() returns String in format "id,name,grade"
 * - Static method: fromCSV(String line) returns Student object
 */










class CSVProcessor {
    
    /**
     * TODO: Create a method called readStudentsFromCSV
     * - Takes String filename
     * - Returns ArrayList<Student>
     * - Reads CSV file (format: id,name,grade)
     * - Skip header line if present
     * - Use try-with-resources
     * - Handle IOException
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called writeStudentsToCSV
     * - Takes String filename and ArrayList<Student>
     * - Returns void
     * - Writes students to CSV file
     * - Include header line: "ID,Name,Grade"
     * - Use try-with-resources
     * - Handle IOException
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called filterByGrade
     * - Takes ArrayList<Student> and double minGrade
     * - Returns ArrayList<Student> with grade >= minGrade
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called calculateAverage
     * - Takes ArrayList<Student>
     * - Returns double (average grade)
     */
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called sortByGrade
     * - Takes ArrayList<Student>
     * - Sorts in descending order by grade
     * - Modifies list in place
     */
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("=== CSV Processor Demonstration ===\n");
        
        String inputFile = "students_input.csv";
        String outputFile = "students_output.csv";
        
        // TODO: Create sample data and write to CSV
        System.out.println("--- Creating Sample Data ---");
        ArrayList<Student> students = new ArrayList<>();
        
        
        
        
        
        
        
        System.out.println();
        
        // TODO: Read students from CSV
        System.out.println("--- Reading from CSV ---");
        
        
        
        
        
        System.out.println();
        
        // TODO: Calculate average
        System.out.println("--- Calculate Average ---");
        
        
        System.out.println();
        
        // TODO: Filter students by grade
        System.out.println("--- Filter by Grade (>= 85) ---");
        
        
        
        
        System.out.println();
        
        // TODO: Sort students by grade
        System.out.println("--- Sort by Grade ---");
        
        
        
        
        System.out.println();
        
        // TODO: Write filtered results to new CSV
        System.out.println("--- Writing Filtered Data ---");
        
        
        System.out.println();
        
        // TODO: Cleanup
        System.out.println("--- Cleanup ---");
        
        
        
    }
}

import java.util.ArrayList;
import java.util.Collections;

/**
 * StudentGrades - Grade management with ArrayList (Practice Problem - Medium)
 * 
 * INSTRUCTIONS:
 * Complete this grade management system using ArrayList where indicated by TODO comments.
 * 
 * Demonstrates:
 * - ArrayList with custom objects
 * - Sorting with Comparable
 * - Collections utility methods
 * - ArrayList of objects
 * 
 * @author Introduction to Java Course
 */

/**
 * TODO: Create a Student class
 * - Private fields: name (String), grade (int)
 * - Constructor
 * - Getters
 * - toString method
 * - Make it implement Comparable<Student> to sort by grade (highest first)
 */









/**
 * GradeBook class - manages student grades
 */
class GradeBook {
    private ArrayList<Student> students;
    
    public GradeBook() {
        students = new ArrayList<>();
    }
    
    /**
     * TODO: Implement addStudent method
     * - Takes name and grade
     * - Creates Student object and adds to list
     */
    
    
    
    
    
    
    /**
     * TODO: Implement removeStudent method
     * - Takes name
     * - Removes student with matching name
     * - Returns true if removed, false if not found
     */
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Implement getAverage method
     * - Returns double (average grade)
     * - Returns 0.0 if no students
     */
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Implement getHighestGrade method
     * - Returns Student with highest grade
     * - Returns null if no students
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Implement getLowestGrade method
     * - Returns Student with lowest grade
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Implement sortByGrade method
     * - Sorts students by grade (highest to lowest)
     * - Use Collections.sort()
     */
    
    
    
    
    
    /**
     * TODO: Implement getStudentsAbove method
     * - Takes int threshold
     * - Returns ArrayList<Student> with grades above threshold
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Implement displayAllStudents method
     * - Prints all students with their grades
     */
    
    
    
    
    
    
    
    
    
}

// Main class
public class StudentGrades {
    public static void main(String[] args) {
        System.out.println("=== Grade Book System ===\n");
        
        // TODO: Create a GradeBook
        
        
        // TODO: Add students
        System.out.println("--- Adding Students ---");
        
        
        
        
        
        
        System.out.println();
        
        // TODO: Display all students
        System.out.println("--- All Students ---");
        
        
        System.out.println();
        
        // TODO: Calculate and display average
        System.out.println("--- Statistics ---");
        
        
        
        
        System.out.println();
        
        // TODO: Sort by grade
        System.out.println("--- Sorted by Grade ---");
        
        
        System.out.println();
        
        // TODO: Find students above threshold
        System.out.println("--- Students with grade > 85 ---");
        
        
        
        
        System.out.println();
        
        // TODO: Remove a student
        System.out.println("--- Removing Student ---");
        
        
        
    }
}

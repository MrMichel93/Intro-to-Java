/**
 * Student - Student management class (Practice Problem - Easy)
 * 
 * INSTRUCTIONS:
 * Complete this Student class by adding code where indicated by TODO comments.
 * 
 * Demonstrates:
 * - Class creation with fields
 * - Constructor
 * - Getters and setters
 * - Instance methods
 * - toString method
 * 
 * @author Introduction to Java Course
 */
public class Student {
    
    // TODO: Declare private instance fields:
    // - studentId (String)
    // - name (String)
    // - grade (int) - grade level (9-12)
    // - gpa (double) - grade point average (0.0-4.0)
    
    
    
    
    
    
    /**
     * TODO: Create a constructor that takes all four parameters
     * - Initialize all fields with the parameter values
     * - Validate grade is between 9 and 12 (set to 9 if invalid)
     * - Validate gpa is between 0.0 and 4.0 (set to 0.0 if invalid)
     */
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create getter methods for all fields
     * - getStudentId() returns String
     * - getName() returns String
     * - getGrade() returns int
     * - getGpa() returns double
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create setter methods for name and gpa only
     * - setName(String name) - only if name is not null/empty
     * - setGpa(double gpa) - only if gpa is between 0.0 and 4.0
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called promoteGrade
     * - No parameters
     * - Returns void
     * - Increments grade by 1 (but not beyond 12)
     * - Prints "[name] has been promoted to grade [new grade]"
     */
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called isHonorRoll
     * - No parameters
     * - Returns boolean
     * - Returns true if gpa >= 3.5, false otherwise
     */
    
    
    
    
    
    
    /**
     * TODO: Create a method called getAcademicStatus
     * - No parameters
     * - Returns String
     * - Returns:
     *   - "Excellent" if gpa >= 3.5
     *   - "Good" if gpa >= 3.0
     *   - "Satisfactory" if gpa >= 2.0
     *   - "Needs Improvement" if gpa < 2.0
     */
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Override toString method
     * - Returns a String with student information
     * - Format: "Student[ID: XXX, Name: YYY, Grade: Z, GPA: W.WW]"
     */
    
    
    
    
    
    
    // Main method for testing
    public static void main(String[] args) {
        System.out.println("=== Student Class Demonstration ===\n");
        
        // TODO: Create a Student object with your details
        // Example: new Student("S12345", "Alice Johnson", 11, 3.8)
        
        
        // TODO: Print student using toString (implicit call)
        System.out.println("--- Student Info ---");
        
        
        System.out.println();
        
        // TODO: Test getter methods
        System.out.println("--- Using Getters ---");
        // Print student name
        // Print student grade
        // Print student GPA
        
        
        
        
        System.out.println();
        
        // TODO: Test academic status
        System.out.println("--- Academic Status ---");
        // Print: "Academic Status: " + student.getAcademicStatus()
        // Print: "Honor Roll: " + student.isHonorRoll()
        
        
        
        System.out.println();
        
        // TODO: Test setters
        System.out.println("--- Update GPA ---");
        // Update GPA to 3.9
        // Print new GPA
        
        
        
        System.out.println();
        
        // TODO: Test promoteGrade
        System.out.println("--- Promote Student ---");
        // Call promoteGrade
        // Print new grade
        
        
        
        System.out.println();
        
        // TODO: Create another student and compare
        System.out.println("--- Multiple Students ---");
        
        
        
    }
}

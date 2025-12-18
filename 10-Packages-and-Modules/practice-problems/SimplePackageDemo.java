/**
 * SimplePackageDemo - Understanding packages (Practice Problem - Easy)
 * 
 * INSTRUCTIONS:
 * This is a conceptual exercise about packages. Complete the TODOs to understand
 * how packages organize code.
 * 
 * Demonstrates:
 * - Package declaration
 * - Import statements
 * - Package naming conventions
 * - Access modifiers with packages
 * 
 * @author Introduction to Java Course
 */

/**
 * TODO: Answer these questions about packages:
 * 
 * 1. What is a package in Java?
 * Answer: _____________________________________________________________
 * 
 * 2. What keyword do you use to declare a package?
 * Answer: _____________________________________________________________
 * 
 * 3. What is the naming convention for packages?
 * Answer: _____________________________________________________________
 * 
 * 4. How do you import a specific class from a package?
 * Answer: _____________________________________________________________
 * 
 * 5. How do you import all classes from a package?
 * Answer: _____________________________________________________________
 * 
 * 6. What access modifier allows access only within the same package?
 * Answer: _____________________________________________________________
 * 
 * 7. Give an example of a built-in Java package:
 * Answer: _____________________________________________________________
 */

/**
 * TODO: Create a package structure for a school management system
 * 
 * Design packages for:
 * - Student information (com.school.students)
 * - Teacher information (com.school.teachers)
 * - Course information (com.school.courses)
 * - Administrative functions (com.school.admin)
 * 
 * For each package, list 2-3 classes that would belong in it:
 * 
 * com.school.students:
 * - _______________
 * - _______________
 * - _______________
 * 
 * com.school.teachers:
 * - _______________
 * - _______________
 * 
 * com.school.courses:
 * - _______________
 * - _______________
 * 
 * com.school.admin:
 * - _______________
 * - _______________
 */

/**
 * Example: Simple class without package (default package)
 */
public class SimplePackageDemo {
    
    /**
     * TODO: Explain what happens when you don't declare a package
     * Answer: _____________________________________________________________
     */
    
    public static void main(String[] args) {
        System.out.println("=== Package Concepts ===\n");
        
        // TODO: Write examples of import statements you would use
        // to import common Java classes
        
        System.out.println("Example imports:");
        System.out.println("import java.util.ArrayList;");
        System.out.println("import java.util.*;");
        System.out.println("import java.io.File;");
        System.out.println();
        
        // TODO: List benefits of using packages
        System.out.println("Benefits of packages:");
        System.out.println("1. _______________________________________________");
        System.out.println("2. _______________________________________________");
        System.out.println("3. _______________________________________________");
        System.out.println("4. _______________________________________________");
        System.out.println();
        
        // TODO: Explain the relationship between package names and directory structure
        System.out.println("Package to directory mapping:");
        System.out.println("Package: com.example.myapp");
        System.out.println("Directory: _______________________________________________");
        System.out.println();
        
        System.out.println("=== Key Concepts ===");
        System.out.println("- Packages organize related classes");
        System.out.println("- Prevents naming conflicts");
        System.out.println("- Provides access control");
        System.out.println("- Mirrors directory structure");
    }
}

/**
 * BONUS CHALLENGE:
 * Create a real package structure for this project:
 * 
 * 1. Create directory: com/school/students/
 * 2. Create file: Student.java in that directory
 * 3. Add package declaration: package com.school.students;
 * 4. Create a simple Student class with fields: name, id, grade
 * 5. Create another class in default package that imports and uses Student
 * 
 * This hands-on exercise will help you understand packages in practice!
 */

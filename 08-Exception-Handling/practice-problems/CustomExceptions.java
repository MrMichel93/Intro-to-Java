/**
 * CustomExceptions - Creating custom exception classes (Practice Problem - Medium)
 * 
 * INSTRUCTIONS:
 * Complete this program by creating custom exceptions where indicated by TODO comments.
 * 
 * Demonstrates:
 * - Creating custom exception classes
 * - Throwing exceptions
 * - Exception chaining
 * - Checked vs unchecked exceptions
 * 
 * @author Introduction to Java Course
 */

/**
 * TODO: Create InvalidAgeException class
 * - Extends Exception (checked exception)
 * - Has constructor that takes String message
 * - Calls super(message)
 */





/**
 * TODO: Create InsufficientFundsException class
 * - Extends Exception
 * - Has constructor with message
 * - Add field: amountShort (double) - how much money is short
 * - Add getter for amountShort
 */








/**
 * TODO: Create InvalidGradeException class
 * - Extends RuntimeException (unchecked exception)
 * - Has constructor with message
 */





/**
 * Person class with age validation
 */
class Person {
    private String name;
    private int age;
    
    /**
     * TODO: Implement constructor
     * - Takes name and age
     * - Throws InvalidAgeException if age < 0 or age > 150
     * - Message: "Invalid age: [age]. Age must be between 0 and 150."
     */
    
    
    
    
    
    
    
    
    
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return name + " (age " + age + ")";
    }
}

/**
 * BankAccount class with transaction validation
 */
class BankAccount {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    /**
     * TODO: Implement withdraw method
     * - Takes double amount
     * - Throws InsufficientFundsException if amount > balance
     * - Message should include account number and amount short
     * - If successful, deduct amount from balance
     */
    
    
    
    
    
    
    
    
    
    
    
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public double getBalance() {
        return balance;
    }
}

/**
 * GradeValidator class
 */
class GradeValidator {
    /**
     * TODO: Implement validateGrade method
     * - Takes int grade
     * - Returns void
     * - Throws InvalidGradeException if grade < 0 or grade > 100
     * - Message: "Invalid grade: [grade]. Must be between 0 and 100."
     */
    
    
    
    
    
    
    
}

// Main class
public class CustomExceptions {
    
    /**
     * TODO: Create method demonstratePersonException
     * - Try to create Person with invalid age
     * - Catch and handle InvalidAgeException
     */
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create method demonstrateBankException
     * - Create BankAccount
     * - Try to withdraw more than balance
     * - Catch and handle InsufficientFundsException
     * - Print how much money is short
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create method demonstrateGradeException
     * - Try to validate invalid grade
     * - Catch and handle InvalidGradeException
     */
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("=== Custom Exceptions Demonstration ===\n");
        
        // TODO: Test Person with valid age
        System.out.println("--- Valid Person ---");
        
        
        
        
        
        
        System.out.println();
        
        // TODO: Test Person with invalid age
        System.out.println("--- Invalid Person ---");
        
        
        System.out.println();
        
        // TODO: Test BankAccount withdrawal
        System.out.println("--- Bank Account Withdrawal ---");
        
        
        System.out.println();
        
        // TODO: Test Grade Validator
        System.out.println("--- Grade Validation ---");
        
        
        System.out.println();
        
        System.out.println("=== Key Concepts ===");
        System.out.println("1. Custom exceptions extend Exception (checked) or RuntimeException (unchecked)");
        System.out.println("2. Checked exceptions must be caught or declared in method signature");
        System.out.println("3. Unchecked exceptions don't require explicit handling");
        System.out.println("4. Custom exceptions can have additional fields and methods");
    }
}

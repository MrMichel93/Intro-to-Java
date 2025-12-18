/**
 * BankAccount - Complete OOP demonstration (Practice Problem)
 * 
 * INSTRUCTIONS:
 * Complete this BankAccount class by adding code where indicated by TODO comments.
 * This demonstrates key Object-Oriented Programming concepts.
 * 
 * Demonstrates:
 * - Class definition with fields and methods
 * - Encapsulation (private fields, public methods)
 * - Constructors
 * - Getters and setters
 * - Instance methods
 * - this keyword
 * 
 * @author Introduction to Java Course
 */
public class BankAccount {
    
    // TODO: Declare private instance fields:
    // - accountNumber (String)
    // - accountHolder (String)
    // - balance (double)
    // - accountType (String) - "Checking" or "Savings"
    
    
    
    
    
    
    /**
     * TODO: Create a constructor that takes accountHolder and initialBalance as parameters
     * - Set accountNumber to "ACC" + a random number (use "ACC1000" for simplicity)
     * - Set accountHolder to the parameter value
     * - Set balance to initialBalance (only if it's >= 0, otherwise set to 0)
     * - Set accountType to "Checking" as default
     */
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a getter method for accountNumber
     * - Method should be public
     * - Should return the accountNumber
     */
    
    
    
    
    
    /**
     * TODO: Create a getter method for accountHolder
     * - Method should be public
     * - Should return the accountHolder
     */
    
    
    
    
    
    /**
     * TODO: Create a getter method for balance
     * - Method should be public
     * - Should return the balance
     */
    
    
    
    
    
    /**
     * TODO: Create a getter method for accountType
     * - Method should be public
     * - Should return the accountType
     */
    
    
    
    
    
    /**
     * TODO: Create a setter method for accountHolder
     * - Method should be public and return void
     * - Should take a String parameter called accountHolder
     * - Should update this.accountHolder only if the parameter is not null and not blank
     * - Otherwise print "Error: Invalid account holder name"
     */
    
    
    
    
    
    
    
    
    
    /**
     * Deposit money into the account
     * 
     * TODO: Implement this method
     * - Should take a double parameter called amount
     * - Should return a boolean (true if successful, false otherwise)
     * - If amount > 0:
     *   - Add amount to balance
     *   - Print "Deposited: $[amount] | New Balance: $[balance]" (use printf with %.2f)
     *   - Return true
     * - Otherwise:
     *   - Print "Error: Deposit amount must be positive"
     *   - Return false
     */
    public boolean deposit(double amount) {
        
        
        
        
        
        
        
        
        
        
        
    }
    
    /**
     * Withdraw money from the account
     * 
     * TODO: Implement this method
     * - Should take a double parameter called amount
     * - Should return a boolean (true if successful, false otherwise)
     * - If amount <= 0:
     *   - Print "Error: Withdrawal amount must be positive"
     *   - Return false
     * - If amount > balance:
     *   - Print "Error: Insufficient funds"
     *   - Return false
     * - Otherwise:
     *   - Subtract amount from balance
     *   - Print "Withdrew: $[amount] | New Balance: $[balance]" (use printf with %.2f)
     *   - Return true
     */
    public boolean withdraw(double amount) {
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    /**
     * Transfer money to another account
     * 
     * TODO: Implement this method
     * - Should take two parameters: BankAccount recipient, double amount
     * - Should return a boolean (true if successful, false otherwise)
     * - If recipient is null:
     *   - Print "Error: Invalid recipient account"
     *   - Return false
     * - If this.withdraw(amount) succeeds:
     *   - Call recipient.deposit(amount)
     *   - Print "Transferred $[amount] to [recipient account holder]"
     *   - Return true
     * - Otherwise return false
     */
    public boolean transfer(BankAccount recipient, double amount) {
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    /**
     * Display account information
     * 
     * TODO: Implement this method (void - no return value)
     * - Print account information in a formatted way:
     *   ========================================
     *            ACCOUNT INFORMATION
     *   ========================================
     *   Account Number : [accountNumber]
     *   Account Holder : [accountHolder]
     *   Account Type   : [accountType]
     *   Balance        : $[balance] (use printf with %.2f)
     *   ========================================
     */
    public void displayAccountInfo() {
        
        
        
        
        
        
        
        
        
        
    }
    
    // Main method for demonstration
    public static void main(String[] args) {
        System.out.println("=== BankAccount Demonstration ===\n");
        
        // TODO: Create a BankAccount object for "Alice Johnson" with initial balance of 500.0
        
        
        // TODO: Create a BankAccount object for "Bob Smith" with initial balance of 1000.0
        
        
        System.out.println("\n--- Operations on Alice's Account ---\n");
        
        // TODO: Deposit 200.0 into Alice's account
        
        
        // TODO: Withdraw 100.0 from Alice's account
        
        
        // TODO: Try to withdraw 1000.0 from Alice's account (should fail)
        
        
        System.out.println("\n--- Display Alice's Account Info ---\n");
        
        // TODO: Display Alice's account information
        
        
        System.out.println("\n--- Transfer from Bob to Alice ---\n");
        
        // TODO: Transfer 300.0 from Bob's account to Alice's account
        
        
        System.out.println("\nAfter transfer:");
        // TODO: Print Bob's balance using the getter method
        
        // TODO: Print Alice's balance using the getter method
        
    }
}

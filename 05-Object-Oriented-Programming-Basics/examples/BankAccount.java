/**
 * BankAccount - Complete OOP demonstration
 * 
 * Demonstrates:
 * - Class definition with fields and methods
 * - Encapsulation (private fields, public methods)
 * - Constructors (default and parameterized)
 * - Getters and setters with validation
 * - Instance methods
 * - Static fields and methods
 * - Method overloading
 * - this keyword
 * - toString() override
 * 
 * This class represents a bank account with standard operations:
 * deposit, withdraw, transfer, and balance inquiry.
 * 
 * @author Introduction to Java Course
 */
public class BankAccount {
    // Static field - shared by all instances
    private static int nextAccountNumber = 1000;
    private static int totalAccounts = 0;
    
    // Instance fields - unique to each object (PRIVATE for encapsulation)
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String accountType;  // "Checking" or "Savings"
    
    // Constructor 1: Default constructor
    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        this.accountHolder = "Unknown";
        this.balance = 0.0;
        this.accountType = "Checking";
        totalAccounts++;
    }
    
    // Constructor 2: With account holder name
    public BankAccount(String accountHolder) {
        this();  // Call default constructor
        this.accountHolder = accountHolder;
    }
    
    // Constructor 3: With name and initial balance
    public BankAccount(String accountHolder, double initialBalance) {
        this(accountHolder);  // Call constructor 2
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }
    
    // Constructor 4: Full constructor
    public BankAccount(String accountHolder, double initialBalance, String accountType) {
        this(accountHolder, initialBalance);  // Call constructor 3
        if (accountType.equals("Checking") || accountType.equals("Savings")) {
            this.accountType = accountType;
        }
    }
    
    // Private helper method to generate account numbers
    private static String generateAccountNumber() {
        return "ACC" + (nextAccountNumber++);
    }
    
    // Getter methods (public access to private fields)
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    // Setter methods with validation
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.isBlank()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Error: Invalid account holder name");
        }
    }
    
    public void setAccountType(String accountType) {
        if (accountType.equals("Checking") || accountType.equals("Savings")) {
            this.accountType = accountType;
        } else {
            System.out.println("Error: Invalid account type. Use 'Checking' or 'Savings'");
        }
    }
    
    // Business logic methods
    
    /**
     * Deposit money into the account
     * @param amount Amount to deposit (must be positive)
     * @return true if successful, false otherwise
     */
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: $%.2f | New Balance: $%.2f%n", amount, balance);
            return true;
        } else {
            System.out.println("Error: Deposit amount must be positive");
            return false;
        }
    }
    
    /**
     * Withdraw money from the account
     * @param amount Amount to withdraw
     * @return true if successful, false if insufficient funds
     */
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive");
            return false;
        }
        
        if (amount > balance) {
            System.out.println("Error: Insufficient funds");
            System.out.printf("Requested: $%.2f | Available: $%.2f%n", amount, balance);
            return false;
        }
        
        balance -= amount;
        System.out.printf("Withdrew: $%.2f | New Balance: $%.2f%n", amount, balance);
        return true;
    }
    
    /**
     * Transfer money to another account
     * @param recipient The account to receive the money
     * @param amount Amount to transfer
     * @return true if successful, false otherwise
     */
    public boolean transfer(BankAccount recipient, double amount) {
        if (recipient == null) {
            System.out.println("Error: Invalid recipient account");
            return false;
        }
        
        if (amount <= 0) {
            System.out.println("Error: Transfer amount must be positive");
            return false;
        }
        
        if (this.withdraw(amount)) {  // Try to withdraw from this account
            recipient.deposit(amount);  // Deposit to recipient
            System.out.printf("Transferred $%.2f to %s (Account: %s)%n", 
                amount, recipient.accountHolder, recipient.accountNumber);
            return true;
        }
        
        return false;  // Withdrawal failed (insufficient funds)
    }
    
    /**
     * Apply interest to the account (Savings accounts only)
     * @param rate Interest rate (e.g., 0.05 for 5%)
     */
    public void applyInterest(double rate) {
        if (accountType.equals("Savings")) {
            double interest = balance * rate;
            balance += interest;
            System.out.printf("Interest applied: $%.2f | New Balance: $%.2f%n", interest, balance);
        } else {
            System.out.println("Error: Interest only applies to Savings accounts");
        }
    }
    
    /**
     * Display account information
     */
    public void displayAccountInfo() {
        System.out.println("========================================");
        System.out.println("           ACCOUNT INFORMATION");
        System.out.println("========================================");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Type   : " + accountType);
        System.out.printf ("Balance        : $%.2f%n", balance);
        System.out.println("========================================");
    }
    
    // Static methods - operate on the class, not instances
    
    /**
     * Get total number of accounts created
     * @return Total accounts
     */
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    
    /**
     * Display statistics about all accounts
     */
    public static void displayStatistics() {
        System.out.println("Bank Statistics:");
        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Next Account Number: ACC" + nextAccountNumber);
    }
    
    // Override toString() for easy printing
    @Override
    public String toString() {
        return String.format("%s [%s]: %s - $%.2f", 
            accountNumber, accountType, accountHolder, balance);
    }
    
    // Main method for demonstration
    public static void main(String[] args) {
        System.out.println("=== BankAccount Demonstration ===\n");
        
        // Creating accounts using different constructors
        BankAccount account1 = new BankAccount();
        System.out.println("Account 1 created: " + account1);
        
        BankAccount account2 = new BankAccount("Alice Johnson");
        System.out.println("Account 2 created: " + account2);
        
        BankAccount account3 = new BankAccount("Bob Smith", 1000.0);
        System.out.println("Account 3 created: " + account3);
        
        BankAccount account4 = new BankAccount("Carol White", 5000.0, "Savings");
        System.out.println("Account 4 created: " + account4);
        
        System.out.println("\n--- Operations on Bob's Account ---\n");
        
        // Deposit money
        account3.deposit(500.0);
        
        // Withdraw money
        account3.withdraw(200.0);
        
        // Try to withdraw more than balance
        account3.withdraw(2000.0);
        
        // Display account info
        System.out.println();
        account3.displayAccountInfo();
        
        System.out.println("\n--- Transfer from Bob to Alice ---\n");
        
        // Transfer money
        account3.transfer(account2, 300.0);
        
        System.out.println("\nAfter transfer:");
        System.out.println("Bob's balance: $" + account3.getBalance());
        System.out.println("Alice's balance: $" + account2.getBalance());
        
        System.out.println("\n--- Interest on Carol's Savings ---\n");
        
        // Apply interest to savings account
        account4.applyInterest(0.05);  // 5% interest
        
        System.out.println("\n--- Bank Statistics ---\n");
        
        // Display bank-wide statistics (static method)
        BankAccount.displayStatistics();
        
        System.out.println("\n--- All Accounts ---\n");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);
    }
}

/*
 * Expected Output:
 * 
 * === BankAccount Demonstration ===
 * 
 * Account 1 created: ACC1000 [Checking]: Unknown - $0.00
 * Account 2 created: ACC1001 [Checking]: Alice Johnson - $0.00
 * Account 3 created: ACC1002 [Checking]: Bob Smith - $1000.00
 * Account 4 created: ACC1003 [Savings]: Carol White - $5000.00
 * 
 * --- Operations on Bob's Account ---
 * 
 * Deposited: $500.00 | New Balance: $1500.00
 * Withdrew: $200.00 | New Balance: $1300.00
 * Error: Insufficient funds
 * Requested: $2000.00 | Available: $1300.00
 * 
 * ========================================
 *            ACCOUNT INFORMATION
 * ========================================
 * Account Number : ACC1002
 * Account Holder : Bob Smith
 * Account Type   : Checking
 * Balance        : $1300.00
 * ========================================
 * 
 * --- Transfer from Bob to Alice ---
 * 
 * Withdrew: $300.00 | New Balance: $1000.00
 * Deposited: $300.00 | New Balance: $300.00
 * Transferred $300.00 to Alice Johnson (Account: ACC1001)
 * 
 * After transfer:
 * Bob's balance: $1000.0
 * Alice's balance: $300.0
 * 
 * --- Interest on Carol's Savings ---
 * 
 * Interest applied: $250.00 | New Balance: $5250.00
 * 
 * --- Bank Statistics ---
 * 
 * Bank Statistics:
 * Total Accounts: 4
 * Next Account Number: ACC1004
 * 
 * --- All Accounts ---
 * 
 * ACC1000 [Checking]: Unknown - $0.00
 * ACC1001 [Checking]: Alice Johnson - $300.00
 * ACC1002 [Checking]: Bob Smith - $1000.00
 * ACC1003 [Savings]: Carol White - $5250.00
 * 
 * 
 * KEY OOP CONCEPTS DEMONSTRATED:
 * 
 * 1. ENCAPSULATION:
 *    - Private fields protect data
 *    - Public methods provide controlled access
 *    - Validation in setters prevents invalid state
 * 
 * 2. CONSTRUCTORS:
 *    - Multiple constructors for flexibility
 *    - Constructor chaining with this()
 *    - Default values for optional parameters
 * 
 * 3. INSTANCE vs STATIC:
 *    - Instance fields: unique per object
 *    - Static fields: shared across all objects
 *    - Instance methods: operate on specific object
 *    - Static methods: operate on class level
 * 
 * 4. this KEYWORD:
 *    - Refers to current object
 *    - Distinguishes field from parameter
 *    - Calls other constructors
 * 
 * 5. METHOD DESIGN:
 *    - Clear single responsibility
 *    - Input validation
 *    - Return values indicate success/failure
 *    - Informative error messages
 * 
 * 6. OBJECT INTERACTION:
 *    - transfer() demonstrates objects working together
 *    - One object calls methods on another
 *    - Encapsulation maintained throughout
 */

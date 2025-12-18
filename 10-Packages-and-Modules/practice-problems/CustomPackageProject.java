/**
 * CustomPackageProject - Creating a multi-package application (Practice Problem - Hard)
 * 
 * INSTRUCTIONS:
 * This is a design exercise for creating a complete package structure.
 * Follow the TODOs to design and implement a multi-package application.
 * 
 * Demonstrates:
 * - Multi-package application design
 * - Package organization
 * - Inter-package communication
 * - Access control across packages
 * 
 * @author Introduction to Java Course
 */

/**
 * PROJECT: Library Management System
 * 
 * TODO: Design a complete package structure for a library management system
 * 
 * Required Packages:
 * 1. com.library.models - Data models (Book, Member, Loan)
 * 2. com.library.services - Business logic (BookService, MemberService, LoanService)
 * 3. com.library.database - Data access (BookDAO, MemberDAO, LoanDAO)
 * 4. com.library.utils - Utility classes (DateUtils, ValidationUtils)
 * 5. com.library.ui - User interface (ConsoleUI, Menu)
 * 
 * Design each package below:
 */

/**
 * ============================================================================
 * PACKAGE: com.library.models
 * ============================================================================
 * 
 * TODO: Design Book class
 * Fields:
 * - _______________
 * - _______________
 * - _______________
 * 
 * Methods:
 * - _______________
 * - _______________
 * 
 * Access Modifiers:
 * - Fields should be: _______________
 * - Class should be: _______________
 * 
 * ----------------------------------------------------------------------------
 * 
 * TODO: Design Member class
 * Fields:
 * - _______________
 * - _______________
 * - _______________
 * 
 * Methods:
 * - _______________
 * - _______________
 * 
 * ----------------------------------------------------------------------------
 * 
 * TODO: Design Loan class
 * Fields:
 * - _______________
 * - _______________
 * - _______________
 * - _______________
 * 
 * Methods:
 * - _______________
 * - _______________
 */

/**
 * ============================================================================
 * PACKAGE: com.library.services
 * ============================================================================
 * 
 * TODO: Design BookService class
 * Purpose: Business logic for book operations
 * 
 * Methods:
 * - public Book addBook(...)
 * - public boolean removeBook(String isbn)
 * - public Book findBook(String isbn)
 * - public List<Book> searchBooks(String query)
 * - _______________
 * 
 * Dependencies:
 * - Imports: com.library.models.Book
 * - Imports: com.library.database.BookDAO
 * 
 * ----------------------------------------------------------------------------
 * 
 * TODO: Design LoanService class
 * Purpose: Business logic for loan operations
 * 
 * Methods:
 * - public Loan checkoutBook(String memberId, String isbn)
 * - public boolean returnBook(String loanId)
 * - public List<Loan> getActiveLoans(String memberId)
 * - _______________
 * 
 * Dependencies:
 * - _______________
 * - _______________
 */

/**
 * ============================================================================
 * PACKAGE: com.library.database
 * ============================================================================
 * 
 * TODO: Design BookDAO class (Data Access Object)
 * Purpose: Database operations for books
 * 
 * Methods:
 * - public void save(Book book)
 * - public Book findById(String id)
 * - public List<Book> findAll()
 * - public void update(Book book)
 * - public void delete(String id)
 * 
 * Note: For this exercise, you can use ArrayList to simulate database
 */

/**
 * ============================================================================
 * PACKAGE: com.library.utils
 * ============================================================================
 * 
 * TODO: Design DateUtils class
 * Purpose: Date manipulation utilities
 * 
 * Methods (all static):
 * - public static LocalDate today()
 * - public static LocalDate addDays(LocalDate date, int days)
 * - public static boolean isOverdue(LocalDate dueDate)
 * - _______________
 * 
 * ----------------------------------------------------------------------------
 * 
 * TODO: Design ValidationUtils class
 * Purpose: Input validation
 * 
 * Methods (all static):
 * - public static boolean isValidISBN(String isbn)
 * - public static boolean isValidEmail(String email)
 * - public static boolean isValidPhoneNumber(String phone)
 * - _______________
 */

/**
 * ============================================================================
 * PACKAGE: com.library.ui
 * ============================================================================
 * 
 * TODO: Design ConsoleUI class
 * Purpose: User interface
 * 
 * Methods:
 * - public void displayMainMenu()
 * - public void displayBooks(List<Book> books)
 * - public String getUserInput(String prompt)
 * - _______________
 */

/**
 * ============================================================================
 * MAIN APPLICATION
 * ============================================================================
 */
public class CustomPackageProject {
    
    /**
     * TODO: Write pseudocode for the main application flow
     * 
     * 1. Initialize services
     * 2. Display main menu
     * 3. Handle user choices:
     *    - Add book
     *    - Search book
     *    - Checkout book
     *    - Return book
     *    - Exit
     * 4. Use services from com.library.services package
     * 5. Use models from com.library.models package
     */
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   LIBRARY MANAGEMENT SYSTEM            ║");
        System.out.println("║   Multi-Package Application            ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();
        
        System.out.println("=== Package Structure ===");
        System.out.println("com.library.models");
        System.out.println("  └─ Book.java");
        System.out.println("  └─ Member.java");
        System.out.println("  └─ Loan.java");
        System.out.println();
        System.out.println("com.library.services");
        System.out.println("  └─ BookService.java");
        System.out.println("  └─ MemberService.java");
        System.out.println("  └─ LoanService.java");
        System.out.println();
        System.out.println("com.library.database");
        System.out.println("  └─ BookDAO.java");
        System.out.println("  └─ MemberDAO.java");
        System.out.println("  └─ LoanDAO.java");
        System.out.println();
        System.out.println("com.library.utils");
        System.out.println("  └─ DateUtils.java");
        System.out.println("  └─ ValidationUtils.java");
        System.out.println();
        System.out.println("com.library.ui");
        System.out.println("  └─ ConsoleUI.java");
        System.out.println("  └─ Menu.java");
        System.out.println();
        
        System.out.println("=== Implementation Steps ===");
        System.out.println("1. Create directory structure matching package names");
        System.out.println("2. Create each class in appropriate package");
        System.out.println("3. Add package declaration at top of each file");
        System.out.println("4. Import classes from other packages as needed");
        System.out.println("5. Implement functionality in each class");
        System.out.println("6. Test inter-package communication");
        System.out.println();
        
        System.out.println("=== Access Control Guidelines ===");
        System.out.println("- Model classes: public");
        System.out.println("- Service classes: public");
        System.out.println("- DAO classes: can be package-private");
        System.out.println("- Utility methods: public static");
        System.out.println("- Model fields: private with public getters/setters");
        System.out.println();
        
        System.out.println("=== CHALLENGE ===");
        System.out.println("Implement this complete package structure!");
        System.out.println("This will give you hands-on experience with:");
        System.out.println("- Organizing large applications");
        System.out.println("- Package dependencies");
        System.out.println("- Clean code architecture");
        System.out.println("- Separation of concerns");
    }
}

/**
 * BONUS EXERCISES:
 * 
 * 1. Draw a UML diagram showing package dependencies
 * 2. Identify circular dependencies (if any) and fix them
 * 3. Add a new feature (e.g., reservations) across all packages
 * 4. Create unit tests for service classes
 * 5. Generate JavaDoc documentation for all packages
 */

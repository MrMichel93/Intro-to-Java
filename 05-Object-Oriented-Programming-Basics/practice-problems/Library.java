/**
 * Library - Library management system with Book class (Practice Problem - Hard)
 * 
 * INSTRUCTIONS:
 * Complete this Library system by implementing both Book and Library classes.
 * This demonstrates a complete OOP system with multiple interacting classes.
 * 
 * Demonstrates:
 * - Multiple class design
 * - Array of objects
 * - Object relationships
 * - Complex OOP interactions
 * - Encapsulation at system level
 * 
 * @author Introduction to Java Course
 */

/**
 * Book class - represents a single book
 */
class Book {
    // TODO: Declare private fields:
    // - isbn (String)
    // - title (String)
    // - author (String)
    // - isCheckedOut (boolean)
    
    
    
    
    
    
    /**
     * TODO: Create a constructor
     * - Takes isbn, title, and author as parameters
     * - Initialize fields (isCheckedOut starts as false)
     */
    
    
    
    
    
    
    
    
    /**
     * TODO: Create getter methods for all fields
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called checkOut
     * - No parameters
     * - Returns boolean
     * - If already checked out, return false
     * - Otherwise, set isCheckedOut to true and return true
     */
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called returnBook
     * - No parameters
     * - Returns boolean
     * - If not checked out, return false
     * - Otherwise, set isCheckedOut to false and return true
     */
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Override toString
     * - Format: "Book[ISBN: XXX, Title: YYY, Author: ZZZ, Status: Available/Checked Out]"
     */
    
    
    
    
    
    
}

/**
 * Library class - manages a collection of books
 */
public class Library {
    // TODO: Declare private fields:
    // - name (String) - library name
    // - books (Book array) - collection of books
    // - bookCount (int) - number of books currently in library
    
    
    
    
    
    /**
     * TODO: Create a constructor
     * - Takes library name and maximum capacity
     * - Initialize name
     * - Create books array with given capacity
     * - Initialize bookCount to 0
     */
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called addBook
     * - Takes Book parameter
     * - Returns boolean (true if added, false if library is full)
     * - Add book to array and increment bookCount
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called findBookByISBN
     * - Takes String isbn parameter
     * - Returns Book (or null if not found)
     * - Search through books array for matching ISBN
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called findBooksByAuthor
     * - Takes String author parameter
     * - Returns void (just prints results)
     * - Print all books by the given author
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called checkOutBook
     * - Takes String isbn parameter
     * - Returns boolean (true if successful, false otherwise)
     * - Find book by ISBN and call its checkOut method
     * - Print appropriate message
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called returnBook
     * - Takes String isbn parameter
     * - Returns boolean (true if successful, false otherwise)
     * - Find book by ISBN and call its returnBook method
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called listAllBooks
     * - No parameters
     * - Returns void
     * - Print all books in the library with their status
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called listAvailableBooks
     * - No parameters
     * - Returns void
     * - Print only books that are not checked out
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called getAvailableCount
     * - No parameters
     * - Returns int (number of available books)
     */
    
    
    
    
    
    
    
    
    
    
    
    // Main method for testing
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===\n");
        
        // TODO: Create a Library with capacity of 10
        
        
        // TODO: Create several Book objects
        
        
        
        
        
        // TODO: Add books to library
        System.out.println("--- Adding Books ---");
        
        
        
        
        
        System.out.println();
        
        // TODO: List all books
        System.out.println("--- All Books in Library ---");
        
        
        System.out.println();
        
        // TODO: Check out a book
        System.out.println("--- Checking Out Book ---");
        
        
        System.out.println();
        
        // TODO: List available books
        System.out.println("--- Available Books ---");
        
        System.out.println("Available count: " + /* call getAvailableCount */ );
        System.out.println();
        
        // TODO: Try to check out same book again (should fail)
        System.out.println("--- Attempting Double Checkout ---");
        
        
        System.out.println();
        
        // TODO: Return the book
        System.out.println("--- Returning Book ---");
        
        
        System.out.println();
        
        // TODO: Find books by author
        System.out.println("--- Books by Author ---");
        
        
        System.out.println();
        
        // TODO: Search for specific book
        System.out.println("--- Search by ISBN ---");
        
        
    }
}

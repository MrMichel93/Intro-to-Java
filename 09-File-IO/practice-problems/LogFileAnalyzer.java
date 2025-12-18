import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

/**
 * LogFileAnalyzer - Analyzing log files (Practice Problem - Hard)
 * 
 * INSTRUCTIONS:
 * Complete this log file analyzer by implementing methods where indicated by TODO comments.
 * 
 * Demonstrates:
 * - Reading large files efficiently
 * - Parsing structured text data
 * - Data analysis from files
 * - Complex file operations
 * 
 * Log Format: [LEVEL] TIMESTAMP: message
 * Example: [INFO] 2024-12-18 10:30:45: Application started
 * 
 * @author Introduction to Java Course
 */

/**
 * TODO: Create a LogEntry class
 * - Private fields: level (String), timestamp (String), message (String)
 * - Constructor
 * - Getters
 * - toString method
 * - Static method: parseLogLine(String line) returns LogEntry or null
 *   Parse format: [LEVEL] TIMESTAMP: message
 */












class LogFileAnalyzer {
    
    /**
     * TODO: Create a method called readLogFile
     * - Takes String filename
     * - Returns ArrayList<LogEntry>
     * - Reads and parses all log entries
     * - Use try-with-resources
     * - Handle IOException
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called filterByLevel
     * - Takes ArrayList<LogEntry> and String level
     * - Returns ArrayList<LogEntry> matching the level
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called countByLevel
     * - Takes ArrayList<LogEntry>
     * - Returns HashMap<String, Integer> (level -> count)
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called searchMessages
     * - Takes ArrayList<LogEntry> and String keyword
     * - Returns ArrayList<LogEntry> where message contains keyword
     * - Case-insensitive search
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called generateReport
     * - Takes ArrayList<LogEntry> and String outputFile
     * - Writes summary report to file
     * - Include:
     *   - Total entries
     *   - Count by level
     *   - Most recent entry
     * - Handle IOException
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called createSampleLogFile
     * - Takes String filename
     * - Creates a sample log file with various entries
     * - Include INFO, WARNING, ERROR, DEBUG levels
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("=== Log File Analyzer ===\n");
        
        String logFile = "application.log";
        String reportFile = "log_report.txt";
        
        // TODO: Create sample log file
        System.out.println("--- Creating Sample Log ---");
        
        
        System.out.println();
        
        // TODO: Read and parse log file
        System.out.println("--- Reading Log File ---");
        
        
        
        System.out.println();
        
        // TODO: Count entries by level
        System.out.println("--- Count by Level ---");
        
        
        
        
        
        System.out.println();
        
        // TODO: Filter by level
        System.out.println("--- ERROR Level Entries ---");
        
        
        
        
        System.out.println();
        
        // TODO: Search for specific messages
        System.out.println("--- Search for 'failed' ---");
        
        
        
        
        System.out.println();
        
        // TODO: Generate report
        System.out.println("--- Generating Report ---");
        
        
        System.out.println();
        
        // TODO: Display report content
        System.out.println("--- Report Content ---");
        
        
        
        
        
        System.out.println();
        
        // TODO: Cleanup
        System.out.println("--- Cleanup ---");
        
        
        
        
        System.out.println("\n=== Use Cases ===");
        System.out.println("1. Monitor application errors");
        System.out.println("2. Analyze system behavior");
        System.out.println("3. Debug production issues");
        System.out.println("4. Generate reports for stakeholders");
    }
}

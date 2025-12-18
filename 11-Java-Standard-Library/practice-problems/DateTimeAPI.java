import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

/**
 * DateTimeAPI - Java Date and Time API (Practice Problem - Hard)
 * 
 * INSTRUCTIONS:
 * Complete this program using Java's Date and Time API where indicated by TODO comments.
 * 
 * Demonstrates:
 * - LocalDate, LocalTime, LocalDateTime
 * - Date formatting and parsing
 * - Date arithmetic
 * - Period and Duration
 * - ZonedDateTime
 * 
 * @author Introduction to Java Course
 */
public class DateTimeAPI {
    
    /**
     * TODO: Create a method called getCurrentDateTime
     * - No parameters
     * - Returns String with current date and time formatted nicely
     * - Use LocalDateTime and DateTimeFormatter
     * - Format: "December 18, 2024 10:30:45 AM"
     */
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called calculateAge
     * - Takes LocalDate birthDate
     * - Returns int (age in years)
     * - Use Period.between()
     */
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called addBusinessDays
     * - Takes LocalDate startDate and int days
     * - Returns LocalDate
     * - Adds specified number of business days (skip weekends)
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called isWeekend
     * - Takes LocalDate date
     * - Returns boolean
     * - Check if date falls on Saturday or Sunday
     */
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called getDayOfWeek
     * - Takes LocalDate date
     * - Returns String (day name)
     * - Use DayOfWeek enum
     */
    
    
    
    
    
    
    /**
     * TODO: Create a method called formatDate
     * - Takes LocalDate date and String pattern
     * - Returns String (formatted date)
     * - Use DateTimeFormatter
     */
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called parseDate
     * - Takes String dateString and String pattern
     * - Returns LocalDate
     * - Use DateTimeFormatter
     * - Handle DateTimeParseException
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called calculateDuration
     * - Takes two LocalDateTime objects
     * - Returns String describing duration
     * - Format: "X hours, Y minutes, Z seconds"
     * - Use Duration
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called getUpcomingBirthday
     * - Takes LocalDate birthDate
     * - Returns LocalDate of next birthday
     * - Consider if birthday already passed this year
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called timeUntilEvent
     * - Takes LocalDateTime eventTime
     * - Returns String describing time until event
     * - Format: "X days, Y hours, Z minutes"
     * - Use Duration and Period
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called convertTimeZone
     * - Takes ZonedDateTime time and ZoneId targetZone
     * - Returns ZonedDateTime in target zone
     */
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("=== Date and Time API Demonstration ===\n");
        
        // TODO: Get current date and time
        System.out.println("--- Current Date and Time ---");
        
        
        
        
        
        System.out.println();
        
        // TODO: Work with specific dates
        System.out.println("--- Specific Dates ---");
        LocalDate birthday = LocalDate.of(2000, 1, 15);
        
        
        
        
        
        System.out.println();
        
        // TODO: Date arithmetic
        System.out.println("--- Date Arithmetic ---");
        LocalDate today = LocalDate.now();
        
        
        
        
        
        
        System.out.println();
        
        // TODO: Business days calculation
        System.out.println("--- Business Days ---");
        
        
        
        System.out.println();
        
        // TODO: Date formatting
        System.out.println("--- Date Formatting ---");
        
        
        
        
        
        System.out.println();
        
        // TODO: Date parsing
        System.out.println("--- Date Parsing ---");
        
        
        
        
        System.out.println();
        
        // TODO: Duration calculation
        System.out.println("--- Duration ---");
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(5).plusMinutes(30).plusSeconds(45);
        
        
        System.out.println();
        
        // TODO: Time zones
        System.out.println("--- Time Zones ---");
        
        
        
        
        
        System.out.println();
        
        System.out.println("=== Key Classes ===");
        System.out.println("LocalDate      - Date without time");
        System.out.println("LocalTime      - Time without date");
        System.out.println("LocalDateTime  - Date and time");
        System.out.println("ZonedDateTime  - Date, time, and timezone");
        System.out.println("Period         - Date-based amount (years, months, days)");
        System.out.println("Duration       - Time-based amount (hours, minutes, seconds)");
        System.out.println();
        
        System.out.println("=== Common Patterns ===");
        System.out.println("yyyy-MM-dd           - 2024-12-18");
        System.out.println("dd/MM/yyyy           - 18/12/2024");
        System.out.println("MMM dd, yyyy         - Dec 18, 2024");
        System.out.println("HH:mm:ss             - 14:30:45");
        System.out.println("hh:mm:ss a           - 02:30:45 PM");
    }
}

/**
 * InterfaceDemo - Interfaces and multiple inheritance (Practice Problem - Hard)
 * 
 * INSTRUCTIONS:
 * Complete this program by implementing interfaces where indicated by TODO comments.
 * 
 * Demonstrates:
 * - Interface definition
 * - Multiple interface implementation
 * - Interface vs abstract class
 * - Default methods (Java 8+)
 * - Interface constants
 * 
 * @author Introduction to Java Course
 */

/**
 * TODO: Create interface Playable
 * - Declare abstract method: play() returns void
 * - Declare abstract method: pause() returns void
 * - Declare abstract method: stop() returns void
 */





/**
 * TODO: Create interface Downloadable
 * - Declare abstract method: download() returns void
 * - Declare abstract method: getFileSize() returns double (in MB)
 */




/**
 * TODO: Create interface Rateable
 * - Declare abstract method: rate(int stars) returns void (stars 1-5)
 * - Declare abstract method: getAverageRating() returns double
 */




/**
 * TODO: Create abstract class Media
 * - Add protected fields: title (String), duration (int in seconds)
 * - Create constructor
 * - Add concrete method: getDurationInMinutes() returns double
 * - Add abstract method: getMediaType() returns String
 */








/**
 * TODO: Create class Video that extends Media and implements Playable, Downloadable, Rateable
 * - Add private fields:
 *   - resolution (String) - e.g., "1080p"
 *   - fileSize (double) - in MB
 *   - totalRatings (int)
 *   - sumOfRatings (int)
 *   - isPlaying (boolean)
 *   - isPaused (boolean)
 * - Create constructor
 * - Implement all interface methods appropriately
 * - Implement getMediaType() to return "Video"
 */

















/**
 * TODO: Create class AudioTrack that extends Media and implements Playable, Downloadable, Rateable
 * - Add private fields:
 *   - artist (String)
 *   - bitrate (int) - e.g., 320 kbps
 *   - fileSize (double)
 *   - totalRatings (int)
 *   - sumOfRatings (int)
 *   - isPlaying (boolean)
 * - Create constructor
 * - Implement all interface methods
 * - Implement getMediaType() to return "Audio"
 */

















/**
 * TODO: Create class Podcast that extends Media and implements Playable, Downloadable
 * - Add private fields:
 *   - host (String)
 *   - episodeNumber (int)
 *   - fileSize (double)
 *   - isPlaying (boolean)
 * - Create constructor
 * - Implement Playable and Downloadable methods
 * - Implement getMediaType() to return "Podcast"
 * - Note: Does NOT implement Rateable
 */













// Main class
public class InterfaceDemo {
    
    /**
     * TODO: Create method playMedia that takes Playable parameter
     * - Demonstrates interface as parameter type
     * - Calls play() on the parameter
     */
    
    
    
    
    
    /**
     * TODO: Create method downloadMedia that takes Downloadable parameter
     * - Calls download() on the parameter
     * - Prints file size
     */
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("=== Interface Demonstration ===\n");
        
        // TODO: Create various media objects
        System.out.println("--- Creating Media ---");
        
        
        
        
        
        System.out.println();
        
        // TODO: Test Video operations
        System.out.println("--- Video Operations ---");
        
        
        
        
        
        
        
        System.out.println();
        
        // TODO: Test AudioTrack operations
        System.out.println("--- Audio Operations ---");
        
        
        
        
        
        
        System.out.println();
        
        // TODO: Test Podcast operations
        System.out.println("--- Podcast Operations ---");
        
        
        
        
        System.out.println();
        
        // TODO: Demonstrate polymorphism with interfaces
        System.out.println("--- Polymorphism with Interfaces ---");
        // Create array of Playable type
        
        
        
        
        
        
        System.out.println();
        
        // TODO: Demonstrate that not all Playable objects are Rateable
        System.out.println("--- Interface Checking ---");
        // Use instanceof to check if objects implement Rateable
        
        
        
        
        
        
        
    }
}

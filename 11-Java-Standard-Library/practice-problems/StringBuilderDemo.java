/**
 * StringBuilderDemo - StringBuilder for efficient string operations (Practice Problem - Medium)
 * 
 * INSTRUCTIONS:
 * Complete this program using StringBuilder where indicated by TODO comments.
 * 
 * Demonstrates:
 * - StringBuilder creation
 * - Append, insert, delete operations
 * - StringBuilder vs String performance
 * - Common StringBuilder methods
 * 
 * @author Introduction to Java Course
 */
public class StringBuilderDemo {
    
    /**
     * TODO: Create a method called buildHTMLTable
     * - Takes String[] headers and String[][] data
     * - Returns String (HTML table)
     * - Use StringBuilder to construct table
     * - Format:
     *   <table>
     *     <tr><th>Header1</th><th>Header2</th></tr>
     *     <tr><td>Data1</td><td>Data2</td></tr>
     *   </table>
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called reverseWords
     * - Takes String sentence
     * - Returns String with words in reverse order
     * - Use StringBuilder
     * - Example: "Hello World" becomes "World Hello"
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called removeVowels
     * - Takes String text
     * - Returns String with all vowels removed
     * - Use StringBuilder for efficiency
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called insertAt
     * - Takes String original, String toInsert, int position
     * - Returns String with toInsert inserted at position
     * - Use StringBuilder.insert()
     */
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called replaceAll
     * - Takes String text, String target, String replacement
     * - Returns String with all occurrences of target replaced
     * - Use StringBuilder
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method demonstrating String vs StringBuilder performance
     * - Concatenate 10000 strings using both approaches
     * - Measure time for each
     * - Print results
     */
    public static void demonstratePerformance() {
        System.out.println("=== Performance Comparison ===");
        
        int iterations = 10000;
        
        // Test String concatenation
        
        
        
        
        
        
        
        // Test StringBuilder
        
        
        
        
        
        
        
        System.out.println();
    }
    
    /**
     * TODO: Create a method called buildReport
     * - Takes no parameters
     * - Returns String (formatted report)
     * - Use StringBuilder to build multi-line report
     * - Include headers, data, separators
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("=== StringBuilder Demonstration ===\n");
        
        // TODO: Basic StringBuilder operations
        System.out.println("--- Basic Operations ---");
        StringBuilder sb = new StringBuilder("Hello");
        
        // Append
        
        
        // Insert
        
        
        // Delete
        
        
        // Replace
        
        
        // Reverse
        
        
        System.out.println();
        
        // TODO: Test buildHTMLTable
        System.out.println("--- HTML Table Builder ---");
        
        
        
        
        
        
        System.out.println();
        
        // TODO: Test reverseWords
        System.out.println("--- Reverse Words ---");
        
        
        System.out.println();
        
        // TODO: Test removeVowels
        System.out.println("--- Remove Vowels ---");
        
        
        System.out.println();
        
        // TODO: Test performance comparison
        
        
        System.out.println();
        
        // TODO: Test buildReport
        System.out.println("--- Report Builder ---");
        
        
        System.out.println();
        
        System.out.println("=== StringBuilder Methods ===");
        System.out.println("append(x)          - Add to end");
        System.out.println("insert(pos, x)     - Insert at position");
        System.out.println("delete(start, end) - Remove characters");
        System.out.println("replace(s, e, str) - Replace range");
        System.out.println("reverse()          - Reverse string");
        System.out.println("toString()         - Convert to String");
        System.out.println();
        System.out.println("Why use StringBuilder?");
        System.out.println("- Much faster for repeated concatenations");
        System.out.println("- Mutable (can be modified)");
        System.out.println("- More memory efficient for building strings");
    }
}

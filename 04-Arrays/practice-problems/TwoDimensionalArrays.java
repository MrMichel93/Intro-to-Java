/**
 * TwoDimensionalArrays - Working with 2D arrays and matrices (Practice Problem - Hard)
 * 
 * INSTRUCTIONS:
 * Complete this program by implementing 2D array operations where indicated by TODO comments.
 * 
 * Demonstrates:
 * - 2D array declaration and initialization
 * - Nested loops for 2D array traversal
 * - Row-major and column-major order
 * - Matrix operations
 * 
 * @author Introduction to Java Course
 */
public class TwoDimensionalArrays {
    
    /**
     * TODO: Create a method called print2DArray
     * - Method should be public and static
     * - Should take a 2D int array parameter
     * - Should return void
     * - Print the array in a grid format
     * - Each row on a new line, elements separated by tabs
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called sumAll
     * - Method should be public and static
     * - Should take a 2D int array parameter
     * - Should return an int (sum of all elements)
     * - Use nested loops to traverse all elements
     */
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called sumRow
     * - Method should be public and static
     * - Should take a 2D int array and row index
     * - Should return an int (sum of elements in specified row)
     */
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called sumColumn
     * - Method should be public and static
     * - Should take a 2D int array and column index
     * - Should return an int (sum of elements in specified column)
     * - Iterate through all rows, accessing the specified column
     */
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called findMax
     * - Method should be public and static
     * - Should take a 2D int array parameter
     * - Should return an int (maximum value in entire array)
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called transposeMatrix
     * - Method should be public and static
     * - Should take a 2D int array parameter (assume it's square)
     * - Should return a 2D int array (transposed matrix)
     * - Transpose means rows become columns and vice versa
     * - Example: {{1,2,3}, {4,5,6}} becomes {{1,4}, {2,5}, {3,6}}
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called searchValue
     * - Method should be public and static
     * - Should take a 2D int array and an int target
     * - Should return a String showing position "[row, col]" or "Not found"
     * - Return position of first occurrence
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called isDiagonal
     * - Method should be public and static
     * - Should take a 2D int array parameter
     * - Should return a boolean
     * - A diagonal matrix has non-zero values only on the main diagonal (i == j)
     * - All other elements should be 0
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Main method
    public static void main(String[] args) {
        System.out.println("=== 2D Arrays Demonstration ===\n");
        
        // TODO: Create a 2D array (3x4 matrix) with sample data
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        // TODO: Print the matrix
        System.out.println("--- Matrix ---");
        
        
        System.out.println();
        
        // TODO: Calculate and print sum of all elements
        System.out.println("--- Sum Operations ---");
        // Print: "Sum of all elements: " + sumAll(matrix)
        
        
        // TODO: Calculate and print sum of row 1 (second row)
        // Print: "Sum of row 1: " + sumRow(matrix, 1)
        
        
        // TODO: Calculate and print sum of column 2 (third column)
        // Print: "Sum of column 2: " + sumColumn(matrix, 2)
        
        
        System.out.println();
        
        // TODO: Find and print maximum value
        System.out.println("--- Search Operations ---");
        // Print: "Maximum value: " + findMax(matrix)
        
        
        // TODO: Search for a value
        int target = 7;
        // Print: "Position of " + target + ": " + searchValue(matrix, target)
        
        
        System.out.println();
        
        // TODO: Test transpose
        System.out.println("--- Transpose Matrix ---");
        int[][] square = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original:");
        
        System.out.println("\nTransposed:");
        // Call transposeMatrix and print result
        
        
        System.out.println();
        
        // TODO: Test diagonal check
        System.out.println("--- Diagonal Matrix Check ---");
        int[][] diagonal = {{5, 0, 0}, {0, 3, 0}, {0, 0, 7}};
        System.out.println("Matrix:");
        
        // Print: "Is diagonal matrix: " + isDiagonal(diagonal)
        
        
        System.out.println("\nMatrix:");
        
        // Print: "Is diagonal matrix: " + isDiagonal(matrix)
        
    }
}

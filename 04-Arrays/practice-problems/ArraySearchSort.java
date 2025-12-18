import java.util.Arrays;

/**
 * ArraySearchSort - Searching and sorting algorithms (Practice Problem - Medium)
 * 
 * INSTRUCTIONS:
 * Complete this program by implementing search and sort algorithms where indicated by TODO comments.
 * 
 * Demonstrates:
 * - Linear search algorithm
 * - Binary search algorithm
 * - Bubble sort algorithm
 * - Array manipulation
 * - Algorithm efficiency
 * 
 * @author Introduction to Java Course
 */
public class ArraySearchSort {
    
    /**
     * TODO: Create a method called linearSearch
     * - Method should be public and static
     * - Should take an int array parameter and an int target value
     * - Should return an int (index of target, or -1 if not found)
     * - Search through array sequentially from start to end
     */
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called binarySearch
     * - Method should be public and static
     * - Should take a sorted int array and an int target value
     * - Should return an int (index of target, or -1 if not found)
     * - Use binary search algorithm:
     *   1. Find middle element
     *   2. If target equals middle, return index
     *   3. If target < middle, search left half
     *   4. If target > middle, search right half
     *   5. Repeat until found or search space is empty
     * - Note: Array must be sorted for binary search to work!
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called bubbleSort
     * - Method should be public and static
     * - Should take an int array parameter
     * - Should return void (sorts array in place)
     * - Bubble sort algorithm:
     *   1. Compare adjacent elements
     *   2. Swap if they're in wrong order
     *   3. Repeat until no swaps needed
     * - Use nested loops
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * TODO: Create a method called reverseArray
     * - Method should be public and static
     * - Should take an int array parameter
     * - Should return void (reverses array in place)
     * - Swap elements from both ends moving toward center
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Helper method to print array
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    // Main method
    public static void main(String[] args) {
        System.out.println("=== Array Search & Sort Demonstration ===\n");
        
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("--- Original Array ---");
        printArray(numbers);
        System.out.println();
        
        // TODO: Test linearSearch
        System.out.println("--- Linear Search ---");
        int target = 22;
        // Call linearSearch and print result
        // Print: "Searching for " + target + "..."
        // Print: "Found at index: " + result (or "Not found" if -1)
        
        
        
        
        System.out.println();
        
        // TODO: Sort the array using bubbleSort
        System.out.println("--- Bubble Sort ---");
        int[] sortTest = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Before: ");
        printArray(sortTest);
        // Call bubbleSort
        
        System.out.print("After:  ");
        printArray(sortTest);
        System.out.println();
        
        // TODO: Test binarySearch (array must be sorted)
        System.out.println("--- Binary Search ---");
        // Call binarySearch on sortTest array
        target = 25;
        // Print: "Searching for " + target + " in sorted array..."
        // Print: "Found at index: " + result
        
        
        
        
        System.out.println();
        
        // TODO: Test reverseArray
        System.out.println("--- Reverse Array ---");
        int[] reverseTest = {1, 2, 3, 4, 5};
        System.out.print("Before: ");
        printArray(reverseTest);
        // Call reverseArray
        
        System.out.print("After:  ");
        printArray(reverseTest);
        System.out.println();
        
        System.out.println("=== Performance Notes ===");
        System.out.println("Linear Search: O(n) - checks every element");
        System.out.println("Binary Search: O(log n) - requires sorted array");
        System.out.println("Bubble Sort: O(n²) - inefficient for large arrays");
    }
}

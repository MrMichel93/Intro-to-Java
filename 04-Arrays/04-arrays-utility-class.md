# Arrays Utility Class

Java provides the `java.util.Arrays` class with many helpful methods for working with arrays.

## 🎯 Learning Objectives

- Use Arrays class for common operations
- Sort arrays efficiently
- Search arrays with binarySearch
- Compare arrays for equality
- Convert arrays to strings
- Fill arrays with values

## Importing Arrays Class

```java
import java.util.Arrays;
```

## Common Arrays Methods

### Arrays.toString()

Convert array to readable string.

```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(numbers));
// Output: [1, 2, 3, 4, 5]
```

### Arrays.sort()

Sort array in ascending order.

```java
int[] numbers = {5, 2, 8, 1, 9};
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));
// Output: [1, 2, 5, 8, 9]

String[] names = {"Charlie", "Alice", "Bob"};
Arrays.sort(names);
System.out.println(Arrays.toString(names));
// Output: [Alice, Bob, Charlie]
```

### Arrays.binarySearch()

Search sorted array efficiently.

```java
int[] numbers = {1, 2, 5, 8, 9};  // Must be sorted!
int index = Arrays.binarySearch(numbers, 5);
System.out.println("Found at index: " + index);  // 2
```

### Arrays.equals()

Compare two arrays for equality.

```java
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
int[] arr3 = {1, 2, 4};

System.out.println(Arrays.equals(arr1, arr2));  // true
System.out.println(Arrays.equals(arr1, arr3));  // false
```

### Arrays.fill()

Fill array with a value.

```java
int[] numbers = new int[5];
Arrays.fill(numbers, 7);
System.out.println(Arrays.toString(numbers));
// Output: [7, 7, 7, 7, 7]
```

### Arrays.copyOf()

Create a copy of an array.

```java
int[] original = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOf(original, original.length);
System.out.println(Arrays.toString(copy));
// Output: [1, 2, 3, 4, 5]
```

## Complete Example

```java
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        
        System.out.println("Original: " + Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));
        
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("8 found at index: " + index);
        
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copy: " + Arrays.toString(copy));
        
        System.out.println("Arrays equal? " + Arrays.equals(numbers, copy));
    }
}
```

## Summary

✓ `Arrays.toString()` - Print arrays
✓ `Arrays.sort()` - Sort arrays
✓ `Arrays.binarySearch()` - Search sorted arrays
✓ `Arrays.equals()` - Compare arrays
✓ `Arrays.fill()` - Fill with value
✓ `Arrays.copyOf()` - Copy arrays

## What's Next?

You've completed Module 4! Practice with exercises, then move to:

**[Module 5: Object-Oriented Programming Basics →](../05-Object-Oriented-Programming-Basics/README.md)**

---

[← Back to Multidimensional Arrays](03-multidimensional-arrays.md) | [Next: Module 5 →](../05-Object-Oriented-Programming-Basics/README.md)

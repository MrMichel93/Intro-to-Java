# Array Basics

Arrays are fundamental data structures that store multiple values of the same type in a single variable. They provide efficient storage and access to collections of data.

## 🎯 Learning Objectives

- Understand what arrays are and when to use them
- Declare and initialize arrays
- Access and modify array elements
- Work with array length property
- Iterate through arrays

## What is an Array?

An **array** is a fixed-size container that holds multiple values of the same data type. Think of it as a row of numbered boxes, each holding one value.

### Real-World Analogy

Think of an **apartment building**:
- Each apartment has a number (index)
- All apartments are in one building (array)
- Each apartment can hold residents (values)
- The building has a fixed number of apartments (fixed size)

## Declaring Arrays

### Syntax

```java
dataType[] arrayName;  // Preferred
// or
dataType arrayName[];  // Also valid but less common
```

### Examples

```java
int[] numbers;           // Array of integers
double[] prices;         // Array of doubles
String[] names;          // Array of strings
boolean[] flags;         // Array of booleans
```

## Creating Arrays

### Using new Keyword

```java
int[] numbers = new int[5];  // Creates array of 5 integers (all 0)
// Index:  0, 1, 2, 3, 4
// Values: 0, 0, 0, 0, 0
```

### With Initial Values

```java
int[] numbers = {10, 20, 30, 40, 50};
String[] names = {"Alice", "Bob", "Charlie"};
double[] prices = {19.99, 29.99, 39.99};
```

## Accessing Elements

Use square brackets `[]` with the index number.

```java
int[] numbers = {10, 20, 30, 40, 50};

System.out.println(numbers[0]);  // 10 (first element)
System.out.println(numbers[1]);  // 20
System.out.println(numbers[4]);  // 50 (last element)
```

**Important**: Array indices start at 0!

```
Index:  0   1   2   3   4
Value: 10  20  30  40  50
```

## Modifying Elements

```java
int[] numbers = {10, 20, 30, 40, 50};

numbers[0] = 15;  // Change first element
numbers[2] = 35;  // Change third element

System.out.println(numbers[0]);  // 15
System.out.println(numbers[2]);  // 35
```

## Array Length

Use the `.length` property (not a method!).

```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println("Length: " + numbers.length);  // 5
```

**Note**: No parentheses for length (it's a property, not a method)

## Iterating Through Arrays

### Using For Loop

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int i = 0; i < numbers.length; i++) {
    System.out.println("Element at index " + i + ": " + numbers[i]);
}
```

### Using Enhanced For Loop (For-Each)

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int num : numbers) {
    System.out.println(num);
}
```

## Complete Examples

### Grade Book

```java
public class GradeBook {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 95, 88};
        
        // Print all scores
        System.out.println("Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student %d: %d%n", i + 1, scores[i]);
        }
        
        // Calculate average
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / scores.length;
        System.out.printf("Average: %.2f%n", average);
    }
}
```

### Days of Week

```java
public class DaysExample {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", 
                         "Thursday", "Friday", "Saturday", "Sunday"};
        
        System.out.println("Days of the week:");
        for (int i = 0; i < days.length; i++) {
            System.out.printf("%d. %s%n", i + 1, days[i]);
        }
    }
}
```

## Common Array Operations

### Find Maximum

```java
public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
```

### Find Minimum

```java
public static int findMin(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}
```

### Calculate Sum

```java
public static int calculateSum(int[] arr) {
    int sum = 0;
    for (int num : arr) {
        sum += num;
    }
    return sum;
}
```

## Common Mistakes

### 1. Index Out of Bounds

```java
int[] numbers = {10, 20, 30};

// WRONG - index 3 doesn't exist!
System.out.println(numbers[3]);  // ArrayIndexOutOfBoundsException

// CORRECT - valid indices are 0, 1, 2
System.out.println(numbers[2]);
```

### 2. Using length()

```java
int[] numbers = {10, 20, 30};

// WRONG
System.out.println(numbers.length());  // Error! length is a property

// CORRECT
System.out.println(numbers.length);
```

### 3. Changing Array Size

```java
int[] numbers = {10, 20, 30};

// Arrays are FIXED size - cannot change!
// numbers.length = 5;  // Error!

// Must create a new array
numbers = new int[5];  // New array, old data lost
```

## Arrays are Reference Types

```java
int[] arr1 = {1, 2, 3};
int[] arr2 = arr1;  // Both reference same array

arr2[0] = 99;

System.out.println(arr1[0]);  // 99 (changed!)
System.out.println(arr2[0]);  // 99
```

## Practice Exercises

### Exercise 1: Temperature Tracker
Create an array of 7 temperatures (one per day) and find the average.

### Exercise 2: Reverse Array
Write a method to reverse an array in place.

### Exercise 3: Find Element
Write a method to find if a value exists in an array.

## Summary

✓ Arrays store multiple values of same type
✓ Fixed size - cannot change after creation
✓ Indices start at 0
✓ Access elements with `array[index]`
✓ Get length with `array.length` (property, not method)
✓ Iterate with for loop or enhanced for loop
✓ Arrays are reference types

## What's Next?

**[Next: Array Operations →](02-array-operations.md)**

---

[← Back to Module 4](README.md) | [Next: Array Operations →](02-array-operations.md)

# Loops

Loops allow you to repeat code multiple times without writing it over and over. They're essential for processing collections, repeating tasks, and implementing algorithms.

## 🎯 Learning Objectives

- Use while loops for condition-based repetition
- Implement do-while loops for at-least-once execution
- Master for loops for counted iteration
- Iterate collections with enhanced for loops
- Control loop flow with break and continue
- Create and work with nested loops

## While Loop

Repeats code while a condition is true. Checks condition **before** each iteration.

### Syntax

```java
while (condition) {
    // Code to repeat
}
```

### Basic Example

```java
int count = 1;

while (count <= 5) {
    System.out.println("Count: " + count);
    count++;
}

// Output:
// Count: 1
// Count: 2
// Count: 3
// Count: 4
// Count: 5
```

### Countdown

```java
int countdown = 10;

while (countdown > 0) {
    System.out.println(countdown);
    countdown--;
}
System.out.println("Blast off!");
```

### Sum Calculator

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
int sum = 0;
int number;

System.out.println("Enter numbers (0 to stop):");

while (true) {
    number = scanner.nextInt();
    if (number == 0) {
        break;  // Exit loop
    }
    sum += number;
}

System.out.println("Sum: " + sum);
scanner.close();
```

### Input Validation

```java
Scanner scanner = new Scanner(System.in);
int age;

while (true) {
    System.out.print("Enter your age (1-120): ");
    age = scanner.nextInt();
    
    if (age >= 1 && age <= 120) {
        break;  // Valid input
    }
    System.out.println("Invalid! Try again.");
}

System.out.println("Age entered: " + age);
scanner.close();
```

## Do-While Loop

Executes code at least once, then checks condition. Checks condition **after** each iteration.

### Syntax

```java
do {
    // Code to execute
} while (condition);
```

### Basic Example

```java
int count = 1;

do {
    System.out.println("Count: " + count);
    count++;
} while (count <= 5);
```

### Menu System

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
int choice;

do {
    System.out.println("\n=== Menu ===");
    System.out.println("1. Start Game");
    System.out.println("2. Load Game");
    System.out.println("3. Settings");
    System.out.println("4. Exit");
    System.out.print("Choice: ");
    
    choice = scanner.nextInt();
    
    switch (choice) {
        case 1:
            System.out.println("Starting game...");
            break;
        case 2:
            System.out.println("Loading game...");
            break;
        case 3:
            System.out.println("Opening settings...");
            break;
        case 4:
            System.out.println("Goodbye!");
            break;
        default:
            System.out.println("Invalid choice!");
    }
} while (choice != 4);

scanner.close();
```

### Password Verification

```java
Scanner scanner = new Scanner(System.in);
String password;
final String CORRECT_PASSWORD = "secret123";

do {
    System.out.print("Enter password: ");
    password = scanner.nextLine();
    
    if (!password.equals(CORRECT_PASSWORD)) {
        System.out.println("Incorrect! Try again.");
    }
} while (!password.equals(CORRECT_PASSWORD));

System.out.println("Access granted!");
scanner.close();
```

## For Loop

Best for counted iterations when you know how many times to repeat.

### Syntax

```java
for (initialization; condition; update) {
    // Code to repeat
}
```

### Basic Example

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}

// Output:
// Count: 1
// Count: 2
// Count: 3
// Count: 4
// Count: 5
```

### Counting Backwards

```java
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
System.out.println("Blast off!");
```

### Increment by Different Values

```java
// Count by 2s
for (int i = 0; i <= 10; i += 2) {
    System.out.println(i);  // 0, 2, 4, 6, 8, 10
}

// Count by 5s
for (int i = 0; i <= 50; i += 5) {
    System.out.println(i);  // 0, 5, 10, ..., 50
}
```

### Sum of Numbers

```java
int sum = 0;

for (int i = 1; i <= 100; i++) {
    sum += i;
}

System.out.println("Sum of 1-100: " + sum);  // 5050
```

### Factorial

```java
int n = 5;
int factorial = 1;

for (int i = 1; i <= n; i++) {
    factorial *= i;
}

System.out.println(n + "! = " + factorial);  // 5! = 120
```

### Multiplication Table

```java
int number = 7;

System.out.println("Multiplication table for " + number);
for (int i = 1; i <= 10; i++) {
    System.out.printf("%d x %d = %d%n", number, i, number * i);
}
```

## Enhanced For Loop (For-Each)

Simplified loop for iterating through arrays and collections.

### Syntax

```java
for (dataType variable : arrayOrCollection) {
    // Use variable
}
```

### Array Iteration

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int num : numbers) {
    System.out.println(num);
}

// Output:
// 10
// 20
// 30
// 40
// 50
```

### String Array

```java
String[] fruits = {"Apple", "Banana", "Orange", "Mango"};

for (String fruit : fruits) {
    System.out.println("I like " + fruit);
}
```

### Sum Array Elements

```java
int[] scores = {85, 90, 78, 92, 88};
int total = 0;

for (int score : scores) {
    total += score;
}

double average = (double) total / scores.length;
System.out.printf("Average: %.2f%n", average);
```

### Find Maximum

```java
int[] numbers = {45, 67, 23, 89, 12, 56};
int max = numbers[0];

for (int num : numbers) {
    if (num > max) {
        max = num;
    }
}

System.out.println("Maximum: " + max);  // 89
```

## Break Statement

Exits the loop immediately.

```java
// Find first even number
int[] numbers = {1, 3, 5, 8, 9, 11};

for (int num : numbers) {
    if (num % 2 == 0) {
        System.out.println("First even: " + num);
        break;  // Exit loop
    }
}
```

### Search in Array

```java
String[] names = {"Alice", "Bob", "Charlie", "David"};
String searchName = "Charlie";
boolean found = false;

for (String name : names) {
    if (name.equals(searchName)) {
        System.out.println("Found: " + name);
        found = true;
        break;
    }
}

if (!found) {
    System.out.println("Not found");
}
```

## Continue Statement

Skips the current iteration and moves to the next one.

```java
// Print only odd numbers
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue;  // Skip even numbers
    }
    System.out.println(i);
}

// Output: 1, 3, 5, 7, 9
```

### Skip Negative Numbers

```java
int[] numbers = {-5, 10, -3, 20, -1, 30};
int sum = 0;

for (int num : numbers) {
    if (num < 0) {
        continue;  // Skip negative
    }
    sum += num;
}

System.out.println("Sum of positive: " + sum);  // 60
```

## Nested Loops

Loops inside other loops - useful for 2D structures, patterns, and combinations.

### Multiplication Table

```java
System.out.println("Multiplication Table:");

for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 5; j++) {
        System.out.printf("%4d", i * j);
    }
    System.out.println();
}

// Output:
//    1   2   3   4   5
//    2   4   6   8  10
//    3   6   9  12  15
//    4   8  12  16  20
//    5  10  15  20  25
```

### Rectangle Pattern

```java
int rows = 5;
int cols = 10;

for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        System.out.print("* ");
    }
    System.out.println();
}

// Output:
// * * * * * * * * * *
// * * * * * * * * * *
// * * * * * * * * * *
// * * * * * * * * * *
// * * * * * * * * * *
```

### Triangle Pattern

```java
int height = 5;

for (int i = 1; i <= height; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}

// Output:
// *
// * *
// * * *
// * * * *
// * * * * *
```

### Number Pyramid

```java
int rows = 5;

for (int i = 1; i <= rows; i++) {
    // Print spaces
    for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
    }
    // Print numbers
    for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
    }
    System.out.println();
}

// Output:
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
```

### 2D Array Iteration

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

## Common Loop Patterns

### Counting Pattern

```java
// Count from start to end
for (int i = start; i <= end; i++) {
    // Process i
}
```

### Accumulator Pattern

```java
// Calculate sum/product
int sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}
```

### Search Pattern

```java
// Find element
boolean found = false;
for (int item : array) {
    if (item == target) {
        found = true;
        break;
    }
}
```

### Validation Pattern

```java
// Validate all items
boolean allValid = true;
for (int item : array) {
    if (!isValid(item)) {
        allValid = false;
        break;
    }
}
```

## Infinite Loops

### Intentional Infinite Loop

```java
while (true) {
    // Game loop
    processInput();
    update();
    render();
    
    if (exitRequested) {
        break;
    }
}
```

### Accidental Infinite Loop (Bug!)

```java
// WRONG! Never increments
int i = 0;
while (i < 10) {
    System.out.println(i);
    // Forgot: i++;
}

// WRONG! Condition always true
int count = 0;
while (count >= 0) {
    System.out.println(count);
    count++;  // Always positive!
}
```

## Complete Example: Number Guessing Game

```java
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1;  // 1-100
        int guess;
        int attempts = 0;
        final int MAX_ATTEMPTS = 7;
        
        System.out.println("=== Number Guessing Game ===");
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts");
        
        while (attempts < MAX_ATTEMPTS) {
            System.out.print("\nAttempt " + (attempts + 1) + ": ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess == secretNumber) {
                System.out.println("🎉 Correct! You won in " + attempts + " attempts!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
            
            if (attempts == MAX_ATTEMPTS) {
                System.out.println("\n😞 Game Over! The number was " + secretNumber);
            }
        }
        
        scanner.close();
    }
}
```

## Common Mistakes

### 1. Off-by-One Errors

```java
// Wrong: Skips last element
for (int i = 0; i < array.length - 1; i++) {  // Missing last!

// Correct
for (int i = 0; i < array.length; i++) {
```

### 2. Modifying Loop Variable in For-Each

```java
int[] numbers = {1, 2, 3};

// Won't affect array!
for (int num : numbers) {
    num = num * 2;  // Only changes local copy
}
```

### 3. Infinite Loop Due to Wrong Condition

```java
// Never terminates!
for (int i = 0; i != 10; i += 2) {
    // i goes 0, 2, 4, 6, 8, 10, 12... never equals 10
}

// Use <= or < instead
for (int i = 0; i < 10; i += 2) {
```

## Performance Tips

1. **Cache array length** in critical loops:
```java
int len = array.length;
for (int i = 0; i < len; i++) {
    // Faster than checking array.length each time
}
```

2. **Break early** when found:
```java
for (int item : items) {
    if (item == target) {
        break;  // Don't keep searching
    }
}
```

3. **Use enhanced for** when you don't need the index:
```java
// Simpler and cleaner
for (String name : names) {
    System.out.println(name);
}
```

## Practice Exercises

### Exercise 1: Fibonacci Sequence
Print the first n numbers of the Fibonacci sequence.

### Exercise 2: Prime Number Checker
Check if a number is prime using a loop.

### Exercise 3: Pattern Printing
Create a hollow square pattern using nested loops.

### Exercise 4: Array Statistics
Calculate min, max, average, and sum of an array.

## Summary

✓ **while**: Repeats while condition is true (checks before)
✓ **do-while**: Executes at least once (checks after)
✓ **for**: Best for counted iterations
✓ **for-each**: Simplified iteration over collections
✓ **break**: Exits loop immediately
✓ **continue**: Skips current iteration
✓ Nested loops create 2D iterations
✓ Watch for infinite loops and off-by-one errors

## What's Next?

You've completed Module 2! Practice with exercises, then move to:

**[Module 3: Methods →](../03-Methods/README.md)**

---

[← Back to Ternary Operator](03-ternary-operator.md) | [Next: Module 3 →](../03-Methods/README.md)

# Input and Output in Java

Programs need to communicate with users - receiving input and displaying output. This lesson covers reading user input with Scanner and formatting output effectively.

## 🎯 Learning Objectives

- Use Scanner class to read user input
- Read different data types from console
- Format output with printf and format specifiers
- Understand print vs println
- Handle common input issues

## Output: Displaying Information

### System.out.println()

Prints text and moves to next line.

```java
System.out.println("Hello!");
System.out.println("World!");
```

**Output:**
```
Hello!
World!
```

### System.out.print()

Prints text but stays on same line.

```java
System.out.print("Hello ");
System.out.print("World!");
System.out.println();  // Move to next line
```

**Output:**
```
Hello World!
```

### Printing Variables

```java
int age = 25;
String name = "Alice";
double price = 19.99;

System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Price: $" + price);
```

### String Concatenation

```java
String first = "Hello";
String second = "World";
System.out.println(first + " " + second + "!");  // Hello World!

int x = 5, y = 10;
System.out.println("Sum: " + (x + y));  // Sum: 15
// Note: Parentheses needed to add first, not concatenate
```

## Formatted Output: printf

`printf` allows formatted output with placeholders.

### Basic Syntax

```java
System.out.printf("format string", arguments);
```

### Format Specifiers

| Specifier | Type | Example |
|-----------|------|---------|
| `%d` | Integer (decimal) | `System.out.printf("%d", 42);` |
| `%f` | Floating-point | `System.out.printf("%f", 3.14);` |
| `%s` | String | `System.out.printf("%s", "Hi");` |
| `%c` | Character | `System.out.printf("%c", 'A');` |
| `%b` | Boolean | `System.out.printf("%b", true);` |
| `%n` | Newline | `System.out.printf("Line1%nLine2");` |

### Examples

```java
String name = "Alice";
int age = 25;
double gpa = 3.85;

System.out.printf("Name: %s%n", name);
System.out.printf("Age: %d years%n", age);
System.out.printf("GPA: %f%n", gpa);
```

**Output:**
```
Name: Alice
Age: 25 years
GPA: 3.850000
```

### Controlling Decimal Places

```java
double price = 19.99;
double pi = 3.14159265359;

System.out.printf("Price: $%.2f%n", price);    // $19.99 (2 decimals)
System.out.printf("Pi: %.4f%n", pi);           // 3.1416 (4 decimals)
System.out.printf("Pi: %.2f%n", pi);           // 3.14 (2 decimals)
```

### Width and Alignment

```java
System.out.printf("%10s%n", "Hello");    // Right-aligned in 10 spaces
System.out.printf("%-10s%n", "Hello");   // Left-aligned in 10 spaces
System.out.printf("%5d%n", 42);          // Right-aligned in 5 spaces
System.out.printf("%08d%n", 42);         // Padded with zeros: 00000042
```

### Multiple Values

```java
String name = "Bob";
int age = 30;
double salary = 75000.50;

System.out.printf("%s is %d years old and earns $%.2f%n", name, age, salary);
// Bob is 30 years old and earns $75000.50
```

## Input: Reading User Data

### Scanner Class

Import Scanner first:

```java
import java.util.Scanner;
```

Create Scanner object:

```java
Scanner scanner = new Scanner(System.in);
```

### Reading Different Types

```java
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Read double
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();
        
        // Read boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        
        // Read single word
        System.out.print("Enter your city: ");
        String city = scanner.next();
        
        // Read full line (with spaces)
        scanner.nextLine();  // Clear buffer
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        
        // Display
        System.out.printf("Name: %s%n", fullName);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Height: %.2f%n", height);
        System.out.printf("City: %s%n", city);
        System.out.printf("Student: %b%n", isStudent);
        
        scanner.close();  // Always close!
    }
}
```

### Scanner Methods

| Method | Reads | Example |
|--------|-------|---------|
| `nextInt()` | Integer | `scanner.nextInt()` |
| `nextDouble()` | Double | `scanner.nextDouble()` |
| `nextBoolean()` | Boolean | `scanner.nextBoolean()` |
| `next()` | Single word | `scanner.next()` |
| `nextLine()` | Entire line | `scanner.nextLine()` |
| `nextChar()` | N/A - use `next().charAt(0)` | `scanner.next().charAt(0)` |

### Reading Character

```java
System.out.print("Enter a character: ");
char ch = scanner.next().charAt(0);
System.out.println("You entered: " + ch);
```

## Common Input Issues

### Issue 1: nextLine() after nextInt/nextDouble

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter number: ");
int num = scanner.nextInt();  // Reads number but leaves newline

System.out.print("Enter name: ");
String name = scanner.nextLine();  // Reads empty line!

System.out.println("Name: " + name);  // Empty!
```

**Solution:** Add `scanner.nextLine()` to clear buffer

```java
int num = scanner.nextInt();
scanner.nextLine();  // Clear the newline
String name = scanner.nextLine();  // Now works correctly
```

### Issue 2: InputMismatchException

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter integer: ");
int num = scanner.nextInt();  // User enters "abc" → Error!
```

**Solution:** Validate input (covered in later modules)

### Issue 3: Forgetting to close Scanner

```java
Scanner scanner = new Scanner(System.in);
// ... use scanner ...
scanner.close();  // Always close when done!
```

## Complete Interactive Example

```java
import java.util.Scanner;

public class InteractiveCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Simple Calculator ===\n");
        
        // Get first number
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        // Get operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        
        // Get second number
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        // Calculate
        double result = 0;
        boolean valid = true;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    valid = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                valid = false;
        }
        
        // Display result
        if (valid) {
            System.out.printf("%n%.2f %c %.2f = %.2f%n", 
                num1, operator, num2, result);
        }
        
        input.close();
    }
}
```

## Practice Exercises

### Exercise 1: User Profile

Create a program that:
1. Asks for name, age, and favorite color
2. Displays a formatted profile

### Exercise 2: Currency Converter

Create a program that:
1. Asks for amount in dollars
2. Asks for exchange rate
3. Displays converted amount with 2 decimal places

### Exercise 3: Mad Libs

Create a program that:
1. Asks for noun, verb, adjective, adverb
2. Creates a funny story using the words

## Summary

✓ `println()` prints and moves to next line
✓ `print()` prints without newline
✓ `printf()` provides formatted output
✓ Scanner reads user input
✓ Always close Scanner when done
✓ Clear buffer with `nextLine()` after numeric input
✓ Use `next().charAt(0)` to read single character

## What's Next?

**[Next: Working with Strings →](04-strings.md)**

---

[← Back to Operators](02-operators.md) | [Next: Strings →](04-strings.md)

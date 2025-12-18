# Switch Statements

Switch statements provide an elegant way to handle multiple specific values of a variable. They're often clearer and more efficient than long else-if chains when checking for equality.

## 🎯 Learning Objectives

- Use switch statements for multiple value checks
- Understand break statements and fall-through
- Use switch expressions (Java 14+)
- Know when to use switch vs if-else
- Implement default cases properly

## Basic Switch Statement

### Syntax

```java
switch (expression) {
    case value1:
        // Code for value1
        break;
    case value2:
        // Code for value2
        break;
    default:
        // Code if no case matches
}
```

### Simple Example

```java
int day = 3;
String dayName;

switch (day) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    case 4:
        dayName = "Thursday";
        break;
    case 5:
        dayName = "Friday";
        break;
    case 6:
        dayName = "Saturday";
        break;
    case 7:
        dayName = "Sunday";
        break;
    default:
        dayName = "Invalid day";
}

System.out.println(dayName);  // Wednesday
```

## Break Statement

The `break` statement exits the switch. Without it, execution "falls through" to the next case.

### Without Break (Fall-Through)

```java
int number = 2;

switch (number) {
    case 1:
        System.out.println("One");
        // No break - falls through!
    case 2:
        System.out.println("Two");
        // No break - falls through!
    case 3:
        System.out.println("Three");
        break;
}

// Output:
// Two
// Three
```

### With Break

```java
int number = 2;

switch (number) {
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
        break;  // Exits switch
    case 3:
        System.out.println("Three");
        break;
}

// Output:
// Two
```

## Multiple Cases for Same Action

Group cases that should execute the same code.

```java
int month = 4;
String season;

switch (month) {
    case 12:
    case 1:
    case 2:
        season = "Winter";
        break;
    case 3:
    case 4:
    case 5:
        season = "Spring";
        break;
    case 6:
    case 7:
    case 8:
        season = "Summer";
        break;
    case 9:
    case 10:
    case 11:
        season = "Autumn";
        break;
    default:
        season = "Invalid month";
}

System.out.println(season);  // Spring
```

## Default Case

The `default` case handles values that don't match any case.

```java
char grade = 'B';

switch (grade) {
    case 'A':
        System.out.println("Excellent!");
        break;
    case 'B':
        System.out.println("Good job!");
        break;
    case 'C':
        System.out.println("Well done");
        break;
    case 'D':
        System.out.println("You passed");
        break;
    case 'F':
        System.out.println("Better try again");
        break;
    default:
        System.out.println("Invalid grade");
}
```

**Note:** Default is optional but recommended!

## Switch with Strings

You can use String values in switch statements (Java 7+).

```java
String command = "start";

switch (command) {
    case "start":
        System.out.println("Starting the program...");
        break;
    case "stop":
        System.out.println("Stopping the program...");
        break;
    case "pause":
        System.out.println("Pausing the program...");
        break;
    case "resume":
        System.out.println("Resuming the program...");
        break;
    default:
        System.out.println("Unknown command");
}
```

### Case-Sensitive Warning

```java
String fruit = "Apple";

switch (fruit) {
    case "apple":  // Won't match "Apple"
        System.out.println("It's an apple");
        break;
    case "Apple":  // Will match
        System.out.println("It's an Apple");
        break;
}

// To ignore case:
switch (fruit.toLowerCase()) {
    case "apple":
        System.out.println("It's an apple");
        break;
}
```

## Switch Expressions (Java 14+)

Modern switch syntax that returns a value.

### Arrow Syntax (->)

```java
int day = 3;

String dayName = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4 -> "Thursday";
    case 5 -> "Friday";
    case 6 -> "Saturday";
    case 7 -> "Sunday";
    default -> "Invalid day";
};

System.out.println(dayName);  // Wednesday
```

### Multiple Cases with Arrow

```java
int month = 4;

String season = switch (month) {
    case 12, 1, 2 -> "Winter";
    case 3, 4, 5 -> "Spring";
    case 6, 7, 8 -> "Summer";
    case 9, 10, 11 -> "Autumn";
    default -> "Invalid month";
};

System.out.println(season);  // Spring
```

### Yield Keyword

Use `yield` for complex expressions that need multiple statements.

```java
int score = 85;

String grade = switch (score / 10) {
    case 10, 9 -> "A";
    case 8 -> "B";
    case 7 -> "C";
    case 6 -> "D";
    default -> {
        if (score >= 0) {
            yield "F";
        } else {
            yield "Invalid";
        }
    }
};

System.out.println("Grade: " + grade);
```

## Real-World Examples

### Calculator

```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
        }
        
        scanner.close();
    }
}
```

### Menu System

```java
import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Restaurant Menu ===");
        System.out.println("1. Pizza - $12.99");
        System.out.println("2. Burger - $8.99");
        System.out.println("3. Pasta - $10.99");
        System.out.println("4. Salad - $6.99");
        System.out.println("5. Exit");
        
        System.out.print("\nEnter your choice (1-5): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("You ordered Pizza - $12.99");
                break;
            case 2:
                System.out.println("You ordered Burger - $8.99");
                break;
            case 3:
                System.out.println("You ordered Pasta - $10.99");
                break;
            case 4:
                System.out.println("You ordered Salad - $6.99");
                break;
            case 5:
                System.out.println("Thank you for visiting!");
                break;
            default:
                System.out.println("Invalid choice! Please select 1-5.");
        }
        
        scanner.close();
    }
}
```

### Traffic Light Simulator

```java
String light = "yellow";
int speed = 50;

switch (light) {
    case "green":
        System.out.println("GO!");
        if (speed == 0) {
            System.out.println("You can start driving");
        }
        break;
    case "yellow":
        System.out.println("CAUTION!");
        if (speed > 0) {
            System.out.println("Prepare to stop");
        }
        break;
    case "red":
        System.out.println("STOP!");
        if (speed > 0) {
            System.out.println("You must stop immediately");
        }
        break;
    default:
        System.out.println("Malfunction: Unknown signal");
}
```

## Switch vs If-Else

### Use Switch When:

✓ Checking **equality** of one variable against multiple values
✓ Values are **constants** (literals, enums)
✓ Many cases (usually 3+)
✓ All cases check the **same variable**

```java
// Good use of switch
switch (dayOfWeek) {
    case 1: // ...
    case 2: // ...
    case 3: // ...
}
```

### Use If-Else When:

✓ Checking **ranges** or **complex conditions**
✓ Different variables in each condition
✓ Need operators like <, >, <=, >=
✓ Boolean expressions

```java
// Must use if-else
if (age < 18) {
    // ...
} else if (score > 90) {
    // ...
}
```

### Comparison Example

```java
// If-Else approach
int score = 85;
char grade;

if (score >= 90) {
    grade = 'A';
} else if (score >= 80) {
    grade = 'B';
} else if (score >= 70) {
    grade = 'C';
} else if (score >= 60) {
    grade = 'D';
} else {
    grade = 'F';
}

// Switch approach (convert to discrete values)
char grade;

switch (score / 10) {
    case 10:
    case 9:
        grade = 'A';
        break;
    case 8:
        grade = 'B';
        break;
    case 7:
        grade = 'C';
        break;
    case 6:
        grade = 'D';
        break;
    default:
        grade = 'F';
}
```

## Common Mistakes

### 1. Forgetting Break

```java
int x = 2;

switch (x) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");  // Executes
    case 3:
        System.out.println("Three");  // Also executes!
}

// Output:
// Two
// Three
```

### 2. Using Variables as Cases

```java
int value = 5;
int threshold = 10;

switch (value) {
    case threshold:  // ERROR! Must be constant
        // ...
}

// Use final constants instead:
final int THRESHOLD = 10;
switch (value) {
    case THRESHOLD:  // OK
        // ...
}
```

### 3. Duplicate Cases

```java
switch (x) {
    case 1:
        // ...
        break;
    case 1:  // ERROR! Duplicate case
        // ...
        break;
}
```

## Practice Exercises

### Exercise 1: Month Days

Write a program that takes a month number (1-12) and prints the number of days in that month (assume non-leap year).

### Exercise 2: Grade Converter

Convert letter grades (A, B, C, D, F) to grade points (4.0, 3.0, 2.0, 1.0, 0.0).

### Exercise 3: Rock-Paper-Scissors

Create a game where user enters a choice (rock, paper, or scissors) and computer makes a random choice. Determine the winner.

## Summary

✓ Switch checks one variable against multiple values
✓ Use `break` to exit after each case
✓ Group multiple cases for same action
✓ `default` handles unmatched values
✓ Strings can be used in switch (Java 7+)
✓ Switch expressions (Java 14+) return values with `->`
✓ Use switch for equality checks, if-else for ranges
✓ Always include a default case

## What's Next?

**[Next: Ternary Operator →](03-ternary-operator.md)**

---

[← Back to If Statements](01-if-statements.md) | [Next: Ternary Operator →](03-ternary-operator.md)

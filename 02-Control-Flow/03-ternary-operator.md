# Ternary Operator

The ternary operator is a compact way to write simple if-else statements. It's called "ternary" because it takes three operands: a condition, a result for true, and a result for false.

## 🎯 Learning Objectives

- Use the ternary operator for simple conditions
- Understand when ternary improves code readability
- Nest ternary operators (with caution)
- Know when to avoid ternary and use if-else instead

## Syntax

```java
variable = (condition) ? valueIfTrue : valueIfFalse;
```

**Parts:**
- **condition**: Boolean expression to evaluate
- **?**: Separates condition from true value
- **valueIfTrue**: Value if condition is true
- **:** Separates true value from false value
- **valueIfFalse**: Value if condition is false

## Basic Examples

### Find Maximum

```java
int a = 10;
int b = 20;

// Using if-else
int max;
if (a > b) {
    max = a;
} else {
    max = b;
}

// Using ternary (more concise!)
int max = (a > b) ? a : b;

System.out.println("Maximum: " + max);  // 20
```

### Even or Odd

```java
int number = 7;

// Using if-else
String result;
if (number % 2 == 0) {
    result = "Even";
} else {
    result = "Odd";
}

// Using ternary
String result = (number % 2 == 0) ? "Even" : "Odd";

System.out.println(result);  // Odd
```

### Absolute Value

```java
int num = -15;

// Get absolute value
int absolute = (num < 0) ? -num : num;

System.out.println("Absolute: " + absolute);  // 15
```

## Real-World Uses

### Display Status

```java
int score = 85;
String status = (score >= 60) ? "Pass" : "Fail";
System.out.println("Status: " + status);
```

### Price Calculation

```java
double price = 100.0;
boolean isMember = true;

double finalPrice = isMember ? price * 0.9 : price;  // 10% discount for members
System.out.printf("Price: $%.2f%n", finalPrice);
```

### Access Control

```java
int age = 20;
String access = (age >= 18) ? "Granted" : "Denied";
System.out.println("Access: " + access);
```

### Greeting Based on Time

```java
int hour = 14;
String greeting = (hour < 12) ? "Good morning" : "Good afternoon";
System.out.println(greeting);
```

## Ternary in Expressions

You can use ternary operators directly in expressions.

### In Print Statements

```java
int lives = 3;
System.out.println("You have " + lives + " " + 
                   (lives == 1 ? "life" : "lives") + " remaining");

// Output: You have 3 lives remaining
```

### In Method Calls

```java
int temperature = 30;
System.out.println((temperature > 25) ? "It's hot!" : "It's comfortable");
```

### In Calculations

```java
int quantity = 15;
double pricePerUnit = 10.0;

// Bulk discount: 10% off for 10+ items
double total = quantity * pricePerUnit * (quantity >= 10 ? 0.9 : 1.0);
System.out.printf("Total: $%.2f%n", total);
```

## Nested Ternary Operators

You can nest ternary operators, but use sparingly - it can become hard to read.

### Grade Assignment

```java
int score = 85;

String grade = (score >= 90) ? "A" :
               (score >= 80) ? "B" :
               (score >= 70) ? "C" :
               (score >= 60) ? "D" : "F";

System.out.println("Grade: " + grade);  // B
```

### Traffic Light

```java
String light = "yellow";

String action = light.equals("green") ? "Go" :
                light.equals("yellow") ? "Caution" :
                light.equals("red") ? "Stop" : "Unknown";

System.out.println(action);  // Caution
```

**Warning:** Deeply nested ternary operators are hard to read. Consider using if-else instead!

## Multiple Ternary Statements

Chain simple ternary operators for clarity.

```java
int age = 25;
int experience = 3;

String level = (age >= 30) ? "Senior" : "Junior";
String status = (experience >= 5) ? "Experienced" : "Learning";

System.out.println(level + " Developer - " + status);
```

## When to Use Ternary

### ✅ Good Uses

**1. Simple Two-Way Choices**
```java
int max = (a > b) ? a : b;
String status = (isPaid) ? "Paid" : "Unpaid";
```

**2. Inline Variable Assignment**
```java
double discount = (isMember) ? 0.10 : 0.0;
```

**3. Display Messages**
```java
System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
```

### ❌ Avoid Ternary When

**1. Complex Logic**
```java
// Too complex for ternary!
String result = (a > b && c < d || e == f) ? "Complex" : "Very Complex";

// Better with if-else
if (a > b && c < d || e == f) {
    result = "Complex";
} else {
    result = "Very Complex";
}
```

**2. Multiple Statements Needed**
```java
// Don't do this!
int result = (x > 0) ? (System.out.println("Positive"), x) : 0;  // Awkward

// Use if-else instead
if (x > 0) {
    System.out.println("Positive");
    result = x;
} else {
    result = 0;
}
```

**3. Readability Suffers**
```java
// Hard to read
String result = a > b ? c > d ? "1" : "2" : e > f ? "3" : "4";

// Much clearer with if-else
if (a > b) {
    result = (c > d) ? "1" : "2";
} else {
    result = (e > f) ? "3" : "4";
}
```

## Complete Example: Login Validator

```java
import java.util.Scanner;

public class LoginValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final String CORRECT_USERNAME = "admin";
        final String CORRECT_PASSWORD = "admin123";
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // Validate username
        boolean validUser = username.equals(CORRECT_USERNAME);
        String userMessage = validUser ? "Valid username" : "Invalid username";
        
        // Validate password
        boolean validPass = password.equals(CORRECT_PASSWORD);
        String passMessage = validPass ? "Valid password" : "Invalid password";
        
        // Overall status
        String status = (validUser && validPass) ? "Login successful!" : "Login failed!";
        
        System.out.println(userMessage);
        System.out.println(passMessage);
        System.out.println(status);
        
        // Access level based on credentials
        String accessLevel = (validUser && validPass) ? "Admin" : "Guest";
        System.out.println("Access Level: " + accessLevel);
        
        scanner.close();
    }
}
```

## Ternary vs If-Else Performance

**Performance**: Ternary and if-else have virtually identical performance in Java. The JVM optimizes both similarly.

**Choose based on readability:**
- Ternary: Simple, single-line conditions
- If-else: Complex logic, multiple statements

## Common Patterns

### Default Values

```java
String name = username != null ? username : "Guest";
int limit = userLimit > 0 ? userLimit : 100;  // Default to 100
```

### String Pluralization

```java
int count = 5;
System.out.println(count + " item" + (count != 1 ? "s" : ""));
// Output: 5 items
```

### Null Safety

```java
String displayName = user != null ? user.getName() : "Unknown";
```

### Range Validation

```java
int value = input >= 0 && input <= 100 ? input : 0;  // Clamp to valid range
```

## Practice Exercises

### Exercise 1: Temperature Converter

Write a program that uses ternary operators to determine if temperature is in Celsius or Fahrenheit (based on a boolean flag) and display appropriately.

### Exercise 2: Discount Calculator

Create a discount calculator that uses ternary operators to apply different discount rates based on purchase amount.

### Exercise 3: Grade Status

Use nested ternary operators to assign status based on grade: A/B = "Excellent", C = "Good", D = "Pass", F = "Fail".

## Summary

✓ Ternary operator: `(condition) ? valueIfTrue : valueIfFalse`
✓ Compact alternative to simple if-else
✓ Best for single-line assignments
✓ Can be nested but loses readability
✓ Use for simple conditions only
✓ Choose if-else for complex logic
✓ Same performance as if-else
✓ Improves code conciseness when used appropriately

## What's Next?

**[Next: Loops →](04-loops.md)**

---

[← Back to Switch Statements](02-switch-statements.md) | [Next: Loops →](04-loops.md)

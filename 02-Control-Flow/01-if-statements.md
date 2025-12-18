# If Statements

Conditional statements allow your program to make decisions and execute different code based on conditions. The `if` statement is the most fundamental control flow structure in Java.

## 🎯 Learning Objectives

- Use basic if statements to make decisions
- Implement if-else for two-way choices
- Chain multiple conditions with else-if
- Nest if statements for complex logic
- Avoid common if statement mistakes

## Basic If Statement

Execute code only when a condition is true.

### Syntax

```java
if (condition) {
    // Code to execute when condition is true
}
```

### Examples

```java
int age = 18;

if (age >= 18) {
    System.out.println("You are an adult!");
}

int temperature = 30;

if (temperature > 25) {
    System.out.println("It's hot outside!");
}
```

### Real-World Uses

```java
// Banking
double balance = 500;
if (balance > 100) {
    System.out.println("Sufficient funds");
}

// Gaming
int health = 20;
if (health <= 0) {
    System.out.println("Game Over!");
}

// E-commerce
int stock = 5;
if (stock > 0) {
    System.out.println("Item available for purchase");
}
```

## If-Else Statement

Choose between two alternatives.

### Syntax

```java
if (condition) {
    // Code when condition is true
} else {
    // Code when condition is false
}
```

### Examples

```java
int age = 15;

if (age >= 18) {
    System.out.println("You can vote");
} else {
    System.out.println("You cannot vote yet");
}

int number = 7;

if (number % 2 == 0) {
    System.out.println("Even number");
} else {
    System.out.println("Odd number");
}
```

### Password Validation

```java
String password = "secret123";
String input = "secret123";

if (password.equals(input)) {
    System.out.println("Access granted!");
} else {
    System.out.println("Access denied!");
}
```

## Else-If Chains

Handle multiple conditions sequentially.

### Syntax

```java
if (condition1) {
    // Code for condition1
} else if (condition2) {
    // Code for condition2
} else if (condition3) {
    // Code for condition3
} else {
    // Code if all conditions are false
}
```

### Grade Calculator

```java
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

System.out.println("Grade: " + grade);
```

### Temperature Advisory

```java
int temp = 32;

if (temp >= 30) {
    System.out.println("Hot! Stay hydrated.");
} else if (temp >= 20) {
    System.out.println("Pleasant weather.");
} else if (temp >= 10) {
    System.out.println("Cool. Bring a jacket.");
} else {
    System.out.println("Cold! Bundle up!");
}
```

### Ticket Pricing

```java
int age = 12;
double price;

if (age < 5) {
    price = 0.0;  // Free for young children
} else if (age < 13) {
    price = 5.0;  // Child price
} else if (age < 65) {
    price = 10.0;  // Adult price
} else {
    price = 7.0;  // Senior discount
}

System.out.printf("Ticket price: $%.2f%n", price);
```

## Nested If Statements

If statements inside other if statements for complex logic.

```java
int age = 20;
boolean hasLicense = true;

if (age >= 16) {
    if (hasLicense) {
        System.out.println("You can drive!");
    } else {
        System.out.println("You need a license first.");
    }
} else {
    System.out.println("You're too young to drive.");
}
```

### Login System

```java
String username = "admin";
String password = "admin123";
String inputUser = "admin";
String inputPass = "admin123";

if (username.equals(inputUser)) {
    if (password.equals(inputPass)) {
        System.out.println("Login successful!");
    } else {
        System.out.println("Incorrect password");
    }
} else {
    System.out.println("User not found");
}
```

### Discount Calculation

```java
double totalAmount = 150;
boolean isMember = true;
boolean hasPromoCode = true;
double discount = 0;

if (totalAmount >= 100) {
    discount = 0.10;  // 10% off for $100+
    
    if (isMember) {
        discount += 0.05;  // Additional 5% for members
    }
    
    if (hasPromoCode) {
        discount += 0.05;  // Additional 5% with promo code
    }
}

double finalAmount = totalAmount * (1 - discount);
System.out.printf("Original: $%.2f%n", totalAmount);
System.out.printf("Discount: %.0f%%%n", discount * 100);
System.out.printf("Final: $%.2f%n", finalAmount);
```

## Logical Operators in Conditions

Combine multiple conditions.

### AND Operator (&&)

Both conditions must be true.

```java
int age = 25;
boolean hasInsurance = true;

if (age >= 21 && hasInsurance) {
    System.out.println("Eligible to rent a car");
}
```

### OR Operator (||)

At least one condition must be true.

```java
boolean isWeekend = true;
boolean isHoliday = false;

if (isWeekend || isHoliday) {
    System.out.println("No work today!");
}
```

### NOT Operator (!)

Inverts the condition.

```java
boolean isRaining = false;

if (!isRaining) {
    System.out.println("Good day for a picnic!");
}
```

### Complex Conditions

```java
int age = 30;
double income = 50000;
boolean hasGoodCredit = true;

if ((age >= 21 && age <= 65) && income >= 30000 && hasGoodCredit) {
    System.out.println("Loan approved!");
} else {
    System.out.println("Loan denied");
}
```

## Complete Example: Number Analyzer

```java
import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if positive, negative, or zero
        if (number > 0) {
            System.out.println(number + " is positive");
            
            // Check if even or odd
            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
            
            // Check if divisible by 5
            if (number % 5 == 0) {
                System.out.println(number + " is divisible by 5");
            }
            
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println("The number is zero");
        }
        
        scanner.close();
    }
}
```

## Common Mistakes

### 1. Using = instead of ==

```java
int x = 5;

if (x = 10) {  // ERROR! Assignment, not comparison
    // Won't compile
}

if (x == 10) {  // CORRECT
    // ...
}
```

### 2. Semicolon after if

```java
if (age >= 18);  // WRONG! Semicolon terminates if
{
    System.out.println("Adult");  // Always executes!
}

if (age >= 18) {  // CORRECT
    System.out.println("Adult");
}
```

### 3. Comparing Strings with ==

```java
String s1 = "hello";
String s2 = "hello";

if (s1 == s2) {  // WRONG! Compares references
    // May not work as expected
}

if (s1.equals(s2)) {  // CORRECT
    // ...
}
```

### 4. Unnecessary nested ifs

```java
// Inefficient
if (score >= 90) {
    grade = 'A';
} else {
    if (score >= 80) {
        grade = 'B';
    }
}

// Better - use else-if
if (score >= 90) {
    grade = 'A';
} else if (score >= 80) {
    grade = 'B';
}
```

## Best Practices

### 1. Always use braces

```java
// Risky (can lead to bugs)
if (condition)
    statement1();
    statement2();  // Not part of if!

// Safe
if (condition) {
    statement1();
    statement2();
}
```

### 2. Keep conditions readable

```java
// Hard to read
if (a > 5 && b < 10 && c != 0 && (d == 1 || e == 2)) {
    // ...
}

// Better - use variables for clarity
boolean isValidRange = a > 5 && b < 10;
boolean hasValidValue = c != 0;
boolean meetsSpecialCondition = d == 1 || e == 2;

if (isValidRange && hasValidValue && meetsSpecialCondition) {
    // ...
}
```

### 3. Handle edge cases

```java
// Check for null before calling methods
String name = getName();

if (name != null && !name.isEmpty()) {
    System.out.println("Hello, " + name);
}
```

## Practice Exercises

### Exercise 1: Age Category

Write a program that categorizes age:
- 0-12: Child
- 13-19: Teenager
- 20-64: Adult
- 65+: Senior

### Exercise 2: BMI Calculator

Calculate Body Mass Index and categorize:
- BMI < 18.5: Underweight
- 18.5 ≤ BMI < 25: Normal
- 25 ≤ BMI < 30: Overweight
- BMI ≥ 30: Obese

### Exercise 3: Leap Year

Determine if a year is a leap year:
- Divisible by 4 AND
- (Not divisible by 100 OR divisible by 400)

## Summary

✓ `if` executes code when condition is true
✓ `if-else` chooses between two alternatives
✓ `else-if` chains handle multiple conditions
✓ Nested ifs create complex decision trees
✓ Logical operators (&&, ||, !) combine conditions
✓ Always use `.equals()` for String comparison
✓ Use braces for all if statements
✓ Keep conditions readable with descriptive variable names

## What's Next?

**[Next: Switch Statements →](02-switch-statements.md)**

---

[← Back to Module 2](README.md) | [Next: Switch Statements →](02-switch-statements.md)

# Method Basics

Methods are reusable blocks of code that perform specific tasks. They help organize code, reduce repetition, and make programs easier to maintain and understand.

## 🎯 Learning Objectives

- Understand what methods are and why they're important
- Define methods with proper syntax
- Call methods from other parts of code
- Use parameters to pass data into methods
- Return values from methods
- Work with void methods

## What is a Method?

A **method** is a named block of code that performs a specific task. Think of it as a mini-program within your program.

### Real-World Analogy

Think of a **coffee machine**:
- **Input**: Coffee beans, water (parameters)
- **Process**: Grind, brew, heat (method body)
- **Output**: Hot coffee (return value)

```java
// Method is like a coffee machine
public static String makeCoffee(String beans, int water) {
    // Grind beans, heat water, brew...
    return "Hot " + beans + " coffee";
}
```

## Why Use Methods?

### 1. Code Reusability

Write once, use many times:

```java
// Without methods - repetitive!
System.out.println("================");
System.out.println("   Welcome!     ");
System.out.println("================");

// Later...
System.out.println("================");
System.out.println("   Welcome!     ");
System.out.println("================");

// With method - reusable!
public static void printBanner() {
    System.out.println("================");
    System.out.println("   Welcome!     ");
    System.out.println("================");
}

// Usage
printBanner();  // Call once
printBanner();  // Call again
```

### 2. Organization

Break complex problems into smaller, manageable pieces:

```java
public static void main(String[] args) {
    initialize();
    processInput();
    displayResults();
    cleanup();
}
```

### 3. Maintainability

Change code in one place:

```java
// Need to change tax rate? Just update the method!
public static double calculateTax(double amount) {
    return amount * 0.08;  // 8% tax
}
```

### 4. Abstraction

Hide complex details:

```java
// User doesn't need to know how password is validated
if (isValidPassword(password)) {
    // Allow login
}
```

## Method Syntax

```java
accessModifier static returnType methodName(parameters) {
    // Method body
    return value;  // If returnType is not void
}
```

**Parts:**
- **accessModifier**: `public`, `private`, etc.
- **static**: Makes method belong to the class (for now, always use it)
- **returnType**: Type of value returned (`int`, `String`, `void`, etc.)
- **methodName**: Descriptive name (camelCase)
- **parameters**: Input values (optional)
- **return**: Sends value back to caller (required unless void)

## Simple Method Examples

### Method with No Parameters, No Return

```java
public static void sayHello() {
    System.out.println("Hello, World!");
}

// Usage
sayHello();  // Output: Hello, World!
```

### Method with No Parameters, Returns Value

```java
public static int getRandomNumber() {
    return 42;
}

// Usage
int num = getRandomNumber();
System.out.println(num);  // 42
```

### Method with Parameters, No Return

```java
public static void greet(String name) {
    System.out.println("Hello, " + name + "!");
}

// Usage
greet("Alice");   // Hello, Alice!
greet("Bob");     // Hello, Bob!
```

### Method with Parameters and Return

```java
public static int add(int a, int b) {
    return a + b;
}

// Usage
int sum = add(5, 3);
System.out.println(sum);  // 8
```

## Parameters vs Arguments

- **Parameters**: Variables in method definition
- **Arguments**: Actual values passed when calling

```java
public static void printAge(int age) {  // 'age' is parameter
    System.out.println("Age: " + age);
}

printAge(25);  // 25 is argument
```

## Return Statement

The `return` statement:
1. Sends a value back to the caller
2. Immediately exits the method

```java
public static int getMax(int a, int b) {
    if (a > b) {
        return a;  // Returns and exits
    }
    return b;
}
```

### Multiple Return Statements

```java
public static String getGrade(int score) {
    if (score >= 90) return "A";
    if (score >= 80) return "B";
    if (score >= 70) return "C";
    if (score >= 60) return "D";
    return "F";
}
```

### Return in Void Methods

```java
public static void checkAge(int age) {
    if (age < 0) {
        System.out.println("Invalid age");
        return;  // Exit early (no value)
    }
    System.out.println("Valid age: " + age);
}
```

## Void Methods

Methods that don't return a value use `void` as return type.

```java
public static void displayMenu() {
    System.out.println("1. Start");
    System.out.println("2. Options");
    System.out.println("3. Exit");
}

public static void printLine(int length) {
    for (int i = 0; i < length; i++) {
        System.out.print("-");
    }
    System.out.println();
}
```

## Method Naming Conventions

### Rules
1. Start with lowercase letter
2. Use camelCase
3. Use descriptive names (verbs for actions)
4. Avoid abbreviations

### Good Names

```java
calculateTotal()
getUserInput()
isValidEmail()
printReport()
findMaxValue()
```

### Bad Names

```java
calc()        // Too abbreviated
DoStuff()     // Starts with capital
method1()     // Not descriptive
x()           // Meaningless
```

## Complete Examples

### Temperature Converter

```java
public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 25.0;
        
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("%.1f°C = %.1f°F%n", celsius, fahrenheit);
        
        double kelvin = celsiusToKelvin(celsius);
        System.out.printf("%.1f°C = %.1fK%n", celsius, kelvin);
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
```

### Circle Calculator

```java
public class CircleCalculator {
    public static void main(String[] args) {
        double radius = 5.0;
        
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);
        
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);
    }
    
    public static double calculateArea(double radius) {
        final double PI = 3.14159265359;
        return PI * radius * radius;
    }
    
    public static double calculateCircumference(double radius) {
        final double PI = 3.14159265359;
        return 2 * PI * radius;
    }
}
```

### Banking System

```java
public class BankingSystem {
    public static void main(String[] args) {
        double balance = 1000.0;
        
        printBalance(balance);
        
        balance = deposit(balance, 500.0);
        printBalance(balance);
        
        balance = withdraw(balance, 200.0);
        printBalance(balance);
    }
    
    public static double deposit(double currentBalance, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return currentBalance;
        }
        System.out.printf("Depositing: $%.2f%n", amount);
        return currentBalance + amount;
    }
    
    public static double withdraw(double currentBalance, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return currentBalance;
        }
        if (amount > currentBalance) {
            System.out.println("Insufficient funds");
            return currentBalance;
        }
        System.out.printf("Withdrawing: $%.2f%n", amount);
        return currentBalance - amount;
    }
    
    public static void printBalance(double balance) {
        System.out.printf("Current balance: $%.2f%n", balance);
    }
}
```

## Method Calling Flow

```java
public static void main(String[] args) {
    System.out.println("Start");
    
    greet();  // Call greet method
    
    System.out.println("End");
}

public static void greet() {
    System.out.println("Hello!");
}

// Output:
// Start
// Hello!
// End
```

### With Return Values

```java
public static void main(String[] args) {
    int x = 5;
    int y = 3;
    
    int result = multiply(x, y);  // Calls multiply
    System.out.println("Result: " + result);
}

public static int multiply(int a, int b) {
    return a * b;  // Returns to caller
}

// Output: Result: 15
```

## Common Patterns

### Validator Methods

```java
public static boolean isValidEmail(String email) {
    return email.contains("@") && email.contains(".");
}

public static boolean isPositive(int number) {
    return number > 0;
}

public static boolean isInRange(int value, int min, int max) {
    return value >= min && value <= max;
}
```

### Utility Methods

```java
public static int getMax(int a, int b) {
    return (a > b) ? a : b;
}

public static int getMin(int a, int b) {
    return (a < b) ? a : b;
}

public static boolean isEven(int number) {
    return number % 2 == 0;
}
```

### Calculation Methods

```java
public static double calculateDiscount(double price, double percentage) {
    return price * (percentage / 100.0);
}

public static double calculateTax(double amount, double rate) {
    return amount * rate;
}

public static double calculateTotal(double subtotal, double tax, double discount) {
    return subtotal + tax - discount;
}
```

## Common Mistakes

### 1. Forgetting to Return

```java
// WRONG
public static int getSum(int a, int b) {
    int sum = a + b;
    // Missing return!
}

// CORRECT
public static int getSum(int a, int b) {
    int sum = a + b;
    return sum;
}
```

### 2. Wrong Return Type

```java
// WRONG - returns int but declared as String
public static String getAge() {
    return 25;  // Compilation error!
}

// CORRECT
public static int getAge() {
    return 25;
}
```

### 3. Using Return Value of Void Method

```java
public static void printMessage() {
    System.out.println("Hello");
}

// WRONG
String message = printMessage();  // Error! void returns nothing

// CORRECT
printMessage();  // Just call it
```

### 4. Not Calling the Method

```java
// WRONG - defines but never calls
public static void main(String[] args) {
    // Method defined but not called!
}

public static void greet() {
    System.out.println("Hello");
}

// CORRECT
public static void main(String[] args) {
    greet();  // Call the method
}
```

## Practice Exercises

### Exercise 1: Math Utilities

Create methods for:
- `square(int n)` - return n²
- `cube(int n)` - return n³
- `isPrime(int n)` - return true if prime

### Exercise 2: String Utilities

Create methods for:
- `reverse(String s)` - return reversed string
- `countVowels(String s)` - return count of vowels
- `isPalindrome(String s)` - return true if palindrome

### Exercise 3: Grade Calculator

Create methods for:
- `calculateAverage(int[] scores)` - return average
- `getLetterGrade(double score)` - return letter grade
- `getHighestScore(int[] scores)` - return highest score

## Summary

✓ Methods are reusable blocks of code
✓ Methods organize code and reduce repetition
✓ Syntax: `public static returnType name(parameters)`
✓ Parameters pass data into methods
✓ `return` sends values back to caller
✓ `void` methods don't return values
✓ Use descriptive names in camelCase
✓ Methods make code more maintainable

## What's Next?

**[Next: Method Overloading →](02-method-overloading.md)**

---

[← Back to Module 3](README.md) | [Next: Method Overloading →](02-method-overloading.md)

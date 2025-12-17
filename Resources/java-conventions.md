# Java Naming Conventions and Style Guide

Professional Java code follows established conventions. This guide is based on Oracle's Code Conventions and Google Java Style Guide.

## 🎯 Why Conventions Matter

- **Readability**: 80% of lifetime cost is maintenance
- **Collaboration**: Team members can read each other's code
- **Professionalism**: Shows you're a serious developer
- **Industry Standard**: What employers expect

## Naming Conventions

### Classes and Interfaces

**PascalCase** - Each word starts with capital letter

```java
// Classes
public class Student { }
public class BankAccount { }
public class TemperatureConverter { }

// Interfaces
public interface Drawable { }
public interface Comparable { }
```

**Rules:**
- Nouns or noun phrases
- Descriptive and specific
- Avoid abbreviations (unless well-known like URL, HTML)

### Methods

**camelCase** - First word lowercase, subsequent words capitalized

```java
public void calculateTotal() { }
public int getUserAge() { }
public boolean isValid() { }
public void setName(String name) { }
```

**Rules:**
- Verbs or verb phrases
- Getters: `getFieldName()`
- Setters: `setFieldName(value)`
- Boolean methods: `isCondition()`, `hasProperty()`, `canDoAction()`

### Variables

**camelCase** - Same as methods

```java
int studentAge;
double totalPrice;
String firstName;
boolean isActive;
```

**Rules:**
- Descriptive, not too short
- Avoid single letters (except loop counters)
- No underscores (unless constants)

### Constants

**UPPER_SNAKE_CASE** - All capitals with underscores

```java
public static final double PI = 3.14159;
public static final int MAX_STUDENTS = 30;
public static final String DEFAULT_NAME = "Unknown";
```

**Rules:**
- Must be `static final`
- All uppercase
- Words separated by underscores

### Packages

**lowercase** - All lowercase, no underscores

```java
package com.company.project.module;
package org.example.utilities;
```

**Rules:**
- Reverse domain name (com.company)
- All lowercase
- Separate with dots

## Code Layout

### Indentation

Use **4 spaces** (not tabs)

```java
public class Example {
    public void method() {
        if (condition) {
            // code
        }
    }
}
```

### Braces

**K&R Style** - Opening brace on same line

```java
// Correct
if (condition) {
    // code
}

// Wrong
if (condition)
{
    // code
}
```

### Line Length

**Maximum 100-120 characters** per line

```java
// Too long - break it up
String message = "This is a very long string that exceeds the recommended line length and should be broken up";

// Better
String message = "This is a very long string that exceeds the " +
                 "recommended line length and should be broken up";
```

### Whitespace

```java
// Spaces after commas
method(arg1, arg2, arg3);

// Spaces around operators
int result = a + b * c;

// No space before parentheses in method calls
myMethod(arg);

// Space after keywords
if (condition) { }
for (int i = 0; i < 10; i++) { }
```

### Blank Lines

```java
public class Example {
    // One blank line between methods
    public void method1() {
        // code
    }
                      // ← One blank line
    public void method2() {
        // code
    }
}
```

## Comments

### Single-Line Comments

```java
// Calculate total price
double total = price * quantity;

// Avoid obvious comments
int age = 25;  // set age to 25  ← Don't do this!
```

### Multi-Line Comments

```java
/*
 * This method calculates the total price
 * including tax and discount.
 */
```

### JavaDoc Comments

```java
/**
 * Calculates the total price with tax.
 * 
 * @param price The base price
 * @param taxRate The tax rate (e.g., 0.08 for 8%)
 * @return The total price including tax
 */
public double calculateWithTax(double price, double taxRate) {
    return price * (1 + taxRate);
}
```

## Class Structure

**Order of members:**

```java
public class Example {
    // 1. Static constants
    public static final int MAX_VALUE = 100;
    
    // 2. Static variables
    private static int count = 0;
    
    // 3. Instance variables
    private String name;
    private int age;
    
    // 4. Constructors
    public Example() { }
    public Example(String name) { }
    
    // 5. Public methods
    public void publicMethod() { }
    
    // 6. Protected methods
    protected void protectedMethod() { }
    
    // 7. Private methods
    private void privateMethod() { }
    
    // 8. Getters and setters (at end)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
```

## Best Practices

### 1. Use Meaningful Names

```java
// Bad
int d; // days
String s;

// Good
int daysSinceCreation;
String studentName;
```

### 2. Keep Methods Short

- One method = one responsibility
- Ideally 10-30 lines
- If longer than 50 lines, consider breaking up

### 3. Avoid Magic Numbers

```java
// Bad
if (age > 18) { }

// Good
final int ADULT_AGE = 18;
if (age > ADULT_AGE) { }
```

### 4. Use Access Modifiers Properly

```java
// Fields should be private
private int age;

// Methods should be public (if part of API)
public int getAge() { return age; }

// Helper methods should be private
private void validateAge(int age) { }
```

### 5. Initialize Variables

```java
// Bad
int count;
// ... might use count without initializing

// Good
int count = 0;
```

### 6. Use StringBuilder for String Building

```java
// Bad - creates many String objects
String result = "";
for (int i = 0; i < 1000; i++) {
    result += i;
}

// Good - more efficient
StringBuilder result = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    result.append(i);
}
```

### 7. Compare Objects Correctly

```java
// Wrong
if (str1 == str2) { }

// Right
if (str1.equals(str2)) { }

// Even better (null-safe)
if (Objects.equals(str1, str2)) { }
```

### 8. Always Override toString()

```java
public class Student {
    private String name;
    private int age;
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
```

## Common Mistakes to Avoid

### 1. Hungarian Notation (Don't use!)

```java
// Wrong (old C style)
String strName;
int iAge;

// Right (Java style)
String name;
int age;
```

### 2. Prefixes (Don't use!)

```java
// Wrong
private String mName;  // m for member
private int _age;      // underscore prefix

// Right
private String name;
private int age;
```

### 3. All Caps (Except constants)

```java
// Wrong
class MYCLASS { }
void MYMETHOD() { }

// Right
class MyClass { }
void myMethod() { }
```

## Example: Well-Formatted Class

```java
package com.example.school;

/**
 * Represents a student in the school system.
 * 
 * @author Your Name
 * @version 1.0
 */
public class Student {
    // Constants
    public static final int MIN_AGE = 5;
    public static final int MAX_AGE = 18;
    
    // Instance variables
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    
    /**
     * Creates a new Student.
     * 
     * @param firstName Student's first name
     * @param lastName Student's last name
     * @param age Student's age
     */
    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAge(age);  // Use setter for validation
        this.gpa = 0.0;
    }
    
    /**
     * Displays student information.
     */
    public void displayInfo() {
        System.out.printf("%s %s, Age: %d, GPA: %.2f%n", 
            firstName, lastName, age, gpa);
    }
    
    /**
     * Checks if student is honor roll.
     * 
     * @return true if GPA >= 3.5
     */
    public boolean isHonorRoll() {
        return gpa >= 3.5;
    }
    
    // Getters
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    // Setters with validation
    public void setAge(int age) {
        if (age < MIN_AGE || age > MAX_AGE) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }
    
    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be 0.0-4.0");
        }
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {
        return String.format("Student{%s %s, age=%d, gpa=%.2f}",
            firstName, lastName, age, gpa);
    }
}
```

## Tools for Enforcing Style

### IDE Settings
- IntelliJ IDEA: Built-in formatter (Ctrl+Alt+L)
- VS Code: Java formatting extensions
- Eclipse: Built-in formatter

### Checkstyle
Static analysis tool that enforces coding standards

### SpotBugs/FindBugs
Finds potential bugs in code

### PMD
Source code analyzer for common issues

## Summary

✓ Classes/Interfaces: PascalCase
✓ Methods/Variables: camelCase
✓ Constants: UPPER_SNAKE_CASE
✓ Packages: lowercase
✓ Indent with 4 spaces
✓ Opening brace on same line
✓ Max 100-120 characters per line
✓ Use meaningful names
✓ Keep methods short
✓ Write JavaDoc for public API

**Remember**: Consistency is more important than perfection. Pick a style and stick with it throughout your project.

---

[← Back to Resources](README.md)

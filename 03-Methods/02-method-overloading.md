# Method Overloading

Method overloading allows you to create multiple methods with the same name but different parameters. Java determines which method to call based on the arguments provided.

## 🎯 Learning Objectives

- Understand what method overloading is
- Create overloaded methods with different parameters
- Know the rules for method overloading
- Use overloading to create flexible APIs
- Understand method signatures

## What is Method Overloading?

**Method overloading** means having multiple methods with the **same name** but **different parameter lists** in the same class.

### Real-World Analogy

Think of a **printer**:
- `print(document)` - prints a document
- `print(document, copies)` - prints multiple copies
- `print(document, copies, color)` - prints in color

Same action (print), different options!

## Basic Overloading

### Different Number of Parameters

```java
public class Calculator {
    // Add two numbers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Add three numbers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Add four numbers
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    public static void main(String[] args) {
        System.out.println(add(5, 3));           // 8
        System.out.println(add(5, 3, 2));        // 10
        System.out.println(add(5, 3, 2, 1));     // 11
    }
}
```

### Different Parameter Types

```java
public class Printer {
    // Print integer
    public static void print(int value) {
        System.out.println("Integer: " + value);
    }
    
    // Print double
    public static void print(double value) {
        System.out.println("Double: " + value);
    }
    
    // Print String
    public static void print(String value) {
        System.out.println("String: " + value);
    }
    
    public static void main(String[] args) {
        print(42);          // Integer: 42
        print(3.14);        // Double: 3.14
        print("Hello");     // String: Hello
    }
}
```

### Different Parameter Order

```java
public class Display {
    public static void show(String text, int number) {
        System.out.println(text + ": " + number);
    }
    
    public static void show(int number, String text) {
        System.out.println(number + " - " + text);
    }
    
    public static void main(String[] args) {
        show("Score", 100);    // Score: 100
        show(100, "Score");    // 100 - Score
    }
}
```

## Rules for Method Overloading

### ✅ Valid Overloading

Methods must differ in:
1. **Number of parameters**
2. **Type of parameters**
3. **Order of parameter types**

```java
// Valid overloading
public static void method(int a) { }
public static void method(int a, int b) { }          // Different count
public static void method(double a) { }              // Different type
public static void method(String a, int b) { }       // Different types
public static void method(int a, String b) { }       // Different order
```

### ❌ Invalid Overloading

These do NOT count for overloading:
- Different return types
- Different parameter names
- Different access modifiers

```java
// INVALID - same signature!
public static int method(int a) { return a; }
public static double method(int a) { return a; }  // ERROR! Only return type differs

// INVALID - same signature!
public static void method(int x) { }
public static void method(int y) { }  // ERROR! Only parameter name differs
```

## Method Signature

The **method signature** consists of:
- Method name
- Parameter types (number, types, order)

```java
// Different signatures
calculateArea(double radius)              // Signature 1
calculateArea(double width, double height) // Signature 2
calculateArea(int side)                   // Signature 3
```

## Practical Examples

### Area Calculator

```java
public class AreaCalculator {
    // Rectangle area
    public static double calculateArea(double length, double width) {
        System.out.println("Calculating rectangle area");
        return length * width;
    }
    
    // Circle area
    public static double calculateArea(double radius) {
        System.out.println("Calculating circle area");
        return Math.PI * radius * radius;
    }
    
    // Square area (uses int)
    public static int calculateArea(int side) {
        System.out.println("Calculating square area");
        return side * side;
    }
    
    public static void main(String[] args) {
        System.out.printf("Rectangle: %.2f%n", calculateArea(5.0, 3.0));
        System.out.printf("Circle: %.2f%n", calculateArea(4.0));
        System.out.printf("Square: %d%n", calculateArea(5));
    }
}
```

### Greeting System

```java
public class Greeter {
    // Simple greeting
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    // Greeting with time of day
    public static void greet(String name, String timeOfDay) {
        System.out.println("Good " + timeOfDay + ", " + name + "!");
    }
    
    // Formal greeting
    public static void greet(String title, String firstName, String lastName) {
        System.out.println("Hello, " + title + " " + firstName + " " + lastName);
    }
    
    public static void main(String[] args) {
        greet("Alice");                           // Hello, Alice!
        greet("Bob", "morning");                  // Good morning, Bob!
        greet("Dr.", "Jane", "Smith");           // Hello, Dr. Jane Smith
    }
}
```

### Distance Calculator

```java
public class DistanceCalculator {
    // Distance in 1D
    public static double distance(double x1, double x2) {
        return Math.abs(x2 - x1);
    }
    
    // Distance in 2D
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    // Distance in 3D
    public static double distance(double x1, double y1, double z1, 
                                   double x2, double y2, double z2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dz = z2 - z1;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
    
    public static void main(String[] args) {
        System.out.printf("1D: %.2f%n", distance(0, 5));
        System.out.printf("2D: %.2f%n", distance(0, 0, 3, 4));
        System.out.printf("3D: %.2f%n", distance(0, 0, 0, 1, 1, 1));
    }
}
```

## Default Parameters Alternative

Java doesn't have default parameters like some languages, but overloading provides similar functionality:

```java
public class SearchEngine {
    // Search with default values
    public static void search(String query) {
        search(query, 10);  // Default: 10 results
    }
    
    public static void search(String query, int maxResults) {
        search(query, maxResults, "relevance");  // Default: sort by relevance
    }
    
    public static void search(String query, int maxResults, String sortBy) {
        System.out.printf("Searching '%s', max %d results, sorted by %s%n",
                          query, maxResults, sortBy);
    }
    
    public static void main(String[] args) {
        search("Java");                              // Uses defaults
        search("Java", 20);                          // Custom max results
        search("Java", 20, "date");                 // Full customization
    }
}
```

## Overloading with Arrays

```java
public class ArrayUtils {
    // Sum of 2 elements
    public static int sum(int a, int b) {
        return a + b;
    }
    
    // Sum of 3 elements
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    // Sum of array (any number of elements)
    public static int sum(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(5, 3));                    // 8
        System.out.println(sum(5, 3, 2));                 // 10
        System.out.println(sum(new int[]{5, 3, 2, 1}));  // 11
    }
}
```

## Constructor Overloading Preview

Overloading is also used with constructors (covered in OOP module):

```java
public class Student {
    String name;
    int age;
    double gpa;
    
    // Constructor 1: Name only
    public Student(String name) {
        this.name = name;
        this.age = 18;      // Default
        this.gpa = 0.0;     // Default
    }
    
    // Constructor 2: Name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.gpa = 0.0;     // Default
    }
    
    // Constructor 3: All fields
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
}
```

## Method Resolution

Java chooses the most specific matching method:

```java
public class Resolution {
    public static void test(int x) {
        System.out.println("int version");
    }
    
    public static void test(double x) {
        System.out.println("double version");
    }
    
    public static void test(Integer x) {
        System.out.println("Integer version");
    }
    
    public static void main(String[] args) {
        test(5);           // int version (exact match)
        test(5.0);         // double version (exact match)
        test(Integer.valueOf(5));  // Integer version (exact match)
        
        byte b = 5;
        test(b);           // int version (byte promoted to int)
    }
}
```

## Common Patterns

### Builder Pattern with Overloading

```java
public class EmailBuilder {
    public static void sendEmail(String recipient, String subject, String body) {
        System.out.printf("To: %s%nSubject: %s%nBody: %s%n", 
                         recipient, subject, body);
    }
    
    public static void sendEmail(String recipient, String subject, 
                                  String body, String attachment) {
        sendEmail(recipient, subject, body);
        System.out.println("Attachment: " + attachment);
    }
    
    public static void sendEmail(String recipient, String subject, 
                                  String body, String[] attachments) {
        sendEmail(recipient, subject, body);
        System.out.println("Attachments: " + attachments.length + " files");
    }
}
```

### Conversion Utilities

```java
public class Converter {
    // String to int with default
    public static int toInt(String str) {
        return toInt(str, 0);  // Default: 0
    }
    
    public static int toInt(String str, int defaultValue) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }
}
```

## Benefits of Overloading

1. **Flexibility**: Same operation, different inputs
2. **Readability**: Same name for related operations
3. **Ease of Use**: Fewer names to remember
4. **Default Values**: Simulate default parameters

## Common Mistakes

### 1. Ambiguous Overloading

```java
// Ambiguous!
public static void process(int a, double b) { }
public static void process(double a, int b) { }

// Calling with (int, int) is ambiguous:
// process(5, 10);  // Which method? Both could work!
```

### 2. Relying Only on Return Type

```java
// INVALID - won't compile
public static int getValue() { return 1; }
public static double getValue() { return 1.0; }  // ERROR!
```

### 3. Overcomplicating

```java
// Too many overloads can be confusing
public static void method(int a) { }
public static void method(int a, int b) { }
public static void method(int a, int b, int c) { }
public static void method(int a, int b, int c, int d) { }
// Consider using an array or varargs instead!
```

## Practice Exercises

### Exercise 1: Max Finder

Create overloaded `max()` methods to find maximum of:
- Two integers
- Three integers  
- An array of integers

### Exercise 2: Display Utilities

Create overloaded `display()` methods to print:
- Single integer
- Array of integers (horizontally)
- 2D array of integers (as matrix)

### Exercise 3: Temperature Converter

Create overloaded `convert()` methods:
- `convert(double celsius)` - to Fahrenheit
- `convert(double value, String from, String to)` - between any units

## Summary

✓ Method overloading: Same name, different parameters
✓ Must differ in number, type, or order of parameters
✓ Return type alone doesn't make methods different
✓ Java picks the most specific matching method
✓ Useful for providing multiple ways to call a method
✓ Simulates default parameters
✓ Makes APIs more flexible and user-friendly

## What's Next?

**[Next: Variable Scope →](03-variable-scope.md)**

---

[← Back to Method Basics](01-method-basics.md) | [Next: Variable Scope →](03-variable-scope.md)

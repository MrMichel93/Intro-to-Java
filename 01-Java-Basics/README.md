# Module 1: Java Basics

Welcome to Module 1! Now that you have Java set up and understand Hello World, it's time to learn the fundamental building blocks of Java programming.

## 🎯 Learning Objectives

By the end of this module, you will be able to:
- Declare and use variables of different data types
- Perform calculations using arithmetic operators
- Compare values using comparison operators
- Combine conditions using logical operators
- Read user input from the console
- Work with and manipulate strings
- Write programs that interact with users

## 📚 Module Contents

### 1. [Variables and Data Types](01-variables-and-data-types.md)
Learn to store and work with different types of data
- [Primitive Types](primitive-types.md) - int, double, boolean, char, byte, short, long, float
- [Type Conversion](type-conversion.md) - Casting and automatic conversion
- [Constants](constants.md) - Using the final keyword

### 2. [Operators](02-operators.md)
Perform operations on data
- [Arithmetic Operators](arithmetic-operators.md) - +, -, *, /, %, ++, --
- [Comparison Operators](comparison-operators.md) - ==, !=, <, >, <=, >=
- [Logical Operators](logical-operators.md) - &&, ||, !
- [Assignment Operators](assignment-operators.md) - =, +=, -=, *=, /=, %=

### 3. [Input and Output](03-input-output.md)
Interact with users
- [Scanner Class](scanner-class.md) - Reading user input
- [Printf Formatting](printf-formatting.md) - Formatted output
- [System.out](system-out.md) - print vs println

### 4. [Strings](04-strings.md)
Work with text
- [String Basics](string-basics.md) - Creation and immutability
- [String Methods](string-methods.md) - length, charAt, substring, indexOf, etc.
- [String Comparison](string-comparison.md) - equals, equalsIgnoreCase, compareTo
- [String Concatenation](string-concatenation.md) - Joining strings

## 💻 Code Examples

Check the [examples/](examples/) folder for complete, runnable programs:
- **Calculator.java** - Basic arithmetic calculator
- **TemperatureConverter.java** - Celsius to Fahrenheit converter
- **NameFormatter.java** - String manipulation demo
- **UserInputExample.java** - Interactive program with Scanner

## 📝 Exercises

Practice what you've learned in the [exercises/](exercises/) folder:
1. **Exercise 1: Variables** - Practice declaring and using variables
2. **Exercise 2: Calculator** - Build a simple calculator
3. **Exercise 3: Mad Libs** - String manipulation game

Solutions are in [exercises/solutions/](exercises/solutions/)

## 🎯 Why This Module Matters

Variables and data types are the foundation of all programming. Every program stores and manipulates data - whether it's numbers, text, or true/false values. Understanding these basics is essential for:

- **Building any application** - All programs work with data
- **Problem solving** - You need to represent real-world information in code
- **Communication** - Input/output lets programs interact with users
- **Future concepts** - Everything builds on these fundamentals

### Real-World Applications

- **Banking apps**: Store account balances (doubles), account numbers (ints), names (Strings)
- **Games**: Track scores (ints), player health (doubles), game state (booleans)
- **Social media**: Store usernames (Strings), post counts (ints), timestamps (longs)
- **E-commerce**: Product prices (doubles), quantities (ints), descriptions (Strings)

## 📊 Module Roadmap

```
Variables & Types → Operators → Input/Output → Strings
      ↓               ↓            ↓             ↓
   Store data    Calculate    Interact      Process text
```

## 🎓 Coming from Other Languages?

### From Python
```python
# Python - dynamic typing
age = 25
name = "Alice"
price = 19.99
```

```java
// Java - static typing (must declare types)
int age = 25;
String name = "Alice";
double price = 19.99;
```

### From JavaScript
```javascript
// JavaScript - dynamic typing
let age = 25;
const name = "Alice";
var price = 19.99;
```

```java
// Java - static typing
int age = 25;
final String name = "Alice";  // final = const
double price = 19.99;
```

## ⚡ Quick Start Example

Here's a taste of what you'll learn:

```java
import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get user's name
        System.out.print("What's your name? ");
        String name = input.nextLine();
        
        // Get user's age
        System.out.print("How old are you? ");
        int age = input.nextInt();
        
        // Calculate birth year (approximately)
        int currentYear = 2024;
        int birthYear = currentYear - age;
        
        // Display personalized greeting
        System.out.println("\nHello, " + name + "!");
        System.out.println("You were born around " + birthYear + ".");
        
        // Check if adult
        if (age >= 18) {
            System.out.println("You're an adult!");
        } else {
            System.out.println("You're a minor.");
        }
        
        input.close();
    }
}
```

## 📋 Self-Check Questions

Before starting this module, test your readiness:

1. Can you compile and run a Hello World program?
2. Do you understand what a class is?
3. Can you find and fix compilation errors?

If you answered "no" to any, review [Module 0: Getting Started](../00-Getting-Started/README.md).

## 💡 Learning Tips for This Module

1. **Type everything yourself** - Don't copy-paste. Muscle memory matters.
2. **Experiment constantly** - Change values, try different operators
3. **Predict output** - Before running, guess what will print
4. **Break things intentionally** - See what error messages say
5. **Name variables meaningfully** - `age` is better than `x`

### Common Pitfalls to Avoid

- **Using = instead of ==** for comparison
- **Integer division** giving unexpected results (7/2 = 3, not 3.5)
- **== for String comparison** (use .equals() instead!)
- **Forgetting semicolons** at the end of statements
- **Not closing Scanner** (causes resource leak)

## 🏃 Let's Begin!

Ready to dive in? Start with **[Lesson 1: Variables and Data Types →](01-variables-and-data-types.md)**

Or jump to a specific topic:
- [Primitive Types →](primitive-types.md)
- [Arithmetic Operators →](arithmetic-operators.md)
- [Scanner Class →](scanner-class.md)
- [String Basics →](string-basics.md)

## 📚 Additional Resources

- [Oracle Java Tutorials - Variables](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)
- [Java Data Types Reference](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [Scanner Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html)

## Estimated Time

⏱️ **8-10 hours** to complete all lessons, examples, and exercises

---

**Module Difficulty**: ★★☆☆☆

---

[← Back to Course Home](../README.md) | [Next: Variables & Data Types →](01-variables-and-data-types.md)

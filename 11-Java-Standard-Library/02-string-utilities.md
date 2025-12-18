# String Utilities

Advanced string manipulation techniques and utilities.

## 🎯 Learning Objectives

- Use StringBuilder for efficiency
- Format strings
- Use String methods effectively
- Handle string operations

## StringBuilder

Mutable alternative to String for efficient concatenation.

```java
StringBuilder sb = new StringBuilder();

sb.append("Hello");
sb.append(" ");
sb.append("World");

String result = sb.toString();  // "Hello World"
```

## String Formatting

```java
// printf style
String formatted = String.format("Name: %s, Age: %d", "Alice", 25);

// With numbers
String price = String.format("Price: $%.2f", 19.99);

// Multiple values
String info = String.format("%s scored %d points", "Bob", 95);
```

## String Methods Review

```java
String text = "Hello World";

// Length and access
int length = text.length();
char first = text.charAt(0);

// Case
String upper = text.toUpperCase();
String lower = text.toLowerCase();

// Trimming
String trimmed = "  hello  ".trim();

// Splitting
String[] words = text.split(" ");

// Replacing
String replaced = text.replace("World", "Java");

// Checking
boolean contains = text.contains("World");
boolean starts = text.startsWith("Hello");
boolean ends = text.endsWith("World");
```

## Summary

✓ StringBuilder for efficient string building
✓ String.format() for formatting
✓ Many useful String methods
✓ Strings are immutable

## What's Next?

**[Next: Date and Time →](03-date-time.md)**

---

[← Back to Math Class](01-math-class.md) | [Next: Date and Time →](03-date-time.md)

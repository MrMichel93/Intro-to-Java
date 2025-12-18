# Exception Basics

Exceptions are events that disrupt normal program flow. Proper exception handling makes programs robust and user-friendly.

## 🎯 Learning Objectives

- Understand what exceptions are
- Know the exception hierarchy
- Distinguish checked vs unchecked exceptions
- Handle runtime errors gracefully

## What are Exceptions?

**Exceptions** are errors that occur during program execution.

```java
int[] numbers = {1, 2, 3};
System.out.println(numbers[10]);  // ArrayIndexOutOfBoundsException!
```

## Exception Hierarchy

```
Throwable
├── Error (system errors - don't catch)
└── Exception
    ├── RuntimeException (unchecked)
    │   ├── NullPointerException
    │   ├── ArrayIndexOutOfBoundsException
    │   └── ArithmeticException
    └── IOException (checked)
        └── FileNotFoundException
```

## Common Exceptions

```java
// ArithmeticException
int result = 10 / 0;  // Division by zero

// NullPointerException
String text = null;
int length = text.length();  // null.length()

// ArrayIndexOutOfBoundsException
int[] arr = {1, 2, 3};
int value = arr[10];  // Index out of bounds

// NumberFormatException
int num = Integer.parseInt("abc");  // Not a number
```

## Checked vs Unchecked

**Unchecked (RuntimeException):**
- Compiler doesn't require handling
- Programming errors (bugs)
- Examples: NullPointer, ArrayIndexOutOfBounds

**Checked (Exception):**
- Compiler requires handling
- External factors (file not found, network issues)
- Examples: IOException, SQLException

## Summary

✓ Exceptions disrupt normal flow
✓ Hierarchy: Throwable → Exception → specific types
✓ Checked exceptions must be handled
✓ Unchecked exceptions are programming errors

## What's Next?

**[Next: Try-Catch-Finally →](02-try-catch-finally.md)**

---

[← Back to Module 8](README.md) | [Next: Try-Catch-Finally →](02-try-catch-finally.md)

# Throwing Exceptions

Learn to throw exceptions when errors occur in your code.

## 🎯 Learning Objectives

- Throw exceptions with `throw`
- Declare exceptions with `throws`
- Create meaningful error messages
- Know when to throw vs catch

## The `throw` Keyword

Manually throw an exception.

```java
public static void validateAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
    }
    if (age > 120) {
        throw new IllegalArgumentException("Age too high");
    }
}
```

## The `throws` Keyword

Declare that method may throw exception.

```java
public static void readFile(String filename) throws IOException {
    FileReader reader = new FileReader(filename);
    // File operations
}
```

## When to Throw Exceptions

Throw exceptions when:
✓ Invalid input is detected
✓ Preconditions are not met
✓ Operation cannot be completed
✓ Resource is unavailable

## Example: Validation

```java
public class BankAccount {
    private double balance;
    
    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds");
        }
        balance -= amount;
    }
}
```

## Summary

✓ Use `throw` to throw exceptions
✓ Use `throws` to declare exceptions
✓ Throw on invalid input or state
✓ Provide clear error messages

## What's Next?

**[Next: Custom Exceptions →](04-custom-exceptions.md)**

---

[← Back to Try-Catch-Finally](02-try-catch-finally.md) | [Next: Custom Exceptions →](04-custom-exceptions.md)

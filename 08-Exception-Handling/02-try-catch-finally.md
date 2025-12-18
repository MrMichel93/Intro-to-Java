# Try-Catch-Finally

Learn to handle exceptions gracefully using try-catch-finally blocks.

## 🎯 Learning Objectives

- Use try-catch blocks
- Handle multiple exceptions
- Use finally blocks
- Understand try-with-resources

## Basic Try-Catch

```java
try {
    int result = 10 / 0;  // May throw exception
} catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Multiple Catch Blocks

```java
try {
    int[] numbers = {1, 2, 3};
    System.out.println(numbers[10]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Index out of bounds");
} catch (Exception e) {
    System.out.println("Some other error");
}
```

## Finally Block

Always executes, regardless of exception.

```java
try {
    // Code that may throw exception
} catch (Exception e) {
    System.out.println("Error occurred");
} finally {
    System.out.println("Cleanup code");  // Always runs
}
```

## Try-With-Resources

Automatically closes resources.

```java
try (Scanner scanner = new Scanner(System.in)) {
    String input = scanner.nextLine();
}  // Scanner automatically closed
```

## Complete Example

```java
import java.util.Scanner;

public class SafeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Enter a number: ");
                int number = Integer.parseInt(scanner.nextLine());
                System.out.println("You entered: " + number);
                break;  // Success - exit loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again.");
            }
        }
        
        scanner.close();
    }
}
```

## Summary

✓ Try-catch handles exceptions
✓ Multiple catch blocks for different exceptions
✓ Finally always executes
✓ Try-with-resources for automatic cleanup

## What's Next?

**[Next: Throwing Exceptions →](03-throwing-exceptions.md)**

---

[← Back to Exception Basics](01-exception-basics.md) | [Next: Throwing Exceptions →](03-throwing-exceptions.md)

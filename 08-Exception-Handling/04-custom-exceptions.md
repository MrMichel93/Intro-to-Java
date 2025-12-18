# Custom Exceptions

Create your own exception classes for domain-specific errors.

## 🎯 Learning Objectives

- Create custom exception classes
- Extend Exception appropriately
- Use custom exceptions effectively
- Provide meaningful exception information

## Creating Custom Exceptions

```java
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
```

## Using Custom Exceptions

```java
public class BankAccount {
    private double balance;
    
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Cannot withdraw " + amount + ". Balance: " + balance
            );
        }
        balance -= amount;
    }
}

// Usage
try {
    account.withdraw(1000);
} catch (InsufficientFundsException e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Exception with Additional Data

```java
public class InvalidAgeException extends Exception {
    private int age;
    
    public InvalidAgeException(String message, int age) {
        super(message);
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
}
```

## Summary

✓ Extend Exception for custom exceptions
✓ Provide constructors with messages
✓ Use for domain-specific errors
✓ Include relevant data in exception

## What's Next?

You've completed Module 8! Practice with exercises, then move to:

**[Module 9: File I/O →](../09-File-IO/README.md)**

---

[← Back to Throwing Exceptions](03-throwing-exceptions.md) | [Next: Module 9 →](../09-File-IO/README.md)

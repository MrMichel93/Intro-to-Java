# Encapsulation

Encapsulation is the practice of hiding internal details and providing controlled access through public methods.

## 🎯 Learning Objectives

- Understand encapsulation principles
- Use access modifiers (private, public)
- Create getters and setters
- Implement data validation

## Access Modifiers

- **private**: Only accessible within the class
- **public**: Accessible from anywhere
- **protected**: Accessible in same package and subclasses
- **default** (no modifier): Accessible in same package

## Encapsulation Example

```java
public class BankAccount {
    private double balance;  // Private field
    
    public double getBalance() {  // Getter
        return balance;
    }
    
    public void deposit(double amount) {  // Controlled access
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
```

## Getters and Setters

```java
public class Person {
    private String name;
    private int age;
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name with validation
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }
    }
}
```

## Benefits of Encapsulation

✓ **Data Protection**: Fields cannot be modified directly
✓ **Validation**: Control what values are allowed
✓ **Flexibility**: Can change internal implementation
✓ **Maintainability**: Easier to modify and debug

## Summary

✓ Make fields private
✓ Provide public getters/setters
✓ Validate data in setters
✓ Encapsulation protects object integrity

## What's Next?

You've completed Module 5! Practice with exercises, then move to:

**[Module 6: OOP Advanced Concepts →](../06-OOP-Advanced-Concepts/README.md)**

---

[← Back to Constructors](03-constructors.md) | [Next: Module 6 →](../06-OOP-Advanced-Concepts/README.md)

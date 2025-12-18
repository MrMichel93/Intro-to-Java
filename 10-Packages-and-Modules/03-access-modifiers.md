# Access Modifiers

Control visibility of classes, methods, and variables.

## 🎯 Learning Objectives

- Understand access levels
- Use public, private, protected, default
- Apply encapsulation principles
- Control access across packages

## Access Modifiers

| Modifier | Class | Package | Subclass | World |
|----------|-------|---------|----------|-------|
| public | ✓ | ✓ | ✓ | ✓ |
| protected | ✓ | ✓ | ✓ | ✗ |
| default | ✓ | ✓ | ✗ | ✗ |
| private | ✓ | ✗ | ✗ | ✗ |

## Public

Accessible from anywhere.

```java
public class User {
    public String name;  // Accessible everywhere
    
    public void display() {  // Accessible everywhere
        System.out.println(name);
    }
}
```

## Private

Only accessible within the same class.

```java
public class BankAccount {
    private double balance;  // Only accessible in BankAccount
    
    public double getBalance() {  // Public getter
        return balance;
    }
}
```

## Protected

Accessible in same package and subclasses.

```java
public class Animal {
    protected String species;  // Accessible in subclasses
}

public class Dog extends Animal {
    void display() {
        System.out.println(species);  // OK - Dog is subclass
    }
}
```

## Default (Package-Private)

No modifier - accessible in same package only.

```java
class Helper {  // Package-private class
    int value;  // Package-private field
    
    void method() {  // Package-private method
    }
}
```

## Best Practices

✓ Make fields private
✓ Make methods public if needed by others
✓ Use protected for inheritance
✓ Default for package-internal classes

## Summary

✓ public: Everywhere
✓ private: Same class only
✓ protected: Same package + subclasses
✓ default: Same package only

## What's Next?

**[Next: Modules →](04-modules.md)**

---

[← Back to Imports](02-imports.md) | [Next: Modules →](04-modules.md)

# Interfaces

Interfaces define contracts that classes must follow. They specify what methods a class must implement without providing the implementation.

## 🎯 Learning Objectives

- Understand interfaces
- Implement interfaces
- Know when to use interfaces vs abstract classes
- Use multiple interfaces

## What is an Interface?

An **interface** is a contract that specifies what methods a class must have.

```java
public interface Drawable {
    void draw();  // Abstract by default
}

public class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
```

## Multiple Interfaces

A class can implement multiple interfaces.

```java
public interface Flyable {
    void fly();
}

public interface Swimmable {
    void swim();
}

public class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
    
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
```

## Interface vs Abstract Class

| Feature | Interface | Abstract Class |
|---------|-----------|----------------|
| Methods | Abstract (default) | Can be concrete or abstract |
| Variables | public static final only | Any type |
| Inheritance | Multiple interfaces | Single parent |
| Use Case | Contract/Capability | IS-A relationship |

## Summary

✓ Interfaces define contracts
✓ Use `interface` keyword
✓ Implement with `implements`
✓ Can implement multiple interfaces
✓ All methods public and abstract by default

## What's Next?

You've completed Module 6! Practice with exercises, then move to:

**[Module 7: ArrayLists and Collections →](../07-ArrayLists-and-Collections/README.md)**

---

[← Back to Abstract Classes](03-abstract-classes.md) | [Next: Module 7 →](../07-ArrayLists-and-Collections/README.md)

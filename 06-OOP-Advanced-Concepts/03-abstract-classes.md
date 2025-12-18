# Abstract Classes

Abstract classes are classes that cannot be instantiated and may contain abstract methods that must be implemented by subclasses.

## 🎯 Learning Objectives

- Understand abstract classes
- Create abstract methods
- Know when to use abstract classes
- Understand abstract vs concrete classes

## What is an Abstract Class?

An **abstract class** is a partially implemented class that serves as a template for subclasses.

```java
public abstract class Animal {
    String name;
    
    // Concrete method (has implementation)
    void eat() {
        System.out.println(name + " is eating");
    }
    
    // Abstract method (no implementation)
    abstract void makeSound();
}

public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

// Usage
// Animal animal = new Animal();  // ERROR! Cannot instantiate
Dog dog = new Dog();              // OK
dog.makeSound();                  // Woof!
```

## Abstract Methods

Methods without implementation that must be overridden.

```java
public abstract class Shape {
    abstract double getArea();
    abstract double getPerimeter();
    
    void display() {
        System.out.printf("Area: %.2f, Perimeter: %.2f%n", 
                          getArea(), getPerimeter());
    }
}

public class Circle extends Shape {
    double radius;
    
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
```

## When to Use Abstract Classes

Use abstract classes when:
✓ You want to share code among related classes
✓ Classes have some common behavior
✓ You want to declare non-public members
✓ You need instance variables (state)

## Summary

✓ Abstract classes cannot be instantiated
✓ Use `abstract` keyword
✓ Can have both abstract and concrete methods
✓ Subclasses must implement abstract methods
✓ Provide common behavior and structure

## What's Next?

**[Next: Interfaces →](04-interfaces.md)**

---

[← Back to Polymorphism](02-polymorphism.md) | [Next: Interfaces →](04-interfaces.md)

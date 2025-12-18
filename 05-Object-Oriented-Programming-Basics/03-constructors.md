# Constructors

Constructors are special methods that initialize objects when they're created.

## 🎯 Learning Objectives

- Understand what constructors are
- Create default and parameterized constructors
- Use constructor overloading
- Implement constructor chaining

## What is a Constructor?

A **constructor** is a special method that runs when an object is created.

```java
public class Student {
    String name;
    int age;
    
    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Usage
Student student = new Student("Alice", 20);
```

## Default Constructor

If you don't write a constructor, Java provides a default one.

```java
public class Book {
    String title;
    String author;
}

// Default constructor (implicit)
Book book = new Book();
```

## Parameterized Constructor

```java
public class Car {
    String brand;
    String model;
    int year;
    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}
```

## Constructor Overloading

Multiple constructors with different parameters.

```java
public class Rectangle {
    double length;
    double width;
    
    // Constructor 1: Default square
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    
    // Constructor 2: Square with size
    public Rectangle(double size) {
        this.length = size;
        this.width = size;
    }
    
    // Constructor 3: Rectangle with different dimensions
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
```

## Summary

✓ Constructors initialize objects
✓ Same name as class, no return type
✓ Can be overloaded
✓ Use `this` to refer to fields

## What's Next?

**[Next: Encapsulation →](04-encapsulation.md)**

---

[← Back to Fields and Methods](02-fields-and-methods.md) | [Next: Encapsulation →](04-encapsulation.md)

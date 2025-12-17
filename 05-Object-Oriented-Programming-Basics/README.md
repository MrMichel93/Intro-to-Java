# Module 5: Object-Oriented Programming Basics

Object-Oriented Programming (OOP) is a programming paradigm that organizes code around "objects" - representations of real-world entities. This is where Java truly shines!

## 🎯 Learning Objectives

- Understand the philosophy of Object-Oriented Programming
- Create classes to model real-world entities
- Instantiate and use objects
- Define instance variables and methods
- Write constructors to initialize objects
- Implement encapsulation with access modifiers
- Use getters and setters appropriately
- Understand the difference between static and instance members

## 📚 Module Contents

### 1. [Classes and Objects](01-classes-and-objects.md)
The foundation of OOP
- What is a class?
- What is an object?
- Creating classes
- Instantiating objects
- The `this` keyword

### 2. [Fields and Methods](02-fields-and-methods.md)
Data and behavior
- Instance variables (fields)
- Instance methods
- Static vs instance members
- The `static` keyword

### 3. [Constructors](03-constructors.md)
Initializing objects
- Default constructor
- Parameterized constructors
- Constructor overloading
- Constructor chaining

### 4. [Encapsulation](04-encapsulation.md)
Data hiding and protection
- Access modifiers (public, private, protected, package-private)
- Getters and setters
- Why encapsulation matters

## 💻 Code Examples

- **Student.java** - Basic class with fields and methods
- **BankAccount.java** - Encapsulation demonstration
- **Rectangle.java** - Constructors and calculations
- **Car.java** - Complete OOP example
- **Book.java** - Practical class design

## 📝 Exercises

1. **Person Class** - Create a person with name, age, and address
2. **Product Inventory** - Manage products with stock tracking
3. **Circle Class** - Calculate area and circumference

## Why OOP Matters

Before OOP, programmers organized code in procedures (functions). This worked for small programs but became unmanageable for large systems. OOP provides:

### Benefits of OOP

1. **Organization**: Code mimics real-world structures
2. **Reusability**: Write once, use many times
3. **Maintainability**: Changes are localized
4. **Abstraction**: Hide complexity, show only essentials
5. **Modularity**: Independent, interchangeable components

### Real-World Analogy

Think of a **Car**:
- **Class** = Blueprint for cars (design specifications)
- **Object** = Actual car (one instance of the blueprint)
- **Fields** = Properties (color, model, speed, fuel)
- **Methods** = Actions (accelerate, brake, turn)
- **Encapsulation** = You use the steering wheel (public interface), internal engine details are hidden (private)

```java
// Blueprint (Class)
class Car {
    private String color;
    private int speed;
    
    public void accelerate() {
        speed += 10;
    }
}

// Actual cars (Objects)
Car myCar = new Car();
Car yourCar = new Car();
```

## From Procedural to OOP

### Procedural Approach (What we've been doing)
```java
// Variables scattered around
String studentName = "Alice";
int studentAge = 20;
double studentGPA = 3.8;

// Functions operate on data
void printStudent(String name, int age, double gpa) {
    System.out.println(name + ", " + age + ", " + gpa);
}
```

### Object-Oriented Approach (Better!)
```java
class Student {
    private String name;
    private int age;
    private double gpa;
    
    public void print() {
        System.out.println(name + ", " + age + ", " + gpa);
    }
}

Student alice = new Student();
alice.print();  // Data and behavior together!
```

## Key OOP Concepts

### Classes

A **class** is a blueprint or template for creating objects.

```java
public class Dog {
    // Fields (data)
    String name;
    int age;
    
    // Methods (behavior)
    void bark() {
        System.out.println(name + " says: Woof!");
    }
}
```

### Objects

An **object** is an instance of a class - a specific realization of the blueprint.

```java
Dog myDog = new Dog();      // Create object
myDog.name = "Max";         // Set data
myDog.age = 3;
myDog.bark();               // Call method
```

### Encapsulation

Hide internal details and provide controlled access.

```java
public class BankAccount {
    private double balance;  // Private - cannot access directly
    
    public void deposit(double amount) {  // Public - controlled access
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public double getBalance() {
        return balance;
    }
}
```

## Class Design Principles

### Good Class Design
- **Single Responsibility**: Each class does one thing well
- **Meaningful Names**: Class names should be nouns (Student, Car, Book)
- **Fields are Private**: Protect data from direct access
- **Methods are Public**: Provide interface to interact with object
- **Constructors Initialize**: Set up object in valid state
- **Validation**: Check input in methods

### Example: Well-Designed Class

```java
public class Student {
    // Private fields (encapsulation)
    private String name;
    private int age;
    private double gpa;
    
    // Constructor with validation
    public Student(String name, int age, double gpa) {
        setName(name);
        setAge(age);
        setGpa(gpa);
    }
    
    // Getters (read access)
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    
    // Setters with validation (write access)
    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }
    
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }
    }
    
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }
    
    // Behavior method
    public void displayInfo() {
        System.out.printf("%s, Age: %d, GPA: %.2f%n", name, age, gpa);
    }
}
```

## Common Patterns

### Builder Pattern (Many Parameters)
```java
public Student(String name, int age) {
    this.name = name;
    this.age = age;
    this.gpa = 0.0;  // Default value
}
```

### Fluent Interface (Method Chaining)
```java
public Student setName(String name) {
    this.name = name;
    return this;  // Return this object
}

// Usage
Student s = new Student()
    .setName("Alice")
    .setAge(20)
    .setGpa(3.8);
```

## Real-World Applications

### Banking System
```java
BankAccount account = new BankAccount("123456", 1000.0);
account.deposit(500.0);
account.withdraw(200.0);
System.out.println("Balance: " + account.getBalance());
```

### E-commerce
```java
Product laptop = new Product("Laptop", 999.99, 10);
if (laptop.isInStock()) {
    laptop.reduceStock(1);
    // Process order
}
```

### Gaming
```java
Player player = new Player("Hero", 100, 10);
Enemy enemy = new Enemy("Goblin", 50, 5);
player.attack(enemy);
```

## Coming from Other Languages?

### Python Developers
```python
# Python
class Student:
    def __init__(self, name, age):
        self.name = name
        self.age = age
```

```java
// Java
public class Student {
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

**Key Differences:**
- Java requires explicit access modifiers
- Java has stronger type checking
- Java fields should be private by default

## Estimated Time

⏱️ **12-14 hours** for all lessons and exercises

---

**Module Difficulty**: ★★★★☆ (Conceptual shift!)

---

[← Module 4: Arrays](../04-Arrays/README.md) | [Next: Classes and Objects →](01-classes-and-objects.md)

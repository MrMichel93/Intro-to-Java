# Classes and Objects

Classes are blueprints for creating objects. Objects are instances of classes that contain data and behavior.

## 🎯 Learning Objectives

- Understand classes as blueprints
- Create and instantiate objects
- Define instance variables and methods
- Use the `this` keyword
- Understand object references

## What is a Class?

A **class** is a template or blueprint that defines the structure and behavior of objects.

```java
public class Car {
    // Fields (data)
    String brand;
    String model;
    int year;
    
    // Methods (behavior)
    void start() {
        System.out.println("Car is starting");
    }
    
    void drive() {
        System.out.println("Car is driving");
    }
}
```

## What is an Object?

An **object** is a specific instance of a class with actual values.

```java
// Create objects
Car myCar = new Car();
myCar.brand = "Toyota";
myCar.model = "Camry";
myCar.year = 2023;

Car yourCar = new Car();
yourCar.brand = "Honda";
yourCar.model = "Accord";
yourCar.year = 2022;
```

## Creating Classes

```java
public class Student {
    // Instance variables (fields)
    String name;
    int age;
    double gpa;
    
    // Instance methods
    void study() {
        System.out.println(name + " is studying");
    }
    
    void displayInfo() {
        System.out.printf("%s, Age: %d, GPA: %.2f%n", name, age, gpa);
    }
}
```

## Using Objects

```java
public class Main {
    public static void main(String[] args) {
        // Create object
        Student student1 = new Student();
        
        // Set values
        student1.name = "Alice";
        student1.age = 20;
        student1.gpa = 3.8;
        
        // Call methods
        student1.displayInfo();
        student1.study();
    }
}
```

## The `this` Keyword

`this` refers to the current object.

```java
public class Person {
    String name;
    int age;
    
    void setName(String name) {
        this.name = name;  // this.name is the field, name is the parameter
    }
    
    void setAge(int age) {
        this.age = age;
    }
    
    void introduce() {
        System.out.println("I am " + this.name + ", age " + this.age);
    }
}
```

## Complete Example

```java
public class BankAccount {
    String accountNumber;
    String owner;
    double balance;
    
    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("Deposited: $%.2f%n", amount);
        }
    }
    
    void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.printf("Withdrawn: $%.2f%n", amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    void displayBalance() {
        System.out.printf("Balance: $%.2f%n", this.balance);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = "123456";
        account.owner = "Alice";
        account.balance = 1000.0;
        
        account.displayBalance();
        account.deposit(500);
        account.withdraw(200);
        account.displayBalance();
    }
}
```

## Summary

✓ Classes are blueprints for objects
✓ Objects are instances of classes
✓ Fields store data, methods define behavior
✓ Use `new` keyword to create objects
✓ `this` refers to current object

## What's Next?

**[Next: Fields and Methods →](02-fields-and-methods.md)**

---

[← Back to Module 5](README.md) | [Next: Fields and Methods →](02-fields-and-methods.md)

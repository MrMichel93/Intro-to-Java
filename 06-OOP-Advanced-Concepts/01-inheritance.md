# Inheritance

Inheritance allows a class to inherit properties and methods from another class, promoting code reuse.

## 🎯 Learning Objectives

- Understand inheritance concepts
- Use the `extends` keyword
- Override methods
- Use the `super` keyword
- Understand IS-A relationships

## What is Inheritance?

**Inheritance** creates a parent-child relationship between classes where the child inherits characteristics from the parent.

```java
// Parent class
public class Animal {
    String name;
    
    void eat() {
        System.out.println(name + " is eating");
    }
    
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Child class
public class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking");
    }
}

// Usage
Dog myDog = new Dog();
myDog.name = "Buddy";
myDog.eat();    // Inherited from Animal
myDog.sleep();  // Inherited from Animal
myDog.bark();   // Own method
```

## Method Overriding

Child class can provide specific implementation of parent's method.

```java
public class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

public class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
```

## The `super` Keyword

Access parent class members.

```java
public class Vehicle {
    String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
}

public class Car extends Vehicle {
    String model;
    
    public Car(String brand, String model) {
        super(brand);  // Call parent constructor
        this.model = model;
    }
}
```

## Summary

✓ Use `extends` for inheritance
✓ Child inherits parent's non-private members
✓ Override methods with `@Override`
✓ Use `super` to access parent class
✓ Promotes code reuse

## What's Next?

**[Next: Polymorphism →](02-polymorphism.md)**

---

[← Back to Module 6](README.md) | [Next: Polymorphism →](02-polymorphism.md)

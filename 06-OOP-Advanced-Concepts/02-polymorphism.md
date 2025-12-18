# Polymorphism

Polymorphism allows objects of different types to be treated as objects of a common supertype.

## 🎯 Learning Objectives

- Understand polymorphism concepts
- Use polymorphic references
- Understand runtime vs compile-time polymorphism
- Use polymorphism in practice

## What is Polymorphism?

**Polymorphism** means "many forms" - the ability of different classes to respond to the same method call in different ways.

```java
Animal[] animals = new Animal[3];
animals[0] = new Dog();
animals[1] = new Cat();
animals[2] = new Bird();

for (Animal animal : animals) {
    animal.makeSound();  // Each makes their own sound
}
// Output:
// Woof!
// Meow!
// Chirp!
```

## Polymorphic References

A parent reference can point to a child object.

```java
Animal myPet = new Dog();  // Parent reference, child object
myPet.eat();               // Calls Dog's eat method
myPet.makeSound();         // Calls Dog's makeSound()
```

## Method Overriding (Runtime Polymorphism)

```java
public class Shape {
    double getArea() {
        return 0;
    }
}

public class Circle extends Shape {
    double radius;
    
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Rectangle extends Shape {
    double length, width;
    
    @Override
    double getArea() {
        return length * width;
    }
}
```

## Summary

✓ Polymorphism allows treating objects uniformly
✓ Parent reference can hold child object
✓ Method called depends on actual object type
✓ Enables flexible, extensible code

## What's Next?

**[Next: Abstract Classes →](03-abstract-classes.md)**

---

[← Back to Inheritance](01-inheritance.md) | [Next: Abstract Classes →](03-abstract-classes.md)

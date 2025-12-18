# Fields and Methods

Learn how to define and use instance variables (fields) and instance methods in classes.

## 🎯 Learning Objectives

- Define instance variables (fields)
- Create instance methods
- Understand static vs instance members
- Use static methods and variables
- Understand when to use static

## Instance Variables (Fields)

Fields store the state of an object.

```java
public class Rectangle {
    // Instance variables (each object has its own copy)
    double length;
    double width;
}
```

## Instance Methods

Methods that operate on instance variables.

```java
public class Rectangle {
    double length;
    double width;
    
    // Instance method
    double calculateArea() {
        return length * width;
    }
    
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}
```

## Static vs Instance

### Instance Members

Each object has its own copy.

```java
Rectangle rect1 = new Rectangle();
rect1.length = 5;  // rect1's length

Rectangle rect2 = new Rectangle();
rect2.length = 10;  // rect2's length (different from rect1)
```

### Static Members

Belong to the class, shared by all objects.

```java
public class Counter {
    static int count = 0;  // Shared by all Counter objects
    
    Counter() {
        count++;  // Increment for each new Counter
    }
    
    static int getCount() {  // Static method
        return count;
    }
}

// Usage
Counter c1 = new Counter();
Counter c2 = new Counter();
Counter c3 = new Counter();
System.out.println(Counter.getCount());  // 3
```

## Static Methods

Called on the class, not on objects.

```java
public class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }
    
    static double square(double x) {
        return x * x;
    }
}

// Usage
int sum = MathUtils.add(5, 3);  // Call on class
double squared = MathUtils.square(4);
```

## Complete Example

```java
public class Employee {
    // Instance variables
    String name;
    int id;
    double salary;
    
    // Static variable
    static int employeeCount = 0;
    static String companyName = "TechCorp";
    
    // Constructor (we'll learn more about these next)
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        employeeCount++;  // Increment for each new employee
    }
    
    // Instance method
    void displayInfo() {
        System.out.printf("Employee: %s (ID: %d), Salary: $%.2f%n", 
                          name, id, salary);
    }
    
    // Static method
    static void displayCompanyInfo() {
        System.out.printf("Company: %s, Employees: %d%n", 
                          companyName, employeeCount);
    }
}

// Usage
Employee emp1 = new Employee("Alice", 101, 50000);
Employee emp2 = new Employee("Bob", 102, 60000);

emp1.displayInfo();  // Instance method
emp2.displayInfo();

Employee.displayCompanyInfo();  // Static method
```

## Summary

✓ Instance variables: Each object has its own copy
✓ Instance methods: Operate on instance data
✓ Static variables: Shared by all objects
✓ Static methods: Called on class, not objects
✓ Use static for utilities and shared data

## What's Next?

**[Next: Constructors →](03-constructors.md)**

---

[← Back to Classes and Objects](01-classes-and-objects.md) | [Next: Constructors →](03-constructors.md)

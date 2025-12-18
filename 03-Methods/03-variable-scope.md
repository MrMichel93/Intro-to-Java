# Variable Scope

Scope defines where in your code a variable can be accessed. Understanding scope is crucial for writing correct and maintainable code.

## 🎯 Learning Objectives

- Understand what variable scope means
- Work with local variables
- Understand method parameters
- Recognize scope boundaries
- Avoid common scope-related errors

## What is Scope?

**Scope** is the region of code where a variable is accessible. Think of it as the variable's "visibility range."

### Real-World Analogy

Think of **hotel room keys**:
- Your room key (local variable) only works on your floor
- The master key (class variable) works everywhere in the hotel
- The key card expires when you check out (variable goes out of scope)

## Types of Scope

### 1. Local Variables

Variables declared inside a method or block.

```java
public class LocalExample {
    public static void main(String[] args) {
        int x = 10;  // Local to main method
        System.out.println(x);  // OK
        
        method1();
    }
    
    public static void method1() {
        // System.out.println(x);  // ERROR! x not accessible here
        int y = 20;  // Local to method1
        System.out.println(y);  // OK
    }
}
```

### 2. Block Scope

Variables declared inside a block `{ }`.

```java
public static void example() {
    int x = 10;  // Accessible in entire method
    
    if (x > 5) {
        int y = 20;  // Only accessible inside if block
        System.out.println(x);  // OK - x is accessible
        System.out.println(y);  // OK - y is accessible
    }
    
    System.out.println(x);  // OK
    // System.out.println(y);  // ERROR! y not accessible outside if
}
```

### 3. Loop Scope

Variables declared in loop header.

```java
public static void loopExample() {
    for (int i = 0; i < 5; i++) {
        System.out.println(i);  // OK - i accessible in loop
    }
    
    // System.out.println(i);  // ERROR! i not accessible outside loop
    
    int j = 0;
    while (j < 5) {
        System.out.println(j);  // OK
        j++;
    }
    
    System.out.println(j);  // OK - j declared outside loop
}
```

## Local Variables

Local variables are:
- Declared inside methods or blocks
- Created when method/block starts
- Destroyed when method/block ends
- Must be initialized before use

```java
public static void calculate() {
    int a;  // Declared but not initialized
    // System.out.println(a);  // ERROR! Must initialize first
    
    a = 10;  // Now initialized
    System.out.println(a);  // OK
}
```

### Shadowing

Inner scope variables can "shadow" outer scope variables (not recommended):

```java
public static void shadowingExample() {
    int x = 10;
    System.out.println(x);  // 10
    
    if (true) {
        int x = 20;  // Different variable (shadows outer x)
        System.out.println(x);  // 20
    }
    
    System.out.println(x);  // 10 (outer x)
}
```

## Method Parameters

Parameters are local variables passed to methods.

```java
public static void greet(String name) {  // name is parameter
    System.out.println("Hello, " + name);
    // name only exists in this method
}

public static void main(String[] args) {
    greet("Alice");
    // System.out.println(name);  // ERROR! name not accessible here
}
```

### Parameter Scope Example

```java
public static int add(int a, int b) {  // a and b are local to this method
    int sum = a + b;  // sum is also local
    return sum;
}

public static int multiply(int a, int b) {  // Different a and b!
    return a * b;
}

public static void main(String[] args) {
    int result1 = add(5, 3);
    int result2 = multiply(5, 3);
    
    // a, b, and sum not accessible here
}
```

## Scope Rules

### Rule 1: Inner Scope Can Access Outer Scope

```java
public static void example() {
    int outer = 10;
    
    if (true) {
        System.out.println(outer);  // OK - can access outer variable
        int inner = 20;
    }
}
```

### Rule 2: Outer Scope Cannot Access Inner Scope

```java
public static void example() {
    if (true) {
        int inner = 20;
    }
    
    // System.out.println(inner);  // ERROR! inner not accessible
}
```

### Rule 3: Variables Must Be Initialized

```java
public static void example() {
    int x;
    // System.out.println(x);  // ERROR! x not initialized
    
    x = 10;
    System.out.println(x);  // OK now
}
```

### Rule 4: No Duplicate Names in Same Scope

```java
public static void example() {
    int x = 10;
    // int x = 20;  // ERROR! x already declared
    
    x = 20;  // OK - reassignment, not redeclaration
}
```

## Practical Examples

### Variable Lifetime

```java
public class LifetimeDemo {
    public static void main(String[] args) {
        System.out.println("Start of main");
        
        int mainVar = 100;
        System.out.println("mainVar: " + mainVar);
        
        helper();  // mainVar still exists
        
        System.out.println("mainVar: " + mainVar);
        System.out.println("End of main");
        // mainVar destroyed here
    }
    
    public static void helper() {
        System.out.println("In helper");
        int helperVar = 200;
        System.out.println("helperVar: " + helperVar);
        // helperVar destroyed here
    }
}
```

### Nested Blocks

```java
public static void nestedBlocks() {
    int level1 = 10;
    System.out.println("Level 1: " + level1);
    
    {
        int level2 = 20;
        System.out.println("Level 1: " + level1);  // OK
        System.out.println("Level 2: " + level2);  // OK
        
        {
            int level3 = 30;
            System.out.println("Level 1: " + level1);  // OK
            System.out.println("Level 2: " + level2);  // OK
            System.out.println("Level 3: " + level3);  // OK
        }
        
        System.out.println("Level 2: " + level2);  // OK
        // System.out.println("Level 3: " + level3);  // ERROR!
    }
    
    System.out.println("Level 1: " + level1);  // OK
    // System.out.println("Level 2: " + level2);  // ERROR!
}
```

### Loop Variable Scope

```java
public static void loopVariables() {
    // For loop
    for (int i = 0; i < 3; i++) {
        int loopVar = i * 10;
        System.out.println("i: " + i + ", loopVar: " + loopVar);
    }
    // i and loopVar not accessible here
    
    // While loop
    int j = 0;
    while (j < 3) {
        int whileVar = j * 10;
        System.out.println("j: " + j + ", whileVar: " + whileVar);
        j++;
    }
    // j accessible here, whileVar is not
    System.out.println("After loop, j = " + j);
}
```

## Common Patterns

### Declaring Variables at Method Start

```java
public static double calculateTotal(double price, double tax, double discount) {
    // Declare all local variables at the start
    double subtotal;
    double taxAmount;
    double total;
    
    // Calculate
    subtotal = price;
    taxAmount = price * tax;
    total = subtotal + taxAmount - discount;
    
    return total;
}
```

### Minimizing Scope

```java
public static void processData() {
    // Good: Minimize scope
    for (int i = 0; i < 10; i++) {
        // i only exists where needed
    }
    
    // Bad: Unnecessarily wide scope
    int j;
    // ... lots of code ...
    for (j = 0; j < 10; j++) {
        // j declared too early
    }
}
```

## Scope and Method Calls

Variables are **passed by value** in Java.

```java
public class PassByValue {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before: " + x);  // 10
        
        modifyValue(x);
        
        System.out.println("After: " + x);   // Still 10!
    }
    
    public static void modifyValue(int num) {
        num = 20;  // Only changes local copy
        System.out.println("Inside method: " + num);  // 20
    }
}
```

### With Arrays (Reference Types)

```java
public class ArrayScope {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println("Before: " + numbers[0]);  // 1
        
        modifyArray(numbers);
        
        System.out.println("After: " + numbers[0]);   // 99 - Changed!
    }
    
    public static void modifyArray(int[] arr) {
        arr[0] = 99;  // Modifies the original array
    }
}
```

## Best Practices

### 1. Declare Variables Close to Use

```java
// Good
public static void example() {
    processStep1();
    
    int result = calculateValue();  // Declare when needed
    processStep2(result);
}

// Less good
public static void example() {
    int result;  // Declared too early
    processStep1();
    // ... many lines of code ...
    result = calculateValue();
    processStep2(result);
}
```

### 2. Use Meaningful Names

```java
// Good
public static void calculatePrice(double basePrice, double taxRate) {
    double tax = basePrice * taxRate;
    double total = basePrice + tax;
    return total;
}

// Bad
public static void calculatePrice(double x, double y) {
    double z = x * y;
    double w = x + z;
    return w;
}
```

### 3. Limit Scope When Possible

```java
// Good - limited scope
if (condition) {
    int temp = expensiveCalculation();
    useValue(temp);
}

// Less good - wider scope
int temp;
if (condition) {
    temp = expensiveCalculation();
    useValue(temp);
}
```

## Common Mistakes

### 1. Using Variable Before Declaration

```java
public static void mistake1() {
    // System.out.println(x);  // ERROR! x not declared yet
    int x = 10;
}
```

### 2. Accessing Variable Outside Scope

```java
public static void mistake2() {
    if (true) {
        int x = 10;
    }
    // System.out.println(x);  // ERROR! x out of scope
}
```

### 3. Forgetting to Initialize

```java
public static void mistake3() {
    int x;
    // System.out.println(x);  // ERROR! x not initialized
}
```

### 4. Shadowing Variables

```java
public static void mistake4(int x) {  // Parameter x
    int x = 20;  // ERROR! x already declared in this scope
}
```

## Practice Exercises

### Exercise 1: Scope Analysis

Identify which variables are accessible at each point in this code:

```java
public static void example() {
    int a = 1;
    if (a > 0) {
        int b = 2;
        for (int c = 0; c < 3; c++) {
            int d = 4;
            // Which variables are accessible here?
        }
        // Which variables are accessible here?
    }
    // Which variables are accessible here?
}
```

### Exercise 2: Fix Scope Errors

Fix the scope errors in this code:

```java
public static void broken() {
    if (true) {
        int result = 42;
    }
    System.out.println(result);
}
```

### Exercise 3: Temperature Converter

Write a method that converts temperature and uses proper variable scoping.

## Summary

✓ Scope defines where variables are accessible
✓ Local variables exist only in their method/block
✓ Inner scopes can access outer scope variables
✓ Outer scopes cannot access inner scope variables
✓ Variables must be declared before use
✓ Variables must be initialized before reading
✓ Parameters are local to their method
✓ Minimize scope when possible for clarity

## What's Next?

**[Next: Recursion →](04-recursion.md)**

---

[← Back to Method Overloading](02-method-overloading.md) | [Next: Recursion →](04-recursion.md)

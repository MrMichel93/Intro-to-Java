# Math Class

The Math class provides common mathematical operations.

## 🎯 Learning Objectives

- Use Math class methods
- Perform mathematical calculations
- Generate random numbers
- Work with constants

## Math Class Methods

```java
// Absolute value
int abs = Math.abs(-5);  // 5

// Power
double power = Math.pow(2, 3);  // 8.0 (2^3)

// Square root
double sqrt = Math.sqrt(16);  // 4.0

// Max and min
int max = Math.max(10, 20);  // 20
int min = Math.min(10, 20);  // 10

// Rounding
double ceil = Math.ceil(4.3);    // 5.0
double floor = Math.floor(4.8);  // 4.0
long round = Math.round(4.5);    // 5

// Trigonometry
double sin = Math.sin(Math.PI / 2);  // 1.0
double cos = Math.cos(0);            // 1.0
```

## Math Constants

```java
double pi = Math.PI;   // 3.141592653589793
double e = Math.E;     // 2.718281828459045
```

## Random Numbers

```java
// Random double [0.0, 1.0)
double random = Math.random();

// Random int [0, 100)
int randomInt = (int)(Math.random() * 100);

// Random int [min, max]
int min = 10, max = 50;
int randomRange = min + (int)(Math.random() * (max - min + 1));
```

## Summary

✓ Math class for mathematical operations
✓ No need to create Math objects (all static)
✓ Math.random() for random numbers
✓ Constants: Math.PI, Math.E

## What's Next?

**[Next: String Utilities →](02-string-utilities.md)**

---

[← Back to Module 11](README.md) | [Next: String Utilities →](02-string-utilities.md)

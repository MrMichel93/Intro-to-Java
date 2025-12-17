# Operators in Java

Operators are special symbols that perform operations on variables and values. Java has several types of operators for different purposes.

## 🎯 Learning Objectives

- Use arithmetic operators for calculations
- Apply comparison operators to compare values
- Combine conditions with logical operators  
- Understand operator precedence
- Use assignment operators efficiently
- Avoid common operator mistakes

## Arithmetic Operators

Perform mathematical calculations.

| Operator | Name | Example | Result |
|----------|------|---------|--------|
| `+` | Addition | `5 + 3` | `8` |
| `-` | Subtraction | `5 - 3` | `2` |
| `*` | Multiplication | `5 * 3` | `15` |
| `/` | Division | `5 / 3` | `1` (integer division!) |
| `%` | Modulus (remainder) | `5 % 3` | `2` |
| `++` | Increment | `x++` | `x = x + 1` |
| `--` | Decrement | `x--` | `x = x - 1` |

### Basic Arithmetic

```java
int a = 10;
int b = 3;

System.out.println(a + b);  // 13
System.out.println(a - b);  // 7
System.out.println(a * b);  // 30
System.out.println(a / b);  // 3 (not 3.333...)
System.out.println(a % b);  // 1 (remainder)
```

### Integer Division Trap!

```java
int result1 = 7 / 2;        // 3 (truncated!)
double result2 = 7 / 2;     // 3.0 (still truncated, then converted)
double result3 = 7.0 / 2.0; // 3.5 (correct!)
double result4 = 7 / 2.0;   // 3.5 (one double is enough)
```

**Rule:** If both operands are integers, result is integer (decimal part discarded).

### Modulus Operator (%)

Returns the remainder after division.

```java
System.out.println(10 % 3);   // 1
System.out.println(17 % 5);   // 2
System.out.println(20 % 4);   // 0 (divides evenly)

// Check if even or odd
int number = 7;
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

### Increment and Decrement

```java
int x = 5;

// Post-increment (use value, then increment)
int a = x++;  // a = 5, x = 6
System.out.println("a: " + a + ", x: " + x);

// Pre-increment (increment, then use value)
int y = 5;
int b = ++y;  // b = 6, y = 6
System.out.println("b: " + b + ", y: " + y);

// Same for decrement
int z = 5;
z--;  // z = 4
--z;  // z = 3
```

**Best Practice:** Use `x++` and `x--` on separate lines for clarity:

```java
int score = 0;
score++;  // Increment score
System.out.println(score);  // 1
```

## Comparison Operators

Compare values and return boolean (true/false).

| Operator | Name | Example | Result |
|----------|------|---------|--------|
| `==` | Equal to | `5 == 5` | `true` |
| `!=` | Not equal to | `5 != 3` | `true` |
| `>` | Greater than | `5 > 3` | `true` |
| `<` | Less than | `5 < 3` | `false` |
| `>=` | Greater than or equal | `5 >= 5` | `true` |
| `<=` | Less than or equal | `5 <= 3` | `false` |

### Examples

```java
int age = 18;

System.out.println(age == 18);  // true
System.out.println(age != 18);  // false
System.out.println(age > 21);   // false
System.out.println(age < 21);   // true
System.out.println(age >= 18);  // true
System.out.println(age <= 18);  // true
```

### Common Uses

```java
int score = 85;

if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) {
    System.out.println("Grade: B");
} else if (score >= 70) {
    System.out.println("Grade: C");
}
```

### WARNING: Comparing Strings

```java
String s1 = "hello";
String s2 = "hello";

// WRONG! Don't use == for strings
if (s1 == s2) {  // Compares references, not content
    // May or may not work correctly
}

// CORRECT! Use .equals()
if (s1.equals(s2)) {  // Compares content
    System.out.println("Strings are equal");
}
```

## Logical Operators

Combine multiple boolean conditions.

| Operator | Name | Example | Result |
|----------|------|---------|--------|
| `&&` | AND (both must be true) | `true && false` | `false` |
| `||` | OR (at least one true) | `true || false` | `true` |
| `!` | NOT (inverts) | `!true` | `false` |

### AND Operator (&&)

Both conditions must be true.

```java
int age = 20;
boolean hasLicense = true;

// Can drive if age >= 16 AND has license
if (age >= 16 && hasLicense) {
    System.out.println("Can drive!");
}
```

**Truth Table:**
```
true  && true   = true
true  && false  = false
false && true   = false
false && false  = false
```

### OR Operator (||)

At least one condition must be true.

```java
boolean isWeekend = true;
boolean isHoliday = false;

// No school if weekend OR holiday
if (isWeekend || isHoliday) {
    System.out.println("No school!");
}
```

**Truth Table:**
```
true  || true   = true
true  || false  = true
false || true   = true
false || false  = false
```

### NOT Operator (!)

Inverts boolean value.

```java
boolean isRaining = false;

if (!isRaining) {
    System.out.println("Go outside!");
}

// Equivalent to:
if (isRaining == false) {
    System.out.println("Go outside!");
}
```

### Complex Conditions

```java
int age = 25;
boolean hasTicket = true;
boolean isVIP = false;

// Can enter if (age >= 18 AND hasTicket) OR isVIP
if ((age >= 18 && hasTicket) || isVIP) {
    System.out.println("Welcome!");
}
```

### Short-Circuit Evaluation

```java
int x = 5;

// && stops if first is false (doesn't evaluate second)
if (x > 10 && x < 20) {  // x > 10 is false, so x < 20 not checked
    // Won't execute
}

// || stops if first is true (doesn't evaluate second)
if (x > 0 || x < 10) {  // x > 0 is true, so x < 10 not checked
    System.out.println("This runs");
}
```

## Assignment Operators

Assign values to variables.

| Operator | Example | Equivalent to |
|----------|---------|---------------|
| `=` | `x = 5` | `x = 5` |
| `+=` | `x += 3` | `x = x + 3` |
| `-=` | `x -= 3` | `x = x - 3` |
| `*=` | `x *= 3` | `x = x * 3` |
| `/=` | `x /= 3` | `x = x / 3` |
| `%=` | `x %= 3` | `x = x % 3` |

### Examples

```java
int score = 100;

score += 10;   // score = score + 10;  → 110
score -= 5;    // score = score - 5;   → 105
score *= 2;    // score = score * 2;   → 210
score /= 3;    // score = score / 3;   → 70
score %= 20;   // score = score % 20;  → 10
```

### Practical Uses

```java
int lives = 3;
lives--;           // Lose a life

int points = 0;
points += 100;     // Earned 100 points

double balance = 1000.0;
balance -= 50.0;   // Spent $50
balance *= 1.05;   // 5% interest
```

## Operator Precedence

When multiple operators appear in an expression, Java follows precedence rules:

**Priority (High to Low):**
1. Parentheses `()`
2. Unary: `++`, `--`, `!`
3. Multiplicative: `*`, `/`, `%`
4. Additive: `+`, `-`
5. Comparison: `<`, `>`, `<=`, `>=`
6. Equality: `==`, `!=`
7. Logical AND: `&&`
8. Logical OR: `||`
9. Assignment: `=`, `+=`, `-=`, etc.

### Examples

```java
int result = 2 + 3 * 4;     // 14, not 20 (multiplication first)
int result2 = (2 + 3) * 4;  // 20 (parentheses first)

boolean check = 5 > 3 && 10 < 20;  // true (comparisons first, then &&)
```

**Best Practice:** Use parentheses for clarity!

```java
// Unclear
if (x > 5 && y < 10 || z == 0) { }

// Clear
if ((x > 5 && y < 10) || z == 0) { }
```

## Complete Example

```java
public class OperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic
        int a = 10, b = 3;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        
        // Comparison
        System.out.println("\na > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
        
        // Logical
        boolean x = true, y = false;
        System.out.println("\nx && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        
        // Compound assignment
        int score = 100;
        score += 50;
        System.out.println("\nFinal score: " + score);
    }
}
```

## Common Mistakes

### 1. Using = instead of ==

```java
int x = 5;
if (x = 10) {  // ERROR! Assignment, not comparison
    // Won't compile
}
if (x == 10) {  // Correct
    // ...
}
```

### 2. Dividing integers

```java
double avg = 7 / 2;      // 3.0 (wrong!)
double avg = 7.0 / 2.0;  // 3.5 (correct)
```

### 3. Forgetting parentheses

```java
boolean result = 5 > 3 && 10 < 20 || 15 == 15;  // Unclear
boolean result = ((5 > 3) && (10 < 20)) || (15 == 15);  // Clear
```

## Practice Exercises

See [exercises/](exercises/) folder for hands-on practice!

## Summary

✓ Arithmetic operators: `+`, `-`, `*`, `/`, `%`, `++`, `--`
✓ Comparison operators: `==`, `!=`, `<`, `>`, `<=`, `>=`
✓ Logical operators: `&&`, `||`, `!`
✓ Assignment operators: `=`, `+=`, `-=`, etc.
✓ Use parentheses for clarity
✓ Watch out for integer division!
✓ Use `.equals()` for String comparison

## What's Next?

**[Next: Input and Output →](03-input-output.md)**

---

[← Back to Variables](01-variables-and-data-types.md) | [Next: Input/Output →](03-input-output.md)

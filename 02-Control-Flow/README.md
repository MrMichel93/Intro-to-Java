# Module 2: Control Flow

Control flow statements determine the order in which your code executes. Instead of running line by line, you can make decisions (if-else), repeat actions (loops), and handle multiple options (switch).

## 🎯 Learning Objectives

- Make decisions with if-else statements
- Handle multiple cases with switch statements
- Use ternary operators for simple conditions
- Repeat code with different types of loops
- Control loop flow with break and continue
- Understand when to use each control structure

## 📚 Module Contents

### 1. [If Statements](01-if-statements.md)
Make decisions in your code
- Basic if
- if-else
- else-if chains
- Nested if statements

### 2. [Switch Statements](02-switch-statements.md)
Handle multiple options elegantly
- Basic switch
- Switch expressions (Java 14+)
- When to use switch vs if-else

### 3. [Ternary Operator](03-ternary-operator.md)
Compact conditional expressions

### 4. [Loops](04-loops.md)
Repeat actions efficiently
- while loops
- do-while loops
- for loops
- Enhanced for loops (for-each)
- Nested loops
- Loop control (break, continue)

## 💻 Code Examples

- **GradeCalculator.java** - If-else chains for grade conversion
- **NumberGuessingGame.java** - While loop and user input
- **PatternPrinting.java** - Nested loops for ASCII art
- **MenuSystem.java** - Switch statement demonstration
- **ValidationExample.java** - Input validation with loops

## 📝 Exercises

1. **Grade Converter** - Convert numeric scores to letter grades
2. **Multiplication Table** - Print times tables with nested loops
3. **Prime Checker** - Determine if a number is prime
4. **Password Validator** - Validate password requirements

## Why Control Flow Matters

Control flow is what makes programs intelligent and interactive. Without it, programs would just execute line by line with no ability to:
- Make decisions (like checking if a password is correct)
- Repeat tasks (like processing 1000 orders)
- Handle different scenarios (like menu selections)
- Adapt to user input (like game difficulty settings)

### Real-World Applications

- **E-commerce**: If stock > 0, allow purchase; else show "out of stock"
- **Games**: While player has lives, continue playing
- **Banking**: For each transaction in list, update balance
- **Social Media**: Switch case for different types of notifications
- **Web Forms**: Validate all fields before submission

## Control Flow Patterns

```
Sequential        Conditional       Repetitive
(default)        (if/switch)         (loops)
    ↓                 ↓                  ↓
Statement1         Condition?      ──→ Statement
    ↓              ┌──┴──┐         │      ↓
Statement2        Yes    No        └────Repeat
    ↓              ↓     ↓
Statement3    Statement Done
```

## Quick Reference

| Need to... | Use... |
|------------|--------|
| Do something if condition is true | `if` |
| Choose between two options | `if-else` |
| Check multiple conditions sequentially | `else-if` |
| Choose from many specific values | `switch` |
| Simple two-way choice | ternary `? :` |
| Repeat while condition is true | `while` |
| Repeat at least once | `do-while` |
| Repeat a specific number of times | `for` |
| Iterate over a collection | `for-each` |
| Exit loop early | `break` |
| Skip to next iteration | `continue` |

## Common Patterns You'll Use

### Guard Clause
```java
if (invalidInput) {
    System.out.println("Error!");
    return;  // Exit early
}
// Continue with valid input
```

### Counter Loop
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

### Sentinel Loop
```java
while (input != -1) {
    process(input);
    input = getNextInput();
}
```

### Input Validation
```java
while (true) {
    System.out.print("Enter (1-10): ");
    int num = scanner.nextInt();
    if (num >= 1 && num <= 10) {
        break;  // Valid input
    }
    System.out.println("Invalid! Try again.");
}
```

## Performance Considerations

- **if vs switch**: Switch can be faster for many cases (compiler optimization)
- **Loop optimization**: Calculate invariants outside the loop
- **Break early**: Exit loops as soon as condition is met
- **Nested loops**: Be careful - O(n²) can be slow for large n

## Common Pitfalls

1. **Infinite Loops**: Forgetting to update loop condition
2. **Off-by-One Errors**: Wrong loop boundaries (< vs <=)
3. **Integer Division**: Using int when you need double
4. **Missing Break**: Fall-through in switch statements
5. **Wrong Scope**: Variables declared inside loops

## Estimated Time

⏱️ **10-12 hours** to complete all lessons and exercises

---

**Module Difficulty**: ★★★☆☆

---

[← Module 1: Java Basics](../01-Java-Basics/README.md) | [Next: If Statements →](01-if-statements.md)

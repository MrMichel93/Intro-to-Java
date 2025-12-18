# Recursion

Recursion is when a method calls itself. It's a powerful technique for solving problems that can be broken down into smaller, similar subproblems.

## 🎯 Learning Objectives

- Understand what recursion is and how it works
- Write recursive methods with base and recursive cases
- Convert iterative solutions to recursive ones
- Recognize when recursion is appropriate
- Understand recursion's limitations and stack overflow

## What is Recursion?

**Recursion** is a method that calls itself to solve a problem by breaking it into smaller instances of the same problem.

### Real-World Analogy

**Russian Nesting Dolls (Matryoshka)**:
- Open a doll, find a smaller doll inside
- Open that doll, find an even smaller doll
- Continue until you reach the smallest doll (base case)

**Searching for Keys**:
1. Look in the room
2. If you find keys, done! (base case)
3. If you find another room, search that room (recursive call)

## Anatomy of Recursion

Every recursive method needs:

### 1. Base Case

The stopping condition - when to stop recursing.

```java
if (condition) {
    return simpleAnswer;  // Base case
}
```

### 2. Recursive Case

The method calling itself with a simpler version of the problem.

```java
return recursiveCall(smallerProblem);  // Recursive case
```

## Simple Examples

### Countdown

```java
public static void countdown(int n) {
    // Base case: stop at 0
    if (n == 0) {
        System.out.println("Blast off!");
        return;
    }
    
    // Recursive case
    System.out.println(n);
    countdown(n - 1);  // Call with smaller number
}

// Usage
countdown(5);
// Output:
// 5
// 4
// 3
// 2
// 1
// Blast off!
```

### Sum of Numbers

```java
// Sum from 1 to n
public static int sum(int n) {
    // Base case
    if (n == 1) {
        return 1;
    }
    
    // Recursive case: n + sum of (n-1)
    return n + sum(n - 1);
}

// sum(5) = 5 + sum(4)
//        = 5 + (4 + sum(3))
//        = 5 + (4 + (3 + sum(2)))
//        = 5 + (4 + (3 + (2 + sum(1))))
//        = 5 + (4 + (3 + (2 + 1)))
//        = 15
```

### Factorial

```java
// n! = n × (n-1) × (n-2) × ... × 1
public static int factorial(int n) {
    // Base case
    if (n == 0 || n == 1) {
        return 1;
    }
    
    // Recursive case
    return n * factorial(n - 1);
}

// factorial(5) = 5 * factorial(4)
//              = 5 * (4 * factorial(3))
//              = 5 * (4 * (3 * factorial(2)))
//              = 5 * (4 * (3 * (2 * factorial(1))))
//              = 5 * (4 * (3 * (2 * 1)))
//              = 120
```

## How Recursion Works

### Call Stack Visualization

```java
factorial(4)
  calls factorial(3)
    calls factorial(2)
      calls factorial(1)
        returns 1
      returns 2 * 1 = 2
    returns 3 * 2 = 6
  returns 4 * 6 = 24
```

### Memory Stack

```
| factorial(1) → returns 1   | ← Top of stack
| factorial(2) → returns 2   |
| factorial(3) → returns 6   |
| factorial(4) → returns 24  | ← Bottom (first call)
```

## Classic Recursive Problems

### Fibonacci Sequence

```java
// 0, 1, 1, 2, 3, 5, 8, 13, 21...
// fib(n) = fib(n-1) + fib(n-2)
public static int fibonacci(int n) {
    // Base cases
    if (n == 0) return 0;
    if (n == 1) return 1;
    
    // Recursive case
    return fibonacci(n - 1) + fibonacci(n - 2);
}

// fibonacci(5)
//   = fibonacci(4) + fibonacci(3)
//   = (fibonacci(3) + fibonacci(2)) + (fibonacci(2) + fibonacci(1))
//   = ...
//   = 5
```

### Power Function

```java
// x^n = x × x^(n-1)
public static double power(double x, int n) {
    // Base case
    if (n == 0) {
        return 1;
    }
    
    // Recursive case
    if (n > 0) {
        return x * power(x, n - 1);
    } else {
        return 1.0 / power(x, -n);
    }
}

// power(2, 4) = 2 * power(2, 3)
//             = 2 * (2 * power(2, 2))
//             = 2 * (2 * (2 * power(2, 1)))
//             = 2 * (2 * (2 * (2 * power(2, 0))))
//             = 2 * (2 * (2 * (2 * 1)))
//             = 16
```

### Greatest Common Divisor (GCD)

```java
// Euclidean algorithm
public static int gcd(int a, int b) {
    // Base case
    if (b == 0) {
        return a;
    }
    
    // Recursive case
    return gcd(b, a % b);
}

// gcd(48, 18)
//   = gcd(18, 48 % 18)
//   = gcd(18, 12)
//   = gcd(12, 18 % 12)
//   = gcd(12, 6)
//   = gcd(6, 12 % 6)
//   = gcd(6, 0)
//   = 6
```

## Recursion with Strings

### Reverse String

```java
public static String reverse(String str) {
    // Base case: empty or single character
    if (str.length() <= 1) {
        return str;
    }
    
    // Recursive case: last char + reverse of rest
    return str.charAt(str.length() - 1) + 
           reverse(str.substring(0, str.length() - 1));
}

// reverse("hello")
//   = 'o' + reverse("hell")
//   = 'o' + ('l' + reverse("hel"))
//   = 'o' + ('l' + ('l' + reverse("he")))
//   = 'o' + ('l' + ('l' + ('e' + reverse("h"))))
//   = 'o' + ('l' + ('l' + ('e' + "h")))
//   = "olleh"
```

### Check Palindrome

```java
public static boolean isPalindrome(String str) {
    // Base case: 0 or 1 characters
    if (str.length() <= 1) {
        return true;
    }
    
    // Check first and last characters
    if (str.charAt(0) != str.charAt(str.length() - 1)) {
        return false;
    }
    
    // Recursive case: check middle part
    return isPalindrome(str.substring(1, str.length() - 1));
}
```

## Recursion with Arrays

### Sum Array Elements

```java
public static int sumArray(int[] arr, int index) {
    // Base case: reached end
    if (index >= arr.length) {
        return 0;
    }
    
    // Recursive case: current + sum of rest
    return arr[index] + sumArray(arr, index + 1);
}

// Usage
int[] numbers = {1, 2, 3, 4, 5};
int total = sumArray(numbers, 0);  // 15
```

### Binary Search (Recursive)

```java
public static int binarySearch(int[] arr, int target, int left, int right) {
    // Base case: not found
    if (left > right) {
        return -1;
    }
    
    int mid = (left + right) / 2;
    
    // Base case: found
    if (arr[mid] == target) {
        return mid;
    }
    
    // Recursive cases
    if (arr[mid] > target) {
        return binarySearch(arr, target, left, mid - 1);  // Search left
    } else {
        return binarySearch(arr, target, mid + 1, right);  // Search right
    }
}
```

## Recursion vs Iteration

### Factorial: Both Ways

```java
// Recursive
public static int factorialRecursive(int n) {
    if (n <= 1) return 1;
    return n * factorialRecursive(n - 1);
}

// Iterative
public static int factorialIterative(int n) {
    int result = 1;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}
```

### When to Use Each

**Use Recursion When:**
- Problem naturally divides into smaller subproblems
- Tree or graph traversal
- Backtracking algorithms
- Elegance and readability are priorities

**Use Iteration When:**
- Simple counting or accumulation
- Performance is critical
- Stack space is limited
- Recursive solution is inefficient

## Tail Recursion

A recursive call that's the last operation in a method.

```java
// Not tail recursive (multiplication after recursive call)
public static int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);  // Operation after recursion
}

// Tail recursive (accumulator pattern)
public static int factorialTail(int n, int accumulator) {
    if (n <= 1) return accumulator;
    return factorialTail(n - 1, n * accumulator);  // Nothing after recursion
}

// Usage
int result = factorialTail(5, 1);
```

## Common Pitfalls

### 1. Missing Base Case

```java
// WRONG - infinite recursion!
public static void countdown(int n) {
    System.out.println(n);
    countdown(n - 1);  // Never stops!
}

// CORRECT
public static void countdown(int n) {
    if (n == 0) return;  // Base case
    System.out.println(n);
    countdown(n - 1);
}
```

### 2. Base Case Never Reached

```java
// WRONG - base case unreachable!
public static int sum(int n) {
    if (n == 0) return 0;  // Base case
    return n + sum(n);  // n never decreases!
}

// CORRECT
public static int sum(int n) {
    if (n == 0) return 0;
    return n + sum(n - 1);  // Decreases toward base case
}
```

### 3. Stack Overflow

```java
// Can cause stack overflow with large n
public static int sum(int n) {
    if (n == 0) return 0;
    return n + sum(n - 1);
}

// sum(1000000) → Stack Overflow!
```

## Advanced Example: Tower of Hanoi

```java
public static void towerOfHanoi(int n, char from, char to, char aux) {
    // Base case: only 1 disk
    if (n == 1) {
        System.out.printf("Move disk 1 from %c to %c%n", from, to);
        return;
    }
    
    // Move n-1 disks from 'from' to 'aux'
    towerOfHanoi(n - 1, from, aux, to);
    
    // Move largest disk from 'from' to 'to'
    System.out.printf("Move disk %d from %c to %c%n", n, from, to);
    
    // Move n-1 disks from 'aux' to 'to'
    towerOfHanoi(n - 1, aux, to, from);
}

// Usage
towerOfHanoi(3, 'A', 'C', 'B');
```

## Complete Example: Directory Size

```java
import java.io.File;

public class DirectorySize {
    public static long getSize(File file) {
        // Base case: file (not directory)
        if (file.isFile()) {
            return file.length();
        }
        
        // Recursive case: directory
        long totalSize = 0;
        File[] files = file.listFiles();
        
        if (files != null) {
            for (File f : files) {
                totalSize += getSize(f);  // Recursive call
            }
        }
        
        return totalSize;
    }
}
```

## Best Practices

1. **Always have a base case** that stops recursion
2. **Make progress** toward base case in each recursive call
3. **Keep it simple** - recursion should clarify, not complicate
4. **Consider performance** - recursion can be slower and use more memory
5. **Document clearly** - explain base and recursive cases

## Practice Exercises

### Exercise 1: String Length

Write a recursive method to find string length without using `.length()`.

### Exercise 2: Count Digits

Write a recursive method to count digits in an integer.

### Exercise 3: Array Maximum

Write a recursive method to find the maximum element in an array.

### Exercise 4: Sum of Digits

Write a recursive method to sum all digits in an integer.

## Summary

✓ Recursion is when a method calls itself
✓ Must have base case (stopping condition)
✓ Must have recursive case (self-call with simpler problem)
✓ Each call creates new stack frame
✓ Elegant for naturally recursive problems
✓ Can cause stack overflow with too many calls
✓ Not always the most efficient solution
✓ Great for trees, graphs, and divide-and-conquer algorithms

## What's Next?

You've completed Module 3! Practice with exercises, then move to:

**[Module 4: Arrays →](../04-Arrays/README.md)**

---

[← Back to Variable Scope](03-variable-scope.md) | [Next: Module 4 →](../04-Arrays/README.md)

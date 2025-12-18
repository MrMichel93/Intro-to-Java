# Utility Classes

Explore additional useful classes from Java's standard library.

## 🎯 Learning Objectives

- Use Random class
- Work with Scanner
- Use Collections utilities
- Understand wrapper classes

## Random Class

More control than Math.random().

```java
import java.util.Random;

Random random = new Random();

// Random int
int randomInt = random.nextInt();

// Random int in range [0, bound)
int randomRange = random.nextInt(100);  // 0-99

// Random double
double randomDouble = random.nextDouble();

// Random boolean
boolean randomBool = random.nextBoolean();
```

## Wrapper Classes

Object versions of primitives.

```java
// int → Integer
Integer num = 10;  // Autoboxing
int value = num;   // Unboxing

// Parsing
int parsed = Integer.parseInt("42");
double dbl = Double.parseDouble("3.14");

// Utility methods
Integer max = Integer.MAX_VALUE;
Integer min = Integer.MIN_VALUE;
```

## Arrays Utility

```java
import java.util.Arrays;

int[] arr = {3, 1, 4, 1, 5};

// Sort
Arrays.sort(arr);

// Search (must be sorted)
int index = Arrays.binarySearch(arr, 4);

// To string
String str = Arrays.toString(arr);

// Fill
Arrays.fill(arr, 0);
```

## Collections Utility

```java
import java.util.Collections;
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
list.add(3);
list.add(1);
list.add(4);

// Sort
Collections.sort(list);

// Reverse
Collections.reverse(list);

// Max/Min
int max = Collections.max(list);
int min = Collections.min(list);

// Shuffle
Collections.shuffle(list);
```

## Summary

✓ Random for random number generation
✓ Wrapper classes for primitives
✓ Arrays utility for array operations
✓ Collections utility for collection operations

## What's Next?

You've completed Module 11! Practice with exercises, then move to:

**[Module 12: Introduction to GUI →](../12-Introduction-to-GUI/README.md)**

---

[← Back to Date and Time](03-date-time.md) | [Next: Module 12 →](../12-Introduction-to-GUI/README.md)

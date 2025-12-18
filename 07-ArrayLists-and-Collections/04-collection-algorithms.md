# Collection Algorithms

Learn algorithms and utilities for working with collections.

## 🎯 Learning Objectives

- Sort collections
- Search collections
- Transform collections
- Use Collections utility class

## Collections Utility Class

```java
import java.util.Collections;
import java.util.ArrayList;

ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(5);
numbers.add(2);
numbers.add(8);
numbers.add(1);

// Sort
Collections.sort(numbers);
System.out.println(numbers);  // [1, 2, 5, 8]

// Reverse
Collections.reverse(numbers);
System.out.println(numbers);  // [8, 5, 2, 1]

// Find max/min
int max = Collections.max(numbers);  // 8
int min = Collections.min(numbers);  // 1

// Shuffle
Collections.shuffle(numbers);
```

## Searching

```java
Collections.sort(numbers);
int index = Collections.binarySearch(numbers, 5);
System.out.println("Found at index: " + index);
```

## Summary

✓ Collections.sort() for sorting
✓ Collections.reverse() for reversing
✓ Collections.max/min() for extremes
✓ Collections.binarySearch() for searching

## What's Next?

You've completed Module 7! Practice with exercises, then move to:

**[Module 8: Exception Handling →](../08-Exception-Handling/README.md)**

---

[← Back to Iterating Collections](03-iterating-collections.md) | [Next: Module 8 →](../08-Exception-Handling/README.md)

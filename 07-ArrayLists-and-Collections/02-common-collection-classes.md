# Common Collection Classes

Java provides several collection classes for different needs: ArrayList, HashSet, HashMap, and more.

## 🎯 Learning Objectives

- Use HashMap for key-value pairs
- Use HashSet for unique elements
- Choose appropriate collection for each scenario
- Understand collection performance

## HashMap

Store key-value pairs.

```java
import java.util.HashMap;

HashMap<String, Integer> ages = new HashMap<>();

// Add entries
ages.put("Alice", 25);
ages.put("Bob", 30);
ages.put("Charlie", 28);

// Get value
int aliceAge = ages.get("Alice");  // 25

// Check if key exists
if (ages.containsKey("Bob")) {
    System.out.println("Bob's age: " + ages.get("Bob"));
}

// Remove entry
ages.remove("Charlie");

// Iterate
for (String name : ages.keySet()) {
    System.out.println(name + ": " + ages.get(name));
}
```

## HashSet

Store unique elements (no duplicates).

```java
import java.util.HashSet;

HashSet<String> uniqueNames = new HashSet<>();

uniqueNames.add("Alice");
uniqueNames.add("Bob");
uniqueNames.add("Alice");  // Duplicate - ignored

System.out.println(uniqueNames);  // [Alice, Bob]
System.out.println("Size: " + uniqueNames.size());  // 2
```

## When to Use Each Collection

| Collection | Use When |
|------------|----------|
| ArrayList | Ordered list, duplicates allowed, fast access by index |
| HashMap | Key-value pairs, fast lookup by key |
| HashSet | Unique elements only, fast membership testing |

## Summary

✓ HashMap: Key-value pairs
✓ HashSet: Unique elements
✓ ArrayList: Ordered list
✓ Choose based on requirements

## What's Next?

**[Next: Iterating Collections →](03-iterating-collections.md)**

---

[← Back to ArrayList Basics](01-arraylist-basics.md) | [Next: Iterating Collections →](03-iterating-collections.md)

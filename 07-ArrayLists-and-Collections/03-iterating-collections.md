# Iterating Collections

Learn different ways to iterate through collections efficiently.

## 🎯 Learning Objectives

- Iterate with for-each loops
- Use iterators
- Understand Collection methods
- Apply functional programming basics

## For-Each Loop

Most common way to iterate.

```java
ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");

for (String name : names) {
    System.out.println(name);
}
```

## Iterator

More control over iteration.

```java
import java.util.Iterator;

Iterator<String> it = names.iterator();
while (it.hasNext()) {
    String name = it.next();
    System.out.println(name);
}
```

## forEach Method (Java 8+)

```java
names.forEach(name -> System.out.println(name));

// Or with method reference
names.forEach(System.out::println);
```

## Summary

✓ For-each loop: Simple and clean
✓ Iterator: More control
✓ forEach: Functional style

## What's Next?

**[Next: Collection Algorithms →](04-collection-algorithms.md)**

---

[← Back to Common Collections](02-common-collection-classes.md) | [Next: Collection Algorithms →](04-collection-algorithms.md)

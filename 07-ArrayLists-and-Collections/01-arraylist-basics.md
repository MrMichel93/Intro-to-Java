# ArrayList Basics

ArrayList is a dynamic array that can grow and shrink in size, unlike regular arrays which have fixed size.

## 🎯 Learning Objectives

- Understand ArrayList and its benefits
- Create and initialize ArrayLists
- Add, remove, and access elements
- Use generics for type safety
- Iterate through ArrayLists

## What is ArrayList?

**ArrayList** is a resizable array implementation from `java.util` package.

```java
import java.util.ArrayList;

// Create ArrayList
ArrayList<String> names = new ArrayList<>();

// Add elements
names.add("Alice");
names.add("Bob");
names.add("Charlie");

System.out.println(names);  // [Alice, Bob, Charlie]
```

## Arrayversus ArrayList

| Feature | Array | ArrayList |
|---------|-------|-----------|
| Size | Fixed | Dynamic |
| Syntax | `String[]` | `ArrayList<String>` |
| Add/Remove | Manual | Built-in methods |
| Performance | Faster | Slightly slower |

## Creating ArrayList

```java
import java.util.ArrayList;

// Integer ArrayList
ArrayList<Integer> numbers = new ArrayList<>();

// String ArrayList
ArrayList<String> names = new ArrayList<>();

// Double ArrayList
ArrayList<Double> prices = new ArrayList<>();
```

## Common ArrayList Methods

### Adding Elements

```java
ArrayList<String> fruits = new ArrayList<>();

fruits.add("Apple");        // Add at end
fruits.add("Banana");
fruits.add(1, "Orange");    // Add at index 1

System.out.println(fruits);  // [Apple, Orange, Banana]
```

### Accessing Elements

```java
String first = fruits.get(0);     // "Apple"
String second = fruits.get(1);    // "Orange"
```

### Modifying Elements

```java
fruits.set(0, "Mango");  // Replace element at index 0
System.out.println(fruits);  // [Mango, Orange, Banana]
```

### Removing Elements

```java
fruits.remove(0);            // Remove by index
fruits.remove("Banana");     // Remove by value
System.out.println(fruits);  // [Orange]
```

### Size

```java
int size = fruits.size();
System.out.println("Size: " + size);
```

### Check if Empty

```java
boolean empty = fruits.isEmpty();
```

### Contains

```java
boolean hasApple = fruits.contains("Apple");
```

### Clear All

```java
fruits.clear();  // Remove all elements
```

## Iterating ArrayList

### For Loop

```java
for (int i = 0; i < fruits.size(); i++) {
    System.out.println(fruits.get(i));
}
```

### Enhanced For Loop

```java
for (String fruit : fruits) {
    System.out.println(fruit);
}
```

## Summary

✓ ArrayList is dynamic, arrays are fixed
✓ Use generics: `ArrayList<Type>`
✓ Common methods: add, get, set, remove, size
✓ Can grow and shrink automatically

## What's Next?

**[Next: Common Collection Classes →](02-common-collection-classes.md)**

---

[← Back to Module 7](README.md) | [Next: Common Collections →](02-common-collection-classes.md)

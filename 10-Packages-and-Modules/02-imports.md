# Imports

Learn to import classes from other packages.

## 🎯 Learning Objectives

- Import individual classes
- Use wildcard imports
- Understand import statements
- Handle import conflicts

## Import Statements

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
    }
}
```

## Wildcard Imports

Import all classes from a package.

```java
import java.util.*;  // Import all from java.util

public class Main {
    // Can use ArrayList, HashMap, Scanner, etc.
}
```

## Static Imports

Import static members.

```java
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Circle {
    double radius = 5;
    double area = PI * radius * radius;  // No Math.PI needed
    double diagonal = sqrt(2) * radius;  // No Math.sqrt needed
}
```

## Import Conflicts

```java
import java.util.Date;
import java.sql.Date;  // Conflict!

// Solution: Use fully qualified name
java.util.Date utilDate = new java.util.Date();
java.sql.Date sqlDate = new java.sql.Date(0);
```

## Summary

✓ Import brings classes into scope
✓ Wildcard (*) imports all classes
✓ Static import for static members
✓ Use fully qualified names for conflicts

## What's Next?

**[Next: Access Modifiers →](03-access-modifiers.md)**

---

[← Back to Packages](01-packages.md) | [Next: Access Modifiers →](03-access-modifiers.md)

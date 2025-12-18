# Packages

Packages organize classes into namespaces, preventing naming conflicts and improving code organization.

## 🎯 Learning Objectives

- Understand packages
- Create packages
- Use package naming conventions
- Organize code into packages

## What are Packages?

**Packages** are folders that organize related classes.

```
src/
  com/
    mycompany/
      project/
        Main.java
        models/
          User.java
        services/
          UserService.java
```

## Creating Packages

```java
// User.java
package com.mycompany.project.models;

public class User {
    private String name;
    private int id;
    
    // Constructor, getters, setters
}
```

## Using Classes from Packages

```java
// Main.java
package com.mycompany.project;

import com.mycompany.project.models.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
    }
}
```

## Package Naming Convention

Use reverse domain name:
- `com.company.project`
- `org.organization.project`
- `edu.university.project`

## Summary

✓ Packages organize classes
✓ Use reverse domain naming
✓ One class per file
✓ Package statement at top of file

## What's Next?

**[Next: Imports →](02-imports.md)**

---

[← Back to Module 10](README.md) | [Next: Imports →](02-imports.md)

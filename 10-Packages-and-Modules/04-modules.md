# Modules

Java modules (Java 9+) provide a higher level of organization above packages.

## 🎯 Learning Objectives

- Understand Java modules
- Create module-info.java
- Export and require modules
- Build modular applications

## What are Modules?

**Modules** group related packages and control what's visible to other modules.

## Module Declaration

`module-info.java`:

```java
module com.myapp {
    exports com.myapp.models;  // Export package
    requires java.sql;         // Require module
}
```

## Benefits of Modules

✓ **Encapsulation**: Hide internal packages
✓ **Reliability**: Explicit dependencies
✓ **Security**: Stronger access control
✓ **Performance**: Smaller runtime footprint

## Module Path vs Class Path

- **Module Path**: For modular JARs (Java 9+)
- **Class Path**: For traditional JARs

## Summary

✓ Modules organize packages
✓ Declared in module-info.java
✓ Explicit exports and requires
✓ Optional but recommended for large projects

## What's Next?

You've completed Module 10! Practice with exercises, then move to:

**[Module 11: Java Standard Library →](../11-Java-Standard-Library/README.md)**

---

[← Back to Access Modifiers](03-access-modifiers.md) | [Next: Module 11 →](../11-Java-Standard-Library/README.md)

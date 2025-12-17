# Java Syntax Cheat Sheet

Quick reference for core Java syntax. Keep this handy while coding!

## Program Structure

```java
// Basic Java Program
public class ClassName {
    public static void main(String[] args) {
        // Your code here
    }
}
```

## Comments

```java
// Single-line comment

/*
 * Multi-line comment
 * Can span multiple lines
 */

/**
 * JavaDoc comment
 * Used for documentation
 * @param name Description
 * @return Description
 */
```

## Variables & Types

```java
// Primitives
byte b = 127;                    // 8-bit integer
short s = 32000;                 // 16-bit integer
int i = 2147483647;             // 32-bit integer
long l = 9223372036854775807L;  // 64-bit integer
float f = 3.14f;                 // 32-bit decimal
double d = 3.14159265359;       // 64-bit decimal
char c = 'A';                    // Single character
boolean flag = true;             // true/false

// Reference
String text = "Hello";

// Constants
final double PI = 3.14159;
```

## Operators

```java
// Arithmetic: + - * / % ++ --
// Comparison: == != < > <= >=
// Logical: && || !
// Assignment: = += -= *= /= %=
// Ternary: condition ? true : false
```

## Control Flow

```java
// If-else
if (condition) {
} else if (condition) {
} else {
}

// Switch
switch (value) {
    case 1: break;
    default: break;
}

// Loops
while (condition) { }
do { } while (condition);
for (int i = 0; i < 10; i++) { }
for (Type item : collection) { }
```

## Arrays

```java
int[] arr = new int[5];
int[] arr = {1, 2, 3};
int[][] matrix = new int[3][4];
```

## Strings

```java
String s = "Hello";
s.length()
s.charAt(0)
s.substring(0, 5)
s.equals("other")
s.toUpperCase()
```

## Methods

```java
public returnType methodName(params) {
    return value;
}
```

## Classes

```java
public class MyClass {
    private int field;
    
    public MyClass(int field) {
        this.field = field;
    }
    
    public int getField() {
        return field;
    }
}

MyClass obj = new MyClass(10);
```

## Collections

```java
ArrayList<String> list = new ArrayList<>();
HashMap<String, Integer> map = new HashMap<>();
HashSet<String> set = new HashSet<>();
```

## Exception Handling

```java
try {
} catch (Exception e) {
} finally {
}
```

---

[← Back to Resources](../README.md)

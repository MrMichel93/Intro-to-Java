# Variables and Data Types

Variables are containers that store data in your program. Think of them as labeled boxes where you can put different types of information.

## 🎯 Learning Objectives

- Understand what variables are and why we use them
- Declare and initialize variables
- Know the eight primitive data types in Java
- Choose appropriate data types for different scenarios
- Understand type conversion and casting
- Use constants with the `final` keyword

## What is a Variable?

A **variable** is a named storage location in memory that holds a value. The value can change (vary) during program execution.

### Real-World Analogy

Think of variables like labeled containers:
- A **jar labeled "cookies"** can hold cookies (and the number can change)
- A **box labeled "age"** holds your age (changes each year)
- A **folder labeled "name"** holds your name (stays the same unless changed legally)

```java
int cookies = 10;     // Start with 10 cookies
cookies = cookies - 1; // Eat one cookie, now 9
cookies = cookies + 5; // Bake more, now 14
```

## Declaring Variables

In Java, you must **declare** a variable before using it.

### Syntax

```java
dataType variableName = value;
```

- **dataType**: What kind of data (int, double, boolean, etc.)
- **variableName**: Your chosen name (follow naming rules)
- **=**: Assignment operator
- **value**: The data to store
- **;**: End of statement

### Examples

```java
int age = 25;                    // Integer (whole number)
double price = 19.99;           // Decimal number
boolean isStudent = true;       // True or false
char grade = 'A';               // Single character
String name = "Alice";          // Text (multiple characters)
```

### Declaration Without Initialization

You can declare first, assign later:

```java
int score;        // Declaration
score = 100;      // Initialization
System.out.println(score);  // Prints: 100
```

### Multiple Declarations

```java
// Declare multiple variables of same type
int x, y, z;
x = 5;
y = 10;
z = 15;

// Or declare and initialize in one line
int a = 1, b = 2, c = 3;
```

## Primitive Data Types

Java has **8 primitive data types** - the building blocks for data manipulation.

### Integer Types (Whole Numbers)

| Type | Size | Range | Use Case |
|------|------|-------|----------|
| **byte** | 8 bits | -128 to 127 | Saving memory in large arrays |
| **short** | 16 bits | -32,768 to 32,767 | Saving memory |
| **int** | 32 bits | -2.1B to 2.1B | Default for integers |
| **long** | 64 bits | Very large | Big numbers, timestamps |

```java
byte smallNumber = 100;
short mediumNumber = 25000;
int normalNumber = 1000000;
long bigNumber = 9876543210L;  // Note the 'L' suffix!
```

**When to use which:**
- **byte**: Almost never (unless extreme memory optimization)
- **short**: Rarely (unless memory-constrained)
- **int**: Most of the time (default choice)
- **long**: Large numbers like timestamps, file sizes

### Floating-Point Types (Decimal Numbers)

| Type | Size | Precision | Use Case |
|------|------|-----------|----------|
| **float** | 32 bits | ~6-7 digits | Saving memory, less precision OK |
| **double** | 64 bits | ~15 digits | Default for decimals |

```java
float smallDecimal = 3.14f;        // Note the 'f' suffix!
double preciseDecimal = 3.14159265359;
```

**Important:** Always use **double** unless you have a specific reason to use float.

### Character Type

```java
char letter = 'A';           // Single quotes!
char digit = '7';
char symbol = '$';
char unicode = '\u0041';     // Unicode: 'A'
```

**Key Points:**
- Uses **single quotes** `' '`
- Stores **one character only**
- Actually stores a number (Unicode value)

### Boolean Type

```java
boolean isJavaFun = true;
boolean isFishMammal = false;
```

**Key Points:**
- Only two values: `true` or `false`
- Used for conditions and logic
- Not the same as 1/0 (unlike some languages)

### Reference Type: String

**String is NOT a primitive type** - it's a class. But we use it so often, we'll cover it here.

```java
String greeting = "Hello, World!";  // Double quotes!
String name = "Alice";
String empty = "";                  // Empty string
```

**Key Points:**
- Uses **double quotes** `" "`
- Can hold multiple characters
- Immutable (can't be changed after creation)

## Complete Example

```java
public class DataTypesDemo {
    public static void main(String[] args) {
        // Integer types
        byte myByte = 127;
        short myShort = 32000;
        int myInt = 2147483647;
        long myLong = 9223372036854775807L;
        
        // Floating-point types
        float myFloat = 3.14f;
        double myDouble = 3.14159265359;
        
        // Character type
        char myChar = 'J';
        
        // Boolean type
        boolean myBoolean = true;
        
        // String type
        String myString = "Hello, Java!";
        
        // Print all values
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);
        System.out.println("String: " + myString);
    }
}
```

## Naming Rules and Conventions

### Rules (Must Follow)

1. **Can contain**: letters, digits, underscore `_`, dollar sign `$`
2. **Must start with**: letter, `_`, or `$` (NOT a digit)
3. **Cannot use**: Java keywords (int, class, public, etc.)
4. **Case-sensitive**: `age` and `Age` are different variables

```java
// Valid names
int age;
int _age;
int $age;
int age2;
int myAge;

// Invalid names
int 2age;       // Starts with digit
int my-age;     // Contains hyphen
int my age;     // Contains space
int class;      // Java keyword
```

### Conventions (Should Follow)

1. **camelCase**: First word lowercase, capitalize each subsequent word
2. **Meaningful names**: `age` not `a`, `totalPrice` not `tp`
3. **No single letters**: Except for loop counters (i, j, k)

```java
// Good
int studentAge;
double totalPrice;
boolean isGameOver;
String firstName;

// Bad (but valid)
int a;           // Not descriptive
int TotalPrice;  // Should start with lowercase
int total_price; // Use camelCase, not snake_case
```

## Type Conversion

### Implicit Conversion (Automatic - Widening)

Java automatically converts smaller types to larger types:

```
byte → short → int → long → float → double
       char → int
```

```java
int myInt = 100;
long myLong = myInt;      // Automatic: int → long
double myDouble = myInt;  // Automatic: int → double

System.out.println(myLong);    // 100
System.out.println(myDouble);  // 100.0
```

**No data loss** - smaller container fits into larger container.

### Explicit Conversion (Casting - Narrowing)

Converting larger types to smaller types requires **casting**:

```java
double myDouble = 9.8;
int myInt = (int) myDouble;  // Cast: double → int

System.out.println(myInt);   // 9 (decimal part lost!)
```

**Syntax:** `(targetType) value`

**Warning:** May lose data!

```java
int bigNumber = 128;
byte smallNumber = (byte) bigNumber;  // Overflow!
System.out.println(smallNumber);      // -128 (wraps around)
```

### Converting Between Types

```java
// String to int
String strNum = "42";
int num = Integer.parseInt(strNum);

// int to String
int age = 25;
String strAge = String.valueOf(age);
// Or simply
String strAge2 = "" + age;  // Concatenate with empty string

// String to double
String strPrice = "19.99";
double price = Double.parseDouble(strPrice);
```

## Constants (final keyword)

**Constants** are variables whose values cannot change.

```java
final double PI = 3.14159265359;
final int DAYS_IN_WEEK = 7;
final String SCHOOL_NAME = "Java Academy";
```

**Conventions:**
- Use `final` keyword
- Name in ALL_CAPS with underscores
- Must initialize when declared

```java
final int MAX_STUDENTS = 30;
MAX_STUDENTS = 35;  // ERROR! Cannot change final variable
```

**When to use:**
- Mathematical constants (PI, E)
- Configuration values
- Fixed limits
- Anything that shouldn't change

## Common Mistakes

### 1. Using = instead of == for comparison

```java
int x = 5;
if (x = 10) {  // WRONG! This assigns, not compares
    // ...
}

if (x == 10) {  // CORRECT! This compares
    // ...
}
```

### 2. Integer division truncates

```java
int result = 7 / 2;
System.out.println(result);  // 3, not 3.5!

double correct = 7.0 / 2.0;  // 3.5
```

### 3. Forgetting L suffix for long literals

```java
long big = 9876543210;   // ERROR! Too big for int
long big = 9876543210L;  // CORRECT! L suffix
```

### 4. Using float without f suffix

```java
float num = 3.14;   // ERROR! 3.14 is double by default
float num = 3.14f;  // CORRECT! f suffix
```

### 5. Comparing Strings with ==

```java
String s1 = "hello";
String s2 = "hello";

if (s1 == s2) {  // WRONG! Compares references
    // ...
}

if (s1.equals(s2)) {  // CORRECT! Compares content
    // ...
}
```

## Practice Exercises

### Exercise 1: Variable Declaration

Declare variables for a student record:
- Name (String)
- Age (int)
- GPA (double)
- Is enrolled (boolean)
- Grade letter (char)

<details>
<summary>Solution</summary>

```java
String name = "Alice Johnson";
int age = 16;
double gpa = 3.85;
boolean isEnrolled = true;
char gradeLetter = 'A';
```

</details>

### Exercise 2: Type Conversion

```java
double price = 19.99;
// Convert to int (cast)
// Print both values
```

<details>
<summary>Solution</summary>

```java
double price = 19.99;
int roundedPrice = (int) price;
System.out.println("Original: " + price);    // 19.99
System.out.println("Rounded: " + roundedPrice);  // 19
```

</details>

### Exercise 3: Calculate Rectangle

```java
// Rectangle dimensions
int length = 10;
int width = 5;

// Calculate area
// Calculate perimeter
// Print results
```

<details>
<summary>Solution</summary>

```java
int length = 10;
int width = 5;

int area = length * width;
int perimeter = 2 * (length + width);

System.out.println("Area: " + area);          // 50
System.out.println("Perimeter: " + perimeter); // 30
```

</details>

## Summary

✓ Variables store data in labeled containers
✓ Java has 8 primitive types: byte, short, int, long, float, double, char, boolean
✓ Use **int** for whole numbers, **double** for decimals
✓ Use **camelCase** for variable names
✓ Implicit conversion is automatic (widening)
✓ Explicit conversion requires casting (narrowing)
✓ Use **final** for constants

## What's Next?

Now that you understand variables and types, learn how to perform operations on them:

**[Next: Operators →](02-operators.md)**

Or dive deeper into specific topics:
- [Primitive Types Details →](primitive-types.md)
- [Type Conversion Guide →](type-conversion.md)
- [Constants Guide →](constants.md)

---

[← Back to Module 1](README.md) | [Next: Operators →](02-operators.md)

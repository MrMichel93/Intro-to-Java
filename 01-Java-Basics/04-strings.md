# Working with Strings in Java

Strings are one of the most commonly used data types in programming. They represent text - sequences of characters. This lesson covers everything you need to know about working with strings in Java.

## 🎯 Learning Objectives

- Understand what Strings are and how they work
- Create and manipulate strings
- Use essential string methods
- Compare strings correctly
- Understand string immutability
- Build strings efficiently

## What is a String?

A **String** is a sequence of characters (letters, numbers, symbols). In Java, String is a class, not a primitive type.

```java
String greeting = "Hello, World!";
String name = "Alice";
String empty = "";  // Empty string
```

**Key Points:**
- Use double quotes `"` (not single quotes `'`)
- Strings are objects (reference type)
- Strings are immutable (cannot be changed after creation)

## Creating Strings

### String Literals

```java
String message = "Hello";
String text = "The answer is 42";
```

### Using new keyword

```java
String s1 = new String("Hello");  // Rarely used
String s2 = "Hello";              // Preferred way
```

**Best Practice:** Use string literals (`"text"`) - simpler and more efficient.

## String Immutability

**Strings cannot be changed once created.** Any operation that seems to modify a string actually creates a new string.

```java
String original = "Hello";
original.toUpperCase();  // Doesn't change original!
System.out.println(original);  // Still "Hello"

String modified = original.toUpperCase();  // Creates new string
System.out.println(modified);  // "HELLO"
```

**Why immutable?**
- Security (passwords, URLs)
- Thread-safe (multiple parts of program can safely share)
- Performance optimization (string pool)

## Essential String Methods

### Length

```java
String text = "Hello";
int length = text.length();  // 5

System.out.println("Length: " + length);
```

### Character Access

```java
String word = "Java";
char first = word.charAt(0);   // 'J'
char last = word.charAt(3);    // 'a'

// Index:  0123
// String: Java
```

**Note:** Indices start at 0!

### Substring (Extract Part)

```java
String text = "Hello, World!";

// substring(startIndex)
String part1 = text.substring(7);     // "World!"

// substring(startIndex, endIndex) - endIndex not included
String part2 = text.substring(0, 5);  // "Hello"
String part3 = text.substring(7, 12); // "World"
```

### Index Of (Find Position)

```java
String sentence = "The quick brown fox";

int pos1 = sentence.indexOf("quick");    // 4
int pos2 = sentence.indexOf("brown");    // 10
int pos3 = sentence.indexOf("z");        // -1 (not found)

int spacePos = sentence.indexOf(" ");    // 3 (first space)
int lastSpace = sentence.lastIndexOf(" "); // 16 (last space)
```

### Case Conversion

```java
String text = "Hello World";

String upper = text.toUpperCase();  // "HELLO WORLD"
String lower = text.toLowerCase();  // "hello world"

System.out.println(text);   // "Hello World" (original unchanged)
System.out.println(upper);  // "HELLO WORLD"
```

### Trim (Remove Spaces)

```java
String messy = "   Hello World   ";
String clean = messy.trim();

System.out.println("|" + messy + "|");  // |   Hello World   |
System.out.println("|" + clean + "|");  // |Hello World|
```

### Replace

```java
String text = "Hello World";
String replaced = text.replace('o', '*');  // "Hell* W*rld"
String replaced2 = text.replace("World", "Java");  // "Hello Java"
```

### Contains (Check if includes)

```java
String sentence = "Java is awesome";

boolean hasJava = sentence.contains("Java");     // true
boolean hasPython = sentence.contains("Python"); // false

if (sentence.contains("awesome")) {
    System.out.println("Positive message!");
}
```

### Starts With / Ends With

```java
String filename = "document.pdf";

boolean isPdf = filename.endsWith(".pdf");    // true
boolean isTxt = filename.endsWith(".txt");    // false

String url = "https://example.com";
boolean isSecure = url.startsWith("https");   // true
```

### Empty/Blank Check

```java
String s1 = "";
String s2 = "   ";
String s3 = "Hello";

System.out.println(s1.isEmpty());   // true (length is 0)
System.out.println(s2.isEmpty());   // false (has spaces)
System.out.println(s3.isEmpty());   // false

System.out.println(s1.isBlank());   // true
System.out.println(s2.isBlank());   // true (only whitespace)
System.out.println(s3.isBlank());   // false
```

## String Comparison

### WRONG: Using ==

```java
String s1 = "hello";
String s2 = "hello";
String s3 = new String("hello");

System.out.println(s1 == s2);   // true (sometimes - string pool)
System.out.println(s1 == s3);   // false (different objects)
```

**Never use `==` to compare strings!** It compares references, not content.

### CORRECT: Using equals()

```java
String s1 = "hello";
String s2 = "hello";
String s3 = "Hello";

System.out.println(s1.equals(s2));  // true (same content)
System.out.println(s1.equals(s3));  // false (case-sensitive)
```

### Case-Insensitive Comparison

```java
String s1 = "Hello";
String s2 = "hello";

System.out.println(s1.equalsIgnoreCase(s2));  // true
```

### Alphabetical Comparison

```java
String a = "apple";
String b = "banana";

int result = a.compareTo(b);
// result < 0: a comes before b
// result > 0: a comes after b
// result = 0: a equals b

if (result < 0) {
    System.out.println(a + " comes before " + b);
}
```

## String Concatenation

### Using + Operator

```java
String first = "Hello";
String second = "World";
String combined = first + " " + second;  // "Hello World"

String name = "Alice";
int age = 25;
String message = name + " is " + age + " years old";
// "Alice is 25 years old"
```

### Using concat()

```java
String s1 = "Hello";
String s2 = " World";
String result = s1.concat(s2);  // "Hello World"
```

### Watch Out: Concatenation with Numbers

```java
System.out.println("Result: " + 5 + 10);   // "Result: 510" (strings!)
System.out.println("Result: " + (5 + 10)); // "Result: 15" (math first)
```

## Splitting Strings

```java
String sentence = "Java is fun";
String[] words = sentence.split(" ");

for (String word : words) {
    System.out.println(word);
}
// Output:
// Java
// is
// fun
```

## Type Conversion

### String to Number

```java
String numStr = "42";
int num = Integer.parseInt(numStr);

String priceStr = "19.99";
double price = Double.parseDouble(priceStr);
```

### Number to String

```java
int age = 25;
String ageStr = String.valueOf(age);
// Or simply:
String ageStr2 = "" + age;

double price = 19.99;
String priceStr = String.valueOf(price);
```

## StringBuilder (Efficient String Building)

When concatenating many strings, use StringBuilder for better performance:

```java
// Inefficient (creates many temporary strings)
String result = "";
for (int i = 0; i < 1000; i++) {
    result += i;  // Bad!
}

// Efficient (modifies same object)
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append(i);
}
String result = sb.toString();
```

## Complete Example

```java
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();
        
        // Analysis
        int length = fullName.length();
        System.out.println("Length: " + length);
        
        String upper = fullName.toUpperCase();
        String lower = fullName.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        
        // Extract first name (if space exists)
        if (fullName.contains(" ")) {
            int spaceIndex = fullName.indexOf(" ");
            String firstName = fullName.substring(0, spaceIndex);
            String lastName = fullName.substring(spaceIndex + 1);
            
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            
            // Initials
            char firstInitial = firstName.charAt(0);
            char lastInitial = lastName.charAt(0);
            System.out.println("Initials: " + firstInitial + "." + lastInitial + ".");
        }
        
        // Check for specific text
        System.out.print("\nCheck if name contains: ");
        String search = input.nextLine();
        if (fullName.toLowerCase().contains(search.toLowerCase())) {
            System.out.println("Yes, found!");
        } else {
            System.out.println("Not found.");
        }
        
        input.close();
    }
}
```

## Common String Patterns

### Check if palindrome
```java
String word = "racecar";
String reversed = new StringBuilder(word).reverse().toString();
boolean isPalindrome = word.equals(reversed);
```

### Count occurrences
```java
String text = "hello world";
char target = 'l';
int count = 0;
for (int i = 0; i < text.length(); i++) {
    if (text.charAt(i) == target) {
        count++;
    }
}
System.out.println("Found " + count + " times");
```

### Reverse a string
```java
String original = "Hello";
String reversed = new StringBuilder(original).reverse().toString();
```

## Common Mistakes

### 1. Using == instead of equals()
```java
// WRONG
if (str1 == str2) { }

// CORRECT
if (str1.equals(str2)) { }
```

### 2. Index out of bounds
```java
String text = "Hi";
char ch = text.charAt(5);  // ERROR! Only indices 0, 1 exist
```

### 3. Forgetting immutability
```java
String text = "hello";
text.toUpperCase();  // Does nothing!
text = text.toUpperCase();  // Correct
```

## Summary

✓ Strings are immutable sequences of characters
✓ Use double quotes: `"text"`
✓ Length: `str.length()`
✓ Access character: `str.charAt(index)`
✓ Compare: `str.equals(other)` NOT `==`
✓ Case conversion: `toUpperCase()`, `toLowerCase()`
✓ Search: `indexOf()`, `contains()`
✓ Extract: `substring(start, end)`
✓ Many methods return new strings (immutability)

## What's Next?

You've completed Module 1! Practice with the exercises, then move to:

**[Module 2: Control Flow →](../02-Control-Flow/README.md)**

---

[← Back to Input/Output](03-input-output.md) | [Next: Module 2 →](../02-Control-Flow/README.md)

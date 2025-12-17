# Your First Java Program: Hello World

Every programmer's journey begins with "Hello World" - a simple program that displays text on the screen. This tradition dates back to the 1970s, and today, you're continuing it!

## 🎯 Learning Objectives

- Understand the structure of a basic Java program
- Learn about classes and the main method
- Write, compile, and run a Java program
- Understand what each line of code does
- Debug common first-program mistakes

## The Classic Hello World

Here's the simplest Java program:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Output:**
```
Hello, World!
```

Let's break down every single part of this program!

## Line-by-Line Breakdown

### Line 1: `public class HelloWorld {`

```java
public class HelloWorld {
```

Let's dissect each keyword:

**`public`**
- An **access modifier** - means this class can be accessed from anywhere
- Don't worry too much about this yet - we'll cover it in Module 5
- For now, just always use `public` for your main class

**`class`**
- **Keyword** that defines a class (a blueprint for objects)
- Everything in Java is inside a class
- Think of a class like a container for code

**`HelloWorld`**
- The **name** of our class
- **MUST match the filename** exactly: `HelloWorld.java`
- Uses **PascalCase** (capitalize first letter of each word)
- No spaces allowed in class names

**`{`**
- Opening **curly brace** - marks the beginning of the class
- Everything inside belongs to the class
- Must have a matching closing `}` at the end

### Line 2: `public static void main(String[] args) {`

```java
public static void main(String[] args) {
```

This is the **main method** - where your program starts running. Every standalone Java program needs exactly one main method.

**`public`**
- Makes the method accessible from anywhere
- Required so Java can find and run your program

**`static`**
- Means this method belongs to the class itself, not to any specific object
- Allows Java to run the method without creating an object
- We'll understand this better in Module 5

**`void`**
- The **return type** - means this method doesn't return any value
- Other methods might return numbers, text, etc.
- `void` = returns nothing

**`main`**
- The **method name** - MUST be exactly "main"
- Java looks for a method called "main" to start your program
- If you spell it differently, your program won't run

**`String[] args`**
- **Parameter** for command-line arguments
- `String[]` = array of strings
- `args` = array name (can be any name, but "args" is convention)
- Allows you to pass information to your program when running it
- We'll learn about this in Module 4

**`{`**
- Opening brace for the method
- Everything inside is the method's code

### Line 3: `System.out.println("Hello, World!");`

```java
System.out.println("Hello, World!");
```

This is a **statement** - an instruction that does something.

**`System`**
- A built-in Java class
- Provides system-level functionality
- Part of `java.lang` package (automatically imported)

**`out`**
- A **static variable** in the System class
- Represents the standard output stream (usually your terminal/console)
- Think of it as the "output channel"

**`println`**
- Short for "print line"
- A **method** that prints text and moves to the next line
- Pronounced "print-lin" or "print-line-n"

**`("Hello, World!")`**
- **Parentheses** contain the method's arguments
- `"Hello, World!"` is a **string** (text) we want to print
- Must be in **double quotes**

**`;`**
- **Semicolon** marks the end of a statement
- Every statement in Java must end with `;`
- Forgetting this is a very common beginner mistake!

### Lines 4-5: Closing Braces

```java
    }
}
```

**First `}`** - Closes the main method
**Second `}`** - Closes the HelloWorld class

Every opening `{` must have a matching closing `}`.

## Complete Annotated Version

```java
// This is a comment - ignored by the compiler

public class HelloWorld {                        // Define a class
    public static void main(String[] args) {    // Main method - program starts here
        System.out.println("Hello, World!");    // Print message to console
    }                                           // End of main method
}                                              // End of class
```

## Creating and Running Hello World

### Method 1: Using IDE (VS Code or IntelliJ)

Already covered in [IDE Setup](ide-setup.md). Just click the "Run" button!

### Method 2: Command Line

**Step 1: Create the file**

Open a text editor and type the Hello World code exactly as shown.

Save as `HelloWorld.java` in a folder (e.g., `Desktop` or `Documents/java-practice`)

**Important**: 
- Filename MUST be `HelloWorld.java` (capital H, capital W)
- Must match class name exactly
- Must end with `.java`

**Step 2: Open terminal/command prompt**

Navigate to the folder where you saved the file:

```bash
cd Desktop                    # or wherever you saved it
```

**Step 3: Compile**

```bash
javac HelloWorld.java
```

- `javac` = Java compiler
- Creates `HelloWorld.class` (bytecode file)
- If successful, no output (silence is golden!)
- If there are errors, they'll be shown

**Step 4: Run**

```bash
java HelloWorld
```

- `java` = Java runtime
- Notice: NO `.class` extension!
- Just use the class name

**Step 5: See output**

```
Hello, World!
```

**🎉 Congratulations!** You've written and run your first Java program!

## Variations and Experiments

Now that you understand the basics, try these variations:

### 1. Change the Message

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, I'm learning Java!");
        System.out.println("This is awesome!");
    }
}
```

**Output:**
```
Hello, I'm learning Java!
This is awesome!
```

Multiple statements run in order from top to bottom.

### 2. Print vs Println

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello");      // No line break
        System.out.print(" ");
        System.out.print("World");
        System.out.println("!");        // Line break after
        System.out.println("Next line");
    }
}
```

**Output:**
```
Hello World!
Next line
```

- `print()` - prints without moving to next line
- `println()` - prints and moves to next line

### 3. Print Numbers

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(42);
        System.out.println(3.14);
        System.out.println(2 + 2);
    }
}
```

**Output:**
```
42
3.14
4
```

Numbers don't need quotes!

### 4. Escape Sequences

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello\nWorld");     // \n = new line
        System.out.println("Hello\tWorld");     // \t = tab
        System.out.println("\"Quoted\"");       // \" = quote mark
        System.out.println("C:\\Users\\Alice"); // \\ = backslash
    }
}
```

**Output:**
```
Hello
World
Hello   World
"Quoted"
C:\Users\Alice
```

## Common Mistakes and How to Fix Them

### 1. Class name doesn't match filename

**❌ Wrong:**
```java
// Saved as HelloWorld.java
public class Hello {  // Class name doesn't match!
```

**Error:** `class Hello is public, should be declared in a file named Hello.java`

**✅ Fix:** Make sure class name matches filename exactly

### 2. Missing semicolon

**❌ Wrong:**
```java
System.out.println("Hello")  // Missing semicolon!
```

**Error:** `';' expected`

**✅ Fix:** Add semicolon at end of statement

### 3. Misspelled keywords

**❌ Wrong:**
```java
public class HelloWorld {
    public static void Main(String[] args) {  // Capital M in Main!
        System.out.println("Hello");
    }
}
```

**Error:** When running: `Error: Main method not found in class HelloWorld`

**✅ Fix:** Use lowercase `main`

### 4. Missing or mismatched braces

**❌ Wrong:**
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");
    // Missing closing brace for main
}
```

**Error:** `'}' expected` or `reached end of file while parsing`

**✅ Fix:** Count your braces - every `{` needs a matching `}`

### 5. Wrong quotes

**❌ Wrong:**
```java
System.out.println('Hello, World!');  // Single quotes!
```

**Error:** `unclosed character literal`

**✅ Fix:** Use double quotes for strings: `"Hello, World!"`

### 6. Typo in System.out.println

**❌ Wrong:**
```java
system.out.println("Hello");  // Lowercase 's' in system
```

**Error:** `package system does not exist`

**✅ Fix:** Use capital `S` in `System`

## Understanding Errors

When you see an error, Java tells you:

```
HelloWorld.java:3: error: ';' expected
        System.out.println("Hello")
                                   ^
1 error
```

**Reading the error:**
- `HelloWorld.java:3` - File and line number
- `error: ';' expected` - What's wrong
- `^` - Points to where the error was found
- `1 error` - How many errors total

**Pro Tip:** Fix errors from top to bottom. One error can cause multiple error messages!

## Comments in Java

Add notes to your code that the compiler ignores:

```java
// Single-line comment

/*
   Multi-line comment
   Can span multiple lines
*/

/**
 * JavaDoc comment
 * Used to generate documentation
 */

public class HelloWorld {
    public static void main(String[] args) {
        // This prints a message
        System.out.println("Hello, World!");  // Inline comment
    }
}
```

**When to use comments:**
- Explain complex logic
- Note why you did something (not what)
- Mark TODO items
- Credit sources

**When NOT to comment:**
- Don't state the obvious: `// print hello` is redundant
- Don't comment out code permanently - delete it
- Don't leave old code commented "just in case" - use git

## Your Turn! Exercises

Try these on your own:

### Exercise 1: Personal Greeting
Write a program that prints:
```
Hello, my name is [Your Name]
I am learning Java
This is fun!
```

<details>
<summary>Solution</summary>

```java
public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello, my name is Alice");
        System.out.println("I am learning Java");
        System.out.println("This is fun!");
    }
}
```

</details>

### Exercise 2: ASCII Art
Print your initials using text characters:

```
 A   A
A A A A
AAAAA A
A   A A
```

<details>
<summary>Hint</summary>

Use multiple `println()` statements, one per line. Put the pattern in quotes.

</details>

### Exercise 3: Math Printer
Print the results of:
- 10 + 5
- 10 - 5
- 10 * 5
- 10 / 5

<details>
<summary>Solution</summary>

```java
public class Math {
    public static void main(String[] args) {
        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
    }
}
```

</details>

## Self-Check Questions

Test your understanding:

1. What must the filename match in Java?
2. What does `public static void main(String[] args)` mean?
3. What's the difference between `print()` and `println()`?
4. Why do strings need double quotes?
5. What does the semicolon do?

<details>
<summary>Answers</summary>

1. The class name (exactly, including capitalization)
2. It's the entry point where Java starts running your program
3. `print()` stays on same line, `println()` moves to next line
4. To distinguish text from code - tells Java this is literal text
5. Marks the end of a statement

</details>

## Summary

✓ Java programs are organized in classes
✓ The main method is where execution starts
✓ `System.out.println()` prints text to console
✓ Statements end with semicolons
✓ Braces `{}` group code together
✓ Compile with `javac`, run with `java`

## What's Next?

You've written your first program! Next steps:

1. If you had any issues, check [Troubleshooting](troubleshooting.md)
2. Experiment with the variations above
3. When ready, move to **[Module 1: Java Basics](../01-Java-Basics/README.md)**

**Remember:** Every expert programmer started exactly where you are now. You've taken the first step!

---

[← Back to IDE Setup](ide-setup.md) | [Next: Module 1 →](../01-Java-Basics/README.md) | [Troubleshooting →](troubleshooting.md)

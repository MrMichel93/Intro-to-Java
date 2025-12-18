# Writing Files

Learn to write data to files.

## 🎯 Learning Objectives

- Write to files with PrintWriter
- Use BufferedWriter for efficiency
- Append vs overwrite
- Handle write exceptions

## Writing with PrintWriter

```java
import java.io.PrintWriter;
import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("output.txt")) {
            writer.println("Hello, World!");
            writer.println("Writing to file");
            writer.printf("Number: %d%n", 42);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Writing with BufferedWriter

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
    writer.write("Line 1");
    writer.newLine();
    writer.write("Line 2");
} catch (IOException e) {
    e.printStackTrace();
}
```

## Appending to File

```java
// Append mode (true parameter)
try (PrintWriter writer = new PrintWriter(new FileWriter("output.txt", true))) {
    writer.println("Appended line");
} catch (IOException e) {
    e.printStackTrace();
}
```

## Summary

✓ PrintWriter: Easy formatted writing
✓ BufferedWriter: Efficient for large writes
✓ Use append mode to add to existing files
✓ Always handle IOExceptions

## What's Next?

**[Next: File Operations →](04-file-operations.md)**

---

[← Back to Reading Files](02-reading-files.md) | [Next: File Operations →](04-file-operations.md)

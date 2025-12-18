# File Operations

Learn advanced file operations and working with CSV files.

## 🎯 Learning Objectives

- Process CSV files
- Copy and move files
- Work with file paths
- Handle file errors gracefully

## Reading CSV Files

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    System.out.print(value + " | ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Writing CSV Files

```java
import java.io.PrintWriter;
import java.io.IOException;

public class CSVWriter {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("output.csv")) {
            writer.println("Name,Age,City");
            writer.println("Alice,25,New York");
            writer.println("Bob,30,Los Angeles");
            writer.println("Charlie,28,Chicago");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Copy File

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

try {
    Files.copy(
        Paths.get("source.txt"),
        Paths.get("destination.txt"),
        StandardCopyOption.REPLACE_EXISTING
    );
    System.out.println("File copied");
} catch (IOException e) {
    e.printStackTrace();
}
```

## Summary

✓ CSV files: Use split(",") for parsing
✓ Files.copy() for copying files
✓ Handle file paths with Paths class
✓ Always handle IOExceptions

## What's Next?

You've completed Module 9! Practice with exercises, then move to:

**[Module 10: Packages and Modules →](../10-Packages-and-Modules/README.md)**

---

[← Back to Writing Files](03-writing-files.md) | [Next: Module 10 →](../10-Packages-and-Modules/README.md)

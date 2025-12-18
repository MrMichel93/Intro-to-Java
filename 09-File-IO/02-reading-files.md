# Reading Files

Learn different ways to read data from files.

## 🎯 Learning Objectives

- Read files with Scanner
- Use BufferedReader for efficiency
- Read line by line
- Handle file exceptions

## Reading with Scanner

Simple and convenient for text files.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
```

## Reading with BufferedReader

More efficient for large files.

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReader {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Reading All Lines

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

try {
    List<String> lines = Files.readAllLines(Paths.get("data.txt"));
    for (String line : lines) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

## Summary

✓ Scanner: Simple and easy
✓ BufferedReader: Efficient for large files
✓ Files.readAllLines(): Read all at once
✓ Always handle IOExceptions

## What's Next?

**[Next: Writing Files →](03-writing-files.md)**

---

[← Back to File Basics](01-file-basics.md) | [Next: Writing Files →](03-writing-files.md)

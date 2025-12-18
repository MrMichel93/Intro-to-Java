# File Basics

Learn to work with files and directories using Java's File class.

## 🎯 Learning Objectives

- Use File class for file operations
- Check if files exist
- Get file information
- Create and delete files
- Work with paths

## File Class

```java
import java.io.File;

File file = new File("data.txt");
```

## Checking File Existence

```java
File file = new File("data.txt");

if (file.exists()) {
    System.out.println("File exists");
} else {
    System.out.println("File not found");
}
```

## File Information

```java
File file = new File("data.txt");

System.out.println("Name: " + file.getName());
System.out.println("Path: " + file.getPath());
System.out.println("Absolute path: " + file.getAbsolutePath());
System.out.println("Size: " + file.length() + " bytes");
System.out.println("Is file? " + file.isFile());
System.out.println("Is directory? " + file.isDirectory());
```

## Creating Files and Directories

```java
import java.io.IOException;

// Create file
File file = new File("newfile.txt");
try {
    if (file.createNewFile()) {
        System.out.println("File created");
    }
} catch (IOException e) {
    e.printStackTrace();
}

// Create directory
File dir = new File("mydir");
if (dir.mkdir()) {
    System.out.println("Directory created");
}
```

## Deleting Files

```java
File file = new File("oldfile.txt");
if (file.delete()) {
    System.out.println("File deleted");
}
```

## Listing Directory Contents

```java
File dir = new File(".");
String[] files = dir.list();

for (String filename : files) {
    System.out.println(filename);
}
```

## Summary

✓ File class represents files and directories
✓ Check existence with exists()
✓ Get file info with getName(), length(), etc.
✓ Create with createNewFile() or mkdir()
✓ Delete with delete()

## What's Next?

**[Next: Reading Files →](02-reading-files.md)**

---

[← Back to Module 9](README.md) | [Next: Reading Files →](02-reading-files.md)

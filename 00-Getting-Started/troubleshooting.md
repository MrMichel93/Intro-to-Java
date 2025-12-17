# Troubleshooting Guide

Don't panic! Every programmer encounters setup and compilation issues. This guide will help you solve the most common problems.

## Table of Contents

1. [Installation Issues](#installation-issues)
2. [Compilation Errors](#compilation-errors)
3. [Runtime Errors](#runtime-errors)
4. [IDE Issues](#ide-issues)
5. [General Tips](#general-tips)

---

## Installation Issues

### Problem: "java is not recognized" or "command not found"

**Symptoms:**
```bash
$ java -version
'java' is not recognized as an internal or external command
```
or
```bash
$ java -version
bash: java: command not found
```

**Causes:**
- Java not installed
- Java not in PATH
- Terminal/Command Prompt not restarted after installation

**Solutions:**

1. **Verify Java is installed**
   - Windows: Check "C:\Program Files\Java" or "C:\Program Files\Amazon Corretto"
   - Mac: Check "/Library/Java/JavaVirtualMachines/"
   - Linux: Run `dpkg -l | grep jdk`

2. **Add Java to PATH** (see your OS-specific installation guide)

3. **Restart terminal/command prompt**
   - Close completely and reopen
   - On Windows, may need to restart computer

4. **Test with full path**
   ```bash
   # Windows
   "C:\Program Files\Amazon Corretto\jdk17.0.9_8\bin\java" -version
   
   # Mac/Linux
   /usr/lib/jvm/java-17-openjdk-amd64/bin/java -version
   ```
   If this works, it's definitely a PATH issue

### Problem: Wrong Java Version

**Symptom:**
```bash
$ java -version
java version "11.0.2"
```

But you need Java 17.

**Solution:**

**Windows:**
```bash
# Update environment variables to point to Java 17
# See Windows installation guide
```

**Mac:**
```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 17)
java -version
```

**Linux:**
```bash
sudo update-alternatives --config java
# Select Java 17 from the list
```

### Problem: JAVA_HOME not set

**Symptom:**
```bash
$ echo $JAVA_HOME

# Empty output
```

**Why it matters:** Some tools require JAVA_HOME to find Java

**Solution:**

See your OS-specific installation guide for setting JAVA_HOME.

**Quick test:**
```bash
# Should output Java installation path
echo $JAVA_HOME
```

---

## Compilation Errors

### Error: "class is public, should be declared in a file named..."

**Full error:**
```
HelloWorld.java:1: error: class Hello is public, should be declared in a file named Hello.java
public class Hello {
       ^
```

**Cause:** Class name doesn't match filename

**Solution:**
- If file is `HelloWorld.java`, class must be `HelloWorld`
- If class is `Hello`, file must be `Hello.java`
- Match them exactly (case-sensitive!)

### Error: "';' expected"

**Full error:**
```
HelloWorld.java:3: error: ';' expected
        System.out.println("Hello")
                                   ^
```

**Cause:** Missing semicolon at end of statement

**Solution:** Add semicolon:
```java
System.out.println("Hello");  // ← Added semicolon
```

### Error: "cannot find symbol"

**Full error:**
```
HelloWorld.java:3: error: cannot find symbol
        Systm.out.println("Hello");
        ^
  symbol:   variable Systm
  location: class HelloWorld
```

**Cause:** Typo in variable/method/class name

**Solution:** Check spelling carefully:
- `System` not `Systm`
- `String` not `string`
- `println` not `printLn`

### Error: "reached end of file while parsing"

**Full error:**
```
HelloWorld.java:5: error: reached end of file while parsing
}
^
```

**Cause:** Missing closing brace `}`

**Solution:** Count your braces:
```java
public class HelloWorld {       // Opening brace 1
    public static void main(String[] args) {  // Opening brace 2
        System.out.println("Hello");
    }                                        // Closing brace 2
}                                            // Closing brace 1
```

Every `{` needs a matching `}`!

**Pro Tip:** Most IDEs highlight matching braces when you click near one.

### Error: "unclosed string literal"

**Full error:**
```
HelloWorld.java:3: error: unclosed string literal
        System.out.println("Hello);
                          ^
```

**Cause:** Missing closing quote

**Solution:**
```java
System.out.println("Hello");  // Both quotes present
```

### Error: "illegal start of expression"

**Cause:** Usually a syntax mistake like:
- Missing opening brace
- Code outside of a method
- Wrong placement of keywords

**Solution:** Check code structure:
```java
public class HelloWorld {           // ← Class definition
    public static void main(String[] args) {  // ← Method
        // Your code here              // ← Statements go here
    }
}
```

### Error: "package system does not exist"

**Full error:**
```
HelloWorld.java:3: error: package system does not exist
        system.out.println("Hello");
```

**Cause:** Lowercase 's' in `System`

**Solution:**
```java
System.out.println("Hello");  // Capital S
```

---

## Runtime Errors

### Error: "Could not find or load main class"

**Full error:**
```
Error: Could not find or load main class HelloWorld
```

**Causes and Solutions:**

1. **Wrong directory**
   ```bash
   # Make sure you're in the directory with the .class file
   ls
   # Should show HelloWorld.class
   ```

2. **Typo in class name**
   ```bash
   java HelloWorld  # Correct
   java helloworld  # Wrong - case sensitive!
   ```

3. **Using .class extension**
   ```bash
   java HelloWorld.class  # Wrong!
   java HelloWorld        # Correct
   ```

4. **Forgot to compile**
   ```bash
   javac HelloWorld.java  # Compile first
   java HelloWorld        # Then run
   ```

### Error: "Main method not found in class"

**Full error:**
```
Error: Main method not found in class HelloWorld, please define the main method as:
   public static void main(String[] args)
```

**Causes:**
- Misspelled `main` (e.g., `Main`, `maine`)
- Wrong signature (e.g., missing `static`, wrong return type)
- main method not `public`

**Solution:** Use exact signature:
```java
public static void main(String[] args) {
    // Your code
}
```

All of these words must be exactly as shown!

### Error: "NoClassDefFoundError"

**Cause:** Java can't find the .class file, even though it compiled

**Solution:**
- Make sure you're in the right directory
- Recompile: `javac HelloWorld.java`
- Check for package statements (we'll cover this later)

---

## IDE Issues

### VS Code: Java extensions not working

**Symptoms:**
- No syntax highlighting
- No auto-complete
- Can't run Java files

**Solutions:**

1. **Check Java Extension Pack is installed**
   - Extensions sidebar (`Ctrl+Shift+X`)
   - Search "Java Extension Pack"
   - Should show "Installed"

2. **Check Java is detected**
   - Open Command Palette (`Ctrl+Shift+P`)
   - Type "Java: Configure Java Runtime"
   - Make sure Java 17 is listed

3. **Reload VS Code**
   - Command Palette → "Developer: Reload Window"

4. **Reinstall extensions**
   - Uninstall Java Extension Pack
   - Restart VS Code
   - Reinstall

### IntelliJ: "Cannot resolve symbol 'System'"

**Cause:** Project SDK not set or invalid

**Solution:**
1. File → Project Structure (or `Ctrl+Alt+Shift+S`)
2. Project Settings → Project
3. Set Project SDK to Java 17
4. Click Apply and OK

### IntelliJ: "Error: java: invalid source release: 17"

**Cause:** Project configured for wrong Java version

**Solution:**
1. File → Project Structure
2. Project Settings → Project
3. Set "Project language level" to "17 - Sealed types, always strict floating-point"
4. Project Settings → Modules → Sources
5. Set "Language level" to "17"
6. Click Apply and OK

### IDE is slow/freezing

**Solutions:**
- Close unused projects
- Increase IDE memory (Help → Edit Custom VM Options)
- Disable unnecessary plugins
- Check for IDE updates
- Restart IDE
- Restart computer

---

## General Tips

### How to Get Better Error Messages

**Use the `-Xdiags:verbose` flag:**
```bash
javac -Xdiags:verbose HelloWorld.java
```

This gives more detailed error information.

### How to Debug Effectively

1. **Read the error message carefully**
   - Location (file and line number)
   - What type of error
   - Where it points with `^`

2. **Check the line number**
   - Error might be on that line or the line before
   - Missing semicolons often reported on next line

3. **Use print statements**
   ```java
   System.out.println("Got to line 5");  // Debug print
   ```

4. **Comment out code**
   ```java
   // System.out.println("Testing");
   ```
   Helps isolate the problem

5. **Start from a working version**
   - If completely stuck, start with Hello World that works
   - Add your code back gradually

### Common Beginner Mistakes Checklist

Before asking for help, check:

- [ ] Class name matches filename exactly (case-sensitive)
- [ ] Every statement ends with semicolon `;`
- [ ] Every opening brace `{` has a closing brace `}`
- [ ] Strings are in double quotes `"like this"`
- [ ] Main method signature is exactly: `public static void main(String[] args)`
- [ ] You're in the right directory
- [ ] You compiled before running (`javac` then `java`)
- [ ] No .class extension when running (`java HelloWorld`, not `java HelloWorld.class`)

### Getting Help

When asking for help online:

1. **Include your code** (formatted properly)
2. **Include the full error message**
3. **Explain what you expected vs what happened**
4. **Mention your setup** (OS, Java version, IDE)
5. **Show what you've tried**

**Good question:**
> "I'm trying to run HelloWorld.java but getting 'class is public, should be declared in a file named Hello.java'. My class is named Hello but my file is HelloWorld.java. Do I change the class or filename?"

**Bad question:**
> "My code doesn't work help"

### Useful Resources

- **Stack Overflow**: Search your error message
- **Oracle Java Docs**: https://docs.oracle.com/en/java/
- **r/learnjava**: Reddit community for beginners
- **Course Discord/Forum**: Ask your classmates/instructor

### Prevention Tips

1. **Use an IDE** - Catches errors before compiling
2. **Enable auto-save** - Don't forget to save files
3. **Learn keyboard shortcuts** - More efficient
4. **Write small amounts, test often** - Don't write 100 lines then compile
5. **Keep a working version** - Use Git to track changes

## Still Stuck?

If you've tried everything and still stuck:

1. Take a break! Fresh eyes help
2. Try on a different computer
3. Uninstall and reinstall Java
4. Ask for help with details
5. Google the exact error message

**Remember:** Everyone gets errors. Even experienced developers spend time debugging. It's part of programming!

## Error Reference Quick Table

| Error Message | Likely Cause | Quick Fix |
|---------------|--------------|-----------|
| command not found | Java not in PATH | Add to PATH, restart terminal |
| class is public | Name mismatch | Match class name to filename |
| ';' expected | Missing semicolon | Add `;` at end of line |
| cannot find symbol | Typo | Check spelling |
| unclosed string | Missing quote | Add closing `"` |
| Could not find main class | Wrong directory or name | Check spelling, location |
| Main method not found | Wrong signature | Use exact: `public static void main(String[] args)` |

## Summary

✓ Most errors are typos or small mistakes
✓ Read error messages carefully - they tell you what's wrong
✓ Check the common mistakes checklist
✓ Google is your friend
✓ Take breaks when frustrated
✓ Everyone deals with errors - you're not alone!

---

[← Back to Hello World](hello-world.md) | [← Back to Module 0](README.md) | [Next: Module 1 →](../01-Java-Basics/README.md)

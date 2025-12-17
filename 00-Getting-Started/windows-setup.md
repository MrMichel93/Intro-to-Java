# Java Installation on Windows

This guide will walk you through installing Java 17 on Windows step by step.

## Prerequisites

- Windows 10 or Windows 11 (will work on Windows 7/8 too)
- Administrator access to your computer
- Internet connection
- About 10-15 minutes

## Step 1: Download Java 17

We'll use Amazon Corretto 17, a free and reliable Java distribution.

1. Open your web browser
2. Go to: https://aws.amazon.com/corretto/
3. Click on **"Download Corretto 17"**
4. Choose **Windows** → **x64** → **MSI installer**
   - File will be named something like: `amazon-corretto-17-x64-windows-jdk.msi`
5. Save the file to your Downloads folder

**Alternative**: If you prefer Oracle JDK, download from https://www.oracle.com/java/technologies/downloads/#java17

## Step 2: Run the Installer

1. Navigate to your Downloads folder
2. Double-click the `.msi` file you downloaded
3. If Windows asks "Do you want to allow this app to make changes?", click **Yes**
4. The Amazon Corretto installer will open

### Installation Wizard Steps:

**Welcome Screen**
- Click **Next**

**License Agreement**
- Read (or pretend to read 😉)
- Select "I accept the terms in the License Agreement"
- Click **Next**

**Custom Setup**
- Default options are fine
- **Important**: Make sure these are checked:
  - ✓ Add to PATH
  - ✓ Set JAVA_HOME variable
  - ✓ Associate .jar files
- Click **Next**

**Ready to Install**
- Review your choices
- Click **Install**
- Wait for installation to complete (1-2 minutes)

**Completion**
- Click **Finish**

## Step 3: Verify Installation

Now let's make sure Java installed correctly!

### Open Command Prompt

**Method 1**: Press `Windows Key + R`, type `cmd`, press Enter

**Method 2**: Press `Windows Key`, type `cmd`, press Enter

### Check Java Version

In the Command Prompt, type:

```bash
java -version
```

Press Enter. You should see something like:

```
openjdk version "17.0.9" 2023-10-17 LTS
OpenJDK Runtime Environment Corretto-17.0.9.8.1 (build 17.0.9+8-LTS)
OpenJDK 64-Bit Server VM Corretto-17.0.9.8.1 (build 17.0.9+8-LTS, mixed mode)
```

### Check Compiler Version

Type:

```bash
javac -version
```

You should see:

```
javac 17.0.9
```

**✅ Success!** If you see version 17, Java is installed correctly!

## Step 4: Set Environment Variables (If Not Automatic)

If the installer didn't set environment variables automatically, you'll need to do it manually.

### Find Java Installation Path

First, find where Java was installed. Default location is usually:
```
C:\Program Files\Amazon Corretto\jdk17.0.9_8
```

Your version numbers might be slightly different.

### Set JAVA_HOME

1. Press `Windows Key`
2. Type "environment variables"
3. Click "Edit the system environment variables"
4. Click **Environment Variables** button (bottom right)

**In System Variables section**:
5. Click **New**
6. Variable name: `JAVA_HOME`
7. Variable value: `C:\Program Files\Amazon Corretto\jdk17.0.9_8`
   (Use your actual path!)
8. Click **OK**

### Add Java to PATH

Still in Environment Variables window:

1. Find **Path** in System Variables
2. Select it and click **Edit**
3. Click **New**
4. Add: `%JAVA_HOME%\bin`
5. Click **OK** on all windows

### Verify Environment Variables

Close and reopen Command Prompt, then type:

```bash
echo %JAVA_HOME%
```

Should show: `C:\Program Files\Amazon Corretto\jdk17.0.9_8`

```bash
echo %PATH%
```

Should include Java's bin directory.

## Step 5: Test with Hello World

Let's write and run your first Java program!

### Create a Test File

1. Open Notepad
2. Type exactly:

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Windows!");
    }
}
```

3. Save as `Hello.java` (not .txt!)
   - Important: In Notepad, choose "All Files" as file type
   - Save to Desktop for easy access

### Compile and Run

Open Command Prompt in the location where you saved Hello.java:

```bash
cd Desktop
javac Hello.java
java Hello
```

You should see:
```
Hello, Windows!
```

**🎉 Congratulations!** Java is working perfectly!

## Troubleshooting Common Windows Issues

### "java is not recognized as an internal or external command"

**Cause**: Java not in PATH

**Solution**:
1. Follow Step 4 to set environment variables manually
2. Make sure to close and reopen Command Prompt after changes
3. Try running: `"C:\Program Files\Amazon Corretto\jdk17.0.9_8\bin\java" -version`
   (Use your actual path)
   If this works, it's definitely a PATH issue

### Multiple Java Versions Installed

**Symptom**: Wrong version shows when running `java -version`

**Solution**:
1. Uninstall old Java versions:
   - Open Settings → Apps → Apps & features
   - Search for "Java"
   - Uninstall old versions
2. Keep only Java 17
3. Verify again with `java -version`

### Permission Denied Errors

**Solution**:
- Run Command Prompt as Administrator
  - Right-click Command Prompt
  - Choose "Run as administrator"

### Installer Fails

**Solutions**:
- Make sure Windows is up to date
- Try running installer as Administrator (right-click → Run as administrator)
- Temporarily disable antivirus during installation
- Download installer again (file might be corrupted)

## Tips for Windows Users

### Use Windows Terminal (Windows 11)

Windows Terminal is better than Command Prompt:
- Multiple tabs
- Better copy/paste
- Prettier output

Download from Microsoft Store: "Windows Terminal"

### Use PowerShell

PowerShell is more powerful than Command Prompt:
- Press `Windows Key`
- Type "PowerShell"
- All same commands work (java, javac, etc.)

### Pin Command Prompt to Taskbar

You'll use it a lot!
1. Search for "cmd"
2. Right-click Command Prompt
3. Choose "Pin to taskbar"

## What's Next?

✅ Java 17 is installed
✅ Environment variables are set
✅ Verified with java -version
✅ Ran your first Java program

**Next Step**: [Set up your IDE →](ide-setup.md)

We'll install VS Code or IntelliJ IDEA to make coding easier and more enjoyable!

---

[← Back to Installation Guide](installation-guide.md) | [Next: IDE Setup →](ide-setup.md)

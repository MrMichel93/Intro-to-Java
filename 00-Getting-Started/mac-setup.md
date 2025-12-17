# Java Installation on macOS

This guide will walk you through installing Java 17 on macOS step by step.

## Prerequisites

- macOS 10.14 (Mojave) or later
- Administrator access
- Internet connection
- About 10-15 minutes

## Step 1: Check if Java is Already Installed

Open Terminal:
- Press `Cmd + Space`
- Type "Terminal"
- Press Enter

Type:
```bash
java -version
```

If you see version 17, you're done! Otherwise, continue with installation.

## Step 2: Download Java 17

We'll use Amazon Corretto 17.

### Option A: Download via Browser

1. Go to: https://aws.amazon.com/corretto/
2. Click **"Download Corretto 17"**
3. Choose **macOS**
   - For M1/M2 Macs (Apple Silicon): Choose **aarch64** (ARM64)
   - For Intel Macs: Choose **x64**
4. Download the `.pkg` installer

### Option B: Download via Terminal (Easier!)

**For Apple Silicon (M1/M2 Macs)**:
```bash
curl -LO https://corretto.aws/downloads/latest/amazon-corretto-17-aarch64-macos-jdk.pkg
```

**For Intel Macs**:
```bash
curl -LO https://corretto.aws/downloads/latest/amazon-corretto-17-x64-macos-jdk.pkg
```

## Step 3: Install Java

### Via Downloaded .pkg File

1. Double-click the `.pkg` file
2. Click **Continue**
3. Click **Continue** on the Introduction
4. Click **Agree** to accept license
5. Click **Install**
6. Enter your Mac password when prompted
7. Click **Close** when complete

## Step 4: Verify Installation

In Terminal:

```bash
java -version
```

Should show:
```
openjdk version "17.0.9" 2023-10-17 LTS
OpenJDK Runtime Environment Corretto-17.0.9.8.1 (build 17.0.9+8-LTS)
OpenJDK 64-Bit Server VM Corretto-17.0.9.8.1 (build 17.0.9+8-LTS, mixed mode)
```

```bash
javac -version
```

Should show:
```
javac 17.0.9
```

**✅ Success!** If you see version 17, you're ready to code!

## Step 5: Set JAVA_HOME (Recommended)

Some tools need the JAVA_HOME environment variable. Let's set it permanently.

### Find Java Location

```bash
/usr/libexec/java_home -v 17
```

This shows where Java 17 is installed. Should output something like:
```
/Library/Java/JavaVirtualMachines/amazon-corretto-17.jdk/Contents/Home
```

### Set JAVA_HOME Permanently

**For Bash (older Macs)**:
```bash
echo 'export JAVA_HOME=$(/usr/libexec/java_home -v 17)' >> ~/.bash_profile
echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.bash_profile
source ~/.bash_profile
```

**For Zsh (macOS Catalina and later - default)**:
```bash
echo 'export JAVA_HOME=$(/usr/libexec/java_home -v 17)' >> ~/.zshrc
echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.zshrc
source ~/.zshrc
```

### Verify JAVA_HOME

```bash
echo $JAVA_HOME
```

Should show:
```
/Library/Java/JavaVirtualMachines/amazon-corretto-17.jdk/Contents/Home
```

## Step 6: Test with Hello World

Let's write your first Java program!

### Create Test File

```bash
cd ~/Desktop
cat > Hello.java << 'EOF'
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Mac!");
    }
}
EOF
```

### Compile and Run

```bash
javac Hello.java
java Hello
```

Output:
```
Hello, Mac!
```

**🎉 Congratulations!** Java is working perfectly on your Mac!

## Troubleshooting macOS Issues

### Multiple Java Versions

**List all installed Java versions**:
```bash
/usr/libexec/java_home -V
```

**Switch between versions**:
```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 17)
```

**Remove old Java versions**:
```bash
sudo rm -rf /Library/Java/JavaVirtualMachines/jdk-11.jdk
```
(Replace with actual version to remove)

### "java" command not found

**Solution**:
1. Reinstall Java
2. Make sure JAVA_HOME is set correctly
3. Close and reopen Terminal

### Permission Issues

**Solution**:
```bash
sudo chmod -R 755 /Library/Java/JavaVirtualMachines/
```

### Gatekeeper Blocking Installation

**Error**: "can't be opened because it is from an unidentified developer"

**Solution**:
1. System Preferences → Security & Privacy
2. Click lock icon, enter password
3. Click "Open Anyway" next to the Java installer message
4. Try installation again

## Using Homebrew (Alternative Method)

If you use Homebrew package manager:

```bash
# Install Homebrew if not installed
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

# Install Java 17
brew install openjdk@17

# Link it
sudo ln -sfn /usr/local/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk

# Set JAVA_HOME
echo 'export PATH="/usr/local/opt/openjdk@17/bin:$PATH"' >> ~/.zshrc
source ~/.zshrc
```

## macOS Tips

### Use iTerm2 (Better Terminal)

iTerm2 is a superior terminal for macOS:
- Split panes
- Better search
- More customization

Download: https://iterm2.com/

### Spotlight for Quick Access

- Press `Cmd + Space`
- Type "Terminal"
- Press Enter

### Terminal Shortcuts

- `Cmd + T` - New tab
- `Cmd + N` - New window
- `Cmd + K` - Clear screen
- `Ctrl + C` - Stop running program
- `Ctrl + A` - Go to line start
- `Ctrl + E` - Go to line end

## What's Next?

✅ Java 17 is installed
✅ JAVA_HOME is set
✅ Verified installation
✅ Ran your first program

**Next Step**: [Set up your IDE →](ide-setup.md)

Let's install VS Code or IntelliJ IDEA for a better coding experience!

---

[← Back to Installation Guide](installation-guide.md) | [Next: IDE Setup →](ide-setup.md)

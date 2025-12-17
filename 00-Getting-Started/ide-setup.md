# IDE Setup for Java Development

An **IDE (Integrated Development Environment)** is a powerful text editor designed specifically for programming. It makes coding much easier with features like:

- **Syntax highlighting**: Colors code for readability
- **Auto-completion**: Suggests code as you type
- **Error detection**: Shows errors before you compile
- **Debugging tools**: Step through code to find bugs
- **Project management**: Organize multiple files

For this course, we recommend either **VS Code** or **IntelliJ IDEA**. Both are excellent and free.

## Choose Your IDE

### VS Code (Visual Studio Code)
**Best for**: Beginners, lightweight setup, versatile for multiple languages

**Pros**:
- ✓ Lightweight and fast
- ✓ Works for many programming languages
- ✓ Huge extension marketplace
- ✓ Great for web development too
- ✓ Customizable

**Cons**:
- ✗ Requires extension setup for Java
- ✗ Slightly less Java-specific features

### IntelliJ IDEA Community Edition
**Best for**: Java-focused development, advanced features

**Pros**:
- ✓ Built specifically for Java
- ✓ Powerful refactoring tools
- ✓ Excellent code completion
- ✓ Professional-grade features
- ✓ Works out of the box

**Cons**:
- ✗ Heavier on system resources
- ✗ Steeper learning curve

**Our Recommendation**: Start with **VS Code** if you're a complete beginner or want a lightweight tool. Choose **IntelliJ IDEA** if you're serious about Java development.

---

## Option 1: VS Code Setup

### Step 1: Install VS Code

**Windows**:
1. Go to https://code.visualstudio.com/
2. Click "Download for Windows"
3. Run the installer
4. Check "Add to PATH"
5. Complete installation

**macOS**:
```bash
# Via browser
Visit https://code.visualstudio.com/
Download .dmg file
Drag to Applications folder

# Or via Homebrew
brew install --cask visual-studio-code
```

**Linux (Ubuntu/Debian)**:
```bash
sudo apt update
sudo apt install wget gpg
wget -qO- https://packages.microsoft.com/keys/microsoft.asc | gpg --dearmor > packages.microsoft.gpg
sudo install -o root -g root -m 644 packages.microsoft.gpg /etc/apt/trusted.gpg.d/
sudo sh -c 'echo "deb [arch=amd64] https://packages.microsoft.com/repos/code stable main" > /etc/apt/sources.list.d/vscode.list'
sudo apt update
sudo apt install code
```

### Step 2: Install Java Extension Pack

1. Open VS Code
2. Click Extensions icon (or press `Ctrl+Shift+X` / `Cmd+Shift+X`)
3. Search for "Java Extension Pack"
4. Click "Install" on the one by Microsoft
5. Wait for installation (includes 6 extensions):
   - Language Support for Java
   - Debugger for Java
   - Test Runner for Java
   - Maven for Java
   - Project Manager for Java
   - Visual Studio IntelliCode

### Step 3: Configure Java

1. Open VS Code Settings (`Ctrl+,` / `Cmd+,`)
2. Search for "java home"
3. Click "Edit in settings.json"
4. Add:

**Windows**:
```json
{
    "java.home": "C:\\Program Files\\Amazon Corretto\\jdk17.0.9_8",
    "java.configuration.runtimes": [
        {
            "name": "JavaSE-17",
            "path": "C:\\Program Files\\Amazon Corretto\\jdk17.0.9_8"
        }
    ]
}
```

**macOS/Linux**:
```json
{
    "java.home": "/Library/Java/JavaVirtualMachines/amazon-corretto-17.jdk/Contents/Home",
    "java.configuration.runtimes": [
        {
            "name": "JavaSE-17",
            "path": "/Library/Java/JavaVirtualMachines/amazon-corretto-17.jdk/Contents/Home"
        }
    ]
}
```

Adjust paths to match your installation!

### Step 4: Create Your First Java Project

1. Open VS Code
2. Press `Ctrl+Shift+P` / `Cmd+Shift+P` (Command Palette)
3. Type "Java: Create Java Project"
4. Select "No build tools"
5. Choose a folder location
6. Enter project name: "HelloWorld"
7. VS Code creates project structure

### Step 5: Write and Run Code

1. Open `src/App.java` (created automatically)
2. Replace content with:

```java
public class App {
    public static void main(String[] args) {
        System.out.println("Hello from VS Code!");
    }
}
```

3. Right-click in the editor
4. Select "Run Java"
5. See output in terminal at bottom

**🎉 Success!** You're ready to code in VS Code!

### Useful VS Code Shortcuts

- `Ctrl+Space` / `Cmd+Space`: Auto-complete
- `F5`: Start debugging
- `Ctrl+Shift+P` / `Cmd+Shift+P`: Command palette
- `Ctrl+` / `Cmd+`: Open terminal
- `Ctrl+B` / `Cmd+B`: Toggle sidebar
- `Ctrl+/` / `Cmd+/`: Comment/uncomment line

### Recommended VS Code Extensions for Java

- **Extension Pack for Java** (already installed)
- **Error Lens**: Shows errors inline
- **Bracket Pair Colorizer**: Colors matching brackets
- **GitLens**: Git integration
- **Material Icon Theme**: Pretty file icons

---

## Option 2: IntelliJ IDEA Setup

### Step 1: Download IntelliJ IDEA Community Edition

Go to: https://www.jetbrains.com/idea/download/

**Choose Community Edition** (free, not Ultimate)

**Windows**: Download .exe installer
**macOS**: Download .dmg file
**Linux**: Download .tar.gz file

### Step 2: Install IntelliJ IDEA

**Windows**:
1. Run the .exe installer
2. Click "Next" through wizard
3. Choose installation options:
   - ✓ Create Desktop Shortcut
   - ✓ Update PATH variable
   - ✓ Add "Open Folder as Project"
   - ✓ .java file association
4. Click "Install"
5. Click "Finish"

**macOS**:
1. Open .dmg file
2. Drag IntelliJ IDEA to Applications folder
3. Open from Applications

**Linux**:
```bash
cd ~/Downloads
tar -xzf ideaIC-*.tar.gz
sudo mv idea-IC-* /opt/idea
cd /opt/idea/bin
./idea.sh
```

### Step 3: First Launch Configuration

1. Launch IntelliJ IDEA
2. **Do Not Import Settings** (first time)
3. Choose theme (Darcula is popular)
4. Skip remaining plugin suggestions (click "Skip All")
5. Click "Start using IntelliJ IDEA"

### Step 4: Create Your First Project

1. Click "New Project"
2. Select "Java" in left sidebar
3. Choose Project SDK:
   - Click "Add SDK" → "Download JDK" if Java 17 not listed
   - Or select your installed Java 17
4. Click "Next"
5. Check "Create project from template"
6. Select "Command Line App"
7. Click "Next"
8. Project name: "HelloWorld"
9. Base package: "com.example"
10. Click "Finish"

### Step 5: Write and Run Code

IntelliJ creates `Main.java` automatically:

```java
package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from IntelliJ!");
    }
}
```

**To Run**:
- Click green play button (▶) next to `main` method
- Or right-click file → "Run 'Main.main()'"
- Or press `Shift+F10` (Windows/Linux) / `Ctrl+R` (Mac)

**🎉 Success!** IntelliJ is ready!

### Useful IntelliJ Shortcuts

- `Ctrl+Space` / `Cmd+Space`: Auto-complete
- `Shift+F10` / `Ctrl+R`: Run
- `Shift+F9` / `Ctrl+D`: Debug
- `Ctrl+/` / `Cmd+/`: Comment/uncomment
- `Ctrl+Alt+L` / `Cmd+Alt+L`: Format code
- `Shift+Shift`: Search everything
- `Alt+Enter` / `Option+Enter`: Quick fix

### Customizing IntelliJ

**Change Font Size**:
1. File → Settings (Windows/Linux) / IntelliJ IDEA → Preferences (Mac)
2. Editor → Font
3. Adjust size

**Change Theme**:
1. File → Settings / Preferences
2. Appearance & Behavior → Appearance
3. Choose theme

---

## VS Code vs IntelliJ: Quick Comparison

| Feature | VS Code | IntelliJ IDEA |
|---------|---------|---------------|
| Learning Curve | Easy | Moderate |
| Speed/Performance | Fast | Slower start |
| Memory Usage | Light (~200MB) | Heavy (~500MB+) |
| Setup Time | 5 minutes | 5 minutes |
| Java Features | Good | Excellent |
| Refactoring | Basic | Advanced |
| Multi-Language | Excellent | Java-focused |
| Cost | Free | Free (Community) |

## Both IDEs Can Do

✓ Syntax highlighting
✓ Auto-completion
✓ Error detection
✓ Debugging
✓ Git integration
✓ Terminal access
✓ Extensions/Plugins

## Command Line Alternative

You can also use any text editor + command line:

**Simple Editors**:
- Notepad++ (Windows)
- Sublime Text (All platforms)
- Vim/Neovim (Terminal-based)
- Nano (Linux/Mac terminal)

**Compile and run manually**:
```bash
javac MyProgram.java
java MyProgram
```

This is totally valid but more work!

## Troubleshooting IDE Issues

### VS Code: "Java runtime could not be located"

**Solution**:
1. Make sure Java 17 is installed (`java -version`)
2. Set `java.home` in VS Code settings
3. Reload VS Code

### IntelliJ: "No JDK found"

**Solution**:
1. File → Project Structure → SDKs
2. Click "+" → "Add JDK"
3. Navigate to Java installation folder
4. Click "OK"

### VS Code: Extensions not working

**Solution**:
1. Uninstall Java Extension Pack
2. Restart VS Code
3. Reinstall Extension Pack
4. Reload window

### IntelliJ: "Cannot start compiler"

**Solution**:
1. File → Invalidate Caches
2. Click "Invalidate and Restart"

### Both: Code runs but errors shown

**Solution**:
- IDE may be using wrong Java version
- Check Project SDK/Java Home settings
- Make sure pointing to Java 17

## What's Next?

✅ IDE is installed
✅ Java extensions/plugins configured
✅ Created and ran first project
✅ Familiar with basic shortcuts

**Next Step**: [Write Hello World →](hello-world.md)

Let's understand your first Java program in detail!

---

[← Back to Installation](installation-guide.md) | [Next: Hello World →](hello-world.md)

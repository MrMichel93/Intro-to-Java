# Java Installation on Linux

This guide covers installing Java 17 on various Linux distributions.

## Prerequisites

- Linux (Ubuntu, Debian, Fedora, Arch, or other)
- Terminal access
- sudo privileges
- Internet connection
- About 10-15 minutes

## Quick Installation by Distribution

### Ubuntu / Debian / Linux Mint

```bash
# Update package list
sudo apt update

# Install Java 17
sudo apt install openjdk-17-jdk -y

# Verify installation
java -version
javac -version
```

### Fedora / CentOS / RHEL

```bash
# Install Java 17
sudo dnf install java-17-openjdk-devel -y

# Or on older systems:
# sudo yum install java-17-openjdk-devel -y

# Verify
java -version
javac -version
```

### Arch Linux / Manjaro

```bash
# Install Java 17
sudo pacman -S jdk17-openjdk

# Verify
java -version
javac -version
```

### openSUSE

```bash
# Install Java 17
sudo zypper install java-17-openjdk-devel

# Verify
java -version
javac -version
```

## Detailed Installation (Ubuntu/Debian)

This is the most detailed guide. Other distributions are similar.

### Step 1: Update Package List

```bash
sudo apt update
sudo apt upgrade -y
```

### Step 2: Check if Java is Installed

```bash
java -version
```

If you see "command not found" or a version other than 17, proceed with installation.

### Step 3: Install OpenJDK 17

```bash
sudo apt install openjdk-17-jdk -y
```

This will download and install:
- Java Runtime Environment (JRE)
- Java Development Kit (JDK)
- All necessary libraries

Installation will take 2-5 minutes depending on your internet speed.

### Step 4: Verify Installation

```bash
java -version
```

Should show:
```
openjdk version "17.0.9" 2023-10-17
OpenJDK Runtime Environment (build 17.0.9+9-Ubuntu-1)
OpenJDK 64-Bit Server VM (build 17.0.9+9-Ubuntu-1, mixed mode, sharing)
```

```bash
javac -version
```

Should show:
```
javac 17.0.9
```

### Step 5: Set JAVA_HOME (If Needed)

Find Java installation path:
```bash
sudo update-alternatives --config java
```

This shows the path, usually something like:
```
/usr/lib/jvm/java-17-openjdk-amd64
```

Set JAVA_HOME permanently:

**For Bash**:
```bash
echo 'export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64' >> ~/.bashrc
echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.bashrc
source ~/.bashrc
```

**For Zsh**:
```bash
echo 'export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64' >> ~/.zshrc
echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.zshrc
source ~/.zshrc
```

Verify:
```bash
echo $JAVA_HOME
```

## Alternative: Manual Installation (All Distributions)

If OpenJDK 17 isn't in your repositories, use Amazon Corretto:

### Download Corretto

```bash
cd ~/Downloads
wget https://corretto.aws/downloads/latest/amazon-corretto-17-x64-linux-jdk.tar.gz
```

### Extract

```bash
tar -xzf amazon-corretto-17-x64-linux-jdk.tar.gz
sudo mv amazon-corretto-17.* /opt/amazon-corretto-17
```

### Set Environment Variables

```bash
echo 'export JAVA_HOME=/opt/amazon-corretto-17' >> ~/.bashrc
echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.bashrc
source ~/.bashrc
```

### Verify

```bash
java -version
javac -version
```

## Step 6: Test with Hello World

Create test file:

```bash
cd ~
cat > Hello.java << 'EOF'
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Linux!");
    }
}
EOF
```

Compile and run:

```bash
javac Hello.java
java Hello
```

Output:
```
Hello, Linux!
```

**🎉 Success!** Java is working on Linux!

## Managing Multiple Java Versions

### List Installed Versions

```bash
update-alternatives --list java
```

### Switch Java Version

```bash
sudo update-alternatives --config java
```

This shows a menu:
```
Selection    Path                                            Priority
* 0          /usr/lib/jvm/java-17-openjdk-amd64/bin/java      1711
  1          /usr/lib/jvm/java-11-openjdk-amd64/bin/java      1111
```

Enter the number for Java 17 and press Enter.

### Set Default Java Version

```bash
sudo update-alternatives --set java /usr/lib/jvm/java-17-openjdk-amd64/bin/java
sudo update-alternatives --set javac /usr/lib/jvm/java-17-openjdk-amd64/bin/javac
```

## Troubleshooting Linux Issues

### "E: Unable to locate package openjdk-17-jdk"

**Solution**: Update repositories
```bash
sudo apt update
sudo apt upgrade
```

If still not found, add universe repository (Ubuntu):
```bash
sudo add-apt-repository universe
sudo apt update
```

### Permission Denied Errors

**Solution**: Use sudo
```bash
sudo apt install openjdk-17-jdk
```

### JAVA_HOME Not Set

**Check if set**:
```bash
echo $JAVA_HOME
```

**If empty, add to shell config**:
```bash
export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which java))))
echo 'export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which java))))' >> ~/.bashrc
```

### Old Java Version Still Appears

**Solution**: Update alternatives
```bash
sudo update-alternatives --config java
sudo update-alternatives --config javac
```

### "javac: command not found" but java works

**Solution**: Install full JDK, not just JRE
```bash
sudo apt install openjdk-17-jdk
```

## Linux Distribution-Specific Notes

### Ubuntu LTS Versions

- Ubuntu 22.04 LTS: OpenJDK 17 available by default
- Ubuntu 20.04 LTS: May need to add repository
- Ubuntu 18.04 LTS: Recommend manual installation

### Fedora

Fedora typically has latest Java in repositories:
```bash
sudo dnf search openjdk
```

### Arch Linux

Always has cutting-edge packages:
```bash
yay -Ss jdk  # Search available JDKs
```

### WSL (Windows Subsystem for Linux)

Follow Ubuntu instructions if using WSL with Ubuntu.

## Linux Tips

### Create Aliases

Add to ~/.bashrc or ~/.zshrc:

```bash
alias jc='javac'
alias jr='java'
alias jver='java -version'
```

Then:
```bash
jc Hello.java
jr Hello
```

### Use Fish Shell

Fish shell has better autocomplete:
```bash
sudo apt install fish
fish
```

### Terminal Emulators

Better terminal experiences:
- **Tilix**: Tiling terminal
- **Terminator**: Multiple terminals in one window
- **Alacritty**: GPU-accelerated, very fast

### Command Line Java REPL

Try JShell (Java's interactive shell):
```bash
jshell
```

```java
jshell> System.out.println("Hello!")
Hello!
jshell> /exit
```

## What's Next?

✅ Java 17 is installed
✅ JAVA_HOME is set (if needed)
✅ Verified with java -version
✅ Ran your first Java program

**Next Step**: [Set up your IDE →](ide-setup.md)

Let's install VS Code or IntelliJ IDEA for better development!

---

[← Back to Installation Guide](installation-guide.md) | [Next: IDE Setup →](ide-setup.md)

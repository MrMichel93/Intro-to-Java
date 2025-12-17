# Java Installation Guide

This guide will help you install the Java Development Kit (JDK) on your computer. Choose your operating system below and follow the instructions carefully.

## Choose Your Operating System

- [Windows Installation →](windows-setup.md)
- [macOS Installation →](mac-setup.md)
- [Linux Installation →](linux-setup.md)

## Which Java Version Should I Install?

For this course, we recommend **Java 17 LTS** (Long Term Support).

### Why Java 17?
- **Long Term Support**: Maintained until 2029
- **Modern Features**: Includes helpful modern Java features
- **Industry Standard**: Widely used in professional environments
- **Stable**: Mature and well-tested

### Where to Download Java 17?

We recommend one of these distributions:

1. **Amazon Corretto 17** (Recommended for beginners)
   - Free, no-hassle installation
   - Great performance
   - Download: https://aws.amazon.com/corretto/

2. **Oracle JDK 17**
   - Official Oracle distribution
   - Free for development and personal use
   - Download: https://www.oracle.com/java/technologies/downloads/

3. **Adoptium Eclipse Temurin 17**
   - Community-driven, open source
   - Download: https://adoptium.net/

**For this course, we'll use Amazon Corretto 17** in our examples, but any Java 17 distribution will work fine.

## Quick Installation Overview

Here's what you'll do (detailed steps in OS-specific guides):

1. **Download JDK 17** for your operating system
2. **Run the installer** - Follow the installation wizard
3. **Set environment variables** (JAVA_HOME and PATH)
4. **Verify installation** - Run `java -version` and `javac -version`
5. **Troubleshoot** if needed

## What Gets Installed?

When you install the JDK, you get:

- **Java Compiler** (`javac`) - Converts .java files to .class files
- **Java Runtime** (`java`) - Runs .class files
- **Java Standard Library** - Thousands of pre-written classes
- **Development Tools** - Debugger, documentation generator, etc.
- **JavaDoc** - API documentation

## Installation Checklist

Use this checklist to track your progress:

- [ ] Determined my operating system and version
- [ ] Downloaded Java 17 JDK installer
- [ ] Ran installer successfully
- [ ] Set JAVA_HOME environment variable
- [ ] Added Java to PATH
- [ ] Verified installation with `java -version`
- [ ] Verified compiler with `javac -version`
- [ ] Both commands show version 17.x.x

## After Installation

Once you've installed Java, you should see something like this:

```bash
$ java -version
openjdk version "17.0.9" 2023-10-17 LTS
OpenJDK Runtime Environment Corretto-17.0.9.8.1 (build 17.0.9+8-LTS)
OpenJDK 64-Bit Server VM Corretto-17.0.9.8.1 (build 17.0.9+8-LTS, mixed mode, sharing)

$ javac -version
javac 17.0.9
```

The exact output will vary slightly depending on your distribution and version, but you should see "17" in the version number.

## Common Installation Issues

### Issue: "command not found" or "not recognized"
**Solution**: Environment variables not set correctly. See troubleshooting guide.

### Issue: Wrong Java version shows up
**Solution**: Multiple Java versions installed. Need to update PATH to prioritize Java 17.

### Issue: JAVA_HOME not set
**Solution**: Must set this environment variable manually on some systems.

### Issue: Installer won't run
**Solution**: May need administrator/sudo privileges.

For detailed solutions, see the **[Troubleshooting Guide](troubleshooting.md)**.

## Ready to Install?

Choose your operating system and follow the detailed instructions:

### [→ Windows Installation Guide](windows-setup.md)
### [→ macOS Installation Guide](mac-setup.md)
### [→ Linux Installation Guide](linux-setup.md)

---

**After installation**, proceed to **[IDE Setup](ide-setup.md)** to configure your development environment!

---

[← Back to Module 0](README.md) | [Next: IDE Setup →](ide-setup.md)

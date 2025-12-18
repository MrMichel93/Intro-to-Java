# Swing Basics

Create graphical user interfaces with Java Swing.

## 🎯 Learning Objectives

- Create windows with JFrame
- Add buttons and labels
- Handle button clicks
- Build simple GUI applications

## Creating a Window

```java
import javax.swing.JFrame;

public class FirstGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

## Adding Components

```java
import javax.swing.*;

public class ComponentsDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Components");
        
        // Create components
        JLabel label = new JLabel("Enter name:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Click Me");
        
        // Add to frame
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

## Common Components

- **JLabel**: Display text
- **JButton**: Clickable button
- **JTextField**: Single line text input
- **JTextArea**: Multi-line text input
- **JPanel**: Container for components

## Summary

✓ JFrame creates windows
✓ Add components with panel.add()
✓ Set size and visibility
✓ Always set default close operation

## What's Next?

**[Next: Layout Managers →](02-layout-managers.md)**

---

[← Back to Module 12](README.md) | [Next: Layout Managers →](02-layout-managers.md)

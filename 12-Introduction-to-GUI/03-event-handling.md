# Event Handling

Make GUI interactive by handling user events.

## 🎯 Learning Objectives

- Handle button clicks
- Implement ActionListener
- Respond to user input
- Create interactive GUIs

## ActionListener

Handle button clicks.

```java
import javax.swing.*;
import java.awt.event.*;

public class EventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling");
        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Not clicked yet");
        
        // Add action listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });
        
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

## Lambda Expression (Java 8+)

Simpler syntax for event handling.

```java
button.addActionListener(e -> {
    label.setText("Button clicked!");
});
```

## Multiple Buttons

```java
JButton button1 = new JButton("Button 1");
JButton button2 = new JButton("Button 2");
JLabel label = new JLabel("No button clicked");

button1.addActionListener(e -> label.setText("Button 1 clicked"));
button2.addActionListener(e -> label.setText("Button 2 clicked"));
```

## Summary

✓ ActionListener for button events
✓ Override actionPerformed()
✓ Lambda expressions simplify code
✓ Update components in event handler

## What's Next?

**[Next: Building GUI Apps →](04-building-gui-apps.md)**

---

[← Back to Layout Managers](02-layout-managers.md) | [Next: Building GUI Apps →](04-building-gui-apps.md)

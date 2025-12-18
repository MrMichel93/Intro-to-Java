# Layout Managers

Control how components are arranged in containers.

## 🎯 Learning Objectives

- Use FlowLayout
- Use BorderLayout
- Use GridLayout
- Choose appropriate layout

## FlowLayout

Components flow left to right, top to bottom.

```java
import javax.swing.*;
import java.awt.FlowLayout;

JFrame frame = new JFrame();
JPanel panel = new JPanel(new FlowLayout());

panel.add(new JButton("Button 1"));
panel.add(new JButton("Button 2"));
panel.add(new JButton("Button 3"));

frame.add(panel);
frame.setSize(300, 200);
frame.setVisible(true);
```

## BorderLayout

Five regions: North, South, East, West, Center.

```java
import java.awt.BorderLayout;

JFrame frame = new JFrame();
frame.setLayout(new BorderLayout());

frame.add(new JButton("North"), BorderLayout.NORTH);
frame.add(new JButton("South"), BorderLayout.SOUTH);
frame.add(new JButton("East"), BorderLayout.EAST);
frame.add(new JButton("West"), BorderLayout.WEST);
frame.add(new JButton("Center"), BorderLayout.CENTER);

frame.setSize(400, 300);
frame.setVisible(true);
```

## GridLayout

Components in a grid of cells.

```java
import java.awt.GridLayout;

JFrame frame = new JFrame();
JPanel panel = new JPanel(new GridLayout(3, 2));  // 3 rows, 2 columns

panel.add(new JButton("1"));
panel.add(new JButton("2"));
panel.add(new JButton("3"));
panel.add(new JButton("4"));
panel.add(new JButton("5"));
panel.add(new JButton("6"));

frame.add(panel);
frame.setSize(300, 200);
frame.setVisible(true);
```

## Summary

✓ FlowLayout: Left to right flow
✓ BorderLayout: Five regions
✓ GridLayout: Grid of cells
✓ Choose based on needs

## What's Next?

**[Next: Event Handling →](03-event-handling.md)**

---

[← Back to Swing Basics](01-swing-basics.md) | [Next: Event Handling →](03-event-handling.md)

# Building GUI Applications

Create complete GUI applications combining components, layouts, and events.

## 🎯 Learning Objectives

- Design GUI applications
- Combine components effectively
- Handle user input
- Create practical GUI programs

## Complete Example: Simple Calculator

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    
    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setLayout(new GridLayout(4, 2, 10, 10));
        
        // Create components
        JLabel num1Label = new JLabel("Number 1:");
        num1Field = new JTextField();
        
        JLabel num2Label = new JLabel("Number 2:");
        num2Field = new JTextField();
        
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);
        
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        
        // Add action listeners
        addButton.addActionListener(e -> calculate('+'));
        subtractButton.addActionListener(e -> calculate('-'));
        
        // Add components
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(subtractButton);
        
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void calculate(char operation) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;
            
            if (operation == '+') {
                result = num1 + num2;
            } else if (operation == '-') {
                result = num1 - num2;
            }
            
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            resultField.setText("Invalid input");
        }
    }
    
    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
```

## Design Tips

✓ **Plan layout** before coding
✓ **Group related components** in panels
✓ **Validate input** before processing
✓ **Handle errors** gracefully
✓ **Test thoroughly** with different inputs

## Summary

✓ Combine components, layouts, and events
✓ Separate GUI from logic
✓ Validate user input
✓ Handle exceptions properly
✓ Test GUI applications thoroughly

## Congratulations!

You've completed all 12 modules of the Java course! You now have a solid foundation in:
- Java fundamentals
- Object-oriented programming
- Collections and data structures
- Exception handling
- File I/O
- GUI development

**Keep practicing and building projects to reinforce your learning!**

---

[← Back to Event Handling](03-event-handling.md) | [Projects →](../Projects/README.md)

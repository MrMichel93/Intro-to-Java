import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * CalculatorGUI - Complete calculator application (Practice Problem - Hard)
 * 
 * INSTRUCTIONS:
 * Complete this calculator GUI by implementing functionality where indicated by TODO comments.
 * 
 * Demonstrates:
 * - Complex GUI layout (GridLayout)
 * - Multiple event handlers
 * - Calculator logic
 * - GUI design patterns
 * 
 * @author Introduction to Java Course
 */
public class CalculatorGUI extends JFrame implements ActionListener {
    
    // Components
    private JTextField displayField;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton equalsButton;
    private JButton clearButton;
    private JButton deleteButton;
    private JButton decimalButton;
    
    // Calculator state
    private double num1 = 0;
    private double num2 = 0;
    private String operator = "";
    private boolean startNewNumber = true;
    
    public CalculatorGUI() {
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));
        
        // TODO: Create display field
        // - Not editable
        // - Right-aligned text
        // - Large font
        // - Initial text "0"
        
        displayField = new JTextField("0");
        
        
        
        
        
        
        // Create panels
        JPanel displayPanel = new JPanel(new BorderLayout());
        displayPanel.add(displayField);
        
        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));
        
        // TODO: Initialize number buttons (0-9)
        numberButtons = new JButton[10];
        
        
        
        
        
        
        // TODO: Initialize operator buttons (+, -, *, /)
        operatorButtons = new JButton[4];
        
        
        
        
        
        // TODO: Initialize special buttons
        
        
        
        
        
        // TODO: Add action listeners to all buttons
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO: Add buttons to panel in calculator layout
        // Row 1: Clear, Delete, /, *
        // Row 2: 7, 8, 9, -
        // Row 3: 4, 5, 6, +
        // Row 4: 1, 2, 3, =
        // Row 5: 0, ., (space), (space)
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Add panels to frame
        add(displayPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        
        // Add some padding
        ((JPanel)getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        setVisible(true);
    }
    
    /**
     * TODO: Implement actionPerformed method
     * Handle all button clicks:
     * - Number buttons: append to display
     * - Operator buttons: store first number and operator
     * - Equals button: perform calculation
     * - Clear button: reset everything
     * - Delete button: remove last digit
     * - Decimal button: add decimal point
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        // TODO: Handle number buttons (0-9)
        
        
        
        
        
        
        
        
        
        
        // TODO: Handle decimal point
        
        
        
        
        
        
        // TODO: Handle operator buttons
        
        
        
        
        
        
        
        
        
        
        // TODO: Handle equals button
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO: Handle clear button
        
        
        
        
        
        
        
        // TODO: Handle delete button
        
        
        
        
        
        
        
    }
    
    /**
     * TODO: Create helper method calculate
     * - Takes two doubles and an operator
     * - Returns result
     * - Handle division by zero
     */
    private double calculate(double n1, double n2, String op) {
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI();
            }
        });
        
        System.out.println("=== Calculator GUI ===");
        System.out.println("Features:");
        System.out.println("- Basic arithmetic operations");
        System.out.println("- Decimal point support");
        System.out.println("- Clear and delete functions");
        System.out.println("- Error handling");
        System.out.println();
        System.out.println("Layout: GridLayout for button grid");
        System.out.println("Event handling: ActionListener interface");
    }
}

/**
 * ENHANCEMENT IDEAS:
 * 
 * 1. Add keyboard support (KeyListener)
 * 2. Add history of calculations
 * 3. Add memory functions (M+, M-, MR, MC)
 * 4. Add scientific functions (sin, cos, sqrt, etc.)
 * 5. Add parentheses support
 * 6. Improve visual design with colors
 * 7. Add calculation history panel
 * 8. Support for negative numbers
 */

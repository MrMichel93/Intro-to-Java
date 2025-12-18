import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * EventHandlingDemo - GUI event handling (Practice Problem - Medium)
 * 
 * INSTRUCTIONS:
 * Complete this interactive GUI by implementing event handlers where indicated by TODO comments.
 * 
 * Demonstrates:
 * - ActionListener for button clicks
 * - Event handling
 * - Updating GUI components
 * - Multiple event sources
 * 
 * @author Introduction to Java Course
 */
public class EventHandlingDemo extends JFrame {
    
    // Components
    private JLabel messageLabel;
    private JTextField inputField;
    private JButton greetButton;
    private JButton clearButton;
    private JButton countButton;
    private JLabel counterLabel;
    private int clickCount = 0;
    
    public EventHandlingDemo() {
        setTitle("Event Handling Demo");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        // Create panels
        JPanel topPanel = new JPanel(new FlowLayout());
        JPanel centerPanel = new JPanel(new FlowLayout());
        JPanel bottomPanel = new JPanel(new FlowLayout());
        
        // Initialize components
        messageLabel = new JLabel("Enter your name and click Greet");
        messageLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        
        inputField = new JTextField(20);
        greetButton = new JButton("Greet");
        clearButton = new JButton("Clear");
        countButton = new JButton("Click Me!");
        counterLabel = new JLabel("Clicks: 0");
        
        // TODO: Add ActionListener to greetButton
        // When clicked:
        // - Get text from inputField
        // - Set messageLabel text to "Hello, [name]!"
        // - If field is empty, show "Please enter your name"
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO: Add ActionListener to clearButton
        // When clicked:
        // - Clear the inputField
        // - Reset messageLabel to "Enter your name and click Greet"
        
        
        
        
        
        
        
        
        // TODO: Add ActionListener to countButton
        // When clicked:
        // - Increment clickCount
        // - Update counterLabel to show "Clicks: [count]"
        
        
        
        
        
        
        
        
        // TODO: Add KeyListener to inputField
        // When Enter key is pressed:
        // - Same action as clicking greetButton
        
        
        
        
        
        
        
        
        
        
        
        
        // Add components to panels
        topPanel.add(new JLabel("Name:"));
        topPanel.add(inputField);
        topPanel.add(greetButton);
        topPanel.add(clearButton);
        
        centerPanel.add(messageLabel);
        
        bottomPanel.add(countButton);
        bottomPanel.add(counterLabel);
        
        // Add panels to frame
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EventHandlingDemo();
            }
        });
        
        System.out.println("=== Event Handling Concepts ===");
        System.out.println("ActionListener  - Handles button clicks");
        System.out.println("KeyListener     - Handles keyboard input");
        System.out.println("MouseListener   - Handles mouse events");
        System.out.println("addActionListener() - Register event handler");
    }
}

/**
 * ADDITIONAL CHALLENGES:
 * 
 * 1. Add a reset button for the counter
 * 2. Change messageLabel color based on input length
 * 3. Add a JComboBox with greeting options (Hello, Hi, Hey)
 * 4. Show a JOptionPane dialog when counter reaches 10
 * 5. Add validation to prevent empty input
 */

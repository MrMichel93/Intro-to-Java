import javax.swing.*;
import java.awt.*;

/**
 * SimpleGUIFrame - Basic JFrame and components (Practice Problem - Easy)
 * 
 * INSTRUCTIONS:
 * Complete this GUI application by adding components where indicated by TODO comments.
 * 
 * Demonstrates:
 * - Creating JFrame
 * - Adding JLabel, JButton, JTextField
 * - Basic layout
 * - Frame properties
 * 
 * @author Introduction to Java Course
 */
public class SimpleGUIFrame extends JFrame {
    
    // TODO: Declare component fields
    // - JLabel titleLabel
    // - JLabel nameLabel
    // - JTextField nameField
    // - JButton submitButton
    
    
    
    
    
    
    public SimpleGUIFrame() {
        // TODO: Set frame title to "Simple GUI Demo"
        
        
        // TODO: Set frame size to 400x300
        
        
        // TODO: Set default close operation to EXIT_ON_CLOSE
        
        
        // TODO: Set layout to FlowLayout
        
        
        // TODO: Initialize components
        // - titleLabel with text "Welcome to GUI Programming!"
        // - nameLabel with text "Enter your name:"
        // - nameField with 20 columns
        // - submitButton with text "Submit"
        
        
        
        
        
        // TODO: Make titleLabel font larger and bold
        // Use Font(Font.SANS_SERIF, Font.BOLD, 18)
        
        
        // TODO: Add all components to frame
        
        
        
        
        
        // TODO: Make frame visible
        
    }
    
    public static void main(String[] args) {
        // TODO: Use SwingUtilities.invokeLater for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // TODO: Create and display frame
                
                
            }
        });
        
        System.out.println("=== GUI Concepts ===");
        System.out.println("JFrame        - Main window");
        System.out.println("JLabel        - Display text");
        System.out.println("JTextField    - Text input");
        System.out.println("JButton       - Clickable button");
        System.out.println("FlowLayout    - Simple left-to-right layout");
    }
}

/**
 * EXERCISES:
 * 
 * 1. Run the program and see the GUI window
 * 2. Try different layouts (BorderLayout, GridLayout)
 * 3. Add more components (JTextArea, JCheckBox)
 * 4. Change colors using setBackground() and setForeground()
 * 5. Experiment with different fonts and sizes
 */

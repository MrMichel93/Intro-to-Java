import java.util.Scanner;

/**
 * Calculator - Interactive arithmetic calculator (Practice Problem)
 * 
 * INSTRUCTIONS:
 * Complete this calculator program by adding code where indicated by TODO comments.
 * The program should perform basic arithmetic operations based on user input.
 * 
 * Demonstrates:
 * - Variable declaration and initialization
 * - User input with Scanner
 * - Arithmetic operators (+, -, *, /, %)
 * - Conditional statements (if-else)
 * - Type conversion
 * 
 * @author Introduction to Java Course
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Display welcome message
        System.out.println("===== Simple Calculator =====");
        System.out.println("This calculator performs basic arithmetic operations.\n");
        
        // TODO: Prompt the user to enter the first number and store it in a variable called num1 (type: double)
        
        
        
        // TODO: Prompt the user to enter an operator (+, -, *, /, %) and store it in a variable called operator (type: char)
        // Hint: Use input.next().charAt(0) to read a single character
        
        
        
        // TODO: Prompt the user to enter the second number and store it in a variable called num2 (type: double)
        
        
        
        // TODO: Create a variable called result (type: double) and initialize it to 0
        
        
        // TODO: Create a boolean variable called validOperation and initialize it to true
        
        
        // TODO: Use if-else statements to perform the calculation based on the operator
        // For '+': Add num1 and num2, store in result, and print the equation
        
        
        
        // TODO: For '-': Subtract num2 from num1, store in result, and print the equation
        
        
        
        // TODO: For '*': Multiply num1 and num2, store in result, and print the equation
        
        
        
        // TODO: For '/': Divide num1 by num2, but first check if num2 is not zero
        // If num2 is zero, print "Error: Division by zero!" and set validOperation to false
        
        
        
        
        
        
        // TODO: For '%': Calculate modulo, but first check if num2 is not zero
        // If num2 is zero, print "Error: Modulo by zero!" and set validOperation to false
        
        
        
        
        
        
        // TODO: If the operator is none of the above, print "Error: Invalid operator!" and set validOperation to false
        
        
        
        
        // TODO: If the operation was valid and not division, check if result is a whole number
        // If it is, print "As integer: " followed by the result cast to an integer
        
        
        
        
        
        System.out.println("\nThank you for using Calculator!");
        input.close();
    }
}

/*
 * Sample Run 1:
 * ===== Simple Calculator =====
 * This calculator performs basic arithmetic operations.
 * 
 * Enter first number: 15
 * Enter operator (+, -, *, /, %): +
 * Enter second number: 7
 * 
 * 15.0 + 7.0 = 22.0
 * As integer: 22
 * Thank you for using Calculator!
 * 
 * Sample Run 2:
 * Enter first number: 10
 * Enter operator (+, -, *, /, %): /
 * Enter second number: 3
 * 
 * 10.0 / 3.0 = 3.3333333333333335
 * Thank you for using Calculator!
 */

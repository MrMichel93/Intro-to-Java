import java.util.Scanner;

/**
 * Calculator - Interactive arithmetic calculator
 * 
 * Demonstrates:
 * - Variable declaration and initialization
 * - User input with Scanner
 * - Arithmetic operators (+, -, *, /, %)
 * - Type conversion
 * - Formatted output
 * 
 * @author Introduction to Java Course
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Display welcome message
        System.out.println("===== Simple Calculator =====");
        System.out.println("This calculator performs basic arithmetic operations.\n");
        
        // Get first number
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        // Get operator
        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);
        
        // Get second number
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        // Perform calculation based on operator
        double result = 0;
        boolean validOperation = true;
        
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("\n" + num1 + " + " + num2 + " = " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("\n" + num1 + " - " + num2 + " = " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("\n" + num1 + " * " + num2 + " = " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("\n" + num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("\nError: Division by zero!");
                validOperation = false;
            }
        } else if (operator == '%') {
            if (num2 != 0) {
                result = num1 % num2;
                System.out.println("\n" + num1 + " % " + num2 + " = " + result);
            } else {
                System.out.println("\nError: Modulo by zero!");
                validOperation = false;
            }
        } else {
            System.out.println("\nError: Invalid operator!");
            validOperation = false;
        }
        
        // Additional information
        if (validOperation && operator != '/') {
            // Show result as integer if it's a whole number
            if (result == (int)result) {
                System.out.println("As integer: " + (int)result);
            }
        }
        
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

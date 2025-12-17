/**
 * HelloWorld - Your First Java Program
 * 
 * This is the classic "Hello World" program that every programmer writes
 * when learning a new language. It demonstrates the basic structure of
 * a Java program.
 * 
 * To compile: javac HelloWorld.java
 * To run: java HelloWorld
 * 
 * Expected output: Hello, World!
 * 
 * @author Introduction to Java Course
 * @version 1.0
 */
public class HelloWorld {
    
    /**
     * The main method is the entry point of any Java application.
     * When you run a Java program, execution starts here.
     * 
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Print a greeting to the console
        System.out.println("Hello, World!");
        
        // You can print multiple lines
        System.out.println("Welcome to Java programming!");
        System.out.println("Let's learn together!");
        
        // Print without a newline using print() instead of println()
        System.out.print("This ");
        System.out.print("is ");
        System.out.print("all ");
        System.out.print("one ");
        System.out.println("line!");
        
        // Print numbers (no quotes needed for numbers)
        System.out.println(42);
        System.out.println(3.14159);
        
        // Print results of calculations
        System.out.println(2 + 2);
        System.out.println(10 * 5);
        
        // Use escape sequences for special characters
        System.out.println("This has a \"quote\" in it");
        System.out.println("This has a \ttab in it");
        System.out.println("This has a \nnewline in it");
        
        // Combine text and numbers
        System.out.println("The answer is: " + 42);
        System.out.println("Pi is approximately: " + 3.14159);
    }
}

/* 
 * Expected Complete Output:
 * 
 * Hello, World!
 * Welcome to Java programming!
 * Let's learn together!
 * This is all one line!
 * 42
 * 3.14159
 * 4
 * 50
 * This has a "quote" in it
 * This has a   tab in it
 * This has a 
 * newline in it
 * The answer is: 42
 * Pi is approximately: 3.14159
 */

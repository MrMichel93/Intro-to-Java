/**
 * MathUtilities - Collection of useful mathematical methods
 * 
 * Demonstrates:
 * - Method creation with parameters and return values
 * - Method overloading (same name, different parameters)
 * - void vs return methods
 * - Static methods for utility functions
 * - Input validation
 * - Math class usage
 * 
 * @author Introduction to Java Course
 */
public class MathUtilities {
    
    // Constants
    public static final double PI = 3.14159265359;
    public static final double E = 2.71828182846;
    
    /**
     * Check if a number is even
     * @param number The number to check
     * @return true if even, false if odd
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    /**
     * Check if a number is odd
     * @param number The number to check
     * @return true if odd, false if even
     */
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
    
    /**
     * Check if a number is prime
     * @param number The number to check (must be positive)
     * @return true if prime, false otherwise
     */
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Calculate factorial (n!)
     * @param n The number (must be non-negative)
     * @return n! (factorial of n)
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    /**
     * Calculate power (base^exponent)
     * Method overloading example - two versions
     */
    public static double power(double base, int exponent) {
        if (exponent == 0) return 1.0;
        if (exponent < 0) {
            return 1.0 / power(base, -exponent);
        }
        
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    
    // Overloaded version for integer base
    public static int power(int base, int exponent) {
        return (int) power((double) base, exponent);
    }
    
    /**
     * Find maximum of two numbers - overloaded for different types
     */
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }
    
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }
    
    /**
     * Find minimum of two numbers
     */
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }
    
    public static double min(double a, double b) {
        return (a < b) ? a : b;
    }
    
    /**
     * Calculate absolute value
     */
    public static int abs(int n) {
        return (n < 0) ? -n : n;
    }
    
    public static double abs(double n) {
        return (n < 0) ? -n : n;
    }
    
    /**
     * Calculate greatest common divisor (GCD) using Euclidean algorithm
     */
    public static int gcd(int a, int b) {
        a = abs(a);
        b = abs(b);
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    /**
     * Calculate least common multiple (LCM)
     */
    public static int lcm(int a, int b) {
        return abs(a * b) / gcd(a, b);
    }
    
    /**
     * Calculate Fibonacci number at position n
     * @param n Position in Fibonacci sequence (0-based)
     * @return Fibonacci number at position n
     */
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Position must be non-negative");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        long prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
    
    /**
     * Calculate area of circle
     * @param radius Circle radius
     * @return Area of circle
     */
    public static double circleArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return PI * radius * radius;
    }
    
    /**
     * Calculate circumference of circle
     * @param radius Circle radius
     * @return Circumference of circle
     */
    public static double circleCircumference(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return 2 * PI * radius;
    }
    
    /**
     * Convert Celsius to Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
    
    /**
     * Convert Fahrenheit to Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
    
    /**
     * Display number properties
     * Void method - prints information, doesn't return anything
     */
    public static void displayNumberInfo(int number) {
        System.out.println("===== Number Analysis =====");
        System.out.println("Number: " + number);
        System.out.println("Even: " + isEven(number));
        System.out.println("Odd: " + isOdd(number));
        System.out.println("Prime: " + isPrime(number));
        System.out.println("Absolute value: " + abs(number));
        if (number >= 0 && number <= 20) {
            System.out.println("Factorial: " + factorial(number));
        }
        System.out.println("==========================");
    }
    
    // Main method for demonstration
    public static void main(String[] args) {
        System.out.println("=== Math Utilities Demonstration ===\n");
        
        // Testing even/odd
        System.out.println("--- Even/Odd Tests ---");
        System.out.println("10 is even: " + isEven(10));
        System.out.println("7 is odd: " + isOdd(7));
        
        // Testing prime
        System.out.println("\n--- Prime Tests ---");
        System.out.println("17 is prime: " + isPrime(17));
        System.out.println("18 is prime: " + isPrime(18));
        
        // Testing factorial
        System.out.println("\n--- Factorial Tests ---");
        System.out.println("5! = " + factorial(5));
        System.out.println("10! = " + factorial(10));
        
        // Testing power (method overloading)
        System.out.println("\n--- Power Tests (Overloading) ---");
        System.out.println("2^10 = " + power(2, 10));
        System.out.println("2.5^3 = " + power(2.5, 3));
        
        // Testing max (method overloading)
        System.out.println("\n--- Max Tests (Overloading) ---");
        System.out.println("max(10, 20) = " + max(10, 20));
        System.out.println("max(3.5, 2.1) = " + max(3.5, 2.1));
        System.out.println("max(5, 15, 10) = " + max(5, 15, 10));
        
        // Testing GCD and LCM
        System.out.println("\n--- GCD and LCM Tests ---");
        System.out.println("GCD(48, 18) = " + gcd(48, 18));
        System.out.println("LCM(12, 18) = " + lcm(12, 18));
        
        // Testing Fibonacci
        System.out.println("\n--- Fibonacci Tests ---");
        System.out.print("First 10 Fibonacci numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        
        // Testing circle calculations
        System.out.println("\n--- Circle Calculations ---");
        double radius = 5.0;
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f%n", circleArea(radius));
        System.out.printf("Circumference: %.2f%n", circleCircumference(radius));
        
        // Testing temperature conversion
        System.out.println("\n--- Temperature Conversion ---");
        double celsius = 25.0;
        System.out.println(celsius + "°C = " + celsiusToFahrenheit(celsius) + "°F");
        double fahrenheit = 77.0;
        System.out.println(fahrenheit + "°F = " + fahrenheitToCelsius(fahrenheit) + "°C");
        
        // Testing void method
        System.out.println("\n--- Number Info (Void Method) ---");
        displayNumberInfo(17);
    }
}

/*
 * KEY CONCEPTS DEMONSTRATED:
 * 
 * 1. METHOD STRUCTURE:
 *    returnType methodName(parameters) {
 *        // method body
 *        return value;  // if not void
 *    }
 * 
 * 2. METHOD OVERLOADING:
 *    - Same method name, different parameters
 *    - Compiler chooses based on arguments
 *    - Examples: max(int, int), max(double, double), max(int, int, int)
 * 
 * 3. RETURN vs VOID:
 *    - Return methods give back a value
 *    - Void methods perform action but don't return
 * 
 * 4. PARAMETERS:
 *    - Input values passed to method
 *    - Can have 0, 1, or many parameters
 * 
 * 5. STATIC METHODS:
 *    - Belong to class, not instances
 *    - Called with ClassName.methodName()
 *    - Utility methods are typically static
 * 
 * BENEFITS OF METHODS:
 * - Code reusability (DRY - Don't Repeat Yourself)
 * - Better organization
 * - Easier testing
 * - Easier maintenance
 * - Abstraction (hide complexity)
 */

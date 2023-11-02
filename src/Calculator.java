import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Stores two numbers
        double num1, num2;

        // Take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");

        // Take the inputs
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+, -, *, /, %, ^, sqrt, |x|, square):");

        String operation = sc.next();
        double result = 0;

        switch (operation) {
            // Addition
            case "+":
                result = num1 + num2;
                break;

            // Subtraction
            case "-":
                result = num1 - num2;
                break;

            // Multiplication
            case "*":
                result = num1 * num2;
                break;

            // Division
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                break;

            // Modulo
            case "%":
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Modulo by zero is not allowed.");
                    return;
                }
                break;

            // Exponentiation
            case "^":
                result = Math.pow(num1, num2);
                break;

            // Square root
            case "sqrt":
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                } else {
                    System.out.println("Square root of a negative number is not allowed.");
                    return;
                }
                break;

            // Absolute value
            case "|x|":
                result = Math.abs(num1);
                break;

            // Maximum
            case "square":
                result = Math.pow(num1, 2);
                break;


            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("The final result:");
        System.out.println();

        // print the final result
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}

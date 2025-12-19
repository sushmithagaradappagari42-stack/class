import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = s.nextDouble();

        System.out.println("Enter second number:");
        double num2 = s.nextDouble();

        System.out.println("Enter the operation (+, -, *, /):");
        char operator = s.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid operator entered");
        }

        s.close();     }
}

import java.util.Scanner;
abstract class Calculator {
    public abstract void add();
    public abstract void sub();
    public abstract void mul();
    public abstract void div();
}
class MyCalculator1 extends Calculator {
    public void add() {
        int number1 = 20;
        int number2 = 30;
        int sum = number1 + number2;
        System.out.println("The sum is: " + sum);
    }
    public void sub() {
        int number1 = 20;
        int number2 = 30;
        int diff = number1 - number2;
        System.out.println("The difference is: " + diff);
    }
    public void mul() {
        int number1 = 20;
        int number2 = 30;
        int prod = number1 * number2;
        System.out.println("The product is: " + prod);
    }
    public void div() {
        int number1 = 20;
        int number2 = 30;
        int quot = number1 / number2;
        System.out.println("The quotient is: " + quot);
    }
}

class MyCalculator2 extends Calculator {
    public void add() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = s.nextInt();
        System.out.println("Enter the second number:");
        int number2 = s.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum is: " + sum);
    }

    public void sub() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = s.nextInt();
        System.out.println("Enter the second number:");
        int number2 = s.nextInt();
        int diff = number1 - number2;
        System.out.println("The difference is: " + diff);
    }

    public void mul() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = s.nextInt();
        System.out.println("Enter the second number:");
        int number2 = s.nextInt();
        int prod = number1 * number2;
        System.out.println("The product is: " + prod);
    }

    public void div() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = s.nextInt();
        System.out.println("Enter the second number:");
        int number2 = s.nextInt();
        int quot = number1 / number2;
        System.out.println("The quotient is: " + quot);
    }
}

class Arithmetic {
    void arithmeticOperations(Calculator c) {
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}

public class ExampleForAbstraction2 {
    public static void main(String[] args) {
        MyCalculator1 m1 = new MyCalculator1();
        MyCalculator2 m2 = new MyCalculator2();
        Arithmetic a = new Arithmetic();

        a.arithmeticOperations(m1);
        System.out.println("--------------------");
        a.arithmeticOperations(m2);
    }
}

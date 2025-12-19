import java.util.Scanner;

interface Calculator {
    public void add();
    public void sub();
}

class MyCalculator1 implements Calculator {

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
}

class MyCalculator2 implements Calculator {

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
}

public class Interface2 {
    public static void main(String[] args) {
        Calculator n1 = new MyCalculator1();
        Calculator n2 = new MyCalculator2();

        n1.add();
        n1.sub();

        n2.add();
        n2.sub();
    }
}

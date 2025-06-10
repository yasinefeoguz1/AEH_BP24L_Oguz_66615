package pl.pp;

import java.util.Scanner;

public class mySecondApp {

    public static void main(String[] args) {

        // Task 1
        double x = 10;
        double y = 2;

        Scanner scanner = new Scanner(System.in);

        var result = x + y;
        System.out.println("x + y = " + result);

        result = x - y;
        System.out.println("x - y = " + result);

        result = x * y;
        System.out.println("x * y = " + result);

        result = x / y;
        System.out.println("x / y = " + result);

        result = x % y;
        System.out.println("x % y = " + result);

        System.out.println("Enter two numbers separated by the Enter key:");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        System.out.println("x + y = " + (first + second));


        // Task 2.1
        System.out.println("\n--- Task 2.1 ---");

        int number = 10;
        int doubleNumber = number * 2;
        int squareNumber = number * number;

        System.out.println("x = " + number);
        System.out.println("Double of x = " + doubleNumber);
        System.out.println("x squared = " + squareNumber);

        scanner.close();
    }
}


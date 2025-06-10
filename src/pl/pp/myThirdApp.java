package pl.pp;

import java.util.Scanner;

public class myThirdApp {
    public static void main(String[] args) {

        /*
        // Task 1 – Loops and Conditions
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number greater than 100:");
        var number1 = scanner.nextDouble();
        while (number1 <= 100) {
            System.out.println("The number is not greater than 100, enter again:");
            number1 = scanner.nextDouble();
        }
        System.out.println("Thank you! You’ve entered: " + number1);

        double number2;
        do {
            System.out.println("Enter a number greater than 200:");
            number2 = scanner.nextDouble();
        } while (number2 <= 200);
        System.out.println("Thank you! You’ve entered: " + number2);

        int wynik = 0;
        for (var i = 1; i <= 10; i++) {
            wynik = wynik + i;
            System.out.println("Iteration no. " + i + " in the for loop, and the result (wynik) = " + wynik);
        }

        System.out.println("Enter the value of x: ");
        var x = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        var y = scanner.nextDouble();

        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x < y) {
            System.out.println("x is smaller than y");
        } else {
            System.out.println("x equals y");
        }

        while (true) {
            System.out.println("Enter -1 to exit the program");
            var input = scanner.nextDouble();
            if (input == -1) {
                System.out.println("Exit...");
                break;
            }
        }

        scanner.close();
        */

        /*
        // Task 2.1 – Convert days to weeks and days
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number of days (or 0 or less to exit): ");
            int totalDays = scanner.nextInt();

            if (totalDays <= 0) {
                System.out.println("Program ended.");
                break;
            }

            int weeks = totalDays / 7;
            int days = totalDays % 7;

            System.out.println(totalDays + " days is " + weeks + " weeks and " + days + " days.");
        }

        scanner.close();
        */

        // Task 2.2 – Celsius to Fahrenheit and Kelvin
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter temperature in Celsius (-1 to exit): ");
            double celsius = scanner.nextDouble();

            if (celsius == -1) {
                System.out.println("Program ended.");
                break;
            }

            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;

            System.out.printf("Celsius: %.2f°C\n", celsius);
            System.out.printf("Fahrenheit: %.2f°F\n", fahrenheit);
            System.out.printf("Kelvin: %.2fK\n", kelvin);
        }

        scanner.close();
    }
}

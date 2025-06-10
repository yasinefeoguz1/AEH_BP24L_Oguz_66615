package pl.pp;

import java.util.Scanner;

public class MyTask2_2App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nSelect operation:");
            System.out.println("a) Add");
            System.out.println("b) Subtract");
            System.out.println("c) Multiply");
            System.out.println("d) Divide");
            System.out.println("q) Quit");

            System.out.print("Your choice: ");
            choice = scanner.nextLine().toLowerCase();

            if (choice.equals("q")) {
                System.out.println("Goodbye!");
                break;
            }

            if (!choice.matches("[abcd]")) {
                System.out.println("Invalid choice. Please select a, b, c, d, or q.");
                continue;
            }

            double num1 = 0;
            double num2 = 0;

            while (true) {
                try {
                    System.out.print("Enter first number: ");
                    num1 = Double.parseDouble(scanner.nextLine());

                    System.out.print("Enter second number: ");
                    num2 = Double.parseDouble(scanner.nextLine());
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter numeric values.");
                }
            }

            switch (choice) {
                case "a":
                    System.out.printf("Result: %.2f\n", num1 + num2);
                    break;
                case "b":
                    System.out.printf("Result: %.2f\n", num1 - num2);
                    break;
                case "c":
                    System.out.printf("Result: %.2f\n", num1 * num2);
                    break;
                case "d":
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.printf("Result: %.2f\n", num1 / num2);
                    }
                    break;
            }

        } while (true);

        scanner.close();
    }
}

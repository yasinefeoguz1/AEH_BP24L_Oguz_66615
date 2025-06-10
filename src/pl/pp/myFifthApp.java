package pl.pp;

import java.util.Scanner;

public class myFifthApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1 – Height & Weight
        System.out.print("Enter your height in centimeters: ");
        int heightCm = scanner.nextInt();
        printHeight(heightCm);

        System.out.print("Enter your weight in kilograms: ");
        double weightKg = scanner.nextDouble();
        printWeight(weightKg);

        // Task 2 – Largest of 3 numbers
        System.out.print("Enter 3 integers:\n");

        System.out.print("First: ");
        int num1 = scanner.nextInt();

        System.out.print("Second: ");
        int num2 = scanner.nextInt();

        System.out.print("Third: ");
        int num3 = scanner.nextInt();

        int largest = findLargest(num1, num2, num3);
        System.out.println("The largest number is: " + largest);

        // Task 3 – Square and Cube
        System.out.print("Enter an integer to calculate square and cube: ");
        int value = scanner.nextInt();
        displaySquareAndCube(value);

        scanner.close();
    }

    public static void printHeight(int height) {
        double heightMeters = height / 100.0;
        System.out.printf("Your height in meters is: %.2f m\n", heightMeters);
    }

    public static void printWeight(double weight) {
        System.out.printf("Your weight is: %.1f kg\n", weight);
    }

    public static int findLargest(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void displaySquareAndCube(int number) {
        int square = number * number;
        int cube = number * number * number;

        System.out.println("The square of " + number + " is: " + square);
        System.out.println("The cube of " + number + " is: " + cube);
    }
}

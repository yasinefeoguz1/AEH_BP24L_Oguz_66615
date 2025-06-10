package pl.pp;

import java.util.Scanner;

public class mySixthApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 2 – Factorial calculations
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Measure time for iterative factorial
        long startTime = System.nanoTime();
        long iterativeResult = iterativeFactorial(n);
        long endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;

        // Measure time for recursive factorial
        startTime = System.nanoTime();
        long recursiveResult = recursiveFactorial(n);
        endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        System.out.println("Iterative Factorial: " + iterativeResult + ", Time: " + iterativeTime + " nanoseconds");
        System.out.println("Recursive Factorial: " + recursiveResult + ", Time: " + recursiveTime + " nanoseconds");

        scanner.close();
    }

    // Iterative method to calculate factorial
    public static long iterativeFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method to calculate factorial
    public static long recursiveFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursiveFactorial(n - 1);
        }
    }
}

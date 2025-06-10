package pl.pp;

import java.util.Scanner;

public class MyAgeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age in years: ");
        int age = scanner.nextInt();

        long ageInSeconds = (long) age * 365 * 24 * 60 * 60;

        System.out.println("My age in seconds: " + ageInSeconds);

        scanner.close();
    }
}

import java.util.Scanner;

public class myNinthApp {

    public static void main(String[] args) {
        // Person class instance
        Person person = new Person("John Doe", 30, "123 Main St");

        // Print Person details
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Address: " + person.address);

        // Grow older
        person.growOld(5);
        System.out.println("After growing older: " + person.age);

        // Become younger
        person.beYounger();
        System.out.println("After becoming younger: " + person.age);

        // Circle class instance
        Circle circle = new Circle(7);

        // Print Circle details
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Circumference of the circle: " + circle.calculateCircumference());
    }

    // Person class
    public static class Person {
        String name;
        int age;
        String address;

        // Constructor
        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        // Method to grow older
        public void growOld(int years) {
            this.age += years;
        }

        // Method to become younger
        public void beYounger() {
            this.age -= 1;
        }
    }

    // Circle class
    public static class Circle {
        double radius;

        // Constructor
        public Circle(double radius) {
            this.radius = radius;
        }

        // Method to calculate area
        public double calculateArea() {
            return Math.PI * Math.pow(radius, 2);
        }

        // Method to calculate circumference
        public double calculateCircumference() {
            return 2 * Math.PI * radius;
        }
    }
}

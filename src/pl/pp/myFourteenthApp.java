// myFourteenthApp.java

interface FuelType {
    String getFuelType();
}

abstract class Vehicle {
    protected String registrationNumber;
    protected String vinNumber;
    protected String color;
    protected double price;
    protected double fuelConsumption; // liters per 100km
    protected double fuelLevel; // in liters
    protected double mileage; // in kilometers

    public Vehicle(String registrationNumber, String vinNumber, String color, double price,
                   double fuelConsumption, double fuelLevel, double mileage) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
    }

    public void drive(double distance) {
        double fuelNeeded = (fuelConsumption / 100.0) * distance;
        if (fuelNeeded <= fuelLevel) {
            mileage += distance;
            fuelLevel -= fuelNeeded;
            System.out.println("Driven " + distance + " km. Remaining fuel: " + fuelLevel + " L");
        } else {
            System.out.println("Not enough fuel to drive " + distance + " km.");
        }
    }

    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Refueled " + amount + " L. Current fuel level: " + fuelLevel + " L");
    }
}

class PassengerCar extends Vehicle implements FuelType {
    private int numberOfDoors;

    public PassengerCar(String regNo, String vin, String color, double price,
                        double consumption, double fuelLevel, double mileage,
                        int numberOfDoors) {
        super(regNo, vin, color, price, consumption, fuelLevel, mileage);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getFuelType() {
        return "gasoline";
    }
}

class Truck extends Vehicle implements FuelType {
    private double loadCapacity;

    public Truck(String regNo, String vin, String color, double price,
                 double consumption, double fuelLevel, double mileage,
                 double loadCapacity) {
        super(regNo, vin, color, price, consumption, fuelLevel, mileage);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String getFuelType() {
        return "diesel";
    }
}

class Motorcycle extends Vehicle implements FuelType {
    private boolean hasSidecar;

    public Motorcycle(String regNo, String vin, String color, double price,
                      double consumption, double fuelLevel, double mileage,
                      boolean hasSidecar) {
        super(regNo, vin, color, price, consumption, fuelLevel, mileage);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getFuelType() {
        return "gasoline";
    }
}

class ConstructionEquipment extends Vehicle implements FuelType {
    private double hoursWorked;

    public ConstructionEquipment(String regNo, String vin, String color, double price,
                                 double consumption, double fuelLevel, double mileage,
                                 double hoursWorked) {
        super(regNo, vin, color, price, consumption, fuelLevel, mileage);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getFuelType() {
        return "electric";
    }
}

public class myFourteenthApp {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar("ABC123", "VIN0001", "Red", 25000, 7.5, 40, 10000, 4);
        Truck truck = new Truck("TRK456", "VIN0002", "Blue", 50000, 15.0, 100, 50000, 5000);
        Motorcycle bike = new Motorcycle("MOTO789", "VIN0003", "Black", 8000, 4.0, 10, 3000, true);
        ConstructionEquipment excavator = new ConstructionEquipment("CONS111", "VIN0004", "Yellow", 120000, 0, 80, 2000, 300);

        System.out.println("Car fuel type: " + car.getFuelType());
        car.drive(100);
        car.refuel(10);

        System.out.println("Truck fuel type: " + truck.getFuelType());
        truck.drive(200);

        System.out.println("Motorcycle fuel type: " + bike.getFuelType());
        bike.drive(50);

        System.out.println("Excavator fuel type: " + excavator.getFuelType());
        excavator.refuel(20);
    }
}


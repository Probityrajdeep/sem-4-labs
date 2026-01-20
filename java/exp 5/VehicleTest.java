class Vehicle {
    String model = "Tesla";
    int year = 2024;
}

class Car extends Vehicle {
    int numDoors = 4;
    String fuelType = "Electric";
}

public class VehicleTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("Model: " + myCar.model + ", Doors: " + myCar.numDoors);
    }
}
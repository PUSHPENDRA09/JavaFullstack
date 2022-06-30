package superkeyword;

public class Vehicle {

    int vehicleCode;
    String vehicleType;
}

class Bike extends Vehicle {
    String bikeName;
    String brand;
    String model;

    public Bike(int VehileCode, String VehicleType, String bikeName, String brand, String model) {
        this.bikeName = bikeName;
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println("vehicle code" + super.vehicleCode);
        System.out.println("vehicle type" + super.vehicleType);
        System.out.println("bike name" + bikeName);
        System.out.println("brand" + brand);
        System.out.println("model" + model);
    }
}
    class VehicleImpl {
        public static void main(String[] args) {
            Bike bike = new Bike(101, "bike", "splendor", "hero", "125cc");
        }
    }

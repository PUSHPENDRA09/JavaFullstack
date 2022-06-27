package association;

public class Vehicle {

    int wheels;
    String vehicletype;
    String brand;
}

class Car extends Vehicle {
    String segment;
    String model;
    String varient;
    Engine engine;
    MPlayer mPlayer;

}

class Engine {
    int stroke;
    String engineType;
    int cc;
}

class MPlayer {
    String companyName;
    double price;
}

class VehicleImpl {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Suzuki";
        car.vehicletype = "car";
        car.model = "swift";
        car.segment = "hashback";
        car.varient = "diesel";
        Engine suzukiengine = new Engine();
        suzukiengine.engineType = "bs6";
        suzukiengine.cc = 1296;
        suzukiengine.stroke = 4;
        car.engine = suzukiengine;
        MPlayer sonyplayer = new MPlayer();
        sonyplayer.companyName = "sony";
        sonyplayer.price = 3400;
        car.mPlayer = sonyplayer;


    }
}

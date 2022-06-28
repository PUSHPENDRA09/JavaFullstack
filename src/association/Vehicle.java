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

        System.out.println("car brand :" +car.brand);
        System.out.println("car type :" +car.vehicletype);
        System.out.println("car model :" +car.model);
        System.out.println("car segment :" + car.segment);
        System.out.println("car varient :" +car.varient);

        System.out.println("car engine type :" +suzukiengine.engineType );
        System.out.println("car strokes :" +suzukiengine.stroke);
        System.out.println("car engine :"+car.engine);

        System.out.println("player name :" +sonyplayer.companyName);
        System.out.println("player price"+sonyplayer.price);
        System.out.println("player  model :" +car.mPlayer);


    }
}

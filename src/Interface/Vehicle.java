package Interface;

public interface Vehicle{

}
interface Engine{



}
class Car implements Vehicle {
    boolean isVehicle() {
        return false;
    }
}
class Bike implements Engine{

}
class VehicleImpl{
    public static void main(String[] args){

        Car engine = new Car();
        Bike bike = new Bike();



        if (bike instanceof Vehicle)
        {

            System.out.println("car");
        }
        else {
            System.out.println("bike");
        }
    }
}
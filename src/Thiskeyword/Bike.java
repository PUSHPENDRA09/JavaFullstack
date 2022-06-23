package Thiskeyword;

public class Bike {
    public Bike(String bikeName) {
        BikeName = bikeName;
    }

    int BikeNo;
    String BikeName;

    public Bike(int BikeNo, String BikeName) {

        this.BikeNo = BikeNo;
        this.BikeName = BikeName;
    }

    void dispay() {
        System.out.println(" bike details");
        System.out.println("BikeNo is :" + BikeNo);
        System.out.println("BikeName is :" + BikeName);
    }
}
    class Bikeimpl{
        public static void main(String args[])
        {
            Bike bike = new Bike(12,"activa");
            bike.dispay();
        }

        public Bikeimpl() {
        }
    }


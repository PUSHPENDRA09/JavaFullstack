package Thiskeyword;

public class Car {

    String carName;
    String vehicleNo;
    int carNo;
    double price;

    Car(int carNo, String carName,double price){

        this.carNo = carNo;
        this.carName=carName;
        this.price=price;
    }
    void display(){
        System.out.println("car details");
        System.out.println("car no :" +carNo);
        System.out.println("car name :" +carName);
        System.out.println("car price :" +price);
    }
}

class carImpl
{
    public static void main(String[] args)
    {
        Car c1 = new Car(101,"swift",500000);
        c1.display();
    }
}

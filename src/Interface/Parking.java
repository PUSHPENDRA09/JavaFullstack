package Interface;

public interface Parking {


}


class TwoWheeler implements Parking{
    void show(){
        System.out.println("In two wheeler");
    }
}

class FourWheeler{
    void show(){
        System.out.println("In four wheeler");
    }
}
class ParkingImpl{
    public static void main(String[] args){
    TwoWheeler twoWheeler = new TwoWheeler();
    FourWheeler fourWheeler= new FourWheeler();

    if(fourWheeler instanceof Parking){
        System.out.println("Allow");
    }
    else
    {
        System.out.println("Dont Allow.");
    }
}
}
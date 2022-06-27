package inheritance;

public class Area {

    String aCir;
    String react;
    String aSquare;
    String aTringle;


}
class Circle extends Area{
    int r=4;
    double aCir = 3.14*(r*r);
}
class React extends Area{
    int l=10;
    int b=6;
    double react = l*b ;
}
class Square extends Area{
    int a=5;
    double aSquare = a*a;
}
    class Tringle extends Area{
        double a=0.5;
        int b=3;
        int c=4;
        double aTringle = a*b*c;
}

class AreaImpl{
    public static void main(String[] args)
    {
        Circle circle = new Circle();
        React react=new React();
        Square square=new Square();
        Tringle tringle=new Tringle();

        System.out.println(""+circle.aCir);
        System.out.println(""+react.react);
        System.out.println(""+square.aSquare);
        System.out.println(""+tringle.aTringle);
    }
}

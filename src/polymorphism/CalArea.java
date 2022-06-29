package polymorphism;

public class CalArea {
    double area(){
        return area();
    }
}
class Cir extends CalArea{
    int r=7;
    double area(){
        return 3.14*r*r;
    }
}
class Rect extends CalArea {
    int l = 7;
    int b=5;

    double area() {
        return l*b;
    }
}
class CalAreaImpl{
    public static void main(String[] args) {
        CalArea calArea;
        calArea=new Cir();
        System.out.println(calArea.area());
        calArea=new Rect();
        System.out.println(calArea.area());
    }
}



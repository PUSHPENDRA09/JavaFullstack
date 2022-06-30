package abstraction;

public abstract class Shape {

    abstract double CalculateArea();

    void display() {
        System.out.println("Calculating of different shapes");
    }
}

class Rectangle extends Shape {
    int breath;
    int height;

    public Rectangle(int breath, int height) {
        this.breath = breath;
        this.height = height;
    }

    @Override
    double CalculateArea() {
        return breath * height;
    }

    @Override
    void display() {
        super.display();
        System.out.println("area of rectangle " + CalculateArea());
    }
}

class Saqure extends Shape {
    int a;

    @Override
    double CalculateArea() {
        return a * a;
    }
    @Override
    void display() {
//        super.display();
        System.out.println("area of saqure " + CalculateArea());
    }
    public Saqure(int a) {
        this.a = a;
    }
}

class Circle extends Shape {
    int l;
    int b;

    @Override
    double CalculateArea() {
        return 0.5 * l * b;
    }
    @Override
    void display() {
//        super.display();
        System.out.println("area of circle " + CalculateArea());
    }

    public Circle(int l, int b) {
        this.l = l;
        this.b = b;
    }
}

class ShapeImpl {
    public static void main(String[] args) {
        Shape shape = new Rectangle(3, 7);
        shape.display();
        shape = new Saqure(5);
        shape.display();
        shape = new Circle(7, 8);
        shape.display();
    }

}



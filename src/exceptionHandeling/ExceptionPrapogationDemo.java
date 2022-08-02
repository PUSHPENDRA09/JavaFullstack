package exceptionHandeling;

public class ExceptionPrapogationDemo {

    void m1() {
        int result = 10 / 0;
    }

    void m2() {
        m1();
    }
    void m3(){
        try {

            m2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ExceptionPrapogationDemo demo = new ExceptionPrapogationDemo();
        demo.m3();
    }
}
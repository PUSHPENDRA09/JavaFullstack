package Thiskeyword;

public class A {

    int n;
    void m(A a)
    {
        System.out.println("current class method m");
    }
    void n()
    {
        System.out.println("n method get call");
        m(this);
        System.out.println("exit from n");
    }
    public static void main(String[] args)
    {
        A a = new A();
        a.n();
    }
}

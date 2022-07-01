package Static;

public class Student {
    int rno;
    String name;
    static String schoolname;

    void display() {
        System.out.println(rno + ":" + name + ":" + schoolname);
    }
}

//    public Student(int rno, String name) {
//        this.rno = rno;
//        this.name = name;
//    }

class Studentimpl {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";
        s1.rno = 1;
        s1.schoolname = "jj";

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.rno = 2;
        s2.schoolname = "jj";

        s1.display();
        s2.display();

    }
}
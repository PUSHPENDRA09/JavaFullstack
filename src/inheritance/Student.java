package inheritance;

public class Student {

    String name;
    int rno=25;
    String div="b";
}
class PhysicsMarks extends Student{
    double Marks = 78;
}
class ChemistryMarks extends Student{
    double Marks = 88;
}
class MathMarks extends Student{
    double Marks = 90;
}

class StudentImpl{
    public static void main(String[] args){
    MathMarks mathmarks = new MathMarks();
    ChemistryMarks chemistryMarks = new ChemistryMarks();
    PhysicsMarks physicsMarks = new PhysicsMarks();

        System.out.println("student detail");
        System.out.println("Roll no" +mathmarks.rno);
        System.out.println("name" +mathmarks.name);
        System.out.println("Div" +mathmarks.div);

}
}
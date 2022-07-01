package Static;

public class Employee {

    int EmpNo;
    String EmpName;
    static String companyName;
    static void show(){

        companyName = "codekul";
    }
    void display(){
        companyName="codekul";
        System.out.println(companyName);
    }
}


class EployeeImpl{
    public static void main(String[] args){
        Employee.show();
        Employee e=new Employee();
        e.display();
    }
}

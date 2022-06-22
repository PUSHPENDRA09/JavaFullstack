package Oops;

public class PersonDetail {

    String personname;
    String personadd;
    Float age;

    void inserData(String pname, String add, float a) {
        personname = pname;
        personadd = add;
        age = a;

    }

    void display() {
        System.out.println("student detail");
        System.out.println("personname" + personname);
        System.out.println("personaddress" + personadd);
        System.out.println("personage" + age);
    }
}




package Oops;

import java.util.Scanner;

public class Student {

    int rollno;
    String name;
    String address;
    float age;


    void inserData(int r,String nm,String add,float a){

        rollno =r;
        name = nm;
        address =add;
        age =a ;

    }
    void display()
    {
        System.out.println("student details");
        System.out.println("rollno " +rollno);
        System.out.println("student name " +name);
        System.out.println("student addr " +address);
        System.out.println("student age " +age);
    }
}

class Studentimpl {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "ram";
        s1.address = "pune";
        s1.age = 5.5f;


        Scanner sc= new Scanner(System.in);
        System.out.println("enter rollno");
        int rollno = sc.nextInt();
        System.out.println("enter name");
        String nm =sc.next();
        System.out.println("enter address");
        String addr= sc.next();
        System.out.println("enter age");
        Float age = sc.nextFloat();

        s1.inserData(rollno,nm,addr,age);
        s1.display();

        Student s2= new Student();
        s2.inserData(3,"ram","ny",50);
        s2.display();
    }
}

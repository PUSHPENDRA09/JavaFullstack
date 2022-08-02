package controleflowstatement;

import java.util.Scanner;

public class Forloops {
//    public static void main(String args[]) {
//        for (int i = 0; i < 3; i++)
//            System.out.println(i);
//
//           //nested forloop
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println(i + " " + j);
//            }
//        }
//        for (int i = 3; i > 0; i--) {
//            for (int j = 3; j > 0; j--) {
//                System.out.println(i + " " + j);
//            }
//
//            //Enhanced for loop
//            int a[] ={5,10,15,20};
//            for (int no:a){
//                System.out.println(no);
//            }
//        }
//    }

    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
                int age = sc.nextInt();

                if(age>18){
                    System.out.println("adult");
                }else
                {
                    System.out.println("not adult");
                }
    }
}


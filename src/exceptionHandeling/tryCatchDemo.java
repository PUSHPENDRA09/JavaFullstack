package exceptionHandeling;

import java.util.Scanner;

public class tryCatchDemo {
    public static void main(String[] args) {
        int a;
        int b;
        int result = 0;
        String str = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        a = sc.nextInt();
        b = sc.nextInt();

        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            result = a / b;
            System.out.println(str.toLowerCase());
            System.out.println("4");
            System.out.println("5");

            }catch(ArithmeticException e){
                e.printStackTrace();
            }


        System.out.println("result :"+result);
        System.out.println("rest of code");
        }
    }

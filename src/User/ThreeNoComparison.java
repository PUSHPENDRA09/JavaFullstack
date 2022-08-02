package User;

import java.util.Scanner;

public class ThreeNoComparison {

    public static void main(String[] args) {

        System.out.println("enter a ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        switch (a) {

            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
            default:
                System.out.println("rest of month");
        }

    }}
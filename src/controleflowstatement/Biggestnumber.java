package controleflowstatement;

import java.sql.SQLOutput;

public class Biggestnumber {

    public static void main(String args[]) {

        int a = 30;
        int b = 45;
        int c = 10;

        if (a > b)
            if (a > c) {
                System.out.println("a is greater");
            }
        if (b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }

        if (a < b)
            if (a < c) {
                System.out.println("a is smaller");
            }
        if (b < c) {
            System.out.println("b is smaller");
        } else {
            System.out.println("c is smaller");
        }

    }
}
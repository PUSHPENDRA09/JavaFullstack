package controleflowstatement;

import java.util.Scanner;

public class Assignment2 {

    public static void main(String args[]){
        Scanner month = new Scanner(System.in);
        System.out.println("enter month");
        String ch = month.next();

        switch (ch){
            case "jan":
                System.out.println("janury");
                break;

            case "feb":
                System.out.println("febury");
                break;

            case "mar":
                System.out.println("march");
                break;

            case "apr":
                System.out.println("april");
                break;

            case "may":
                System.out.println("may");
                break;

            case "jun":
                System.out.println("june");
                break;

            case "jul":
                System.out.println("july");
                break;
        }
    }
}

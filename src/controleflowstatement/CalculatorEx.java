package controleflowstatement;

import java.util.Scanner;

public class CalculatorEx {

    public static void main(String args[]) {

        int no1, no2;

        Scanner scanner = new Scanner(System.in);

        char ch;
        int result;

        do {
            System.out.println("enter no1");
            no1 = scanner.nextInt();
            System.out.println("enter no2");
            no2 = scanner.nextInt();
            System.out.println("1.addition");
            System.out.println("2.substraction");
            System.out.println("3.multiplication");
            System.out.println("4.divsion");
            System.out.println("enter your choise");
            int choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    result = no1 + no2;
                    System.out.println("addition is" + result);
                    break;

                case 2:
                    result = no1 - no2;
                    System.out.println("substraction is" + result);
                    break;

                case 3:
                    result = no1 * no2;
                    System.out.println("multiplication is" + result);
                    break;

                case 4:
                    result = no1 / no2;
                    System.out.println("division is" + result);
                    break;

                default:
                    System.out.println("wrong choise");
            }
            System.out.println("do you want to continue");
            ch = scanner.next().charAt(0);


        }while (ch=='Y'|| ch=='y');
    }
}

package exceptionHandeling;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        long units;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units");
        units = sc.nextLong();
        double bill = 0;
        if (units <= 50) {
            bill = units * 0.5;
        } else if (units <= 150) {
            bill = 50 * 0.5 + 100 * 0.75 + (units - 150) * 1.20;
        } else {
            bill = 50 * 0.5 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
        }
        double total = bill + (20 / 100 * bill);
        System.out.println("The total bill is " + total);
    }
}

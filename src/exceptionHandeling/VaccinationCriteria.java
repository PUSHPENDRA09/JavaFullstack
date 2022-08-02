package exceptionHandeling;

import java.util.Scanner;

public class VaccinationCriteria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        try {
            validateAge(age);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void validateAge(int age) {
        if (age < 18 || age > 55) {
            throw new ArithmeticException("you are not eligible for vaccine");
        } else {

            System.out.println("you are eligible for vaccine");
        }
    }
}
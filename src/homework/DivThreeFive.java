package homework;
import java.util.Scanner;

public class DivThreeFive {

    public static void main(String[] args){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no :");
        no = sc.nextInt();

        if (no%3==0 & no%5==0){
            System.out.println(no+ " no is divisible by 3 & 5");
        }
        else if (no%3==0) {
            System.out.println(no+ " no is divisible by 3");
        } else if (no%5==0) {
            System.out.println(no+ " no is divisible by 5");
        }
        else
        {
            System.out.println(no+ " no is divisible by 3&5");
        }
    }
}

package controleflowstatement;

import java.util.Scanner;

public class VowelsEx {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any char");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
                System.out.println("Vowel");
                break;

            case 'e':
                System.out.println("Vowel");
                break;

            case 'i':
                System.out.println("Vowel");
                break;

            case 'o':
                System.out.println("Vowel");
                break;

            case 'u':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonunts");

        }
    }
}

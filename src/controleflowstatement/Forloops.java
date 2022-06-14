package controleflowstatement;

public class Forloops {
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++)
            System.out.println(i);

           //nested forloop
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + " " + j);
            }
        }
        for (int i = 3; i > 0; i--) {
            for (int j = 3; j > 0; j--) {
                System.out.println(i + " " + j);
            }
        }
    }
}


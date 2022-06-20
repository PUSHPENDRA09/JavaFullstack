package controleflowstatement.Prime;

public class noEx {

    public static void main(String args[]) {
        int no = 15;
        boolean flag = false;
        for (int i = 2; i < no / 2; i++) {
            if (no % i == 0) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("no is prime");
        } else {
            System.out.println("no is not prime");
        }
    }

}

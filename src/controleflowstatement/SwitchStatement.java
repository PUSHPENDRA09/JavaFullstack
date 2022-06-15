package controleflowstatement;

public class SwitchStatement {
    public static void main(String args[]) {

        int ch = 3;
        switch (ch) {

            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            case 3:
                System.out.println("three");
                break;

            default:
                System.out.println("no match found");
                break;
        }
    }
}
package exceptionHandeling;

public class NestedTry {

    public static void main(String[] args){
        String msg = null;
        try {
            try {
                System.out.println(10/2);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            System.out.println(msg.toLowerCase());
            System.out.println("rest of code 1");
        }catch (NullPointerException e){

            System.out.println(e.getMessage());
        }
        System.out.println("rest of code 2");
    }
}

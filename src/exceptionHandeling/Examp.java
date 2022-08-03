package exceptionHandeling;

public class Examp {
    public static void main(String[] args) {
        String n=null;
        try {
            System.out.println("I am in try");
            System.out.println(n.length());
        }catch (Exception e){
           try {
               System.out.println(10/0);
           }catch (ArithmeticException e1){
               System.out.println(e1.getMessage());
           }
        }
        finally {
            String num = "121";
            System.out.println(Integer.parseInt(num));
        }
        System.out.println("rest of code");
    }
}

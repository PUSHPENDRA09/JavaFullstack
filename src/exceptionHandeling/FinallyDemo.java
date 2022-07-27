package exceptionHandeling;

public class FinallyDemo {
    public static void main(String[] args){

        try {
            System.out.println(10/0);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("in fianally block");
        }
        System.out.println("in rest of code");
    }
}

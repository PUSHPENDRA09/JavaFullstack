package exceptionHandeling;

public class ArrayIndex {

    public static void main(String[] args){

        String a = "hello";
        System.out.println(a.toLowerCase());

        int b[] = {1,2,3,4,5,6};

        try {
            System.out.println(b[1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}

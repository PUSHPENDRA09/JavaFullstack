package Strings;

public class Stringconcat {

    public static void main(String[] args) {


        String FristName = "hello";
        String LastName ="world";

        String FullName = FristName + " " +LastName ;

        System.out.println(FullName);

        //calculate length
        System.out.println(FullName.length());

        //Charat

        for (int i=0;i<FullName.length();i++){
            System.out.println(FullName.charAt(i));
        }
    }
}

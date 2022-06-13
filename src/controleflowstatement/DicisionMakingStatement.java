package controleflowstatement;

public class DicisionMakingStatement {

    public static void main(String args[]) {
        String city = "pune";
        if (city == "pune")

            System.out.println("you are from pune");

        else

            System.out.println("you are in mumbai");


        if (city == "goa")

            System.out.println("you are from goa");

        else
            System.out.println("you are from pune");


        String country = "india";
        if (country == "india")
            if (city == "goa") {
                System.out.println("goa is in india");
            } else {
                if (city == "pune") ;
                System.out.println("pune is in india");
            }
        else {
            System.out.println("you are from");

        }

    }


}



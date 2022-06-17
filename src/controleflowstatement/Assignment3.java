package controleflowstatement;

public class Assignment3 {

    public static void main(String args[]) {
//        int number = 05;
//
//        if (number % 2 == 0) {
//
//            System.out.println("number is even");
//        } else {
//            System.out.println("number is odd");
//        }

        int no =5;
        int fact =1 ;

        for (int i=1;i<=no;i++)
        {
            fact = fact * i ;

        }
        System.out.println(no+
                "factorial is" +fact);
   }
    }

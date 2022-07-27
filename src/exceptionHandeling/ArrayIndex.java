package exceptionHandeling;

public class ArrayIndex {

//    public static void main(String[] args){
//
//        String a = "hello";
//        System.out.println(a.toLowerCase());
//
//        int b[] = {1,2,3,4,5,6};
//
//        try {
//            System.out.println(b[1]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());  //numberformat exception.
//        }
//    }
//    public static void main(String[] args){
//
//        String hi= "pushpendra";
//        System.out.println(hi.toLowerCase());
//
//        int a[]  =  {1,2,3,4,5,6,7,8,9};
//
//        try{
//            System.out.println(a[10]);
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
//    }

//    public static void main(String[] args){
//
//        String h= "hello world";
//        System.out.println(h.toLowerCase());
//
//        int a[] = {0,9,8,7,6,5,4,3,2,1};
//
//        try {
//            System.out.println(a[2]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
//
//    }


    public static void main(String[] args){

        String a = "welcome";
        System.out.println(a.toLowerCase());


        int q[] = {98,7,62,34,59,87,6};

        try {
            System.out.println(q[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()

            );
        }
    }

}

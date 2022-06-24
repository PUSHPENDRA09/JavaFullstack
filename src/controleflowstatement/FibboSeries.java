package controleflowstatement;

public class FibboSeries {

    public static void main(String[] args){


    int no1 = 0;
    int no2 = 1;
    int limit = 10;
    System.out.println(+no1);
    System.out.println(+no2);
    while (limit>0){

        int next = no1+no2;
        System.out.println(+next);
        no2=next;
        no1=no2;
        limit--;

    }

}
}
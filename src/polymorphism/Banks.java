package polymorphism;

public class Banks {
    float intrest() {
        return 8;
    }
}
    class Sbi extends Banks{
        float intrest(){
            return 9;
        }
    }
    class Hdfc extends Banks{
    float intrest(){
        return 9.9f;
    }
    }
    class RbiImpl{
    public static void main(String[] args){
        Banks rbi = new Banks();
        rbi=new Sbi();
        System.out.println(rbi.intrest());
    }
    }


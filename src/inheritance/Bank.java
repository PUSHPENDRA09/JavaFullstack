package inheritance;

public class Bank {

    int bankno;
    String ifscCode;
}
class SbiBank extends Bank{
    String address;
    String branchcode;
    String contactno;

    void display(){
        System.out.println("bank no" +bankno);
        System.out.println("ifsc code" +ifscCode);
        System.out.println("address" +address);
        System.out.println("branchcode" +branchcode);
        System.out.println("contactno" +contactno);
    }
}
class BankImpl{
    public static void main(String[] args)
    {
        SbiBank sbiBank = new SbiBank();
        sbiBank.address = "kothrud,pune";
        sbiBank.branchcode="sbi123";
        sbiBank.bankno=333;
    }
}
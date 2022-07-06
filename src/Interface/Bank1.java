package Interface;

import java.util.Base64;

public interface Bank1 {

    double getRateofIntrest();
    float N=10;
}

interface BankOperations extends Bank1{
    double CalculateIntrest();
}
class HDFC implements BankOperations{
    @Override
    public double getRateofIntrest() {
        return 10;
    }

    @Override
    public double CalculateIntrest() {
        return 0;
    }
}
class BankImpl{

    public static void main(String[] args)
    {
        BankOperations bank;
        bank = new HDFC();
        bank.getRateofIntrest();
        bank.getRateofIntrest();

    }
}

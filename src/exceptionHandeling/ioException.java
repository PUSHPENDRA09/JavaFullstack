package exceptionHandeling;

import java.io.File;

public class ioException {

    public static void main(String[] args)
    {
        File file = new File("abc.txt");
                                   //io exception
       // file.createNewFile();  //checked or compile exception
    }
}

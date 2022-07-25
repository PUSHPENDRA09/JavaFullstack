package encapsulation;

public class Person{


    private int pid;
    private String fristName;
    private String lastName;
    private String fullName;

    public void setPid(int pid){
        this.pid = pid;
    }

    public int getPid() {
        return pid;
    }

    public String getFullName() {
        fullName=fristName+""+lastName;
        return fullName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

class PersonImpl{
    public static void main(String[] args){
        

    }
}

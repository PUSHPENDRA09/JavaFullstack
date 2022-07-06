package finalkeyword;

public class Person {

    int EnpId;
    String name;
    final String PAN_NO = "PUSHP234E";
    final String AADHAR_NO;

    final String MOBILE_NO;

    static final String BIRTH_DATE;

    Person() {
        AADHAR_NO = "625464176177";
        MOBILE_NO = "0987654321";
    }

    static {
        BIRTH_DATE = "22/09/1998";
    }

    Person(String AADHAR_NO, String MOBILE_NO) {
        this.AADHAR_NO = AADHAR_NO;
        this.MOBILE_NO = MOBILE_NO;
        System.out.println(AADHAR_NO);
        System.out.println(MOBILE_NO);
    }
}

class PersonImpl {
    public static void main(String[] args) {
        Person person = new Person("123456789", "23456789");
    }
}

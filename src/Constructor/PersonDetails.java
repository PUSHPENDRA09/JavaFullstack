package Constructor;

public class PersonDetails {

    int id;
    String name;

    PersonDetails(int i, String nm) {
        id = i;
        name = nm;
    }

    PersonDetails(String nm) {
        name = nm;
    }

    PersonDetails() {
        System.out.println("default");
    }

    void display() {
        System.out.println("id" + id);
        System.out.println("name" + name);
    }
}

class Personimpl {
    public static void main(String[] aregs) {
        PersonDetails p1 = new PersonDetails(2, "im");
        p1.display();
        PersonDetails p2 = new PersonDetails();
        p2.display();
    }
}

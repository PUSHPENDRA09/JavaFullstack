package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class PersonDemo {

    public PersonDemo(String name, Integer id, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    private String name;
    private Integer id;
    private Integer age;

    public PersonDemo(String ram) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public static void main(String[] args) {

        List<PersonDemo> personList = new ArrayList<>();
        PersonDemo p1 = new PersonDemo("ram");

    }
}
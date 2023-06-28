package practicePrincy;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
}

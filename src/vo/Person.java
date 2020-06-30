package vo;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    private final String name;
    private int age;
    private String gender;

    public static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ram", 20, "M"));
        people.add(new Person("Mohan", 60, "M"));
        people.add(new Person("Sita", 26, "F"));
        people.add(new Person("Raju", 20, "M"));
        people.add(new Person("Rita", 45, "F"));
        people.add(new Person("Gita", 28, "F"));
        people.add(new Person("Rohan", 70, "M"));
        return people;
    }

    @Override
    public String toString() {
        return name + ":" + age + ":" + gender;
    }
}

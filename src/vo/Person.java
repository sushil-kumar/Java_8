package vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ram", 20, "M"));
        people.add(new Person("Mohan", 60, "M"));
        people.add(new Person("Sita", 26, "F"));
        people.add(new Person("Raju", 20, "M"));
        people.add(new Person("Rita", 20, "F"));
        people.add(new Person("Gita", 20, "F"));
        people.add(new Person("Rohan", 20, "M"));
        return people;
    }

    @Override
    public String toString() {
        return name + ":" + age + ":" + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}

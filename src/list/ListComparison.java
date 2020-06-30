package list;

import vo.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ListComparison {
    public static void main(String[] args) {
        List<Person> people = Person.getPeople();

        // Sort people with first name
        // Using Collections.sort
        /*Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        /*Collections.sort(people, (Person o1, Person o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(people);*/

        // Java 8 style using Comparator.comparing
        people.sort(Comparator.comparing(Person::getName)
                            .thenComparing(Person::getAge));

        System.out.println(people);

        // Reverse Order
        people.sort(Comparator.comparing(Person::getName, Comparator.reverseOrder()));

        System.out.println(people);
    }
}

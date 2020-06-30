package stream;

import vo.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollector {
    public static void main(String[] args) {
        List<Person> people = Person.getPeople();
        // List of all the person's name with age > 30
        // Using reduce and using collect
        /*List<String> personWithAge30 =
                        people.stream()
                            .filter(person -> person.getAge() > 30)
                            .map(Person::getName)
                            .reduce(
                                new ArrayList<>(),
                                (names, name) -> {
                                    names.add(name);
                                    return names;
                                },
                                (names1, names2) -> {
                                    names1.addAll(names2);
                                    return names1;
                                }
                            );

        System.out.println(personWithAge30);*/

        /*List<String> personWithAge30 =
                people.stream()
                        .filter(person -> person.getAge() > 30)
                        .map(Person::getName)
                        .collect(Collectors.toList());

        System.out.println(personWithAge30);*/

        // to set
        Set<String> personWithAge30 =
                people.stream()
                        .filter(person -> person.getAge() > 30)
                        .map(Person::getName)
                        .collect(Collectors.toSet());

        System.out.println(personWithAge30);

        // Comma separated list of Person Age
        // joining
        System.out.println(
                people.stream()
                        .filter(person -> person.getAge() > 30)
                        .map(Person::getName)
                        .collect(Collectors.joining(","))
        );
    }
}

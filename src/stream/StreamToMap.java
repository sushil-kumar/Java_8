package stream;

import vo.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamToMap {
    public static void main(String[] args) {
        List<Person> people = Person.getPeople();

        // Create a Map with name as key and person as value
        /*Map<String, Person> mapOfPerson = people.stream()
                                            .collect(Collectors.toMap(
                                               Person::getName,
                                               person -> person
                                            ));
        System.out.println(mapOfPerson);*/

        // Create a Map with Gender as Key and person as value
        // Key conflict
        /*Map<String, Person> mapOfPerson = people.stream()
                                            .collect(Collectors.toMap(
                                                    Person::getGender,
                                                    person -> person,
                                                    (u, v) -> v
                                            ));
        System.out.println(mapOfPerson);*/

        // Create a Map with Gender as Key and list of person as value
        // grouping by
        Map<String, List<Person>> mapOfPerson = people.stream()
                                            .collect(Collectors.groupingBy(Person::getGender));
        System.out.println(mapOfPerson);

        // Create a Map with Gender as Key and List of Person Name as Value
        // grouping by with mapping
        Map<String, List<String>> mapOfPersonNames = people.stream()
                                        .collect(Collectors.groupingBy(Person::getGender,
                                                Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println(mapOfPersonNames);
    }
}

package stream;

import vo.Person;

import java.util.List;

public class StreamCollector {
    public static void main(String[] args) {
        List<Person> people = Person.getPeople();
        // List of all the person's name with age > 30
        // Using reduce and using collect


        // Comma separated list of Person Age
        // joining
    }
}

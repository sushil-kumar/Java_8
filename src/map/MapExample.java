package map;

import vo.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        List<Person> people = Person.getPeople();

        // Create a Map with Gender as Key and list of person as value
        // Traditional approach
        /*Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            List<Person> list = null;
            if (map.containsKey(person.getGender())) {
                list = map.get(person.getGender());
            } else {
                list = new ArrayList<>();
                map.put(person.getGender(), list);
            }
            list.add(person);
        }
        System.out.println(map);*/

        /*Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            List<Person> list = map.get(person.getGender());
            if (list == null) {
                list = new ArrayList<>();
                map.put(person.getGender(), list);
            }
            list.add(person);
        }
        System.out.println(map);*/

        // using getOrDefault
        /*Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            List<Person> list = map.getOrDefault(person.getGender(), new ArrayList<>());
            map.put(person.getGender(), list);
            list.add(person);
        }
        System.out.println(map);*/

        // using computeIfAbsent
        Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            map.computeIfAbsent(person.getGender(), p -> new ArrayList<>()).add(person);
        }
        System.out.println(map);

    }
}

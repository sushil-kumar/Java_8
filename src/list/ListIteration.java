package list;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListIteration {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // External Iterator
        /*for (int i=0;i<list.size();++i) {
            System.out.println(list.get(i));
        }*/

        // Another form of External Iterator
        /*for (int elem : list) {
            System.out.println(elem);
        }*/

        // Functional Approach using forEach
        //list.forEach(integer -> System.out.println(integer));

        // Method Reference
        //list.forEach(System.out::println);

        list.forEach(ListIteration::op);
    }

    static void op (Integer integer) {
        integer = integer * 2;



        System.out.println(integer);
    }
}

package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ListOperations {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // Remove all even numbers
        // Traditional Approach using iterator
        /*for (Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
            int temp = itr.next();
            if (temp % 2 == 0) {
                itr.remove();
            }
        }
        System.out.println(list);*/

        // Functional Approach using removeIf
        list.removeIf(integer -> integer % 2 == 0);

        System.out.println(list);

        // Transform each element in-place (replaceAll)
        // multiply each element by 2
    }
}

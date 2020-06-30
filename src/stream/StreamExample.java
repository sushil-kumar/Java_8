package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Find the double of first even number greater then 3
        int num = list.stream()
                        .filter(isEven)
                        .filter(number -> number > 3)
                        .map(number -> number * 2)
                        .findFirst()
                        .orElse(-1);

                        //.orElseGet(() -> -1);
        System.out.println(num);

        // count all the odd numbers
        System.out.println(list.stream()
                            .filter(isEven)
                            .count());

        // sum of all even the numbers
        System.out.println(list.stream()
                                .filter(isEven)
                                .mapToInt(number -> number)
                                .sum());
    }
}

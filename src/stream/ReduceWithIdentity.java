package stream;

import java.util.Arrays;
import java.util.List;

public class ReduceWithIdentity {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Sum of all the integers using reduce
        // Meaning of Identity value in reduce
        int sum = list.stream()
                        .reduce(
                                0,
                                (tempSum, number) -> tempSum + number,
                                (sum1, sum2) -> sum1 + sum2
                        );
        System.out.println(sum);
    }
}

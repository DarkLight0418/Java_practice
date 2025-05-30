package Chapter13_Lambda_and_Stream.innerclass.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectTest {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;

        List<Integer> numbers = Arrays.asList(5, -10, -22, 0, 43, 7);

        List<Integer> positiveNumbers = numbers.stream()
                .filter(isPositive)
                .collect(Collectors.toList()); // 반환값을 리스트로 출력
        System.out.println(positiveNumbers);
    }
}

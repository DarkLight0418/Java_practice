package Chapter13_Lambda_and_Stream.innerclass.stream;

import java.util.Arrays;
import java.util.List;

public class SortedTest {
    public static void main(String[] args) {
        // 문자열 리스트 생성
        List<String> fruits = Arrays.asList("파인애플", "사과", "바나나", "귤");

        System.out.print("기본 정렬 (오름차순으로 정렬): ");

        // 오름차순으로 정렬
        fruits.stream()
                .sorted()
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        System.out.print("맞춤형 정렬 (문자열 길이에 따라 정렬): ");

        // 문자열 길이에 따라 정렬
        fruits.stream()
                .sorted((f1, f2) -> Integer.compare(f1.length(), f2.length()))
                .forEach(s -> System.out.print(s + " "));
    }
}

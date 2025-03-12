package exercise.chapter12;

import java.util.List;
import java.util.stream.Stream;

public class Ex1 {
  public static void main(String[] args) {
    List<Integer> scores = List.of(45,76,38,27,50);
    Stream<Integer> s1 = scores.stream();
    s1.map(i -> i + 10) // .map(i -> i + 10) => map의 내용물에서 i 들을 1 10
        .forEach(System.out::println);
  }
}

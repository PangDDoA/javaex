package exercise.chapter12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex2 {
  public static void main(String[] args) {
    Stream.of("a1", "a2", "a3")//Stream<String> 을 생성
        .map(s -> s.substring(1)) // 문자열을 1개씩 자른다.
        .mapToInt(Integer::parseInt) // 문자열스트림을 숫자스트림으로 변환
        .max() // 최대값을 찾아서 Optional 로 반환
        .ifPresent(System.out::println);


    Stream<String> stringStream = Stream.of("a1", "a2", "a3")//Stream<String> 을 생성
        .map(s -> s.substring(1));// 문자열을 1개씩 자른다.

    System.out.println(stringStream);//해시값을 문자열이나 숫자로 변환하기


  }
}

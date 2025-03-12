package exercise.chapter12;

import java.util.List;

public class Ex3 {
  public static void main(String[] args) {
    List<String> animal = List.of("갈매기", "나비", "다람쥐", "라마");
    animal.stream()
        .filter(s ->s.length() == 2) //필터를 사용해서 길이가 2개인 것과 같은 것을 걸른다.
        .forEach(System.out::println);
  }

}

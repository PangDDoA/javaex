package exercise.chapter12;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

public class Ex4 {
  public static void main(String[] args) {
    List<String> capitals = List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
    //1)스트림을 생성
    //2)정렬 오름차순
    //3)첫번째 수도를 출력
    capitals.stream()
        .sorted()
        .findFirst()//첫번째를 찾고
        .ifPresent(System.out::println);//맞으면 출력해라.
  }
}

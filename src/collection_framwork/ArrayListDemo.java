package collection_framwork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    List<String> list = List.of("그랜저", "소나타", "아반테", "제네시스", "소울");
    //list.set(0,"K3"); 불변객체라 수정 불가.

    List<String> list2 = new ArrayList<>(list); // new ArrayList<>()에 list를 넣음으로서 가변객채로

    list2.add("K3");
    //list2.set(0,"뉴 그랜저");
    list2.removeIf(s -> s.startsWith("소")); // .startWith => true, false 도출
    System.out.println(list2);
    list2.forEach(s-> System.out.println(s));
    list2.forEach(System.out::println);
    list2.replaceAll(s -> "뉴" + s);
    list2.clear(); // 객체 전부 지우기
    if (list2.isEmpty()){
      System.out.println("리스트가 비었습니다.");
    }

  }
}

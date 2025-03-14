package collection_framwork;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    set.add(10);
    System.out.println(set);

    set.add(10);
    System.out.println(set); // 동일객체는 추가하지 않는다.

    set.add(20);
    set.add(5);
    System.out.println(set); // 다른값이므로 값 추가. 앞부터 추가

    Set<String> s = Set.of("a","b","c","d");
    HashSet<String> set2 = new HashSet<>(s);
    set2.add("e");
    set2.add("a");
    System.out.println(set2);
  }
}

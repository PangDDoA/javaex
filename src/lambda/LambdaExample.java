package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExample {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
    Comparator<String> c = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);  // 오름차수 정리, o2>o1 : 양수, o2>o1 : 음수, o2 == o1 : 0
        //return o1.compareTo(o2);  // 오름차수 정리, o1>o2 : 양수, o1>o2 : 음수, o1 == o2 : 0
      }
    };
    System.out.println(list);
    Collections.sort(list, (String o1, String o2) -> o2.compareTo(o1)); // override 한 식을 람다식을 변형
    System.out.println(list);
  }
}

@FunctionalInterface
interface Comparator<T>{
  int compare(T o1, T o2);
}
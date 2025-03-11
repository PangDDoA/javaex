package collection_framwork;

import java.util.*;

public class CollectionsDemo {
  public static void main(String[] args) {
    String[] fruits = {"포도", "수박", "사과", "키위", "망고"};
    List<String> fruitsList = Arrays.asList(fruits);
    Map<Fruit, Integer> fruitsMap = new HashMap<>();
//    Collections.sort(fruits);
//    Collections.sort(fruitsMap);
    System.out.println(fruitsList);
    Collections.sort(fruitsList);
    System.out.println(fruitsList);

    Collections.sort(fruitsList, ((o1, o2) -> o2.compareTo(o1)));
    System.out.println(fruitsList);

    Collections.sort(fruitsList, Collections.reverseOrder()); // 앞의 람다식으로 작성한 내용과 동일한 결과도출
    System.out.println(fruitsList);

    Collections.reverse(fruitsList);
    System.out.println(fruitsList);

    Collections.rotate(fruitsList,1);
    System.out.println(fruitsList);
    Collections.rotate(fruitsList,1);
    System.out.println(fruitsList);

    Collections.shuffle(fruitsList);
    System.out.println(fruitsList);
  }
}

package collection_framwork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo2 {
  public static void main(String[] args) {
    List<String> list1 = List.of("포도", "수박", "사과", "키위", "망고","포도", "수박", "사과", "키위", "망고");
    System.out.println(list1);
    Set<String> set = new HashSet<>(list1); // HashSet<>(list1)으로 인해서 중복값 제외.
    System.out.println(set);
    //list1.set(0,"키위"); 수정불가 --> immutable
    List<String> list2 = new ArrayList<>(set);
    System.out.println(list2);
    list2.set(0, "키위");
    System.out.println(list2);

//    for (String s : list2)
  }
}

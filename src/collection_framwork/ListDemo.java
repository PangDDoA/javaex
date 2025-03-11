package collection_framwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    String[] animals = {"a", "b", "c", "d"};

    //배열을 리스트로 --> Arrays.asList(배열변수명)
    List<String> list = Arrays.asList(animals); //  반만 불변객체
    //list.add("e");// 리스트로 변경 전은 배열. 배열은 불변객채라서 원소 추가/삭제 X
    System.out.println(list);

    list.set(0,"A"); // 첫번째 자리에 다른 문자열 치환은 가능.
    System.out.println(list);

    List<Integer> list2 = List.of(1,2,3,4,5); // Factory Method, 완전 불변객체
    //list2.set(0,10);
    System.out.println(list2);
    System.out.println(list2.get(1));

    System.out.println("------------------------------------");
    Collection<Integer> listc = new ArrayList<>();
    listc.add(10);
    listc.add(20);
    System.out.println(listc);
    System.out.println(listc.remove(15));
    System.out.println(listc);

    System.out.println("====================================");
    List<Integer> listl = new ArrayList<>(); // 부모메서드를 가지고와서, 부모의 ArrayList 사용가능.
    listl.add(10); // 부모로 부터 물려받은 add 사용. [10]
    listl.add(0,20); // [20,10]
    System.out.println(listl);
    System.out.println(listl.remove(1) + " 이 삭제되었습니다."); // [20]
    System.out.println(listl);
    System.out.println("===============================");

    ArrayList<Integer> lista = new ArrayList<>();
    lista.add(10);
    lista.add(0,20);
    lista.set(1,10);
    System.out.println(lista);



  }
}

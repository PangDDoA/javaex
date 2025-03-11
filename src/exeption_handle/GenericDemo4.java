package exeption_handle;

import java.util.ArrayList;

public class GenericDemo4 {
  public static void main(String[] args) {
//    ArrayList list = new ArrayList(); // 제네릭이 아니기 때문에 모두 다 담을 수 있다.
//    list.add(10);
//    list.add('c');
//    list.add("abc");              // ClassCastException 오류
    ArrayList<Integer> list = new ArrayList<>();
    // <>안에서는 Wrapper class 만을 담아야 한다. new 연산자 우항에서의 <> 안은 생략가능하다.
    list.add(10);



    int i = (Integer)list.get(2); // "abc"ㄹ, 인티처로 변환해서 쓰고싶다. 예상하기를 (Integer)10.0 == > 0
  }
}

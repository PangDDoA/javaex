package exercise.chapter9;

import java.util.*;

public class Ex3 {

  public static void main(String[] args) {
    //숫자를 담을 수 있는 동적배열을 만들어라.
    ArrayList<Integer> al = new ArrayList<>();
    al.add(10);
//    al.add("10");
    int result = al.get(0) + 10; // 타입체크 및 형변환이 필요없이 사용가능.

    //문자열을 담을 수 있는 ArrayList 선언.
    ArrayList<String> al2 = new ArrayList<>();


    //숫자를 담을 수 있는 Stack 선언.
    Stack<Integer> sti = new Stack<>();
    sti.add(1);
    sti.pop(); // 맨 위에 있는 것만 꺼내기 때문에 .pop(); 말고는 없다.

    //문자열을 담을 수 있는 Stack 선언.
    Stack<String> ststr = new Stack<>();
    ststr.add("A");
    ststr.pop().toLowerCase(); //toLowerCase() : 대문자를 소문자로 내린다.

    //숫자만 담을 수 있는 Queue 선언.
    Queue<Integer> qi = new LinkedList<>();
    qi.add(1);
    int num2 = qi.poll();

    //문자열을 담을 수 있는 Queue 선언.
    Queue<String> qs = new LinkedList<>();

    //숫자를 키로, 문자열을 값으로 가지는 HashMap 을 선언하고 사용해보기.
    HashMap<Integer, String> hm1= new HashMap<>();
    hm1.put(1,"아무거나");
    System.out.println(hm1.get(1));
    hm1.put(2, "anything");
    System.out.println(hm1.get(2));

    //문자열을 키로, 숫자를 값으로 가지는 HashMap 을 선언하고 사용해보기.
    HashMap<String, Integer> hm2 = new HashMap<>();
    hm2.put("안녕",1);
    System.out.println(hm2.get("안녕"));
    hm2.put("반가워",2);
    System.out.println(hm2.get("반가워"));

  }
}

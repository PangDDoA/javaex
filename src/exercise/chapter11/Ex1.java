package exercise.chapter11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex1 {
  public static void main(String[] args) {
    List<String> s = new LinkedList<>();    //new ArrayList<>();
    // 인터페이스(=규약) = 구현체 --->구현체에 얽메여서 작성하면 확장성이 없음. 인터페이스가 더 넓게 작성해야함.
    s.add("갈매기");
    s.add("나비");
    s.add("다람쥐");
    s.add("라마");
    //for-each 문과 if 조건문으로 문자열의 길이가 2인 동물만 출력!
    //iter
  }
}

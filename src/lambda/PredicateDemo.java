package lambda;

import java.util.function.Predicate;

public class PredicateDemo {
  public static void main(String[] args) {
    Predicate<String> isEmpty = new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.length() == 0;
      }
    };
    String s = (String) "";
    if (s != null && isEmpty.test(s)) {
      System.out.println("빈 문자열 입니다.");
    }
  }
}
//무슨뜻인지 전체정리
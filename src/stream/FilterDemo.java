package stream;

import java.util.stream.Stream;

public class FilterDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2", "c3");
    //스트림<타입> s1 은 스트림 (내용물) 을 가지고 있다.
    s1.filter(s ->s.startsWith("c"))
        .forEach(Util::print);

    System.out.println();

    Stream<String> s2 = Stream.of("a1", "b1", "b2", "c1", "c2", "c3");
    s2.filter(s ->s.startsWith("c"))
        .skip(2) // 어디까지 넘어간다.
        .forEach(Util::printWithParenthesis);

  }
}

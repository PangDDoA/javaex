package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo3 {
  public static void main(String[] args) {
    String s = "hello java";
    String ss = "hi, my name is";
    String[] s1 = s.split(" ");
    String[] s2 = ss.split(" ");

    Arrays.stream(s1);
    System.out.println(s1.length);
    System.out.println(s2.length);

    List<String> list1 = List.of("안녕, 자바!", "잘가, C++!");
    Stream<String> list2 = list1.stream();
    Stream<String> stringStream = list2.flatMap(str -> Arrays.stream(str.split(" ")));
    stringStream.forEach(Util::printWithParenthesis);
  }
}

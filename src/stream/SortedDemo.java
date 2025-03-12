package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {
  public static void main(String[] args) {
    List<String> list1 = List.of("a1", "x2", "d3", "b2", "a4");
    list1.stream() // list1을 스트림화
        .sorted() // 문자열 순서대로
        .forEach(Util::printWithParenthesis);

    System.out.println();

    List<Integer> list2 = List.of(7, 10, 5, 3, 1, 2);
    list2.stream() // list2을 스트림화
        .sorted() // 정수 순서대로
        .forEach(Util::printWithParenthesis);

    System.out.println();
    List<Nation> list3 = Nation.nations;
    //Stream<Nation> sorted =        >>좌항을 없앤 이유는 우항의 nation.getName()의 반환값이 없기때문에 오류발생.
    list3.stream().sorted(Comparator.comparing(nation -> nation.getName()))
        .forEach(nation -> Util.printWithParenthesis(nation.getName()));

    System.out.println();
    list3.stream()
    .sorted(Comparator.comparing(nation -> nation.getGdpRank()))
    .forEach(nation -> Util.printWithParenthesis(nation.getGdpRank()));

    System.out.println();
    list3.stream()
    .sorted(Comparator.comparing(nation -> nation.getPopulation()))
    .forEach(nation -> Util.printWithParenthesis(nation.getPopulation()));

    System.out.println();
    list3.stream().sorted(Comparator.comparing((Nation::getPopulation)).reversed())
        .forEach(nation -> Util.printWithParenthesis( nation.getName()
            +":" + nation.getPopulation()));



  }
}

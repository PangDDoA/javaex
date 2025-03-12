package stream;

import java.util.List;
import java.util.stream.Stream;

public class MapDemo2 {
  public static void main(String[] args) {
    // 국가정보를 리스트로 얻어오기
    // 리스트를 스트림으로 변환하기
    // 국가의 이름만을 스트림으로 map 시키기
    // 4개의 국가의 이름만 출력하기 ---------------1번문제
    List<Nation> nations = Nation.nations;      //
    Stream<Nation> stream = nations.stream();
    Nation.nations.stream()
        .map(nation -> nation.getName())
        .limit(4)
        .forEach(nationName -> Util.printWithParenthesis(nationName));
    System.out.println();
    // 국가정보를 리스트를 스트림으로 변환하기
    //GDP 순위만을 number 스트림으로 map 시키기
    //전 국가의 GDP 순위 출력하기.

    nations.stream()
        .mapToInt(nation-> nation.getGdpRank())
        .forEach(i -> Util.printWithParenthesis(i));

//    아래 코드는 위의 코드를 수정 적용시킨 예제
//    Stream<Nation> stream2 = nations.stream();
//    nations.stream()
//        .map(nation -> nation.getGdpRank())
//        .forEach(nationNames -> Util.printWithParenthesis(nationNames));
  }
}

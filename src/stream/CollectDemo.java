package stream;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
  public static void main(String[] args) {
    Stream<Nation> s1 = Nation.nations.stream();
    Double avg = s1.collect(Collectors.averagingDouble(Nation::getPopulation));
    System.out.println("인구의 평균 : " + avg);

    Stream<Nation> s2 = Nation.nations.stream();
    Long count = s2.collect(Collectors.counting());
    System.out.println("나라 갯수 : " + count);

    Stream<Nation> s3 = Nation.nations.stream();
    String names = s3.limit(4)// 4개의 나라, 이름만을 가지고 다른 stream 반환
        .map(Nation::getName)
        .collect(Collectors.joining("-"));// "-"로 연결한다
    System.out.println("4개의 나라 : " + names);

    Stream<Nation> s4 = Nation.nations.stream();
    String names2 = s4.limit(4)
        .collect(Collectors.mapping(Nation::getName, Collectors.joining("-")));
    System.out.println("4개의 나라 : " + names2);

    Stream<Nation> s5 = Nation.nations.stream();
    Optional<Double> max = s5.collect(Collectors.mapping(
        Nation::getPopulation, Collectors.maxBy(Double::compare)));
    System.out.println("최대 인구를 가진 나라의 인구수 : " + max.get());

    Stream<Nation> s6 = Nation.nations.stream();
    IntSummaryStatistics iss = s6.collect(Collectors.summarizingInt(nation -> nation.getGdpRank()));
    System.out.println(iss); // 각 요소별 합의 결과값 나열
  }
}

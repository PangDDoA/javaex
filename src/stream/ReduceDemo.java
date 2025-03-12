package stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class ReduceDemo {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(3,4,5,1,2);
    int reduce = numbers.stream().reduce(0, (i, j) -> i + j);
    int reduce1 = numbers.stream().reduce(1, (a, b) -> a * b);
    System.out.println(reduce + ":" + reduce1);

    Optional<Integer> reduce2 = numbers.stream().reduce(Integer::sum);
    System.out.println(reduce2.get()); // .get()을 해야 Optional 의 내용물만 출력한다.
    Optional<Integer> reduce3 = numbers.stream().reduce(Integer::max);
    System.out.println(reduce3.get());

    IntStream intStream = numbers.stream().mapToInt(x -> x);
    System.out.println(intStream);
    int reduce4 = intStream.reduce(0, (x, y) -> x + y);
    System.out.println(reduce4);

    IntStream intStream1 = numbers.stream().mapToInt(x -> x.intValue());


  }
}

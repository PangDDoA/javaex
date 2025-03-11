package stream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamDemo3 {
  public static void main(String[] args) {
//    IntStream iterate = IntStream.iterate();
//    iterate.limit(2).forEach(x-> System.out.println(x));

    Random r = new Random();
    IntStream ints = r.ints(); // .ints() ->괄호 안에 갯수를 한정. 지금은 무한생산.nextInt() ->> 한개만 반환한다.
    //ints.forEach(x -> System.out.println(x)); --->.forEach()와 같은 조급한 연산은 직접 쓰지않는다. 지금은 무한루프
    IntStream limit = ints.limit(6);
    limit.forEach(System.out::println);

    IntStream generate = IntStream.generate(() -> new Random().nextInt(10));  //무한생산

    IntStream range = IntStream.range(1,10);// 1 부터 9까지의 수를 한번찍 생성해준다.
    range.forEach(System.out::println);

    LongStream range1 = LongStream.range(1, 10);  //유한생성, End 미포함
    range1.forEach(System.out::println);

    LongStream range2 = LongStream.rangeClosed(1, 10); //유한생성, End 포함
    range2.forEach(System.out::println);

  }
}

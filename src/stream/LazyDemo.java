package stream;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class LazyDemo {
  public static void main(String[] args) {
    IntStream intStream = IntStream.rangeClosed(1, 5);// 1,2,3,4,5

    IntStream filterStream = intStream.filter(i -> i % 2 == 0);
    IntStream mapStream = filterStream.map(x -> x * x);
    mapStream.forEach(s-> System.out.println(s));

    System.out.println("연속호출방식");
    IntStream.rangeClosed(1,5)
        .filter(i -> i % 2 == 0)
        .map(x -> x*x)
        .forEach(s -> System.out.println(s));


    System.out.println("예제풀이");
    //무한 생성해주는 난수(0~10)를 이용해 스트림을 만들고
    //홀수만 걸러내고
    //3개만 한정
    //2배한 결과를
    //출력하라.

    IntStream.generate(() -> new Random().nextInt(10))            //서플라이어 람다식  () -> {Random r = new Random; return r.nextInt(10)}
        .filter(i -> i % 2 == 1) //IntPredicated (i) -> 조건식 (리턴값이 boolean)
        .limit(3)
        .map(i -> 2 * i) // IntUnaryOperator (i) -> i * 2
        .forEach(i -> System.out.println(i));  //IntConsumer (x) -> action
  }
}

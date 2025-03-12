package stream;

import java.util.Random;
import java.util.stream.IntStream;

public class LazyDemo3 {
  public static void main(String[] args) {
    IntStream is = IntStream.generate(() -> new Random().nextInt(10));

    is.filter(i -> {
      System.out.println("filter : " + i);
      return i % 2 == 0;
    }).limit(3)  // 무한생산에 대해서 제한. n갯수 만큼만 선택한다.
        .map(i -> {
      System.out.println("map : " + i);
      return i * i;
    }).forEach(i -> System.out.println("forEach : " + i)
    );
    }
  }
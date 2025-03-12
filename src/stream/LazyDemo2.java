package stream;

import java.util.stream.IntStream;

public class LazyDemo2 {
  public static void main(String[] args) {
    IntStream is = IntStream.rangeClosed(1, 5);  // .rangeClosed(시작숫자, 끝나는숫자) -> 시작숫자에서 끝나는숫자까지 범위

  }
}

package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Random r = new Random();

    for (int i = 0; i < 10; i++) {
      int number = r.nextInt(30);
      list.add(number);
    }// 10번의 횟수로, 1~30까지의 랜덤한 숫자 출력.

    List<Integer> gt10 = new ArrayList<>();
    for (Integer i : list){
      if(i > 10){
        System.out.println(i);
        gt10.add(i);
      }
    }
    //연속된 데이터 + 함수형 처리연산
    list.stream() // list의 연속된 stream을 만듬.
        .filter(i -> i>10) // Predicate 함수형 인터페이스의 익명구현체 --->람다식
        .sorted()
        .forEach(System.out::println);//Consumer 함수형 인터페이스의 익명구현체 --->람다식

    }
}
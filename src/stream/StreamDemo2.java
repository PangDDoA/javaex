package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo2 {
  public static void main(String[] args) {

    //IntStream, DoubleStream, LongStream - 숫자 스트림 : average(), sum(), 통계 메서드를 가진다.
    int[] iarr = {1,2,3,4,5};  //배열, 공간적 집합체
    IntStream iStream = Arrays.stream(iarr);// stream이라는 시간적 집합체로 변경. Arrays.stream(iarr) 작성 후 ctrl+alt+v ->
//    System.out.println(iStream.sum() + ":" + iStream.average()); stream은 일회성으로, 한번 실행하면 다른
    System.out.println(iStream.sum());

    double[] darr ={1.0, 2.0, 3.0, 4.0 , 5.0};
    DoubleStream stream3 = Arrays.stream(darr);

    long[] larr = {1L, 2L, 3L, 4L};
    LongStream stream4 = Arrays.stream(larr);

    IntStream intStream = IntStream.of(1, 2, 3, 4);

    // 객체 Stream
    List<Integer> ilist = Arrays.asList(1,2,3,4,5); // ilist의 집합체를 작성하는법 = Arrays.asList() 이용
    Stream<Integer> stream1 = ilist.stream();//  객체 Stream 이라는 시간적 집합체

    String[] sarr = {"a", "b",  "d ",  "c"};
    Stream<String> stream2 = Arrays.stream(sarr);

    Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5); //Stream.of() -> 객체 stream으로 받아들인다.
  }
}

//   for (String string : map.keySet()) {
//    if (map.get(string) > maxScore){
//    name = string;
//    maxScore=map.get(string);
//     System.out.println(map.get(string));
//    }
//     totalScore += map.get(string);
//    }
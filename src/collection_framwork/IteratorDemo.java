package collection_framwork;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
  public static void main(String[] args) {


    Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");

    Iterator<String> iterator = list.iterator();
    //    if (iterator.hasNext()){
    //      System.out.println(iterator.next());
    //    }
    //    System.out.println(iterator.next());
    //    System.out.println(iterator.next());  ......계속 만들 수 없다.
    //System.out.println(iterator.next()); // 범위를 벗어나 출력을 요청하면 NoSuchElementException 발생 ->unchecked exception

    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
    System.out.println("첫번째 출력");
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
    //이미 출력됐기 때문에 더이상 출력이 안됀다.
    //또 찍고싶으면 재정의 후 다시 입력해주면 된다.

    iterator = list.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }



  }
}

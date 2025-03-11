package collection_framwork;

import java.util.ArrayList;

public class PerformanceDemo {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    ArrayList<Integer> ll = new ArrayList<>();

    long start = System.nanoTime();
    for (int i = 0; i < 100000; i++) {
      al.add(i);
    }
    long end = System.nanoTime();
    System.out.println("연결리스트의 마지막에 원소를 추가하는데 걸리는 시간 : " + (end - start));

    start = System.nanoTime();
    for (int i = 0; i < 100000; i++) {
      ll.add(i);
    }
    end = System.nanoTime();
    System.out.println("연결리스트의 마지막에 원소를 추가하는데 걸리는 시간 : " + (end - start));
  }
}

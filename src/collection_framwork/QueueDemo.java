package collection_framwork;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    if(!q.isEmpty()){
      q.remove();
    }else {
      System.out.println("큐가 비어있습니다.");
    }
    System.out.println(q.poll());
    q.add("1");
    q.add("2");
    q.add("3");
    while (!q.isEmpty()){
      System.out.println(q.poll());
    }
    q.clear();

    q.offer("10");
    q.offer("20");
    q.offer("30");

    System.out.println(q.peek()); //선입반출
    System.out.println(q.contains("10")); // 내용물이 있기때문에 true 반출

  }
}

package exercise.chapter11;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Map<String, Integer> map = new Hashtable<>();
    map.put("김열공", 80);
    map.put("최고봉", 90);
    map.put("우등생", 95);
    map.put("나자바", 88);
    System.out.println(map);

    System.out.println("이름을 입력하세요 : ");
    String name = scanner.nextLine();

    Integer score = map.get(name);
    if (score == null) { // ifn 단축키 사용!
      System.out.println("해당 사용자는 존재하지 않습니다.");
    } else {
      System.out.println(map.get(name));
    }
  }
}

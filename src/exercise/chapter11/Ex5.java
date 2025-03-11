package exercise.chapter11;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Ex5 {
  public static void main(String[] args) {
  Map<String, String> beast = Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion");
    System.out.println("변경 전 : " + beast);

    // 생성자 Hashtable<>를 이용해서 타입변경
  Map<String, String> beast2 = new Hashtable<>(beast);
  beast2.replaceAll((key,value) -> value.toUpperCase());
  //.replaceAll( (매개변수1, 매개변수2) -> 매개변수'1 혹은 2' .toUppercase(); 작성!!
    System.out.println("변경 후 : " + beast2);
  }
}

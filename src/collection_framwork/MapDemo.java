package collection_framwork;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {
//    Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1); + ctrl + alt + v ==> 자동으로 값 입력
      Map<String, Integer> fruits = Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1); // 먼저 들어간 내용만 적용, 중복된 키는 넣을 수 없다.팩토리메소드??
    System.out.println(fruits);//set은 저장된 순서가 중요하지않다. 출력할때 마다 순서가 달라진다.

    Map<String, Integer> map = new HashMap<>(fruits); // 불변객체를 가변객체로 전환.

    for ( String key :fruits.keySet()) { // inhanced-for ==> 컬랙션 형태!!
      System.out.println(key + " 가 "+ fruits.get(key) + "개 있습니다."); //
    }
  String fruit = "바나나";
    if (fruits.containsKey(fruit)){
      System.out.println(fruit + "가 "+ fruits.get(fruit)+ "개 있습니다.");
      } else {
      System.out.println(fruit + "가 없습니다." );
    }
    fruits.forEach((key, value) -> System.out.print(key + "(" + value + ") ")); // forEach에 대한 세미콜론;
    //fruits.replaceAll(( key, v1) -> v1 * 10); // immutable 이므로 수정이 안됌. put으로도 수정 불가.
    //fruits.put("사과",50);
    //of가 아닌 메소드를 만들면 replace, put, clear 등 사용 가능
  }
}

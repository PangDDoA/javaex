package collection_framwork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapDemo {
  public static void main(String[] args) {
    Map<Fruit, Integer> fruits = new HashMap<>();  //key도 value도 객체, HashMap<>()은 null값 포함하여 중복값 추가가 가능하다.

    fruits.put(new Fruit ("사과"), 5);
    fruits.put(new Fruit ("사과"), 50);
    fruits.put(new Fruit ("바나나"), 3);
    fruits.put(new Fruit ("바나나"), 30);
    fruits.put(null, 20);

    System.out.println(fruits);
    Collection<Integer> value = fruits.values();
    }
}

class Fruit{
  String name;
  public Fruit(String name){
    this.name = name;
  }  // 여기까지 입력시 => 해시값만 출력.

  @Override // toString을 오버라이드해서 해시값을 문자열로 변경.
  public String toString() {
    return "collection_framwork.Fruit[" + name + ']';
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Fruit fruit)) return false;
    return hashCode() == fruit.hashCode();  // 형 변환한 fruit.hashCode()가 다른 해시코드와 같은지 비교
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}
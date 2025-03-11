package collection_framwork;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
  public static void main(String[] args) {
    Map<Fruit, Integer> fruits = new Hashtable<>();

    fruits.put(new Fruit("사과"), 5);
    fruits.put(new Fruit("사과"), 50);
    fruits.put(new Fruit("바나나"), 3);
    fruits.put(new Fruit("바나나"), 30);
    //fruits.put(null, 20);   // null 값은 Hashtable 에서 키, 값으로 넣을 수 없다.
    System.out.println(fruits.get("사과"));
    System.out.println(fruits);
  }
}

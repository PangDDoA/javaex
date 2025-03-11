package exercise.chapter9;

public class Ex2 {
  public static void main(String[] args) {
    // Person (이름, 나이(숫자))
    // Person (주민번호, 이름)
    Person <String, Integer> p1 = new Person<>("홍길동", 20);
    System.out.println(p1.getKey() + " " + p1.getValue());

    Person <String, String> p2 = new Person<>("1111-111111", "홍길동");
    System.out.println(p2.getKey() + " " + p2.getValue());

  }
}

class Person<K, V>{
  private K key;
  private V value;

  public Person(K key, V value){
    this.key = key;
    this.value = value;
  }
  //getter, setter
  public K getKey(){
    return key;
  }
  public V getValue(){
    return value;
  }
}
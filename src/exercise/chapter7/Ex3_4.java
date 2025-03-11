package exercise.chapter7;

import java.util.Arrays;

public class Ex3_4 {
  public static void main(String[] args) {
    Person p1 = new Person("박지성", 40, 175, 68);
    Person p2 = new Person("손흥민", 20, 180, 70);

    if (p1.compareTo(p2) == -999){
      System.out.println("나이를 비교할 수 없습니다.");
    }else {
      if (p1.compareTo(p2) > 0){
        System.out.println(p1.name + " 이 나이가 더 많습니다.");
      } else if (p1.compareTo(p2) < 0) {
        System.out.println(p2.name + " 이 나이가 더 많습니다.");
      } else {
        System.out.println(p1.name + " 과 " + p2.name + "의 나이가 같습니다.");
      }
    }
    Person[] persons ={
        new Person("박지성", 40, 175, 68),
        new Person("홍길동", 32, 170, 75),
        new Person("손흥민", 20, 180, 70)
    };
    // 오름차순으로 정렬
    Arrays.sort(persons);
    System.out.println("\n" + persons + "\n");
    // 내림차순으로 정렬
    Arrays.sort(persons,(pi, pj) -> pj.compareTo(pi));
    System.out.println("\n" + persons + "\n");

    //iter
    for (Person person : persons) {
      System.out.println(person);
    }

  }
}

class Person implements Comparable{
  String name;
  int age;
  int height;
  int weight;

  public Person(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  //Comparable 을 구현하려면 compareTo를 Override 해야 한다.
  @Override
  public int compareTo(Object o) {
    int result = -999;
    if (o instanceof Person p){
      if (this.age > p.age) result = 1;
      else if (this.age < p.age) result = -1;
      else result = 0;
    }
    return result;
    //return 0; -->이럴경우 A와 B의 값이 같다고 나온다.
    //지금의 값은 내림차순. 오름차순일 경우 결과값을 뒤집으면 된다.
  }

  @Override
  public String toString() {
    return "Person{" +
        "이름='" + name + '\'' +
        ", 나이=" + age +
        ", 키=" + height +
        ", 몸무게=" + weight +
        '}';
  }
}
package exercise.chapter11;

//Person 클래스는 이름과 나이를 포함하며, 이름과 나이를 반환하도록 toString() 메서드를 오버라이딩한다.
//HashSet 컬렉션에 Person 객체를 추가한다.
//HashSet 은 원소의 중복 여부를 hashCode()와 equals()메서드를 이용해 판단한다.


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ex2 {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();
    set.add(new Person("김열공", 20));
    set.add(new Person("최고봉", 56));
    set.add(new Person("우등생", 16));
    set.add(new Person("나자바", 35));
    set.add(new Person("나자바", 35));
    for (Person person : set) {
      System.out.println(person);
    }

  }
}
// 클래스 Person 정의
class Person{
  String name;
  int age;
//공통으로 쓰는 name과 age 필드설정
  public Person(String name,int age){
    this.name = name; //클래스에서의 요소를 가져와서 쓸때는 this. 이용,  name이라는 매개변수는 this.name에 적용
    this.age = age;
  } //메소드 설정1
//alt + ins --> override
  @Override
  public int hashCode() {
    return Objects.hashCode(name); //name 객체의 hashcode를 가져온다. 모든 요소가 같은지 확인이 필요하
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person) {
      Person person = (Person) obj;
      if (name.equals(person.name))
        return true;
    } //가져온 hashcode값을 비교해서 출력한다.
    return false;
  }

  @Override
  public String toString() {
    return "Person [" + name + ":" + age + "]";
  }
}


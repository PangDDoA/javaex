package chapter4_oop;

public class MathDemo {
  public static void main(String[] args) {
    // Math math = new Math(); ==>Math는 private 로 캡슐화되어 new 로 생성이 불가능하다.
    // 클래스변수 - 클래스를 이용해서 객체를 생성하지 않고도 바로 사용가능.
    // 메모리의 Method 영역에 Math 라는 클래스 정보를 JVM 이 읽어들일 때 저장된다.
    // Math 는 클래스변수 이면서 final 을 사용한 상수다.
    System.out.println(Math.PI);
  }
}

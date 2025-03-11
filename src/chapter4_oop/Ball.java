package chapter4_oop;

public class Ball {
  // 생성자 (Constructor) <=>소멸자 >>따로 만들 필요 없음
  public Ball(){        // 기본 생성자  // 밖에서 임의로 쓸 수 없음으로 기존의 함수와 다르게 작용한다.
  }
  public Ball(double r){

  }
  // 필드 (변수)
  public double radius = 2.0;
  // 메서드(동작)
  public double getVolume(){
    return  4/3 * 3.14 * radius * radius * radius;
  }
  static void print(){
    System.out.println("공입니다.");
  }

  @Override
  public String toString() {
    return "반지름이 " +radius + " 인 원입니다.";
  }
}

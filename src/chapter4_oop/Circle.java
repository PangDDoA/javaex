package chapter4_oop;

public class Circle {
  // 원의 반지름과 넓이를 구하고자 한다.
  // 원의 넓이는 0보다 커야 한다.
  // 원이 생성될 때 크기가 전해진다. 크기는 생성 후에도 변경될 수 있다.
  // 원의 반지름과 넓이를 출력하는 기능 작성.
  public Circle(double radius) {
    this.radius = radius;
  }
  // 인스턴스 멤버
  // 필드
  private double radius;
  // 접근자(getter)와 설정자(setter)
  public void getRadius(){
    if (radius <= 0) {
      this.radius = 1.0;
    } else {
      this.radius = radius;
    }
    }

  public void setRadius(double radius) {
    if (radius <= 0) {
      System.out.println("원의 반지름은 0 보다 커야합니다.");
    } else {
      this.radius = radius;   //객체의 인스턴스 변수를 바꿀것이다.
    }
  }
  // 메서드
  double findArea() {
    final double PI = 3.14159826535897;
    return PI * radius * radius;
  }
    void show(){
  System.out.printf("원의 반지름은 %4.1f 이고 원의 넓이는 %.2f 입니다. \n", radius, findArea());
                                                                    // 참조변수 this 를 붙일 필요가 없다.
  }
}
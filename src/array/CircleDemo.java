package array;

public class CircleDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle(10.0);
    zero(c1);
    System.out.println(c1);

    Circle c2 = new Circle(10);
//    zero(c2.radius);
    System.out.println(c2);

    // 인수 c1 이 매개변수 c 에 복사된다.
    // c1 과 c 는 동일한 Circle 객체를 가리킨다.
    // zero() 메서드에서 c.radius 에 0.0 을 대입한다.
  }
  static void zero(Circle c){

  }
}

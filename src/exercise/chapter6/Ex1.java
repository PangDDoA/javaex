package exercise.chapter6;

public class Ex1 {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
//    ColoredCircle coloredCircle = new ColoredCircle(10, "빨간색");

    circle.show();
//    coloredCircle.show();
  }
}   //main 메소드에서 /밑에 정의한 Circle 과 ColoredCircle 를 불러서 값을 도출한다.
//각 클래스 Circle 과 ColoredCircle 을 정의한다.
class Circle {
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }// main 메소드에서 사용해야 하기때문에 public으로 Circle 메소드로 만들어준다.

  void show() {
    System.out.println("반지름이 " + radius + " 인 원이다.");
  }
} // 클래스 Circle 에서 반지름을 정의하고 입력한 반지름을 표시해준다.

class ColoredCircle {
  String color = "빨간색";
  int radius = 10;

  void show() {
    System.out.println("반지름이" + radius + " 인" + color + " 원이다.");
  }

}
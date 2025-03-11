package abstract_interface;

public class MovableDemo {
  public static void main(String[] args) {
    Movable m = new Car(); // 자동 형변환, upcasting , 기능을 제한
    m.move();
    //m.show(); 써야할 경우 downCasting, 명시적 강제 형 변환을 하여 기능을 풀어줌.
    Car car = (Car)m;
    car.move(10);
    car.show();
    System.out.println("==============");
    car.move(5);
    car.show();
  }
}

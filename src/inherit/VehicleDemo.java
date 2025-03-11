package inherit;

public class VehicleDemo {
  public static void main(String[] args) {
    Vehicle v1 = new Vehicle();
    System.out.println(v1.name);
    v1.whoami();

    Vehicle v = new Car();
    System.out.println(v.name);
    v.whoami();
    Car c = (Car) v;   //Car 가 가지고있는 move 를 보고싶으면 형 변환을 해야한다.
//    v.move;
  }
}

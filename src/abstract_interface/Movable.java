package abstract_interface;

public interface Movable {
  // 반드시 가져야하는 기능
  void move();
}

class Car implements Movable {
  @Override
  public void move() {
    System.out.println("자동차는 움직인다.");
  } // Overloading 상태. 매서드 이름(move)이름이 같고 매개변수의 유형과 개수가 다르도록 하는것.
    // Overriding 상태. 상위클래스가 가지고 있는 매서드를 하위 클래스가 재정의해서 사용.

  private int pos = 0; //0에서 시작함을 정함.
  public void move(int x) {
    pos += x;
  }


  public void show() {
    System.out.println(pos + " m 만큼 이동했습니다.");
  }
}

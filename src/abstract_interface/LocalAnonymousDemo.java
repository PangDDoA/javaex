package abstract_interface;

public class LocalAnonymousDemo {
  public static void main(String[] args) {
    Bird b = new Bird(){
      @Override
      void move() {
        System.out.println("독수리가 난다.");
      }
    };
    //클래스의 이름을 쓰지 않아 구현부만 불러와 사용.

    b.move();
  }
}

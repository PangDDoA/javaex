package abstract_interface;

public class LocalClassDemo {
  public static void main(String[] args) {
    class Eagle extends Bird{
      @Override
      void move() {
        System.out.println("독수리가 난다.");//안의 기능은 필요없다. 불러오는것이 중요.
      }
    }
    Bird b = new Eagle();
    b.move();
  }
}

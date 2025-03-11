package abstract_interface;

/**
 * @implSpec turnOn - 전자제품의 전원을 켜는 기능으로 반드시 구현되어야 함.
 * @param - none
 * @return - void
 * @throws - NullPointerException
 */

public interface Controllable {
  default void repair(){
    System.out.println("장비를 수리한다.");
  }
  static void reset (){
    System.out.println("장비를 초기화한다.");
  }
  private void show(String s){
    System.out.println(s);
  }
  void turnOn();
  void turnOff();
}


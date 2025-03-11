package abstract_interface;

public class ControllableDemo2 {
  public static void main(String[] args) {
    test(new TV()); //tv 테스트
    test(new Computer()); //computer 테스트
    test(new NoteBook()); //notebook 테스트
  }
  // 매개변수를 인터페이스로 주고, (tv, computer, notebook)형변환과
  // 다형성을 테스트.
  public static void test(Controllable con) {
    con.turnOn();
    con.turnOff();
    con.repair();
  }
}

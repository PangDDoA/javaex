package abstract_interface;

public class InterfaceDemo {
  public static void main(String[] args) {
    TV tv = new TV();

    tv.turnOn();
    tv.turnOff();
    tv.repair();

    Controllable.reset();
    //tv.reset(); 인터페이스명.staticMethode() 로 호출해야 함.

    Computer com = new Computer();
    com.turnOn();
    com.turnOff();
    com.repair();


  }
}

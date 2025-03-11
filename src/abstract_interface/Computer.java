package abstract_interface;

public class Computer implements Controllable {
  @Override
  public void turnOn() {
    System.out.println("Computer를 켜다.");
  }

  @Override
  public void turnOff() {
    System.out.println("Computer를 끄다.");
  }

  @Override
  public void repair() {
    System.out.println("Computer를 수리한다.");
      }
}

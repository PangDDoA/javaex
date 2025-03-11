package abstract_interface;

public interface MyInterface {
  // 상수 필드
  int MAX = 10;
  // 추상 메서드
  void sayHello();
  // 구현부가 있는 default 메서드(클래스로 상속 + 오버라이드 가능 ==> 다형성)
  default void MyNameIs(){
    System.out.println("my name is newFunction");
  };
}

class NewClass implements MyInterface{
  @Override
  public void sayHello() {
    System.out.println("hello");
  }

  @Override
  public void MyNameIs() {
    System.out.println("my name is ");
  }
}
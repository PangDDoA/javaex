import abstract_interface.MyInterface;

public interface YourInterface extends MyInterface {
  int MIN = 0;

  @Override
  void sayHello();
}

  // 클래스는 인터페이스를 구현
  class MyClass implements MyInterface {
    int myClassInt = 1;
    @Override
    public void sayHello() {
      System.out.println("hello");
    }
  }

  class MyClass2 implements MyInterface{

    @Override
    public void sayHello() {
      System.out.println("hello");
    }
  }

  class YourClass implements YourInterface {
    @Override
    public void sayHello() {

    }
  }


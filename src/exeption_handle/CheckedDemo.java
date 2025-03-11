package exeption_handle;

public class CheckedDemo {
  public static void main(String[] args) {
    try {
      method1(); // 더이상 떠넘길 곳이 없다.try/catch 로 작성.
    } catch (ClassNotFoundException e) {
      System.out.println("method1 실행에서 사용한 클래스를 찾을 수 없습니다.");
    }
  }
  static void method1() throws ClassNotFoundException {
    method2();
  }
  static void method2() throws ClassNotFoundException {
    Class clazz = Class.forName("java.lang.String2");
  }
}

package exeption_handle;

public class UncheckedDemo {
  public static void main(String[] args) {
//  int number = 0;
    int result = 0;
    try {
      result = 1 / 0;
      result = 2 / 0;
      result = 3 / 0;
    } catch (ArithmeticException e){
      e.printStackTrace(); // 개발할때
      System.out.println(e.getMessage()); // 이와같이 사용자가 보기 편한 메시지로 변환하여 보여주는 것을 권장.
    }
  }
}

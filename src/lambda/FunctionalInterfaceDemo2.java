package lambda;

public class FunctionalInterfaceDemo2 {
  public static void main(String[] args) {
    // 두 개의 정수를 입력받아서 두 수를 더한 후 그 결과를 출력한다. ->> 이러한 익명클래스를 만들어라
    Calculable cal = new Calculable() {
      @Override // 이러한 구현부를 쉽게 작성한 것이 람다식.
      public void calculate(int x, int y) {
        int res = x + y;
        System.out.println(res);
        return; //적을 필요없음.
      }
    };
    Calculable cal2 = (x,y) -> {
      int res = x + y;
      System.out.println(res);
    };
    cal2.calculate(3,5);
  }
  }

  @FunctionalInterface
interface Calculable {
    //추상메소드
  void calculate(int x, int y);
}

//해당 구현부만 메인클래스로 가지고 감.
//class Add implements Calculable{
//  @Override
//  public void calculate(int x, int y) {
//    int res = x + y;
//    System.out.println(res);
//    return; //적을 필요없음.
//  }
//}
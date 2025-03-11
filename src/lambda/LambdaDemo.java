package lambda;

public class LambdaDemo {
  public static void main(String[] args) {
//    Object obj = new Object() {
//      int max(int a, int b) {
//        return a > b ? a : b;
//      }
//    };
//    System.out.println(obj.max(3,5)); //upcasting??
    MyFunction m2 = (a, b) -> a > b ? a : b;
    System.out.println(m2.max(3,5));

//    System.out.println(m.max(3,5));   // ==>5

  }
}

// 함수형 인터페이스 - "단 하나"의 "추상 메서드"만 가지는 인터페이스
@FunctionalInterface //
interface MyFunction {
  public abstract int max(int a, int b);
//  public abstract int min(int a, int b);
}



//class AnyObject{
//  class Anonymous{
//    int max(int a, int b){
//      return a > b ? a : b;
//    }
    // (a,b) -> a > b ? a : b
//  }
//}
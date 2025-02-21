public class ForDemo {
  public static void main(String[] args) {
    for ( int i = 0 ; i < 3; i++){
      System.out.println("hello, world" + i);
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(i + 1);
    } // 1부터 차례대로 나열

    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    } //짝수만 2,4,6,8,10 나열

    for (int i = 10; i > 0 ; i--) {
      System.out.println(i);
    } //10부터 시작
  }
}

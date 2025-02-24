public class EchoDemo {
  public static void main(String[] args) {
    echo("안녕", 3);
    // 1. 반환값이 없음. => void
    // 2. main 에서 별도의 객체 생성 없이 호출 가능
    // 3. 매개변수가 2개 있음(문자열, 정수)
    // 4. 문자열을 정수의 횟수만큼 반복출력하는 기능
  }

  static void echo(String s, int n){
    for (int i = 0; i < n; i++) { // fori
      System.out.println(s);
    }
  }
}

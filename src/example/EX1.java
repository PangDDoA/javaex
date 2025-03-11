package example;

public class EX1 {
  // "문자열" 과 문자를 매개변수 값으로 가지는 다음 메서드가 있다.
  // "문자열 s"에 포함된 문자 c 의 개수를 반환하도록 구현
  public static void main(String[] args) {
    System.out.println(countChar("hello", 'l'));
    System.out.println(countChar("hello", 'L'));
  }
  // 문자열 s 선언, 문자 c 선언
  static int countChar (String s, char c){
    int count=0;
    c = String.valueOf(c).toLowerCase().charAt(0);
    s = s.toLowerCase();
    for (int i = 0; i < s.length(); i++) {
      if(s.toUpperCase().charAt(i) == c || s.toLowerCase().charAt(i) == c){
        count++;
      }
    }
    return count;
  }
}

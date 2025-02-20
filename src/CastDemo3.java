public class CastDemo3 {
  public static void main(String[] args) {
    // + , - , * , / =>나누기에 대한 형변환에 주의할것
    int result = 7 / 4 ;
    System.out.println(result);

    double result2 = 7 / 4 ;
    System.out.println(result2);

    double result3 = 7 / (double)4 ;
    System.out.println(result3);

    double result4 = 7 / 4.0 ;
    System.out.println(result4);

    double result5 = 7.0 / 4 ;
    System.out.println(result5);

    //범위와 정확도가 높은 double을 사용. 형 변환을 입력하거나 소수점을 이용하여 강제 형변환을 사용.
  }
}

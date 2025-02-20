public class NumberTypeDemo {
  public static void main(String[] args) {
    /*
    // 정수를 선언하고 사용
    int mach = 340;
    int distance = mach * 60 * 60;
    // 문자열과 숫자를 더하면 ==> 문자열
    System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");

    //실수를 선언하고 사용
    double radius = 10.0;
    final double PI = 3.141592;
    double area = radius * radius * PI;
    System.out.println("반지름이" + radius + "인 원의 넓이 : " + area);
    */

    // 정수(int->long)를 선언하고 사용
    long mach = 340;
    long distance = mach * 60 * 60; //long * int = 더 큰 값으로 변수 long으로 자동형변한다.
    // 문자열과 숫자를 더하면 ==> 문자열
    System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");

    //실수(double->float)를 선언하고 사용
    float radius = 10.0F;
    final float PI = 3.141592F;
    float area = radius * radius * PI;
    System.out.println("반지름이" + radius + "인 원의 넓이 : " + area);


    //논리 , boolean 값
    int x = 10;
    boolean reasult = (x == 10);
    reasult = (x != 10);
    System.out.println(reasult);
  }
}

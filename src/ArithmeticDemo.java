import java.util.Scanner;

public class ArithmeticDemo {
  public static void main(String[] args) {
    int a = 1_000_000;
    int b = 2_000_000;

    //int result = a * b; 오버플로우 발생, a * b에서 이미 오버플로우 발생하므로 변수 1개 이상을 long으로 형 변환해야한다.
    long result = (long) a * b;
    System.out.println(result);

    int apple = 1;
    double priceUnit = 0.1;
    int number = 7;

    double result2 = number * priceUnit;
    System.out.println(result2);

    Scanner in = new Scanner(System.in);
    System.out.print("어떤 숫자로 나눌까요?");
    int i = in.nextInt();
    int result3 = 3 / i;
    System.out.print(result3);
    //if(i == 0);  =>다시 처음으로 돌아가는 코드 정리해보기.

  }

}

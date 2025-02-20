import java.util.Scanner;

public class TernartOperatorDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("정수를 입력해주세요 : ");
    int number = in.nextInt();
    int remainder = number % 2;
    String evenOdd = (remainder == 0) ? "짝수" : "홀수" ;
    System.out.printf("입력한 수는 %d 이며, %s 입니다.", number, evenOdd);
    git a
    /*if (remainder == 0) {
      System.out.printf("입력한 숫자는 %d이며, 짝수입니다.", number); }
      else
      {System.out.printf("입력한 숫자는 %d이며, 홀수입니다.", number);
    }*/

  }
}

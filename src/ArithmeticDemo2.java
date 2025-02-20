import java.util.Scanner;

public class ArithmeticDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("정수를 입력해주세요 : ");
    int number = in.nextInt();
    int remainder = number % 2;
    if (remainder == 0) {
      System.out.printf("입력한 숫자는 %d이며, 짝수입니다.", number);
    }else{
      System.out.printf("입력한 숫자는 %d이며, 홀수입니다.", number);
    }
  }
}

//대괄호 확인!
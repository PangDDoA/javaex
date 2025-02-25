import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo3 {
  public static void main(String[] args) {
    // 재활용성/유지보수가 편하게 작성할 것.
    //1. 다섯 과목의 점수를 사용자로부터 입력받는다.
    //2. 입력받은 점수를 배열에 저장한다.
    //3. for 문을 사용한다.
    //4. 입력받은 점수가 저장되어 있는 배열을 전부 읽어서 합계와 평균을 구한다.
    //5. 입력받은 점수, 합계와 평균을 출력한다.
    Scanner in = new Scanner(System.in); // 입력해야하기 때문에 Scanner 입력
    int[] scores = new int[5]; // 5개의 문자열을 담을 수 있는 배열을 생성.
    System.out.println("Arrays.toString(scores) = " + Arrays.toString(scores));
    int total = 0;
    float avg = 0.0f;
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%d 번째 과목의 점수를 입력하세요 : ", i+1);
      scores[i] = in.nextInt();
    }

    for (int i = 0; i < scores.length; i++) {
      total += scores[i];
    }
    avg = total / (float)scores.length;
    System.out.println("scores = " + Arrays.toString(scores)); // 문자열이기 때문에 Array 의 도움을 받아야 한다.
    System.out.println("total = " + total);
    System.out.println("avg = " + avg);
    }
  }


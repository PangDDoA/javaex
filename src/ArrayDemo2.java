import java.util.Arrays;

public class ArrayDemo2 {
  public static void main(String[] args) {
    // 배열의 초기화 방법 1
    int[] scores = {0,90,80,95,85,70,10,20,30,40,50,60,100};
    System.out.println("scores = " + scores);
    // 배열의 초기화 방법 2
    int[] scores1 = new int[]{1,2,3,4,5};
    // 초기화방법3
    int[] scores2 ;
    scores2 = new int[]{1,2,3,4,5};

//    error
//    int[] scores3;
//    scores3 = {1,2,3,4,5};
    System.out.println("scores[10] ==>" + scores[scores.length - 1]); // O(1) -->대문자O(big O)표기법

    for (int i = 0; i < scores.length; i++) {
      if(scores[i] == 100) {
        System.out.printf("%d 번째에서 찾았다.\n", i+1);
        break;
      } // 빅오 표기법 - O(N), 최악의 경우.
    }
    System.out.println(Arrays.toString(scores));
    
    char[] chars = {'a', 'b', 'c'};
    System.out.println("chars = " + chars);
    //System.out.println(chars.toString()); 동일하게 출력
    System.out.println(Arrays.toString(chars));
    }
  }


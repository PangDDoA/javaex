package array;

public class ArrayDemo {
  public static void main(String[] args) {
    // 5 과목의 점수를 저장하고 총점과 평균을 구하려고 한다// .
    int score1 = 100; int score2 = 90; int score3 = 80; int score4 = 90; int score5 = 78; int score6 = 70;
    int total = score1 + score2 + score3 + score4 + score5 + score6;
    double avg = total / (double) 6;

    System.out.println("total = " + total);
    System.out.println("avg = " + avg);

    int[] scores = {100,90,80,90,78,70}; //불변객체라서 변하지 않음.
    total = 0; // 이전의 total을 다시 0으로 정의.
    for (int i = 0; i < scores.length; i++) {
      total += scores[i];
      }
    avg = total / (double)scores.length;
    System.out.println("total = " + total);
    System.out.println("avg = " + avg);

    for (String arg : args){
      System.out.println("arg = " + arg);
    }
  }
}
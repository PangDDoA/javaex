package exercise.chapter8;

import java.util.Random;

public class Ex4 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {  // 어떤게 dice고, roll인지 구분어려움.
      System.out.println(new Dice().roll());
    }
  }
}
class Dice{
  int roll(){
//   return (int)(Math.random() * 6 + 1);
    Random r = new Random(); //변수 r에 대한 새로운 타입을 불러온다.
    return r.nextInt(6) + 1 ;//0~5까지의 수에 +1을 하여 1~6까지의 수를 사용한다.
  }
}
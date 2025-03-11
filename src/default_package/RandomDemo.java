package default_package;

import java.util.Random;

public class RandomDemo {
  public static void main(String[] args) {
    Random random = new Random();

    for (int i = 0; i < 5; i++) {    // 5개의 수 발생.
      System.out.println(random.nextInt(10)); //bound 설정을 하면 0부터 (10-1)까지 랜덤 정수 반환.
    }

//    Random[] randoms = new Random[3];
//    for (int i = 0; i < 10; i++) {
//      System.out.println(randoms.);
//    }


  }
}

public class MethodDemo {
  public static void main(String[] args) {
    int result = sum(1, 10);
    System.out.println("1부터 10까지의 합은 " + result);
    result = sum(10, 100);
    System.out.println("1부터 10까지의 합은 " + result);


//    sum += 1;
//    sum += 2;
//    sum += 3;
//    sum += 4;
//    sum += 5;
//    sum += 6;
//    sum += 7;
//    sum += 8;
//    sum += 9;
//    sum += 10;


//    sum = 0;   //sum의 초기값 부여
//    for (int i = 10; i <= 100; i++) {
//      sum += i;
//    }
//      System.out.println("10부터 100까지의 합은 " + sum);
//
//    sum = 0;   //sum의 초기값 부여
//    for (int i = 100; i <= 1000; i++) {
//      sum += i;
//    }
//    System.out.println("100부터 1000까지의 합은 " + sum);
//    } // end of main method
  }
  static int sum(int num1, int num2){
    int total = 0;   //total의 초기값 부여
    for (int i = num1; i <= num2; i++) {
      total += i;
    }
    return total;
  }

  } // end of class

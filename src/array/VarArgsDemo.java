package array;

public class VarArgsDemo {
  public static void main(String[] args) {
    printSum(1,2,3,4,5);
    printSum(1,2,3,5);
    printSum(10,20,30);
  }

  private static void printSum(int... v) {
    int sum = 0;
    for(int i : v){
      sum += i;
    }
    System.out.println(sum);
  }
}
//private static void printSum(int a, int b, int c){
//
//}
//private static void printSum(int a, int b, int c, int d){
//
//}
//private static void printSum(int a, int b, int c, int d, int f){
//
//}  이런식의 메서드가 무한정 배열이 필요한 경우 ... 사용
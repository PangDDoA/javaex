public class MethodOverloadingDemo {
  public static void main(String[] args) {
//    add2Numbers(1,2);
//    add3Numbers(1,2,3);
//    add4Numbers(1,2,3,4);
addnumbers(1,2);
addnumbers(1000L,2000L);
  }

  public static void addnumbers(int... numbers) {
    int result = 0;
    for (int number : numbers) {
      result += number;
    }
    System.out.println(result);
  }

  public static void addnumbers(long... numbers) {
    int result = 0;
    for (long number : numbers) {
      result += number;
    }
    System.out.println(result);
  }
}

public class AddDemo {
  public static void main(String[] args) {
    int j = 0, i = 2;
    System.out.printf("연산전 : j = %d, i = %d \n", j, i);
    j = i++;
    System.out.printf("연산후 : j = %d, i = %d", j, i);
  }
}

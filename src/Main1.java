public class Main1 {
  public static void main(String[] args) {
    MyMath m = new MyMath();
    long res1 = m.add(10L, 20L);
    System.out.println("res1 = " + res1); // soutv
    long res2 = m.sub(20, 10); //
    System.out.println("res2 = " + res2);
    long res3 = m.mul(1, 10);
    System.out.println("res3 = " + res3);
    long res4 = m.div(3, 2);
    System.out.println("res4 = " + res4);

    MyMath m2 = new MyMath();
    System.out.println(m2.add(1,2));

    MyMath m3 = new MyMath();
    System.out.println(m3.add(3,4));

  }
}

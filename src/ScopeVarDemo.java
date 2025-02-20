public class ScopeVarDemo {
  public static void main(String[] args) {
    int var1 = 1;

    if (true) {
      int var2 = 2;
      System.out.println("var1 ==>" + var1);
      System.out.println("var2 ==>" + var2);
    }

    for (String arg : args);{
      int var3 = 3;
      System.out.println("var1 ==>" + var1);
      //System.out.println("var2 ==>" + var2);
      System.out.println("var3 ==>" + var3);
    }
    System.out.println("(main) var1==" + var1);
  }
}

package default_package;

public class GarbageDemo {
  public static void main(String[] args) {
    Garbage garbage = new Garbage(1);
    System.gc();
  }
}

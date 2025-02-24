public class StringDemo {
  public static void main(String[] args) {
    int a = 1;
    int b = a;

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    b = 2;

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    Cat c1 = new Cat("나비");
    Cat c2 = new Cat("야옹이");

    String str = "hello";

    System.out.println(c1.getName());
    System.out.println(c2.getName());
    //c2.setName("야옹이");

  }
}

class Cat {
  private final String name;

  public Cat(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
}
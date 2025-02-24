public class StringDemo2 {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";

    System.out.println(s1 == s2); // 최적화를 통해서 각자 같은 객체

    String s3 = new String("hello");
    String s4 = new String("hello");

    System.out.println(s3 == s4);  //서로 다른 객체

    s2 = "hello world";

    System.out.println(s1 == s2);

  }
}

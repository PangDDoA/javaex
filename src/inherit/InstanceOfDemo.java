package inherit;

public class InstanceOfDemo {
  public static void main(String[] args) {
    Person p = new Person();
    Student s = new Student();
    Worker w = new Worker();

    System.out.println(p instanceof Person);
    System.out.println(s instanceof Student);
    System.out.println(w instanceof Worker);

  System.out.println(s instanceof Person);
    System.out.println(w instanceof Person);

  //System.out.println(s instanceof Worker);
  //System.out.println(w instanceof String); 완전히 다른 class 와는 연관되지 않아 오류
  }
}

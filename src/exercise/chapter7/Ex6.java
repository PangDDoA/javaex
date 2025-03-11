package exercise.chapter7;

public class Ex6 {
  public static void main(String[] args) {
    Human.echo();                   //야호 !!!
    Student s = new Student(20);
    s.print();                      //20세의 학생입니다.
    s.eat();                        //도시락을 먹습니다.

    Human p = new Worker();
    p.print();                      //인간입니다.
    p.eat();                        //빵을 먹습니다.


  }
}

interface Human{
  static void echo() {
    System.out.println("야호!");
  }

  void eat();
  void print();
}


class Worker implements Human {


  @Override
  public void eat() {
    System.out.println("빵을 먹습니다.");

  }

  @Override
  public void print() {
    System.out.println("인간입니다");

  }
}

  class Student implements Human{
    int print;

    public Student(int print) {
      this.print = print;
    }

    @Override
    public void eat() {
      System.out.println("도시락을 먹습니다.");
    }

    public void print() {
      System.out.println(print+"세의 학생입니다.");
    }
  }
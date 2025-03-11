package exercise.chapter8;

public class Ex2 {
  public static void main(String[] args) {
    System.out.println(new Student("김삿갓")); //학생[김삿갓]
    System.out.println(new Student("홍길동")); //학생[홍길동]
  }
}
//없는 클래스이므로, 클래서 생성.
class Student{
  String name; // 무슨 값을 넣을지 필드 생성
public Student(String name){
  this.name = name; // 해당 변수 위치에 어떤 내용이 들어갈지 작성.
}

//문자열 toString의 출력을 위한 override 작성.
  @Override
  public String toString() {
    return "학생[" + name + ']';
  }
}
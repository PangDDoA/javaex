package exercise.chapter9;

public class Ex1 {
  public static void main(String[] args) {

    Box<Integer> i = new Box<>();
    i.set(Integer.valueOf(100));
    System.out.println(i.get());

    Box<String> s = new Box<>();
    s.set("만능이네!");
    System.out.println(s.get());

  }
}

class Box<T> {
  //필드
  private T type;
  //getter, setter
  public T get(){
    return type;
    //return 을 입력된 값(반환값이 있다.) 그대로 내보내기 때문에 입력되는 매개변수를 공란,
  }

  public void set(T type) { //return 없이 값을 받아들여 적용하기때문에 'void 변수(매개변수)'로 작성.
    this.type = type;
    return; //return 하는 내용이 없다 => 반환값이 없다. 메소드 작성 시 void 입력.
  }

}
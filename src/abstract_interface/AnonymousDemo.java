package abstract_interface;

public class AnonymousDemo {
  Bird b = new Bird(){ // 바로 오버라이딩 시도

    @Override
    void move() {
      System.out.println("어떤 새가 난다.");
    }
    void sound(){
      System.out.println("소리를 낸다.");
    }
  };

/*{
    @Override
    void move() {
      System.out.println("어떤 새가 난다.");
}
void sound(){
  System.out.println("소리를 낸다.");
}
  };*/
  //메소드 정의를 내리지 않고 구현부만
  public static void main(String[] args) {
    AnonymousDemo a = new AnonymousDemo();
    a.b.move();
    //a.b.sound(); 부모객채에 가지고있지 않아 사용이 불가.

  }
}

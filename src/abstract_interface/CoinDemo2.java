package abstract_interface;

public class CoinDemo2 implements Coin{   // class 는 다른 interface 를 implements (구현) 할 수 있다.
  public static void main(String[] args) {
    // 인터페이스를 상속받아서 만든 클래스 안에서는, 상수 이름만으로 사용 가능.
    System.out.println("Dime 은 " + Coin.DIME + " 센트 입니다.");
    System.out.println("Quarter 는 " + Coin.QUARTER + " 센트 입니다.");
  }
}

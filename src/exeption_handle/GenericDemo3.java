package exeption_handle;

public class GenericDemo3 {
  public static void main(String[] args) {
    Cup<Boricha> c = new Cup<>();
    Boricha b = new Boricha();

    c.setBeverage(b);;
    c.getBeverage().drinkBoricha(); // 형 변환 없이 작성 가능
    Beer beer = new Beer();
//    c.setBeverage(beer); Boricha 가 아닌 객채를 담을 수 없음.

    Cup<Beer> cbeer = new Cup<>();
    cbeer.setBeverage(beer);
    cbeer.getBeverage().drinkBeer(); // 불필요한 타입 체크가 필요없다.
  }
}

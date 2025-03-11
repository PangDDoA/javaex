package exeption_handle;

public class GenericDemo2 {
  public static void main(String[] args) {
    Cup c = new Cup();
    Beer beer = new Beer();
    c.setBeverage(beer);
//    c.setBeverage().drink(); ==> 다운캐스팅을 해야 실행 가능
//    Beer b = (Beer)c.setBeverage();

    Boricha boricha = new Boricha();
    c.setBeverage(boricha);

    Beverage beverage = new Beverage();

  }
}

class Cup<T>{
  private T beverage;
  public T getBeverage(){
    return beverage;
  }
  public void setBeverage(T beverage){
    this.beverage = beverage;
  }
}  //정해진 T 만을 담을 수 있음.


//class Cup {
//  public Object getBeverage() {
//    return beverage;
//  }
//
//  public void setBeverage(Object beverage) {
//    this.beverage = beverage;
//  }
//
//  private Object beverage;
//}

class Beverage{

}

class Boricha extends Beverage{
  public void drinkBoricha( ){
    System.out.println("맥주를 마신다.");
  }
}
class Beer extends Beverage{
  public void drinkBeer( ){
    System.out.println("맥주를 마신다.");
  }
}
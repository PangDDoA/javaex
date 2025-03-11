package exeption_handle;

import java.util.ArrayList;

public class GenericInheritanceDemo {
  public static void main(String[] args) {
    ArrayList<Beverage> list1 = new ArrayList<>();
    list1.add(new Beverage()); //index 0
    list1.add(new Beer()); //index 1
    list1.add(new Boricha()); //index 2

    beverageTest(list1);

    Beverage b1 = list1.get(0);
    Beverage b2 = (Beer)list1.get(1); // beer 로 downcasting 필요
//    b2.drinkBeer();
    Boricha b3 = (Boricha) list1.get(2);

    ArrayList<Beer> list2 = new ArrayList<>();
    list2.add(new Beer());
  }
//같은 Arraylist 끼리는 상속관계가 아니다.
  static void beverageTest(ArrayList<Beverage> list1) {
  }



}

package lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5);
//    list.add(1);
//    list.add(2);
//    list.add(3);
//    list.add(4);
//    list.add(5);

    //리스트<Integer로만> list라는 변수에 담아서 =

    //하나씩 내가 원하는 형태로 찍고싶을때
    //list.forEach(Comparator<Integer>{void action(Integer )
    list.forEach(i -> System.out.print(i + ":")); // list 의 모든 요소를 출력하는 람다식, 컨슈머를 이용하여

    //list.removeIf(j -> j % 2 ==0); // list 의 모든 요소를 읽어서 짝수를 삭제한다.
//    list.replaceAll(i*10);//list 의 모든 요소에 10을 곱한다.

    list.forEach(i -> System.out.print(i + ":"));
    System.out.println("\n=========================");
    list.forEach(i -> System.out.print(i)); // ==> 얘도 줄일 수 있다.
    System.out.println("\n=========================");
    list.forEach(System.out::print);

    HashMap<Integer, String> map = new HashMap<>();
    map.put(1,"사과");
    map.put(2,"딸기");
    map.forEach((key, value) -> System.out.println(" \n"+ key + ", " + value ));

    Function<String, Integer> f = (s)->Integer.parseInt(s);
    f = Integer::parseInt; // Static Method 참조

    //인스턴스 메서드 참조
    String s1 = "hello", s2 = "world";
//    BiFunction<String, String, Boolean> f1 = (s1, s2) -> s1.equals(s2);
//    f1 = String::equals;

    //특정 객체의 인스턴스 메서드 참조
    MyClass mc = new MyClass();
    Function<String, Boolean> f2 = (x) -> mc.equals(x);
    f2 = mc::equals;

    // new 연산자(생성자) 참조
    Supplier<MyClass> s = MyClass::new;
    Function<Integer, MyClass> f3 = MyClass::new;

  }
}

class MyClass{
  int i;
  public MyClass(){}
  public MyClass(int i){
    this.i=i;
  }
}
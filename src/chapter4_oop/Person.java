package chapter4_oop;

public class Person {
  // 프라이빗 : 이름, 나이
  // 퍼블릭 : sayHello() void
  String name;
  int age;
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }


  private Person (String name){

  }
  private Person (int age){

  }
  public void sayHello (String name, int age){

  }

  public void show(){
    System.out.printf("제 이름은 %s 이고, 나이는 %d 입니다.\n", name, age);

  }
}
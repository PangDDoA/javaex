package enumType;

public class People {
  enum Gender { MALE, FEMALE };
  enum Num { ONE, TWO };
  //enum 사용함으로써 메서드 내 선언작업 필요 없음.
//  static  final int MALE = 0;
//  static  final int FEMALE = 1;
//  static  final int ONE = 1;
//  static  final int TWO = 2;
  final int kind = 0;
  final int num = 1;
}

class Person {
    //Gender gender;
    String name;
        int age;
    }
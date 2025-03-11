package chapter4_oop;

class Phone {
  //얼만지, 모델이 얼만지, 그 모델이 얼마인지 표기
  // 가격, 모델 ==> 필드
  int value;
  String model;
  // 정보출력 ==> 메서드
  void print(){
    System.out.println(value + "만원 짜리 " + model +" 스마트폰");
  }
}

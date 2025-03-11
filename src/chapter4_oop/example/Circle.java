package chapter4_oop.example;

class Circle {
  double radius;
  String color;
  static int numberOFCircles; // 원의 갯수를 세기 위한 내용.
  public Circle(){
    // 반지름은 직접 입력해주고,
    // color는 검증이 필요
    this(10.0, "빨강"); // 생성자를 불러서 처리
    //    radius = 10.0;
    //    color = "빨강";
  }
  public Circle(double radius){
    this(radius, "빨강");
    //    if(radius <= 0){
    //      this.radius = 10.0; //this를 쓰지 않는 경우 가장 가까운 변수의 값을 가져옴.
    //    }else {
    //      this.radius = radius;
    //    }
  }
  public Circle(String color) {
    this(10.0, color);
    //    if (color != null && color.length() > 0) {  //shortcirkit
    //      this.color = color;
    //    } else {
    //      this.color = "빨강";
    //    }
    // this 문을 이용하여 단순하게 작성 완료. 뒤의 코드들로 인해 앞서 내용들은 단순화할 수 있다.

  }

  public Circle(double radius, String color){
    if(radius <= 0){
      this.radius = 10.0; //this를 쓰지 않는 경우 가장 가까운 변수의 값을 가져옴.
    }else {
      this.radius = radius;
    }
    if (color != null && color.length() > 0) {  //shortcirkit
      this.color = color;
    } else {
      this.color = "빨강";
    }
    numberOFCircles++;
  }
}

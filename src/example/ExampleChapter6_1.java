package example;

public class ExampleChapter6_1 {
  public static void main(String[] args) {
//Printer printer = new printer()
//    printer.println(10);
//    printer.println(true);
//    printer.println(5.7);
//    printer.println("홍길동");

}

class Printer {
  //생성자
  //메서드
  public void println(int value) {
    System.out.println("value = " + value);
    }
  public void println(boolean value) {
    System.out.println("value = " + value);
  }
  public void println(double value) {
    System.out.println("value = " + value);
  }
  public void println(String value) {
    System.out.println("value = " + value);
  }
}}
package chapter4_oop;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone myPhone = new Phone();
    myPhone.value = 100;
    myPhone.model = "갤럭시 S25";
    myPhone.print();

    Phone yourPhone = new Phone();
    myPhone.value = 80;
    myPhone.model = "G6";
    myPhone.print();
  }
}

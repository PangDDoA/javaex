package exercise.chapter6;

public class Ex6_19 {
  public static void main(String[] args) {

//    Account1 account = new Account1();
//    account.setBalance(10000);
//    System.out.println("현재 잔고 : " + account.getBalance());
//
//    account.setBalance(10000);
//    System.out.println("현재 잔고 : " + account.getBalance());
//
//    account.setBalance(10000);
//    System.out.println("현재 잔고 : " + account.getBalance());
//
//    account.setBalance(10000);
//    System.out.println("현재 잔고 : " + account.getBalance());
  }
}

class Account{ //Account 라는 객체는
  private int balance; // 잔고(balance) 필드를 가진다.
  //상수 선언
  final int MIN_BALANCE = 0;
  final int MAX_BALANCE = 1_000_000;

  //접근자(Getter)
  public int getBalance(){
    return balance;
  }

  // 설정자 (Setter)
  public void setBalance(int balance) {

//    if (!(balance < MIN_BALANCE || balance > MAX_BALANCE)){
//      this.balance;
    }
  }
//}
package exercise.chapter6;

public class Account1 {
  // 필드 추가 - 계좌번호, 계좌주, 초기입금액
  private int balance;
  private String accountNo;
  private String accountOwner;

  //상수 선언 -
  public static void main(String[] args) {
  Account1 account = new Account1();




  }
}

class Account2{ //Account 라는 객체는
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

 public void withdraw(){

 }
  //참조변수를 찍었을떄 내용이 나오려면 toString이 구현되어야 한다.

//  public String toString(){
//    return accountNO + accountOwner
// }
}
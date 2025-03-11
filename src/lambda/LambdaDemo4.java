package lambda;

public class LambdaDemo4 {
  public static void main(String[] args) {
    DiceFunction d = new DiceFunction() {
      @Override
      public int roll() {
        return (int)(Math.random() * 6) + 1;
      }
    };
    System.out.println(d.roll());

    DiceFunction d1 = ()->(int) (Math.random()*6)+1;
    System.out.println(d1.roll());
  }
}

@FunctionalInterface
interface DiceFunction{
  int roll(); // integer roll 에 어떤 값을 넣을지 ()까지 표시한다.
}


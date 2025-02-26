package array;

public class MainArgumentDemo {
  public static void main(String[] args) {
    if(args.length == 2){
      //args[0] 출력하고 싶은 문자열
      //args[1] 출력하고싶은 횟수 ->숫자
      int count = Integer.parseInt(args[1]);

      printlnCount(count, args[0]); // count를 매개변수로 전달하게 만들어라.



//      for (int i = 0; i < count; i++) {
//        System.out.println(args[0]);
//        }
    }else {
      System.out.println("안녕");
    }
  }

  private static void printlnCount(int count, String arg) {
          for (int i = 0; i < count; i++) {
        System.out.println(arg);
        }
  }
}


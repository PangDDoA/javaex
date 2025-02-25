import java.util.Arrays;

public class ArrayDemo4 {
  public static void main(String[] args) {
    String[] names = new String[3];
    System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

    names[0] = "kim";
    System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
    for (int i = 0; i < names.length; i++) {
//      if(names[i] == null) {
//        System.out.println(0);
//      } else{
//        System.out.println(names[i].length());
//      }
      if(names[i] != null && names[i].length() > 0) {
        System.out.println(names[i].length());
      }
    }

    // 첫번째 변수는 입력됐기 때문에 프린트되고, null 값은 NullPointerException 가 발생.
    names[1] = "lee";
    System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

    names[2] = "park";
    System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

  }
}

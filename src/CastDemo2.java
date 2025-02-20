public class CastDemo2 {
  public static void main(String[] args) {
    String strInt = "20";
    int i = Integer.parseInt(strInt);
    System.out.println(i);

    String strDouble = "20.001";
    double d = Double.parseDouble(strDouble);
    System.out.println(d + 0.1);
    //float에 비해 double의 오차가 더 적다

    
    String strFloat = "3.14";
    float f = Float.parseFloat(strFloat);
    System.out.println(f);
  }
}

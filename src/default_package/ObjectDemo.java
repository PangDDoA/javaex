package default_package;

public class ObjectDemo {
  public static void main(String[] args) {
    Keyboard keyboard = new Keyboard("키보드");

    Class c = keyboard.getClass();
    c.getName();
    Keyboard keyboard1 = new Keyboard("키보드");

    Mouse mouse = new Mouse("마우스");
    Mouse mouse1 = new Mouse("마우스");

    System.out.println(keyboard);
    System.out.println(mouse);

    System.out.println("keyboard == keyboard1 : " + (keyboard == keyboard1));
    // 내용이 아닌 '주소'가 같은지를 물어보게 된다.

    System.out.println("keyboard.equals(keyboard1 : " + keyboard.equals(keyboard1));
    // 결과값을 반환하는 동작이 없을때는 fault값 출력.

    System.out.println("mouse.equals(mouse1) : " + mouse.equals(mouse1));
  }
}

package default_package;

class Keyboard {
  String name;
  public Keyboard(String name){
    this.name = name;
  }
//override 전에는 Object의 출력형태로 나오게 됐음.
  //override 를 해서 우리가 원하는 문자 형태로 만들어줌.
  @Override
  public String toString() {
    return "Keyboard{" +
        "name='" + name + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Keyboard){
      Keyboard keyboard = (Keyboard) o;
      if (name.equals(keyboard.name)){
        return  true;
      }
    }
    return false;
  }
}

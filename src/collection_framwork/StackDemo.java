package collection_framwork;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {

    Stack<String> stack = new Stack<>();
    //System.out.println(stack.peek());비어있는 상태이므로 exception 발생
    if(!stack.isEmpty()){
      System.out.println(stack.pop());
    }else {
      System.out.println("비었습니다");
    }

    //stack.add("A");      //사용은 가능하지만 push 로만 넣어야 한다.
    //stack.add(1,"B");   //가능하지만 권장하지 않음.
    stack.push("10");
    stack.push("20");
    stack.push("30");
    for(String s : stack){
      System.out.println(s);
    }

    while (!stack.isEmpty()){
      System.out.println(stack.pop());
    }
//    System.out.println(stack.pop());
//    System.out.println(stack.pop());
//    System.out.println(stack.pop()); //while 문을 사용해서 비울때가지 사용하는

  }
}

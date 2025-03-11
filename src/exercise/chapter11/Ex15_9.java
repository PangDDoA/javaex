package exercise.chapter11;

import java.util.HashMap;
import java.util.Map;

public class Ex15_9 {
  public static void main(String[] args) {
    Map<String,Integer> map = new HashMap<String,Integer>();
    map.put("blue", 96);
    map.put("hong", 86);
    map.put("white", 92);


    String name = null;   //  최고 점수를 받은 아이디를 저장하는 변수
    int maxScore = 0;     //  최고 점수를 저장하는 변수
    int totalScore = 0;   //  점수 합계를 저장하는 변수

    String name2 = null;   //  최고 점수를 받은 아이디를 저장하는 변수
    int minScore = 0;     //  최저 점수를 저장하는 변수 => 초기값 적용시 유의할 것.
    //여기에 코드를 작성하세요.

    //이름과 점수가 있다. 최고점수는? 각각 점수를 불러와서 다 비교한다.
    // =>이름을 불러 점수들을 비교.
    //점수들의 합은 각 객체들을 불러 다 합한다.
    System.out.println(map.keySet());
    // map.keySet()  --> 맵의 모든 키를 불러온다.

   // <방법 1>
    for(String callName : map.keySet()){ //map.keySet()를 사용해 모든 키들을 가져와 callName변수에 대입.

      if(map.get(callName) > maxScore){
        name = callName;
        maxScore = map.get(callName);
        }
      totalScore += map.get(callName);
    }
    System.out.println(name + " 은 최고점수 " + maxScore + " 점 입니다.");
    System.out.printf("평균점수는 %.2f 입니다.", totalScore / (double)map.size());



    // < 방법 2 > -entrySet<>활용
    // < 방법 3 > -entryS

  }
}

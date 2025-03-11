package exercise.chapter11;
//개인적으로 풀이

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
   -키보드로 입력한 정수 값을 학생의 점수로 사용하며 ArrayList에 저장한다.
   -입력된 정수값이 음수면 입력의 끝이다.
   -점수 중에서 최고 점수부터 최고 점수 -10점 이상은 A,
    최고 점수 -10 미만부터 최고 점수 -20점 이상은 B처럼 등급을 배정한 후 출력하는 프로그램
    을 작성하시오. （예외처리 포함）
 */
public class Ex4 {
  Scanner scanner = new Scanner(System.in);

  // List(Integer 타입의 변수명 scores)를 new ArrayList<>(); 으로 선언!
  List<Integer> scores = new ArrayList<>();

  String grade = ""; // 변수명 grade가 표기되기 위해 "" 큰따옴표,공란을 만들어줌.
  //그리고 점수가 입력도
}
package exercise.chapter8;

import java.util.Calendar;

public class Ex3 {
  public static void main(String[] args) {
    String[] weekName = {"일", "월", "화", "수", "목", "금", "토"};
    String[] noonName = {"오전", "오후"};
    Calendar c = Calendar.getInstance();

    //코드추가

    int year = c.get(Calendar.YEAR);
//    System.out.println(year);
    int month = c.get(Calendar.MONTH) + 1;
//    System.out.println(month);
    int day = c.get(Calendar.DAY_OF_MONTH);
//    System.out.println(day);
    System.out.println(year + " 년 " + month + " 월 " + day + " 일");

    int weekNo = c.get(Calendar.DAY_OF_WEEK); //숫자로 나오므로 몇번째 순서의 인덱스에서 가져오겠다는 명령을 한다.
//    System.out.println(weekNo);
    String week = weekName[weekNo-1];
//    System.out.println(week);

    int noonNO = c.get(Calendar.AM_PM);
    System.out.println(noonNO);
    String noon = noonName[noonNO];
    System.out.println(noon);
    System.out.println(week + "요일 " + noon);

    int hour = c.get(Calendar.HOUR);
    System.out.println(hour);
    int minute = c.get(Calendar.MINUTE);
    int second = c.get(Calendar.SECOND);
    System.out.println(hour + " 시 " + minute + " 분 " + second + " 초");
  }
}

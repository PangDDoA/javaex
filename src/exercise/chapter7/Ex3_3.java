package exercise.chapter7;

import java.util.Arrays;
import java.util.Comparator;

public class Ex3_3 {
  public static void main(String[] args) {
    Book b1 = new Book(15000);
    Book b2 = new Book(5000);

    int res = b1.compareTo(b2);
    // Book[15000] 이 Book[5000] 보다 비쌉니다.
    // 정수끼리의 비교값을

    if(res == -999) {
      System.out.println("비교할 수 없습니다.");
    } else {
      if(res > 0) {
        System.out.println(b1 + "이 " + b2 + "보다 비쌉니다.");
      }
    }
    Book[] books={
        new Book(15_000),
        new Book(50_000),
        new Book(20_000),
    };
    System.out.println("정렬 전");
    for (Book book : books) {
      System.out.println(books);
    }
    Arrays.sort(books);
    System.out.println("정렬 후");
    for (Book book : books) {
      System.out.println(books);
    }
    // 내림차순으로 정렬하느 방법 - 함수형 인터페이스와 람다식을 활용하여
    Arrays.sort(books, (Book o1, Book o2) ->o2.compareTo(o1)); // 매개변수의 순서를 변경하면 오름,내림차순으로 변경가능.
    System.out.println(Arrays.toString(books));
      }
    };

class Book implements Comparable {
  int price;

  public Book(int price) {
    this.price = price;
  }

  @Override
  public int compareTo(Object o) {
    if(o instanceof Book b) {
      if(this.price > b.price) {
        return 1;
      } else if(this.price < b.price) {
        return -1;
      } else {
        return 0;
      }
    }
    return -999;
  }

  @Override
  public String toString() {
    return "Book[" +
        "price=" + price +
        ']';
  }
}
  //alt insert 로 toString()하는게 쉽게 모양새를 잡아준다.

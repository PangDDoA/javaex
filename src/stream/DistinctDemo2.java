package stream;

import java.util.Objects;
import java.util.stream.Stream;

public class DistinctDemo2 {
  //유니크 엘리먼트?
  public static void main(String[] args) {
    Stream<Circle> cs = Stream.of(new Circle(3),
                                  new Circle(5),
                                  new Circle(3),
                                  new Circle(4),
                                  new Circle(8));
    cs.filter(c -> c.getR() % 2 == 0) // c -> c.getR() % 2 == 0 왜 이렇게 돼는거지?
        .distinct()
        .forEach(circle -> System.out.println(circle));
  }
}
class Circle{
  private int r;
  public Circle(int r){
    this.r = r;
  }

  public int getR() {
    return r;
  }

  @Override
  public String toString() {
    return "Circle{" +
        "r=" + r +
        '}';
  }

  @Override
  public boolean equals(Object object) {
    if (object == null || getClass() != object.getClass()) return false;
    Circle circle = (Circle) object;
    return hashCode() == circle.hashCode();
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(r);
  }
}
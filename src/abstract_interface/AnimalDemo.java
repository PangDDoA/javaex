package abstract_interface;

public class AnimalDemo {
  public static void main(String[] args) {
    Animal[] animals = {
        new Dog(),
        new Cuckcoo()
    };

    for(Animal animal:animals){
      animal.sound();
    }
    System.out.println("================");

    makeSound(new Dog());
    makeSound(new Cuckcoo());
  }
  static void makeSound (Animal animal){
    animal.sound();
  }
}

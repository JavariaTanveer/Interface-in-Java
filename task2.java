package lAB5;
import java.util.Scanner;


 abstract class Animal {
  public abstract void makeSound();
}

class Cat extends Animal {
  public void makeSound() {
    System.out.println("Meow");
  }
}

class Dog extends Animal {
  public void makeSound() {
    System.out.println("dog is making sound");
  }
}

public class task2 {
  public static void main(String[] args) {
    Animal cat = new Cat();
    Animal dog = new Dog();

    cat.makeSound();
    dog.makeSound();
  }
}
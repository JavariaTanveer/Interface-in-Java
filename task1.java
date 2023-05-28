package lAB5;

class Vehicle {
  public void startEngine() {
    System.out.println("Engine started.");
  }
}

class Car extends Vehicle {
  @Override
  public void startEngine() {
    System.out.println("Car started.");
  }
}

class Truck extends Vehicle {
  @Override
  public void startEngine() {
    System.out.println("Truck started.");
  }
}

public class task1 {
  public static void main(String[] args) {
    Vehicle vehicle1 = new Vehicle();
    Vehicle car1 = new Car();
    Vehicle truck1 = new Truck();

    vehicle1.startEngine();
    car1.startEngine();
    truck1.startEngine();
  }
}


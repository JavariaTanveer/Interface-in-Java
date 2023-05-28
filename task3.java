package lAB5;

import java.util.Scanner;

interface Taxable {
  double getTax();
}

class Product implements Taxable {
  private String name;
  private double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public double getTax() {
    return price * 0.1;
  }
}

class Service implements Taxable {
  private String name;
  private double hourlyRate;
  private double hours;

  public Service(String name, double hourlyRate, double hours) {
    this.name = name;
    this.hourlyRate = hourlyRate;
    this.hours = hours;
  }

  public String getName() {
    return name;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public double getHours() {
    return hours;
  }

  public double getTax() {
    return (hourlyRate * hours) * 0.05;
  }
}

public class task3 {
  public static void main(String[] args) {
    Product product = new Product("Laptop", 1000);
    Service service = new Service("Plumbing", 50, 2);

    System.out.println("Product: " + product.getName() + " | Price: $" + product.getPrice() + " | Tax: $" + product.getTax());
    System.out.println("Service: " + service.getName() + " | Hourly Rate: $" + service.getHourlyRate() + " | Hours: " + service.getHours() + " | Tax: $" + service.getTax());
  }
}
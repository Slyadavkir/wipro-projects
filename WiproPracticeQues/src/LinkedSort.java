import java.util.LinkedList;

public class LinkedSort {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.sort(null);
    System.out.println(cars);
  }
}

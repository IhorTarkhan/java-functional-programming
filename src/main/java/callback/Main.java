package callback;

import java.util.List;
import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    Consumer<Integer> callback = (Integer it) -> System.out.println("it = " + it); // T -> void
    Consumer<Integer> callback2 = (Integer it) -> System.out.println("it2 = " + it); // T -> void
    Consumer<Integer> integerConsumer = callback.andThen(callback2);
    IntConsumer calInt = System.out::println;

    Function<Integer, String> converter = i -> i.toString() + " tail"; // T -> R
    Supplier<String> getter = () -> "HW"; // void -> T
    Predicate<String> isValidEmail = email -> email.contains("@"); // T -> bool

    printX2(15, calInt);
  }

  private static void printX2(int i, IntConsumer cd) {
    System.out.println(i * 2);
    cd.accept(i);
  }
}

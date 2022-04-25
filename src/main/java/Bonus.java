import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.range;

public class Bonus {
  public static void main(String[] args) {
    //    System.out.println(isPrime2(3));
    //    System.out.println(isPrime2(4));
    //    System.out.println(isPrime2(5));
    clearStream();
  }

  private static boolean isPrime(int number) {
    for (int i = 2; i < number; i++) {
      if (number % i == 0) return false;
    }
    return true;
  }

  private static boolean isPrime2(int number) {
    IntPredicate intPredicate =
        (int i) -> {
          return number % i == 0;
        };
    return range(2, number).noneMatch(intPredicate);
  }

  private static boolean isEven(int number) {
    try {
      Thread.sleep(500);
    } catch (Exception i) {
    }
    return number % 2 == 0;
  }

  private static void clearStream() {
    List<Integer> collect1 = range(2, 10).boxed().collect(Collectors.toList());
    Function<Integer, Predicate<Integer>> factory = n -> (it -> it % n == 0);
    List<Integer> collect =
        collect1.parallelStream()
                .filter(factory.apply(3))
                .collect(Collectors.toList());
  }
}

package validator;

import java.time.LocalDate;

import static validator.CustomerValidator.*;

public class Main {
  public static void main(String[] args) {
    CustomerDto some_name =
        new CustomerDto("some name", "test@g.c", "123", LocalDate.of(2000, 1, 1));

    boolean test = isAdultValid(some_name);

    System.out.println(test);
  }

  private static boolean isAdultValid(CustomerDto some_name) {
    return isAdult().and(isEmailValid()).and(isPhoneValid()).test(some_name);
  }

  private static boolean isValid(CustomerDto some_name) {
    return isEmailValid().and(isPhoneValid()).test(some_name);
  }
}

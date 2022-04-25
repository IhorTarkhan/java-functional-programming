package validator;

import java.time.LocalDate;
import java.util.function.Predicate;

public interface CustomerValidator extends Predicate<CustomerDto> {
  static CustomerValidator isEmailValid() {
    return customer -> customer.getEmail().contains("@");
  }

  static CustomerValidator isPhoneValid() {
    return customer -> customer.getPhoneNumber().length() > 5;
  }

  static CustomerValidator isAdult() {
    return customer -> LocalDate.now().isAfter(customer.getDob().minusYears(18));
  }
}

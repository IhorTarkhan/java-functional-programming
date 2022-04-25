package great;

import validator.CustomerDto;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    GreetService greetService = new GreetService();

    greetService.greet(CustomerType.GOLD,  new CustomerDto("some name", "test@g.c", "123", LocalDate.of(2000, 1, 1)));
    greetService.greet(CustomerType.FREE,  new CustomerDto("some name", "test@g.c", "123", LocalDate.of(2000, 1, 1)));
  }
}

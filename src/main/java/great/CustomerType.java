package great;

import validator.CustomerDto;

import java.util.function.BiConsumer;

public enum CustomerType {
  FREE(GreetService::greetFree),
  SILVER(GreetService::greetSilver),
  GOLD(GreetService::greetGold);

  public final BiConsumer<GreetService, CustomerDto> greetMe;

  CustomerType(BiConsumer<GreetService, CustomerDto> greetMe) {
    this.greetMe = greetMe;
  }
}

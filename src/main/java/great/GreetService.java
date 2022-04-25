package great;

import validator.CustomerDto;

public class GreetService {
  public void greet(CustomerType customerType, CustomerDto customer) {
    customerType.greetMe.accept(this, customer);
  }

  public void greetGold(CustomerDto customer) {
    System.out.println("Hello, " + customer.getName());
    sedEmail();
  }

  public void greetSilver(CustomerDto customer) {
    System.out.println("Hello");
  }

  public void greetFree(CustomerDto customer) {
    System.out.println("hi, " + customer.getName());
  }

  private void sedEmail() {
    System.out.println("Email 🤑");
  }
}

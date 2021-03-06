public class Greeter {
  private final String greeting;

  public Greeter(final String greeting) {
    this.greeting = greeting;
  }

  public String greet(final String name) {
    return String.format("%s, %s!", this.greeting, name);
  }
}

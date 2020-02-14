import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreeterTests {

  @Test void greetingTest() {
    final var greeter = new Greeter("Hello");
    assertEquals("Hello, World!", greeter.greet("World"));
  }
}

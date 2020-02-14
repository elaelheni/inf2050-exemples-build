import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreeterTests {

  @Test void greetingTest() {
    var greeter = new Greeter("Hello");
    assertEquals("Hello, World!", greeter.greet("World"));
  }
}

package ca.uqam.inf2050;

import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static ca.uqam.inf2050.Monnaie.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests de l'objet valeur Monnaie")
class MonnaieTests {

  @Test
  @DisplayName("Additionne deux nombres entiers")
  void additionne() {
    final var un = new Monnaie("1");
    final var deux = new Monnaie("2");

    final var resultat = plus(un, un);

    assertEquals(deux, resultat, "1 + 1 === 2");
  }

  @ParameterizedTest(name = "{0} + {1} === {2}")
  @DisplayName("Additionne des nombres entiers 🐙")
  @MethodSource("additionneMonnaieCas")
  void additionneMonnaie(
      final Monnaie lhs, final Monnaie rhs, final Monnaie result) {
    assertEquals(result, Monnaie.plus(lhs, rhs));
  }

  private static Stream<Arguments> additionneMonnaieCas() {
    return Stream.of(
        Arguments.of(new Monnaie("1"), new Monnaie("1"), new Monnaie("2"))
      , Arguments.of(new Monnaie("1"), new Monnaie("2"), new Monnaie("3"))
      , Arguments.of(new Monnaie("0"), new Monnaie("0"), new Monnaie("0"))
    );
  }
}

package ca.uqam.inf2050;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import lombok.*;

@EqualsAndHashCode
@ToString
public class Monnaie {

  public static final Monnaie ZERO = new Monnaie(BigDecimal.ZERO);

  private final BigDecimal montant;

  public Monnaie(final String montant) {
    this(new BigDecimal(montant));
  }

  public Monnaie(final BigDecimal montant) {
    this.montant = montant;
    montant.setScale(2, RoundingMode.HALF_UP);
  }

  public static Monnaie plus(final Monnaie lhs, final Monnaie rhs) {
    return new Monnaie(lhs.montant.add(rhs.montant));
  }
}
